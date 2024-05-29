package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

public class profilActivity extends AppCompatActivity {

    SearchView searchView;
    ImageView settingImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        // Initialize settingImageView after setContentView
        settingImageView = findViewById(R.id.setting);

        settingImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.popup_profil_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.action_main) {
                    // Handle profile action
                    Intent intent = new Intent(profilActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true; // startActivity was successful, so return true
                } else if (item.getItemId() == R.id.action_logout) {
                    // Handle logout action
                    Intent intent = new Intent(profilActivity.this, girisActivity.class);
                    startActivity(intent);
                    finish(); // Optionally call finish to remove this activity from the back stack
                    return true; // startActivity was successful, so return true
                }
                return false; // menu item not recognized, so return false
            }
        });
        popupMenu.show();
    }
}
