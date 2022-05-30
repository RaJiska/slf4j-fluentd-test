package io.buildpacks.example.sample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class FooBarController {
	private static Logger logger = LoggerFactory.getLogger(FooBarController.class);

	@RequestMapping("/foo")
	public static void Foo() {
		logger.info("Hello World");
		try {
			throw new Exception("Exception just occured bro");
		}
		catch (Exception e) {
			logger.error("Real Exception Bro", e);		
		}
		logger.info("DONE");
	}

	@RequestMapping("/bar")
	public static void Bar() {
		logger.info("I am a line");
	}
}


