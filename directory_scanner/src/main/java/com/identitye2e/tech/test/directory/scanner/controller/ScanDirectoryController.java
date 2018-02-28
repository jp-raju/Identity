package com.identitye2e.tech.test.directory.scanner.controller;

import java.util.Set;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.identitye2e.tech.test.directory.model.FileInfo;
import com.identitye2e.tech.test.directory.scanner.service.ScanDirectoryService;

@RestController
public class ScanDirectoryController {

	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(ScanDirectoryController.class);

	@Autowired
	private ScanDirectoryService scanDirectoryService;
	
	@GetMapping(value = "api/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String test() {
		
		return "hello";
	}

	@GetMapping(value = "api/scan", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Set<FileInfo>> getDirectory(@RequestParam(value = "path", required = false) String path) {

		logger.info("Endpoint: /api/scan");
		
		if(path == null){
			logger.info("The user has not provided a path so the default path will be used");
			path = "D:\\Data\\gitrepos\\qa\\automated_testing\\target\\allure-results";
		}
		logger.debug("The path is: " + path);
		
		return scanDirectoryService.getDirectoryList(path);

	}

}
