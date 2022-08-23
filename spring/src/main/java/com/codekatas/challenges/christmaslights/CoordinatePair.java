package com.codekatas.challenges.christmaslights;

public class CoordinatePair {

  // representing range from(row,column) to(row,column)
  private Coordinate from;
  private Coordinate to;

  public CoordinatePair(Coordinate from, Coordinate to) {
    this.from = from;
    this.to = to;
  }

  public void setFrom(Coordinate from) {
    this.from = from;
  }

  public Coordinate getFrom() {
    return this.from;
  }

  public void setTo(Coordinate to) {
    this.to = to;
  }

  public Coordinate getTo() {
    return this.to;
  }
}
