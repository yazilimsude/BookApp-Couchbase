package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class girisActivity extends AppCompatActivity {

    private Button signInButton;
    private TextView signUpTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        // signInButton'u bul ve tıklama olayı ekleyerek MainActivity'e yönlendir
        signInButton = findViewById(R.id.signInButton);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(girisActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // signUpTextView'u bul ve tıklama olayı ekleyerek kayitActivity'e yönlendir
        signUpTextView = findViewById(R.id.signUpTextView);
        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(girisActivity.this, kayitActivity.class);
                startActivity(intent);
            }
        });
    }
}
