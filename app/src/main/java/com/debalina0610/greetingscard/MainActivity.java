package com.debalina0610.greetingscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private String name;
    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        username = findViewById(R.id.editTextTextPersonName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birthday();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anniversary();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newyear();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newyear();
            }
        });
    }
    public void birthday(){
        name = username.getText().toString();
        Intent intent = new Intent(this, Birthday.class);
        intent.putExtra(Birthday.NAME, name);
        startActivity(intent);
    }

    public void anniversary(){
        name = username.getText().toString();
        Intent intent = new Intent(this, Anniversary.class);
        intent.putExtra(Anniversary.NAME, name);
        startActivity(intent);
    }

    public void newyear(){
        name = username.getText().toString();
        Intent intent = new Intent(this, NewYear.class);
        intent.putExtra(NewYear.NAME, name);
        startActivity(intent);
    }
}