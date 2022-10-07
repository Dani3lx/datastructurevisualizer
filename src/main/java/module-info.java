module com.example.datastructurevisualizer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datastructurevisualizer to javafx.fxml;
    exports com.example.datastructurevisualizer;
}