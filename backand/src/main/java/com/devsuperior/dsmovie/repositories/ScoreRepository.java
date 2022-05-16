package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entitis.Score;
import com.devsuperior.dsmovie.entitis.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
