package com.example.gui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class BlackChipSurfaceView extends SurfaceView {
    private Paint blackChip;
    private int radius;
    private Paint background;

    public BlackChipSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setWillNotDraw(false);

        blackChip = new Paint();
        blackChip.setARGB(255, 0, 0, 0);

        radius = 25;

        background = new Paint();
        background.setARGB(255, 241, 180, 80);
    }

    @Override
    public void onDraw(Canvas canvas){
        canvas.drawCircle(150,150, 150, background);

        canvas.drawCircle(70, 70, radius, blackChip);
        canvas.drawCircle(250, 120, radius, blackChip);
        canvas.drawCircle(125, 250, radius, blackChip);
        canvas.drawCircle(175, 115, radius, blackChip);

    }
}
