module org.sistema.bimba {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires org.hibernate.orm.community.dialects;
    requires static lombok;

    opens org.sistema.bimba to javafx.fxml;
    exports org.sistema.bimba;
    exports org.sistema.bimba.model;
    opens org.sistema.bimba.model to org.hibernate.orm.core;
}
