module org.home.cursoJavaFX {
    requires transitive javafx.controls;
    requires javafx.fxml;
	requires transitive org.slf4j;
	requires java.persistence;
	requires org.hibernate.orm.core;
	requires java.naming;
	
    opens org.home.cursoJavaFX to javafx.fxml;
    exports org.home.cursoJavaFX;

}