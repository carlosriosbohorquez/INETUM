package com.ocr.api.Tests;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.formato.api.controller.FormatoController;
import com.formato.api.exception.ContentNotAllowedException;

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
	private FormatoController postController = new FormatoController();

	@Test
	public void sumatoria() throws ContentNotAllowedException {
		// TODO
		System.out.println("TODO");
	}

}
