package com.project.animation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.animation.Model.Animation;
@Repository
public interface animationRepository extends JpaRepository<Animation, Integer> {

}
