module com.example.bibby {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bibby to javafx.fxml;
    exports com.example.bibby;
}