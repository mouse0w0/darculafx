package com.github.mouse0w0.jfxdarcula;

import javafx.scene.Parent;
import javafx.scene.Scene;

public final class DarculaHelper {

    public static final String DARCULA_STYLE_URL = DarculaHelper.class.getResource("darcula.css").toExternalForm();

    public static void applyDarculaStyle(Scene scene) {
        scene.getStylesheets().add(DARCULA_STYLE_URL);
    }

    public static void applyDarculaStyle(Parent parent) {
        parent.getStylesheets().add(DARCULA_STYLE_URL);
    }

    private DarculaHelper() {
        // Nothing to do.
    }
}
