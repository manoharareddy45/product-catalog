package com.catelogue.search.exception;

public class ProductCatelogueException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProductCatelogueException(String message) {
		super(message);
	}

	public ProductCatelogueException(String message, Throwable t) {
		super(message, t);
	}
}
