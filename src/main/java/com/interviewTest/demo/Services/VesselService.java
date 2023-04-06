package com.interviewTest.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewTest.demo.Exceptions.RequestException;
import com.interviewTest.demo.Models.Position;
import com.interviewTest.demo.Models.Vessel;
import com.interviewTest.demo.Repositories.VesselRepository;

@Service
public class VesselService {
  @Autowired
  private VesselRepository vesselRepo;

  @Autowired
  private PositionService positionService;

  public Optional<Vessel> findByNameAndCountry(String name, String country) {
    return vesselRepo.findByNameAndCountry(name, country);
  }

  public Vessel save(Vessel v) {
    return vesselRepo.save(v);
  }

  public void addPosition(Vessel vessel, Position newPosition) {
    Optional<Vessel> retrievedVessel = findByNameAndCountry(vessel.getName(), vessel.getCountry());

    retrievedVessel.ifPresentOrElse(v -> {
      Position p = positionService.save(newPosition);
      p.linkToVessel(v);
      v.addPosition(p);
      save(v);
    }, () -> {
      throw new RequestException("Vessel not found");
    });

  }
}
