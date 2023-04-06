package com.interviewTest.demo;

public class util {
  private static final double KNOT_CONVERSION_RATIO = 0.514444;

  // Convert knots to meters/second
  public static double knotsToMS(double knots) {
    return knots * KNOT_CONVERSION_RATIO;
  }
}
