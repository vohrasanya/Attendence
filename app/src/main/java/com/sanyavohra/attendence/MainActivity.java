package com.sanyavohra.attendence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity<button> extends AppCompatActivity {

    private Intent homepage;
    private View loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbtn = findViewById(R.id.loginbtn);
        Intent intent= new Intent(this,homepage.class);
        startActivity(intent);
        finish();

    }
}