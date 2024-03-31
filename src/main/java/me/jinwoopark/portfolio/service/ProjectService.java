package me.jinwoopark.portfolio.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.jinwoopark.portfolio.domain.Project;
import me.jinwoopark.portfolio.dto.AddProjectRequest;
import me.jinwoopark.portfolio.dto.UpdateProjectRequest;
import me.jinwoopark.portfolio.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public Project save(AddProjectRequest request) {
        return projectRepository.save(request.toEntity());
    }

    public List<Project> findAll() {
        return projectRepository.findAllByOrderByIdDesc();
    }

    public Project findById(long id) {
        return projectRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }

    public void delete(long id) {
        projectRepository.deleteById(id);
    }

    @Transactional
    public Project update(long id, UpdateProjectRequest request) {
        Project project = projectRepository.findById(id).orElseThrow(() ->new IllegalArgumentException("not found : " + id));
        project.update(request.getTitle(), request.getImage(), request.getResult(), request.getGithub(), request.getContent());

        return project;
    }


}
