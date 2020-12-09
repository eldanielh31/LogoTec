package com.tec.ui;
import javafx.scene.canvas.Canvas;

import javafx.scene.control.MenuBar;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class UIEngine {
    private ZonaDibujo zd;
    private Menu_Controller mb;
    public UIEngine(Stage st,Scene sc) {

        zd=new ZonaDibujo((Canvas)sc.lookup("#la_zonaDeDibujo"));
        st.setScene(sc);
        st.sizeToScene();
    }
}
