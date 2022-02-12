package com.debalina0610.greetingscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Birthday extends AppCompatActivity {
    public static final String NAME = "NAME";
    private TextView uname;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        uname = findViewById(R.id.bname);

        Intent intent = getIntent();
        name = intent.getStringExtra(NAME);
        uname.setText("HAPPY BIRTHDAY " + name);
    }
}