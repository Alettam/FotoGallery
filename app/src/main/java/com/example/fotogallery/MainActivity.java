package com.example.fotogallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int numberRnd = (int) (Math.random()*100);
        TextView textView = findViewById(R.id.textView);
        textView.setText("http://myfile.org/" + String.valueOf(numberRnd));

    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View view) {
        finish();
    }
}
