package me.jinwoopark.portfolio.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UpdateProjectRequest {

    private Long id;
    private String title;
    private String image;
    private String result;
    private String github;
    private String content;

}
