package com.example.prestigeportfoliocreators.repository;

import com.example.prestigeportfoliocreators.models.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepository extends JpaRepository<Stats,Long> {
}
