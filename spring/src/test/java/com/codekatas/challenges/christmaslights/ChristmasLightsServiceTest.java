package com.codekatas.challenges.christmaslights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.codekatas.challenges.christmaslights.ChristmasLightsGrid.GRID_SIZE;

@ExtendWith(MockitoExtension.class)
public class ChristmasLightsServiceTest {
  private ChristmasLightsGrid emptyGrid;
  private ChristmasLightsGrid fulLGrid;

  @InjectMocks
  private ChristmasLightsService christmasLightsService;


  @BeforeEach
  public void setup() {
    emptyGrid = new ChristmasLightsGrid();
    fulLGrid = new ChristmasLightsGrid();

    for (int i = 0; i < GRID_SIZE; i++) {
      for (int j = 0; j < GRID_SIZE; j++) {
        fulLGrid.getGrid()[i][j] = 1;
      }
    }
  }

  @Test
  public void testModifyLightsShouldTurnOnLights() {
    var coordinates = CoordinatePair.builder()
                                    .from(Coordinate.builder().row(0).column(0).build())
                                    .to(Coordinate.builder().row(999).column(999).build()).build();

    var result = christmasLightsService.modifyLights(emptyGrid, coordinates, Action.TURN_ON);

    Assertions.assertEquals(1000000, result);
  }

  @Test
  public void testModifyLightsShouldTurnOffLights() {

    var coordinates = CoordinatePair.builder()
                                    .from(Coordinate.builder().row(499).column(499).build())
                                    .to(Coordinate.builder().row(500).column(500).build()).build();

    var result = christmasLightsService.modifyLights(fulLGrid, coordinates, Action.TURN_OFF);

    Assertions.assertEquals(999996, result);
  }

  @Test
  public void testModifyLightsShouldToggleLightsEmpty() {

    var coordinates = CoordinatePair.builder()
                                    .from(Coordinate.builder().row(0).column(0).build())
                                    .to(Coordinate.builder().row(0).column(999).build()).build();

    var result = christmasLightsService.modifyLights(emptyGrid, coordinates, Action.TOGGLE);

    Assertions.assertEquals(1000, result);
  }

  @Test
  public void testModifyLightsShouldToggleLightsFull() {

    var coordinates = CoordinatePair.builder()
                                    .from(Coordinate.builder().row(0).column(0).build())
                                    .to(Coordinate.builder().row(0).column(999).build()).build();

    var result = christmasLightsService.modifyLights(fulLGrid, coordinates, Action.TOGGLE);

    Assertions.assertEquals(999000, result);
  }

  @Test
  @Disabled
  public void testModifyLightsShouldWinContest() {
    var grid = new ChristmasLightsGrid();

    var step1 = createCoordinatePair(887, 9, 959, 629);
    christmasLightsService.modifyLights(grid, step1, Action.TURN_ON);

    var step2 = createCoordinatePair(454, 398, 844, 448);
    christmasLightsService.modifyLights(grid, step2, Action.TURN_ON);

    var step3 = createCoordinatePair(539, 243, 559, 965);
    christmasLightsService.modifyLights(grid, step3, Action.TURN_OFF);

    var step4 = createCoordinatePair(370,819, 676, 868);
    christmasLightsService.modifyLights(grid, step4, Action.TURN_OFF);

    var step5 = createCoordinatePair(145, 40, 370, 997);
    christmasLightsService.modifyLights(grid, step5, Action.TURN_OFF);

    var step6 = createCoordinatePair(301, 3, 808, 453);
    christmasLightsService.modifyLights(grid, step6, Action.TURN_OFF);

    var step7 = createCoordinatePair(351, 678, 951, 908);
    christmasLightsService.modifyLights(grid, step7, Action.TURN_ON);

    var step8 = createCoordinatePair(720, 196, 897, 994);
    christmasLightsService.modifyLights(grid, step8, Action.TOGGLE);

    var step9 = createCoordinatePair(831, 394, 904, 860);
    var result = christmasLightsService.modifyLights(grid, step9, Action.TOGGLE);

    Assertions.assertEquals(230022, result);
  }

  @Test
  public void testModifyBrightnessShouldWinContest() {
    var grid = new ChristmasLightsGrid();

    var step1 = createCoordinatePair(887, 9, 959, 629);
    christmasLightsService.modifyBrightness(grid, step1, Action.TURN_ON);

    var step2 = createCoordinatePair(454, 398, 844, 448);
    christmasLightsService.modifyBrightness(grid, step2, Action.TURN_ON);

    var step3 = createCoordinatePair(539, 243, 559, 965);
    christmasLightsService.modifyBrightness(grid, step3, Action.TURN_OFF);

    var step4 = createCoordinatePair(370,819, 676, 868);
    christmasLightsService.modifyBrightness(grid, step4, Action.TURN_OFF);

    var step5 = createCoordinatePair(145, 40, 370, 997);
    christmasLightsService.modifyBrightness(grid, step5, Action.TURN_OFF);

    var step6 = createCoordinatePair(301, 3, 808, 453);
    christmasLightsService.modifyBrightness(grid, step6, Action.TURN_OFF);

    var step7 = createCoordinatePair(351, 678, 951, 908);
    christmasLightsService.modifyBrightness(grid, step7, Action.TURN_ON);

    var step8 = createCoordinatePair(720, 196, 897, 994);
    christmasLightsService.modifyBrightness(grid, step8, Action.TOGGLE);

    var step9 = createCoordinatePair(831, 394, 904, 860);
    var result = christmasLightsService.modifyBrightness(grid, step9, Action.TOGGLE);

    Assertions.assertEquals(135339, result);
  }


  /**
   * Helper method to create coordinate pairs.
   *
   * @param rowStart    range start row
   * @param columnStart range start column
   * @param rowEnd      range end row
   * @param columnEnd   range end column
   * @return coordinate pair
   */
  private CoordinatePair createCoordinatePair(int rowStart, int columnStart, int rowEnd,
                                              int columnEnd) {
    return CoordinatePair.builder()
                         .from(Coordinate.builder().row(rowStart).column(columnStart).build())
                         .to(Coordinate.builder().row(rowEnd).column(columnEnd).build()).build();
  }

}
