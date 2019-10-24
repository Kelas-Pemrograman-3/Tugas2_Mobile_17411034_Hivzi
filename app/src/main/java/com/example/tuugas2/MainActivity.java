package com.example.tuugas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtnpm;
    EditText edtnama;
    Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtnpm =(EditText) findViewById(R.id.edtnpm);
        edtnama=(EditText) findViewById(R.id.edtnama);
        btnsave=(Button) findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = edtnpm.getText().toString();
                String datas = edtnama.getText().toString();

                Intent next = new Intent(MainActivity.this,hal2.class);
                next.putExtra("data",data);
                next.putExtra("datas",datas);
                startActivity(next);
                finish();
            }
        });
    }
}