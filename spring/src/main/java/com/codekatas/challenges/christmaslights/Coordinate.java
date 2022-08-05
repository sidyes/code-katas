package com.codekatas.challenges.christmaslights;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Coordinate {

  // representing (row,column) in a grid
  private int row;
  private int column;
}
