package com.example.loginemailandgoogle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import javax.xml.transform.Result;

public class qrScanner extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_scanner);
    }

    public void handleResult(Result rawResult){

    }
}