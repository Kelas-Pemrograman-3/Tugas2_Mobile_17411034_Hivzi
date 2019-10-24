package com.example.tuugas2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class hal2 extends AppCompatActivity {
    TextView txtdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2);

        txtdata = (TextView) findViewById(R.id.txtdata);
        Intent datas = getIntent();
        String npm = datas.getStringExtra("data");
        String nama = datas.getStringExtra("datas");
        txtdata.setText(nama + "\n"+npm);

    }
    @Override
    public void onBackPressed(){
        Intent back = new Intent(hal2.this,MainActivity.class);
        startActivity(back);
        finish();
    }
}
