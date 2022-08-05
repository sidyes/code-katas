package com.codekatas.challenges.christmaslights;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.codekatas.challenges.christmaslights.ChristmasLightsGrid.GRID_SIZE;

@ExtendWith(MockitoExtension.class)
public class ChristmasLightsGridTest {
  private ChristmasLightsGrid fullGrid;
  private ChristmasLightsGrid emptyGrid;


  @BeforeEach
  public void setup() {
    fullGrid = new ChristmasLightsGrid();
    emptyGrid = new ChristmasLightsGrid();
    for (int i = 0; i < GRID_SIZE; i++) {
      for (int j = 0; j < GRID_SIZE; j++) {
        fullGrid.getGrid()[i][j] = 1;
      }
    }
  }
}
