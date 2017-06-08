# Spring Boot Jar to War File

## - Create new Spring boot web project

## Changes to deploy a Spring Boot WAR file to Tomcat servlet container.

## - Extends SpringBootServletInitializer
	
	Make the existing @SpringBootApplication class extends SpringBootServletInitializer

		@SpringBootApplication
		public class JarToWarApplication extends SpringBootServletInitializer {

			public static void main(String[] args) {
				SpringApplication.run(JarToWarApplication.class, args);
			}
			
			@Override
		    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		        return application.sources(JarToWarApplication.class);
		    }
		}

## - Marked the embedded servlet container as provided - Update POM XML with adding new dependency


		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<!-- marked the embedded servlet container as provided -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-tomcat</artifactId>
			<scope>provided</scope>
		</dependency>

## - Update packaging to war - Update POM XML packaging

		<packaging>war</packaging>

## - Do mvn package - Copy war to Tomcat & Tomcat

## - Other Changes - Added Sample @RestController - SampleService and added new entry in application.properties - server.context-path=  /sample

Start server

Access - http://localhost:8080/sample/greetings
