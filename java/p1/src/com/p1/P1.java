package com.p1;

import org.json.simple.JSONObject;

public class P1 {
	public P1() {}
	public String getMessage() {
		JSONObject obj = new JSONObject();
		String jsonText;

		obj.put("name", "Joe");
		obj.put("message", "Hello");
		jsonText = obj.toString();
		System.out.println("P1 says hello");

		return jsonText;
	}
}
