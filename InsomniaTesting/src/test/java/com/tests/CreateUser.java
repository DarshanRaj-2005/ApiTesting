package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateUser {
	
	@Test
	public void createUser() {
		Map<String,Object> values = new HashMap<>();
		values.put("name", "jagadeep");
		values.put("email", "jagadeep@gmail.com");
		values.put("category", "TCS");
		values.put("id", "6");
		
		Response res = RestAssured.given().contentType(ContentType.JSON).body(values).when().post("http://localhost:3000/trainees");
		
		Assert.assertEquals(res.getStatusCode(),201);
		String name = res.jsonPath().getString("name");
		Assert.assertEquals(name,"jagadeep");
	}
}
