package com.codekatas.challenges.christmaslights;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.codekatas.challenges.christmaslights.ChristmasLightsGrid.GRID_SIZE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ChristmasLightsServiceImplTest {
  private ChristmasLightsGrid emptyGrid;
  private ChristmasLightsGrid fulLGrid;

  // FIXME: use ChristmastLightsServiceImpl implementation of the interface
  private ChristmasLightsService christmasLightsService;


  @BeforeEach
  void setup() {
    emptyGrid = new ChristmasLightsGrid();
    fulLGrid = new ChristmasLightsGrid();

    for (int i = 0; i < GRID_SIZE; i++) {
      for (int j = 0; j < GRID_SIZE; j++) {
        fulLGrid.getGrid()[i][j] = 1;
      }
    }
  }

  /**
   * Ignore the following tests for now. These are final tests.
   */
  @Test
  @Disabled
  void testModifyLightsShouldWinContest() {
    var step1 = createCoordinatePair(887, 9, 959, 629);
    christmasLightsService.modifyLights(emptyGrid, step1, Action.TURN_ON);

    var step2 = createCoordinatePair(454, 398, 844, 448);
    christmasLightsService.modifyLights(emptyGrid, step2, Action.TURN_ON);

    var step3 = createCoordinatePair(539, 243, 559, 965);
    christmasLightsService.modifyLights(emptyGrid, step3, Action.TURN_OFF);

    var step4 = createCoordinatePair(370, 819, 676, 868);
    christmasLightsService.modifyLights(emptyGrid, step4, Action.TURN_OFF);

    var step5 = createCoordinatePair(145, 40, 370, 997);
    christmasLightsService.modifyLights(emptyGrid, step5, Action.TURN_OFF);

    var step6 = createCoordinatePair(301, 3, 808, 453);
    christmasLightsService.modifyLights(emptyGrid, step6, Action.TURN_OFF);

    var step7 = createCoordinatePair(351, 678, 951, 908);
    christmasLightsService.modifyLights(emptyGrid, step7, Action.TURN_ON);

    var step8 = createCoordinatePair(720, 196, 897, 994);
    christmasLightsService.modifyLights(emptyGrid, step8, Action.TOGGLE);

    var step9 = createCoordinatePair(831, 394, 904, 860);
    var result = christmasLightsService.modifyLights(emptyGrid, step9, Action.TOGGLE);

    assertEquals(230022, result);
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
    Coordinate from = new Coordinate(rowStart, columnStart);
    Coordinate to = new Coordinate(rowEnd, columnEnd);

    CoordinatePair pair = new CoordinatePair(from, to);
    return pair;
  }

}
