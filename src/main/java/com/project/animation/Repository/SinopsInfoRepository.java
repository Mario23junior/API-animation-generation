package com.project.animation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.animation.Model.SinopsInfo;

@Repository
public interface SinopsInfoRepository extends JpaRepository<SinopsInfo, Integer>{

}
