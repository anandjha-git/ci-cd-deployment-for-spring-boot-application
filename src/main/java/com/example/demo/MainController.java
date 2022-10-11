package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	//@RequestMapping(value="Hello", method="get")
	@GetMapping("/")
	public String message() {
		return "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h1>Spring Boot Application to Perform CI/CD using jenkins Create By Anand....</h1>\r\n" + 
				"<h3>Fill Form to Connect with Anand...</h2>\r\n" + 
				"\r\n" + 
				"<p>The formenctype attribute specifies how the form data should be encoded when submitted.</p>\r\n" + 
				"\r\n" + 
				"<form action=\"/action_page_binary.asp\" method=\"post\">\r\n" + 
				"  <label for=\"fname\">First name:</label>\r\n" + 
				"  <input type=\"text\" id=\"fname\" name=\"fname\"><br><br>\r\n" + 
				"  <input type=\"submit\" value=\"Submit\">\r\n" + 
				"  <input type=\"submit\" formenctype=\"multipart/form-data\" value=\"Submit as Multipart/form-data\">\r\n" + 
				"</form>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"\r\n" + 
				"";
	}
}
