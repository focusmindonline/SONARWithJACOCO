package com.pak.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl {

	public String getMessage() {
		String str = " Hello World";
		Object obj = getObject();
		return str;
	}

	private Object getObject() {
		return "abc";
	}

}
