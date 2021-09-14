package com.example.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the gameboard
        GameBoardSurfaceView gameBoardSurfaceView = (GameBoardSurfaceView) findViewById(R.id.gameBoardSurfaceView);

        WhiteChipSurfaceView whiteChipSurfaceView = (WhiteChipSurfaceView) findViewById(R.id.whiteChipSurfaceView);
        BlackChipSurfaceView blackChipSurfaceView= (BlackChipSurfaceView) findViewById(R.id.blackChipSurfaceView);

    }
}