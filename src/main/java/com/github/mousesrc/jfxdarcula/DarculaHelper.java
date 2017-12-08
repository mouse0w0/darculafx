package com.github.mousesrc.jfxdarcula;

import javafx.scene.Parent;
import javafx.scene.Scene;

public interface DarculaHelper {
	
	static String DARCULA_CONTAINER_CLASS = "darcula-container";
	static String DARCULA_CSS_URL = DarculaHelper.class.getResource("darcula.css").toExternalForm();

	static void setDarculaContainerStyleClass(Parent parent){
		parent.getStyleClass().add(DARCULA_CONTAINER_CLASS);
	}
	
	static void setDarculaCss(Scene scene){
		scene.getStylesheets().add(DARCULA_CSS_URL);
	}
	
	static void setDarculaCss(Parent parent){
		parent.getStylesheets().add(DARCULA_CSS_URL);
	}
}
