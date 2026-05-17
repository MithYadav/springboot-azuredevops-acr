package com.example.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testazure")
public class TestAzureDevOpsController {

	@GetMapping
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("Azure Test deployment is successfull using azuredevops on azure");
	}

}
