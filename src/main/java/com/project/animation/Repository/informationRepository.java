package com.project.animation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.animation.Model.Information;

@Repository
public interface informationRepository extends JpaRepository<Information, Integer> {

}
