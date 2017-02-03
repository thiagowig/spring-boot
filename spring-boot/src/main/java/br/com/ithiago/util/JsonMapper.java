package br.com.ithiago.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMapper {
	
	public static Object toObject(String json, Class classToConvert) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		return mapper.readValue(json, classToConvert);
	}
}
