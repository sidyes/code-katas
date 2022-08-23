package com.codekatas.challenges.christmaslights;

public abstract class AbstractChristmasLightsGrid {
  public static final int GRID_SIZE = 1000;

  private int[][] grid;

  /********** 1000x1000 GRID **********
   *(0,0)   |  (0,1) |........|........|(0,999)
   *(1,0)   |  (1,1) |........|........|(1,999)
   * ...    |........|........|........|.........
   * (999,0)| (999,1)|........|........|(999,999)
   ************************************/

  public AbstractChristmasLightsGrid() {
    this.grid = new int[1000][1000];

    for (int i = 0; i < GRID_SIZE; i++) {
      for (int j = 0; j < GRID_SIZE; j++) {
        grid[i][j] = 0;
      }
    }
  }

  public int[][] getGrid() {
    return this.grid;
  }

  public abstract int getNumberOfLitLights();

  public abstract void turnOnLight(Coordinate coordinate);

  public abstract void turnOffLight(Coordinate coordinate);

  public abstract void toggleLight(Coordinate coordinate);
}
