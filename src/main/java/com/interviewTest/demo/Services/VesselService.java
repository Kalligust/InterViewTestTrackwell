package com.interviewTest.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewTest.demo.Models.Position;
import com.interviewTest.demo.Models.Vessel;
import com.interviewTest.demo.Repositories.VesselRepository;

@Service
public class VesselService {
  @Autowired
  private VesselRepository vesselRepo;

  @Autowired
  private PositionService positionService;

  public Vessel findByName(String name) {
    return vesselRepo.findByName(name);
  }

  public Vessel findByNameAndCountry(String name, String country) {
    return vesselRepo.findByNameAndCountry(name, country);
  }

  public Vessel save(Vessel v) {
    return vesselRepo.save(v);
  }

  public Vessel addPosition(Position p, String vesselName, String country) {
    Position newPosition = positionService.save(p);
    Vessel vessel = findByNameAndCountry(vesselName, country);
    newPosition.linkToVessel(vessel);
    vessel.addPosition(newPosition);
    return save(vessel);

  }
}
