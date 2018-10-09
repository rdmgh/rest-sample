package com.edelivery.restclient.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloRestController {
	private static final String URL_JSON = "http://dummy.restapiexample.com/api/v1/employees";

	@RequestMapping("/")
	public String sayHello() {
		HttpHeaders headers = new HttpHeaders();
//		headers.add("Accept", MediaType.APPLICATION_JSON);
		headers.setContentType(MediaType.APPLICATION_JSON);

		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<String> requestBody = new HttpEntity<>(headers);

		String result = restTemplate.getForObject(URL_JSON, String.class);
//		String result = restTemplate.postForObject(URL_JSON, requestBody, String.class);
		return result;

	}
}