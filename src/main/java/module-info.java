module com.example.school_manager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.school_manager to javafx.fxml;
    exports com.example.school_manager;
    opens com.example.school_manager.Controllers to javafx.fxml;
    exports com.example.school_manager.Controllers;
}