package com.identitye2e.tech.tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static io.restassured.path.json.JsonPath.*;
import java.util.List;
import com.identitye2e.tech.test.directory.scanner.DirectoryScannerApplication;

import io.restassured.response.Response;


@RunWith(SpringRunner.class)
public class DirectoryScannerApplicationTests {
	
	static ConfigurableApplicationContext ctx= null;
	
	@BeforeClass
	public static void beforeClass(){
		ctx =  SpringApplication.run(DirectoryScannerApplication.class, "");
	}
	
	@Test
	public void verify_File_in_Drivers_Folder() {
		String response = get("http://localhost:8080/api/scan?path=drivers").asString();
		String filename = from(response).getList("filename").get(0).toString();
		String fileExtention = from(response).getList("fileExtention").get(0).toString();
		String mimeType = from(response).getList("mimeType").get(0).toString();
		String fileSize = from(response).getList("fileSize").get(0).toString();
		Assert.assertEquals("Filename does not match", "chromedriver.exe", filename);
		Assert.assertEquals("File Extention does not match", "exe", fileExtention);
		Assert.assertEquals("File mime type does not match", "application/x-msdownload", mimeType);
		Assert.assertEquals("File Size does not match", "6403584", fileSize);
	}
	
	@Test
	public void verify_No_File_in_Directory() {
		Response response = get("http://localhost:8080/api/scan?path=src//main//resources//static");
		Assert.assertEquals("Blank data for blank directory failed.", 404, response.getStatusCode());
	}
	
	
	@AfterClass
	public static void afterClass(){
		ctx.close();
	}
	
	

}
