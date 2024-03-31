package me.jinwoopark.portfolio.controller;

import me.jinwoopark.portfolio.domain.Profile;
import me.jinwoopark.portfolio.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    // 메인 페이지
    @GetMapping("/")
    public String showMainPage(Model model) {
        Profile profile = profileRepository.findAll().stream().findFirst().orElse(new Profile());
        model.addAttribute("profile", profile);
        return "index";
    }

    // 수정 페이지
    @GetMapping("/edit")
    public String showEditPage(Model model) {
        Profile profile = profileRepository.findAll().stream().findFirst().orElse(new Profile());
        model.addAttribute("profile", profile);
        return "edit";
    }

    // 프로필 수정 처리
    @PostMapping("/update")
    public String updateProfile(@RequestParam("mainImage") String mainImage,
                                @RequestParam("about") String about,
                                @RequestParam("otherOne") String otherOne,
                                @RequestParam("otherTwo") String otherTwo,
                                @RequestParam("otherThree") String otherThree,
                                @RequestParam("otherFour") String otherFour,
                                @RequestParam("otherFive") String otherFive,
                                @RequestParam("otherSix") String otherSix) {
        Profile profile = profileRepository.findAll().stream().findFirst().orElse(new Profile());
        profile.setMainImage(mainImage);
        profile.setAbout(about);
        profile.setOtherOne(otherOne);
        profile.setOtherTwo(otherTwo);
        profile.setOtherThree(otherThree);
        profile.setOtherFour(otherFour);
        profile.setOtherFive(otherFive);
        profile.setOtherSix(otherSix);
        profileRepository.save(profile);
        return "redirect:/";
    }
}