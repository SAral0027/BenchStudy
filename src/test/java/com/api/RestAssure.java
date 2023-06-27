package com.api;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RestAssure {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RestAssured.given().
		when().get().
		then().statusCode(200).log().all();
				
	}
}
