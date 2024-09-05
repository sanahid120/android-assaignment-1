package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private static int ImageIndex = 0;
    private static final int[] imageResources = {R.drawable.img, R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4};
    private ImageView imageView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.iv_imageView);
        button = findViewById(R.id.bt_change_image);
        button.setOnClickListener(v -> {
            ImageIndex++;
            if (ImageIndex >= imageResources.length) {
                ImageIndex = 0;
            }
            imageView.setImageResource(imageResources[ImageIndex]);
            Toast.makeText(this, "Image changed!!!", Toast.LENGTH_SHORT).show();
        });
    }
}