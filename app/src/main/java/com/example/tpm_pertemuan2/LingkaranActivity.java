package com.example.tpm_pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LingkaranActivity extends AppCompatActivity {

    private Button btn_hitung;
    private TextView text_header, text_hasil;
    private EditText et_jari;
    final private double phi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        btn_hitung = findViewById(R.id.btn_hitung);
        text_header = findViewById(R.id.text_header);
        text_hasil = findViewById(R.id.text_hasil);
        et_jari = findViewById(R.id.et_jari);

        final String header = getIntent().getStringExtra("mode");
        text_header.setText(header.equals("keliling") ? "Hitung \nKeliling Lingkaran" : "Hitung \nLuas Lingkaran");

        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double jari = Double.parseDouble(et_jari.getText().toString());
                    double hasil = header.equals("keliling") ? 2*phi*jari : phi*jari*jari;
                    text_hasil.setText((header.equals("keliling") ? "Keliling = " : "Luas = ") + String.valueOf(hasil));
                }
                catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Input Error! Please Check Your Field!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
