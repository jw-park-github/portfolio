package me.jinwoopark.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.jinwoopark.portfolio.domain.Project;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddProjectRequest {

    private String title;
    private String image;
    private String result;
    private String github;
    private String content;


    public Project toEntity() {
        return Project.builder().
                title(title).
                image(image).
                result(result).
                github(github).
                content(content).
                build();
    }
}
