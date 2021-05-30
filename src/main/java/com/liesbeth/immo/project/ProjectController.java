package com.liesbeth.immo.project;

import com.google.common.collect.Streams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProjectController {
    
    private final ProjectRepository projectRepository;
    
    @GetMapping("/project")
    @Transactional
    public Collection<String> test() {
        return Streams.stream(projectRepository.findAll())
            .map(Project::toString)
            .collect(Collectors.toList());
    }

}
