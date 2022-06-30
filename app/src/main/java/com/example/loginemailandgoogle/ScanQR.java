package com.example.loginemailandgoogle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScanQR extends AppCompatActivity {
    Button qrButton;
    TextView qrText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr);
        qrButton = findViewById(R.id.qrbtn);
        qrText = findViewById(R.id.qrtext);

        qrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}