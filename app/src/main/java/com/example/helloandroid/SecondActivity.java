package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends Activity {
    int red = Color.argb(255, 255, 0, 0);
    int green = Color.argb(255, 0, 255, 0);
    int blue = Color.argb(255, 0, 0, 255);
    int white = Color.argb(255, 255, 255, 255);

    private RelativeLayout layout;
    private TextView actual_color;
    private String wrong_color_text;

    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setFields();
        changeColor();
    }

    private void setFields() {
        resources = getResources();

        layout = findViewById(R.id.layout);
        actual_color = (TextView)findViewById(R.id.actual_color);
        wrong_color_text = resources.getString(R.string.wrong_color_text);
    }

    private void changeColor() {
        Intent data = getIntent();
        String color = data.getStringExtra("color_name");
        int new_color;

        actual_color.setText(color);
        switch(color) {
            case "Red":
                new_color = red;
                break;
            case "Green":
                new_color = green;
                break;
            case "Blue":
                new_color = blue;
                break;
            default:
                new_color = white;
                actual_color.setText(wrong_color_text);
        }

        layout.setBackgroundColor(new_color);
    }
}
