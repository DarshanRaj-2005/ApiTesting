package com.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateUserPatch {
	
	@Test
	public void updateUserPatch() {
		Map<String,Object> values = new HashMap<>();
		values.put("category", "TCS");
		Response res = RestAssured.given().contentType(ContentType.JSON).body(values).when().patch("http://localhost:3000/trainees/d4DXgNyr-8s");
		Assert.assertEquals(res.getStatusCode(),200);
		
		String category = res.jsonPath().getString("category");
		Assert.assertEquals(category,"TCS");
	}

}
