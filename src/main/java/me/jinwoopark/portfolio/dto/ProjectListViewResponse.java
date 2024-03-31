package me.jinwoopark.portfolio.dto;

import lombok.Getter;
import me.jinwoopark.portfolio.domain.Project;

@Getter
public class ProjectListViewResponse {

    private final Long id;
    private final String title;
    private final String image;
    private final String result;
    private final String github;
    private final String content;


    public ProjectListViewResponse(Project project) {

        this.id = project.getId();
        this.title = project.getTitle();
        this.image = project.getImage();
        this.result = project.getResult();
        this.github = project.getGithub();
        this.content = project.getContent();
    }
}
