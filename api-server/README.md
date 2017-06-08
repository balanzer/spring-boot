# Angular-2 with Spring Boot 

# Installations 

# 1) NodeJS
Link: https://nodejs.org/en/
	Open the command prompt, and run command “node -v & npm -v” confirm versions
	
# 2) Angular-cli	
Link: https://cli.angular.io/  or https://github.com/angular/angular-cli

Useful links 

https://angular.io/docs/ts/latest/tutorial/
https://github.com/angular/angular-cli/wiki
http://angularjs.blogspot.ca/

# 3) Java - 1.8 

# 4) Ecplise - Neon 
Install 
	STS (Spring Tool Suite) for Spring, Spring Boot, Spring Data
	Angular IDE 2017 for Angular 2 and TypeScript
From Eclipse Market Place 


# Server Project Setup

1) Create a new Spring Boot Application using the “Spring Starter Project” Type.

	Note: Change “Packaging” to “War” if you intend to deploy your project to a Servlet Container (like Tomcat etc).

2) Click next, and select any number of Spring Boot Starters you may need	
3) Click finish. The project will be created in your workspace. Next, right-click on the project and go to “Spring Tools”, and click “Add Boot Devtools.” This will enable the server side code watch and hot deployment features.
4) Run application to confirm changes are looking good so far.

# REST controller 
1) Create a simple REST controller to return a greeting message

		package com.example.demo.api;

		import org.springframework.web.bind.annotation.RequestMapping;
		import org.springframework.web.bind.annotation.RestController;

		@RestController
		public class SampleService {
			@RequestMapping("/api/greetings")
			public String greetings() {
				return "Hello World!!!";
			}
		}

2) Access http://localhost:8080/api/greetings  to check service

# Have you notice your code changes are watched, deployed, and refreshed automatically.

# UI Project Setup

1) Create new Project using command 'ng new app-client'   or Use Eclipse plugin to create

2) run npm start - Verify application working - http://localhost:4200/
   note : Dont use ng serve, use npm start


# Client-Server Integration
 TO be completed later