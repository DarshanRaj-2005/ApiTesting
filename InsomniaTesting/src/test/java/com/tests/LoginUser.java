package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginUser {

	@Test
	public void loginTest() {
		Map<String,Object> values = new HashMap<>();
		values.put("username","admin");
		values.put("password", "admin123");
		
		Response res = RestAssured.given().contentType(ContentType.JSON).body(values).when().post("http://localhost:5000/login");
		Assert.assertEquals(res.statusCode(),200);
	}

}
