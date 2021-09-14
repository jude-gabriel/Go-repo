package com.example.gui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

public class WhiteChipSurfaceView extends SurfaceView {
    private Paint whiteChip;
    private int radius;
    private Paint background;

    public WhiteChipSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setWillNotDraw(false);


        whiteChip = new Paint();
        whiteChip.setARGB(255, 255, 255, 255);

        radius = 25;

        background = new Paint();
        background.setARGB(255, 241, 180, 80);
    }

    @Override
    public void onDraw(Canvas canvas){
        canvas.drawCircle(150,150, 150, background);

        canvas.drawCircle(70, 70, radius, whiteChip);
        canvas.drawCircle(250, 120, radius, whiteChip);
        canvas.drawCircle(125, 250, radius, whiteChip);
        canvas.drawCircle(175, 115, radius, whiteChip);

    }
}
