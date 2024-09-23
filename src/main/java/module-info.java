module com.moosematrix.moosemanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.moosematrix.moosemanager to javafx.fxml;
    exports com.moosematrix.moosemanager;
}
