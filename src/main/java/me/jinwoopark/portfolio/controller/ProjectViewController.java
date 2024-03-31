package me.jinwoopark.portfolio.controller;

import lombok.RequiredArgsConstructor;
import me.jinwoopark.portfolio.domain.Project;
import me.jinwoopark.portfolio.dto.ProjectListViewResponse;
import me.jinwoopark.portfolio.dto.ProjectViewResponse;
import me.jinwoopark.portfolio.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@RequiredArgsConstructor
@Controller
public class ProjectViewController {

    private final ProjectService projectService;

    @GetMapping("/projects")
    public String getProjects(Model model) {
        List<ProjectListViewResponse> projects = projectService.findAll()
                .stream()
                .map(ProjectListViewResponse::new)
                .toList();
        model.addAttribute("projects", projects);

        return "projectList";
    }

    @GetMapping("/projects/{id}")
    public String getProject(@PathVariable Long id, Model model) {
        Project project = projectService.findById(id);
        model.addAttribute("project", new ProjectViewResponse(project));

        return "project";
    }


    @GetMapping("/new-project")
    public String newProject(@RequestParam(required = false) Long id, Model model) {
        if (id == null) {
            model.addAttribute("project", new ProjectViewResponse());
        } else {
            Project project = projectService.findById(id);
            model.addAttribute("project", new ProjectViewResponse(project));
        }

        return "newProject";
    }
}
