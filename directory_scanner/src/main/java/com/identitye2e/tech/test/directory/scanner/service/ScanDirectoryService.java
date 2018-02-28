package com.identitye2e.tech.test.directory.scanner.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.identitye2e.tech.test.directory.model.FileInfo;

@Service
public class ScanDirectoryService {

	public ResponseEntity<Set<FileInfo>> getDirectoryList(String path) {

		final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ScanDirectoryService.class);
		Set<FileInfo> fileList = new HashSet<FileInfo>();

		try {
			logger.debug("Retrieving all of the files in the specified path");
			File[] files = new File(path).listFiles();

			if (files != null) {
				for (File file : files) {
					if (file.isFile()) {
						logger.info("Retrieving info about file: " + file.getName());
						Path p = Paths.get(file.getAbsolutePath());
						BasicFileAttributes fileAttributes = Files.getFileAttributeView(p, BasicFileAttributeView.class)
								.readAttributes();
						// Get file extension

						String ext = getFileExtension(file.getName());
						if (ext != null) {
							FileInfo fileInfo = new FileInfo(file.getName(), Files.probeContentType(p),
									fileAttributes.size(), ext);
							fileList.add(fileInfo);
						} else {
							logger.debug("No extension retrieved for file: " + file.getName());
							FileInfo fileInfo = new FileInfo(file.getName(), Files.probeContentType(p),
									fileAttributes.size());
							fileList.add(fileInfo);
						}
					}
				}
				return new ResponseEntity<Set<FileInfo>>(fileList, HttpStatus.OK);
			}

			logger.info("No files found");
			return ResponseEntity.notFound().build();

		} catch (IOException e) {
			
			logger.error("An IO exception has occured");
			logger.error("Exception message: ---- " + e.getMessage());
			logger.error("Exception stacktrace : ---- " + e.getStackTrace());
			return ResponseEntity.status(500).build();
		}

	}

	private String getFileExtension(String name) {

		int i = name.lastIndexOf('.');
		if (i > 0) {
			return name.substring(i + 1);
		}
		return null;
	}

}
