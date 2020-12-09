package com.tec.ui;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ZonaDibujo {
    private Canvas zd;

    public ZonaDibujo(Canvas zd) {
        this.zd = zd;
        GraphicsContext gc = this.zd.getGraphicsContext2D();
        gc.setFill(Color.web("#e8e8e8"));
        gc.fillRect(0, 0,  740,520);
        gc.setStroke(Color.BLACK);
        gc.setFill(Color.WHITE);

    }
}
