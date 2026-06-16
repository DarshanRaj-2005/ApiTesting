package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteUser {	
	
	@Test
	public void deleteUserPatch() {
		Response res = RestAssured.when().delete("http://localhost:3000/trainees/jTsxnqT5XmY");
		Assert.assertEquals(res.getStatusCode(),200);
	}
	
}
