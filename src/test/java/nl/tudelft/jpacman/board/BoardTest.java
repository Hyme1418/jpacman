package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class BoardTest {
    @Test
    void testValidBoard() {
        //Construct a 1x1 grid with a null square
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        //Create board with grid
        Board board = new Board(grid);
        //Check that the board has basic square
        assertThat(board.squareAt(0,0)).isEqualTo(grid[0][0]);
    }
    @Test
    void testNullBoard() {
        // Construct a 1x1 grid with a null square
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;

        assertThrows(AssertionError.class, () -> {
            new Board(grid);
        });
    }
}
