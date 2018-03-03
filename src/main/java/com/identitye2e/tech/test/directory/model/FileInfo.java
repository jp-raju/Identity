package com.identitye2e.tech.test.directory.model;

public class FileInfo {

	private String filename;
	private String mimeType;
	private long fileSize;
	private String fileExtention;
	
	public FileInfo(String filename, String mimeType, long fileSize, String fileExtention){
		
		this.filename = filename;
		this.mimeType = mimeType;
		this.fileSize = fileSize;
		this.fileExtention = fileExtention;
	}

	public FileInfo(String filename, String mimeType, long fileSize) {
		this.filename = filename;
		this.mimeType = mimeType;
		this.fileSize = fileSize;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileExtention() {
		return fileExtention;
	}

	public void setFileExtention(String fileExtention) {
		this.fileExtention = fileExtention;
	}

}
