package me.jinwoopark.portfolio.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.jinwoopark.portfolio.domain.Project;

@NoArgsConstructor
@Getter
public class ProjectViewResponse {

    private Long id;
    private String title;
    private String image;
    private String result;
    private String github;
    private String content;


    public ProjectViewResponse(Project project) {

        this.id = project.getId();
        this.title = project.getTitle();
        this.image = project.getImage();
        this.result = project.getResult();
        this.github = project.getGithub();
        this.content = project.getContent();
    }
}
