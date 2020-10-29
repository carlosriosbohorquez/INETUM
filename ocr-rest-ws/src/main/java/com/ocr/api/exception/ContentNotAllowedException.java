package com.ocr.api.exception;

public class ContentNotAllowedException extends Exception {
    /**
	 * Serial ID
	 */
	private static final long serialVersionUID = -1739796584543083269L;
	
    
    public ContentNotAllowedException(String errorMessage) {
        super(errorMessage);
    }
}
