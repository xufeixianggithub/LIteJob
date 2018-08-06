package com.alen.exception;


public class BizException extends RuntimeException {

	private static final long serialVersionUID = -6773372105984590041L;

	/**
	 * 自定义的错误码
	 */
	private Integer code;


	public BizException(int code, String msg){
		super(msg);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}
