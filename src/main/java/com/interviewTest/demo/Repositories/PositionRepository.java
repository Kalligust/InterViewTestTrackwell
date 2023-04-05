package com.interviewTest.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interviewTest.demo.Models.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {

}
