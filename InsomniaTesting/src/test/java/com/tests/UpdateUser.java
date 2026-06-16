package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UpdateUser {
	
	@Test
	public void updateUser() {
		Map<String,Object> values = new HashMap<>();
		values.put("name","jagadeep");
		values.put("email","jagadeep@gmail.com");
		values.put("category", "Wipro");
		values.put("id", "6");
		
		Response res = RestAssured.given().contentType(ContentType.JSON).body(values).when().put("http://localhost:3000/trainees/d4DXgNyr-8s");
		Assert.assertEquals(res.getStatusCode(),200);
		
		String category = res.jsonPath().getString("category");
		Assert.assertEquals(category,"Wipro");
	}
}
