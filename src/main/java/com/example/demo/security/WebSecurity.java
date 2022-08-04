package com.example.demo.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class WebSecurity extends WebSecurityConfigurerAdapter{
	
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests()
		.antMatchers("/dashboard").authenticated()
		.antMatchers("/home").permitAll()
		.and()
		.httpBasic();
	}

}
