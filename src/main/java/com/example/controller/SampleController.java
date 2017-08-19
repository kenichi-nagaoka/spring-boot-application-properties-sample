package com.example.controller;

import javax.naming.NamingException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApplicationProperties;

@RestController
@RequestMapping(value = "sample")
public class SampleController {

	private final static org.slf4j.Logger logger = LoggerFactory.getLogger("com.example.controller");

	@Autowired
	ApplicationProperties applicationProperties;

	@RequestMapping(method = RequestMethod.GET)
	public String getSomething() throws NamingException {
		logger.info("my.url : " + applicationProperties.getUrl());
		logger.info("my.env : " + applicationProperties.getEnv());
		return "something";
	}
}
