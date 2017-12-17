package com.github.mousesrc.jfxdarcula;

import javafx.scene.Parent;
import javafx.scene.Scene;

public interface DarculaHelper {
	
	static String DARCULA_CSS_URL = DarculaHelper.class.getResource("darcula.css").toExternalForm();
	
	static void applyDarculaStyle(Scene scene){
		scene.getStylesheets().add(DARCULA_CSS_URL);
	}
	
	static void applyDarculaStyle(Parent parent){
		parent.getStylesheets().add(DARCULA_CSS_URL);
	}
}
