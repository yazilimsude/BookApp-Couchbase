package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kayitActivity extends AppCompatActivity {
    TextView name, email, password, signIn;
    Button signUp;
    ImageView settingImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit); // activity_kayit.xml adında bir layout dosyasını kullanın

        // XML elemanlarını Java değişkenlerine bağlama
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signIn = findViewById(R.id.signIn);
        signUp = findViewById(R.id.signUp);

        // signUp butonuna tıklama olayını tanımlama
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kayitActivity.this, girisActivity.class);
                startActivity(intent);
            }
        });

        signIn.setOnClickListener(new View.OnClickListener()
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(kayitActivity.this, girisActivity.class);
            startActivity(intent);
        }
    });


    }
}
