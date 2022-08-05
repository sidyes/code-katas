package com.codekatas.challenges.christmaslights;

import lombok.Getter;

@Getter
public class ChristmasLightsGrid {
  public static final int GRID_SIZE = 1000;

  private int[][] grid;

  /********** 1000x1000 GRID **********
   *(0,0)   |  (0,1) |........|........|(0,999)
   *(1,0)   |  (1,1) |........|........|(1,999)
   * ...    |........|........|........|.........
   * (999,0)| (999,1)|........|........|(999,999)
   ************************************/

  public ChristmasLightsGrid() {
    this.grid = new int[1000][1000];

    for (int i = 0; i < GRID_SIZE; i++) {
      for (int j = 0; j < GRID_SIZE; j++) {
        grid[i][j] = 0;
      }
    }
  }

  /**
   * SCENARIO I
   **/

  public int getNumberOfLitLights() {
    // TODO
    return 0;
  }

  public void turnOnLight(Coordinate coordinate) {
    // TODO
  }

  public void turnOffLight(Coordinate coordinate) {
    // TODO
  }

  public void toggleLight(Coordinate coordinate) {
    // TODO
  }

  /**
   * SCENARIO II
   **/

  public int getGridBrightness() {
    // TODO
    return 0;
  }

  public void turnOnBrightness(Coordinate coordinate) {
    // TODO
  }

  public void turnOffBrightness(Coordinate coordinate) {
    // TODO
  }

  public void toggleBrightness(Coordinate coordinate) {
    // TODO
  }

}
