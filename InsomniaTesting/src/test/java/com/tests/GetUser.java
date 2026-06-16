package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUser {

	@Test
	public void getUser() {
		Response response = RestAssured.given().when().get("http://localhost:3000/trainees/1");
		Assert.assertEquals(response.getStatusCode(),200);
		String name = response.jsonPath().getString("name");
		Assert.assertEquals(name,"darshan raj");
	}
}