package me.jinwoopark.portfolio.repository;

import me.jinwoopark.portfolio.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
