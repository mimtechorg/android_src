package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class day1activity extends AppCompatActivity {
 final String TAG ="day1activity ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1activity);
        Log.e(TAG, "onCreate: " );
        Toast.makeText(getApplicationContext(), "onCreate: ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: " );
        Toast.makeText(getApplicationContext(), "onStart: ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: " );
        Toast.makeText(getApplicationContext(), "onResume: ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: " );
        Toast.makeText(getApplicationContext(), "onPause: ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: " );
        Toast.makeText(getApplicationContext(), "onStop: ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: " );
        Toast.makeText(getApplicationContext(), "onDestroy: ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: " );
        Toast.makeText(getApplicationContext(), "onRestart: ", Toast.LENGTH_SHORT).show();
    }
}
