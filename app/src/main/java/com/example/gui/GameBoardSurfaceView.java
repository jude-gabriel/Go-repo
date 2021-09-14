package com.example.gui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.io.FileOutputStream;

public class GameBoardSurfaceView extends SurfaceView {
    private Paint blackPaint;
    private Paint whitePaint;
    private int radius;

    public GameBoardSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        //Initialize board to draw
        setWillNotDraw(false);

        //Populate paint colors
        blackPaint = new Paint();
        blackPaint.setARGB(255, 0, 0, 0);
        whitePaint = new Paint();
        whitePaint.setARGB(255, 255, 255, 255);
        radius = 25;
    }

    @Override
    protected void onDraw(Canvas canvas){
        //Create a bitmap of the board image. Pass in resources and ID
        Bitmap gameBoard = BitmapFactory.decodeResource(getResources(), R.drawable.gameboard);

        //Draw the board on the canvas
        canvas.drawBitmap(gameBoard, 0.f, 0.f, null);

        //Draw a few black chips on the board to represent mid-game
        canvas.drawCircle(70, 70, radius, blackPaint);
        canvas.drawCircle(395, 390, radius, blackPaint);
        canvas.drawCircle(500, 500, radius, blackPaint);
        canvas.drawCircle(500, 390, radius, blackPaint);
        canvas.drawCircle(500, 170, radius, blackPaint);
        canvas.drawCircle(170, 390, radius, blackPaint);
        canvas.drawCircle(500, 280, radius, blackPaint);

        //Draw a few white chips on the board to represent mid-game
        canvas.drawCircle(500, 70, radius, whitePaint);
        canvas.drawCircle(395, 280, radius, whitePaint);
        canvas.drawCircle(610, 390, radius, whitePaint);
        canvas.drawCircle(610, 170, radius, whitePaint);
        canvas.drawCircle(610, 280, radius, whitePaint);
        canvas.drawCircle(500, 500, radius, whitePaint);
        canvas.drawCircle(830, 830, radius, whitePaint);
    }
}
