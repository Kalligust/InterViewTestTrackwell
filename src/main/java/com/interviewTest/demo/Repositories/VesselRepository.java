package com.interviewTest.demo.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.interviewTest.demo.Models.Vessel;

public interface VesselRepository extends JpaRepository<Vessel, Long> {

  Optional<Vessel> findByNameAndCountry(String name, String country);

}
