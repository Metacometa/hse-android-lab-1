package com.example.helloandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private Button btn;
    private EditText edit_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btn_main);
        edit_color = (EditText)findViewById(R.id.edit_color);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String color = edit_color.getText().toString();

                Intent eIntent = new Intent(MainActivity.this, SecondActivity.class);
                eIntent.putExtra("color_name", color);

                startActivity(eIntent);
            }
        }
        );
    }

;
}
