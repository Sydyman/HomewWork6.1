package com.ex.homewwork6;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView answerTextView = findViewById(R.id.answer);
        int result = getIntent().getIntExtra("result", 0);
        answerTextView.setText(String.valueOf(result));
    }
}
