package sudoku.userinterface;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import sudoku.problemdomain.SudokuGame;

import java.util.HashMap;

public class UserInterfaceImpl implements IUserInterfaceContract.view {
    EventHandler<KeyEvent> {

        private final Stage stage;
        private final Group root;

        // how do we keep track of 81 different text field??
        // don't make a different variable for each field.
        // instead use a hash map.

        private HashMap<Coordinates, SudokuTextField> textFieldCoordinates;
        private IUserInterfaceContract.EventListener listener;

        private static final double WINDOW_Y = 732;
        private static final double WINDOW_X = 668;
        private static final double BOARD_PADDING = 50;
        private static final double BOARD_X_AND_Y = 576;

        private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(0, 150, 136);
        private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(224, 242, 241);
        private static final String SUDOKU = "Sudoku";

        public UserInterfaceImpl(Stage stage) {
            this.stage = stage;
            this.root = newGroup();
            this.textfieldCoordinates = new HashMap<>();
            initializeUserInterface();
        }

        private void initializeUserInterface() {
            drawBackground(root);
            drawTitle(root);
            drawSudokuBoard(root);
            drawTextFields(root);
            drawGridLines(root);
            stage.show();
        }

        private void drawGridLines(Group root) {

        }

        private void drawTextFields(Group root) {

        }

        private void drawSudokuBoard(Group root) {                )

        }

        private void drawTitle(Group root) {

        }

        private void drawBackground(Group root) {

        }

        @Override
        public void setListener(IUserInterfaceContract.EventListener listener) {
            this.listener = listener;
        }

        @Override
        public void updateSquare(int x, int y, int input) {

        }
    }
}
