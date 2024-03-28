package com.muen.crazycat.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.muen.crazycat.View.GameView;


public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GameView gameView = new GameView(this);
        setContentView(gameView);
        getSupportActionBar().hide();
    }
}
