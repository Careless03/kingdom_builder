package menu_commands

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Menu_Test extends AnyFunSpec with Matchers {
  describe("Kingdom Conquest Simulation") {
    describe("Has a menu") {

      // ******* SHOW __AYER ORDER *******
      it("can show the __ayer order") {
        val expectedResult =
          "Holy Empire, Immortal Kingdom, Goblin Confederation, United Tribes"
        Menu.showPlayerOrder should be(expectedResult)
      }

      // ******* ADVANCE ORDER *******
      it("can advance the player order") {
        val expectedResult =
          "Immortal Kingdom, Goblin Confederation, United Tribes, Holy Empire"
        Menu.advancePlayerOrder should be(expectedResult)
      }

      // ******* SHOW GAME AREA *******
      it(
        "can show the game area, including the 10 x 10 board, kingdom scores and their resources "
      ) {
        val expectedResult =
          "Conquer Area:\n" +
            "[ HE ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ GC ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ MM ][ MM ][ MM ][ MM ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ MM ][ MM ][ MM ][ MM ][ MM ][ MM ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ MM ][ MM ][ MM ][ MM ][ MM ][ MM ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ MM ][ MM ][ MM ][ MM ][ MM ][ MM ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ MM ][ MM ][ MM ][ MM ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ $$ ][ $$ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ $$ ][ $$ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ]\n" +
            "[ IK ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ __ ][ UT ]\n" +
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
            "\n" +
            "Legend:\n" +
            "__ = Plain Tile\n" +
            "$$ = Forest Tile\n" +
            "MM = Mountain Tile\n" +
            "O = City Tile\n" +
            "\n"
        Menu.showGameArea should be(expectedResult)
      }
    }
  }
}
