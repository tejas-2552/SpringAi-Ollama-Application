package com.demo.controller;

import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

	
	@Autowired
	private OllamaChatClient client; 
	
	
	@GetMapping("/prompt")
	public String chatInterface(@RequestParam String req) {		
		return client.call(req);
	}
}
