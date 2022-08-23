package com.codekatas.challenges.christmaslights;

public class Coordinate {
  // representing (row,column) in a grid
  private int row;
  private int column;

  public Coordinate(int row, int column) {
    this.row = row;
    this.column = column;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public int getRow() {
    return this.row;
  }

  public void setColumn(int column) {
    this.column = column;
  }

  public int getColumn() {
    return this.getColumn();
  }
}
