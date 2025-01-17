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
            "[ HE ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ GC ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ MN ][ MN ][ MN ][ MN ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ MN ][ MN ][ MN ][ MN ][ MN ][ MN ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ MN ][ MN ][ MN ][ MN ][ MN ][ MN ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ MN ][ MN ][ MN ][ MN ][ MN ][ MN ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ MN ][ MN ][ MN ][ MN ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ FS ][ FS ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ FS ][ FS ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ]\n" +
            "[ IK ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ PL ][ UT ]\n" +
            "\n" +
            "Scores:\n" +
            "Holy Empire = 0\n" +
            "Immortal Kingdom = 0\n" +
            "Goblins Confederation = 0\n" +
            "United Tribes = 0\n" +
            "\n" +
            "Resources: Actions / Wood\n" +
            "Holy Empire = 2 / 0 \n" +
            "Immortal Kingdom = 2 / 0 \n" +
            "Goblins Confederation = 2 / 0 \n" +
            "United Tribes = 2 / 0 \n" +
            "\n"
        Menu.showGameArea should be(expectedResult)
      }
    }
  }
}
