package com.liesbeth.immo;


import com.google.common.collect.Streams;

import com.liesbeth.immo.project.Project;
import com.liesbeth.immo.project.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

@SpringBootApplication
public class ImmoApplication implements ApplicationRunner {
	
	@Autowired
	private ProjectRepository projectRepository;

	public static void main(String[] args) {
		SpringApplication.run(ImmoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(ApplicationArguments args) throws Exception {
		Project project = Project.builder().name("hello").description("test").build();
		projectRepository.save(project);
		
	}

	@RestController
	class HelloWorldController {

		@Autowired
		private ProjectRepository projectRepository;

		@GetMapping("/")
		public String hello() {
			return "hello world!";
		}

		@GetMapping("/test")
		@Transactional
		public Collection<String> test() {
			return Streams.stream(projectRepository.findAll())
				.map(Project::toString)
				.collect(Collectors.toList());
		}
	}
}
