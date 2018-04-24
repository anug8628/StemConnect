package com.example.anushka.my_application;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

//    public void onProfileButtonClick(View v)  {
//        Intent intent = new Intent(this, MapsActivityOne.class);
//        startActivity(intent);
//    }
//
//    public void onMapButtonClick(View v)  {
//        Intent intent = new Intent(this, MapsActivityOne.class);
//        startActivity(intent);
//    }

    public void onOppButtonClick(View v)  {
        Intent intent = new Intent(this, MapsActivityOne.class);
        startActivity(intent);
    }

    public void onMentorButtonClick(View v)  {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
