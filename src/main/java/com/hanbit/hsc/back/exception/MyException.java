package com.hanbit.hsc.back.exception;

public class MyException extends RuntimeException {

	private int errorCode = 500;

	public MyException(String msg) {
		super(msg);
	}

	public MyException(int errorCode, String msg) {
		this(msg);

		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
