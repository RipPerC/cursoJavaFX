package org.home.cursoJavaFX;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.home.cursoJavaFX.model.Empleado;
import org.slf4j.Logger;



/**
 * JavaFX App
 */
public class App extends Application {

	public static final Logger LOG = LoggerFactory.getLogger(App.class);
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
    	LOG.info("Comienza el programa");
//    	launch();
    	
    	
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	session.beginTransaction();
    	        
    	List<Empleado> listado = session.createQuery("FROM Empleado").getResultList();
    			
    	LOG.info("En esta base de datos hay " + listado.size() + " empleados");
    	        
    	session.getTransaction();
    	session.close();

    }

}