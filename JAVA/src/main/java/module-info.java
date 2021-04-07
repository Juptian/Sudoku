module SUDOKU_JAVA {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens org.openjfx to javafx.fxml;
    exports io.github.juptian.main;
    exports org.openjfx;
}