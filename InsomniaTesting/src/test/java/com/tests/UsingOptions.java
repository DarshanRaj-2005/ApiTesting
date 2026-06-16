package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UsingOptions {
	@Test
	public void Options() {
		Response res = RestAssured.given().when().options("http://localhost:3000/trainees");
		Assert.assertEquals(res.getStatusCode(),204);
		System.out.print(res.getHeader("Access-Control-Allow-Methods"));
	}
}
