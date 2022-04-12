module com.cjp_proj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cjp_proj to javafx.fxml;
    exports com.cjp_proj;
}