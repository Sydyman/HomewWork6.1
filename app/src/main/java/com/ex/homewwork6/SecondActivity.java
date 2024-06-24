package com.ex.homewwork6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private ImageButton imageButton;
    private Boolean Image2 = true;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView answerTextView = findViewById(R.id.answer);
        imageButton = findViewById(R.id.imageButton);
        findViewById(R.id.next_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finishAffinity();




            }
        });

        int result = getIntent().getIntExtra("result", 0);
        answerTextView.setText(String.valueOf(result));

        imageButton.setOnClickListener(view -> {
            if (Image2) {
                imageButton.setImageResource(R.drawable.img_1);
                Toast.makeText(SecondActivity.this, "Button clicked - Image 2", Toast.LENGTH_SHORT).show();
            } else {
                imageButton.setImageResource(R.drawable.img_2);
                Toast.makeText(SecondActivity.this, "Button clicked - Image 1", Toast.LENGTH_SHORT).show();
            }
            Image2 = !Image2;
        });

    }

    private void finishActivity() {
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}

