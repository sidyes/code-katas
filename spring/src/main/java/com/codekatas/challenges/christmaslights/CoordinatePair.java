package com.codekatas.challenges.christmaslights;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CoordinatePair {

  // representing range from(row,column) to(row,column)
  private Coordinate from;
  private Coordinate to;
}
