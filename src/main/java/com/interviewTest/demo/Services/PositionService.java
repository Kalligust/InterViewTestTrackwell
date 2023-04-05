package com.interviewTest.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewTest.demo.Models.Position;
import com.interviewTest.demo.Repositories.PositionRepository;

@Service
public class PositionService {

  @Autowired
  private PositionRepository positionRepo;

  public Position save(Position p) {
    return positionRepo.save(p);
  }

}
