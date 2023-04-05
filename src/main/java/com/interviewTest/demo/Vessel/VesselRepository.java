package com.interviewTest.demo.Vessel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VesselRepository extends JpaRepository<Vessel, Long> {

  Vessel findByName(String name);

}
