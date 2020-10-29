package com.ocr.api.controller;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ocr.api.dto.OCRRequest;

import net.sourceforge.tess4j.Tesseract;

@RestController
@RequestMapping("/api")
public class OCRController {

	private Logger logger = LogManager.getLogger(OCRController.class);
	private static String LANGUAJE = "spa";

	@PostMapping(path="/png/extractText", consumes = "application/json", produces = "application/json")
	public @ResponseBody ResponseEntity<String> extractTextFromPDFFile(@RequestBody OCRRequest path) {
		try {
			if(!path.getPath().isEmpty()) {
				File image = new File(path.getPath());
				Tesseract tesseract = new Tesseract();
				tesseract.setDatapath("src/main/resources/tessdata");
				tesseract.setLanguage(LANGUAJE);
				tesseract.setPageSegMode(1);
				tesseract.setOcrEngineMode(1);
				String strippedText = tesseract.doOCR(image);
	
				JSONObject obj = new JSONObject();
				obj.put("fileName", image);
				obj.put("text", strippedText.toString());
				logger.info("Mensaje :  " + obj);		
				return new ResponseEntity<String>(obj.toString(), HttpStatus.OK);
			}else
				return new ResponseEntity<String>("No contiene una ruta valida", HttpStatus.INTERNAL_SERVER_ERROR);				
		} catch (Exception e) {
			logger.error("Error obteniendo texto mensaje.",e);
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	
	

}
