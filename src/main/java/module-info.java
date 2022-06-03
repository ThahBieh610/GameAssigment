module com.example.rthabile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rthabile to javafx.fxml;
    exports com.example.rthabile;
    exports com.example.assigment5;
    opens com.example.assigment5 to javafx.fxml;
}