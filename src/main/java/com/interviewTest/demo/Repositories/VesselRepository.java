package com.interviewTest.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interviewTest.demo.Models.Vessel;

public interface VesselRepository extends JpaRepository<Vessel, Long> {

  Vessel findByName(String name);

}
