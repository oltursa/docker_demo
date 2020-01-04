package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
	public static String of(Object obj) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString(obj);
		} catch (Exception e) {
			return "";
		}
	}
}
