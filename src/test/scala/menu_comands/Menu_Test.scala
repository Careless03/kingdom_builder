package menu_commands

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Menu_Test extends AnyFunSpec with Matchers {
  describe("Kingdom Conquest Simulation") {
    describe("Has a menu") {

      // ******* SHOW PLAYER ORDER *******
      it("can show the player order") {
        val expectedResult =
          "Holy Empire, Immortal Kingdom, Goblin Confederation, United Tribes"
        Menu.showPlayerOrder should be(expectedResult)
      }

      // ******* ADVANCE ORDER *******
      it("can advance the player order") {
        val expectedResult =
          "Holy Empire, Immortal Kingdom, Goblin Confederation, United Tribes"
        Menu.advancePlayerOrder should be(expectedResult)
      }

      // ******* SHOW GAME AREA *******
      it(
        "can show the game area, including the 10 x 10 board, kingdom scores and their resources "
      ) {
        val expectedResult =
          "Conquer Area:\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "\n" +
            "Scores:\n" +
            "Holy Empire = 0\n" +
            "Immortal Kingdom = 0\n" +
            "Goblins Confederation = 0\n" +
            "United Tribes = 0\n" +
            "\n" +
            "Resources: Actions / Wood\n" +
            "Holy Empire = 1 / 0 \n" +
            "Immortal Kingdom = 1 / 0 \n" +
            "Goblins Confederation = 1 / 0 \n" +
            "United Tribes = 1 / 0 \n" +
            "\n"
        Menu.showGameArea should be(expectedResult)
      }
    }
  }
}
