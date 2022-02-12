package com.debalina0610.greetingscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewYear extends AppCompatActivity {
    public static final String NAME = "NAME";
    private TextView uname;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_year);

        uname = findViewById(R.id.cname);

        Intent intent = getIntent();
        name = intent.getStringExtra(NAME);
        uname.setText("DEAR, " + name + ", WISHING YOU MERRY CHRISTMAS AND A HAPPY NEW YEAR");
    }
}