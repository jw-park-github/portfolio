package me.jinwoopark.portfolio.controller;

import lombok.RequiredArgsConstructor;
import me.jinwoopark.portfolio.domain.Project;
import me.jinwoopark.portfolio.dto.AddProjectRequest;
import me.jinwoopark.portfolio.dto.ProjectResponse;
import me.jinwoopark.portfolio.dto.UpdateProjectRequest;
import me.jinwoopark.portfolio.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProjectApiController {

    private final ProjectService projectService;

    @PostMapping("/api/projects")
    public ResponseEntity<Project> addProject(@RequestBody AddProjectRequest request) {

        Project savedProject = projectService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedProject);
    }

    @GetMapping("/api/projects")
    public ResponseEntity<List<ProjectResponse>> findAllProjects() {

        List<ProjectResponse> projects = projectService.findAll()
                .stream()
                .map(ProjectResponse::new)
                .toList();

        return ResponseEntity.ok().body(projects);
    }
    @GetMapping("/api/projects/{id}")
    public ResponseEntity<ProjectResponse> findProject(@PathVariable long id) {

        Project project = projectService.findById(id);

        return ResponseEntity.ok().body(new ProjectResponse(project));
    }

    @DeleteMapping("/api/projects/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable long id) {

        projectService.delete(id);

        return ResponseEntity.ok().build();
    }

    @PutMapping("/api/projects/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable long id, @RequestBody UpdateProjectRequest request) {

        Project updatedProject = projectService.update(id, request);

        return ResponseEntity.ok().body(updatedProject);
    }
}
