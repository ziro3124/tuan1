package com.example.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class tuan11MainActivity extends AppCompatActivity {
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main);
        // anh xa
        txt1 = findViewById(R.id.text1);
        txt2 = findViewById(R.id.text2);
        btn1 = findViewById(R.id.button);
        tv1 = findViewById(R.id.textView1);
        //xu ly
        btn1.setOnClickListener(v -> {
            //goi ham tinh tong
            tinhtong();
        });
    }
    private void tinhtong() {
        //lay du lieu text 1
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1);
        //lay du lieu text 2
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        float tong=so1+so2;
        //in ket qua
        tv1.setText(String.valueOf(tong));
    }
}