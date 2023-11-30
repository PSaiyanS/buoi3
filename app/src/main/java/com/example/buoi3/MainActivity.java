package com.example.buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtF,edtC;
    TextView txtF,txtC,txtKQ ;
    Button btnCtoF, btnFtoC, btnClear ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // anh xa
        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKQ = findViewById(R.id.txtKQ);
        edtF = findViewById(R.id.edtF);
        edtC = findViewById(R.id.edtC);
        btnCtoF = findViewById(R.id.btnCtoF);
        btnFtoC = findViewById(R.id.btnFtoC);
        btnClear = findViewById(R.id.btnClear);
        //xu li du kien
        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = Double.parseDouble(edtC.getText().toString());
                double f = c * 9/5 + 32 ;
                txtKQ.setText("Ket quả: " + f);
            }
        });
        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double f = Double.parseDouble(edtF.getText().toString());
                double c = (f-32)   * 5/9 ;
                txtKQ.setText("Ket quả: " + c);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtC.setText("");
                txtF.setText("");
                txtKQ.setText("Lựa chọn chức năng muốn thực hiện");
            }
        });

    }
}