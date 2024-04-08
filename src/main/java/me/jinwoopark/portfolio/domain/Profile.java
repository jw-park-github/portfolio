package me.jinwoopark.portfolio.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "main_image", length = 300, nullable = false)
    private String mainImage;

    @Column(name = "about", length = 500, nullable = false)
    private String about;

    @Column(name = "other_one", length = 300, nullable = false)
    private String otherOne;

    @Column(name = "other_two", length = 300, nullable = false)
    private String otherTwo;

    @Column(name = "other_three", length = 300, nullable = false)
    private String otherThree;

    @Column(name = "other_four", length = 300, nullable = false)
    private String otherFour;

    @Column(name = "other_five", length = 300, nullable = false)
    private String otherFive;

    @Column(name = "other_six", length = 20000, nullable = false)
    private String otherSix;

}
