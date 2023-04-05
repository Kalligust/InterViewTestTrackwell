package com.interviewTest.demo.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Vessel {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String country;

  @OneToMany(mappedBy = "vessel", fetch = FetchType.EAGER)
  private List<Position> positions = new ArrayList<>();

  public Vessel() {
  }

  public Vessel(String name, String country) {
    this.name = name;
    this.country = country;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCountry() {
    return country;
  }

  public void setVesselCountry(String country) {
    this.country = country;
  }

  public List<Position> getPositions() {
    return positions;
  }

  public void setPositions(List<Position> positions) {
    this.positions = positions;
  }

  public void addPosition(Position position) {
    this.positions.add(position);
  }

}
