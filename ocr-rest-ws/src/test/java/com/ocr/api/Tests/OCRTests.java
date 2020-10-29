package com.ocr.api.Tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ocr.api.controller.OCRController;
import com.ocr.api.dto.OCRRequest;
import com.ocr.api.exception.ContentNotAllowedException;

@RunWith(SpringRunner.class)
@SpringBootTest
class OCRTests {

	@Test
	void contextLoads() {
	}

	@Before
	public void init() {
	}
	@Autowired
	private OCRController postController = new OCRController();

	@Test
	public void sumatoria() throws ContentNotAllowedException {		
		OCRRequest req = new OCRRequest();
		req.setPath("C:\\Users\\carlo\\Desktop\\Captura.png");
		postController.extractTextFromPDFFile(req);
	}

}
