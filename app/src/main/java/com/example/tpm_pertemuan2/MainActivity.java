package com.example.tpm_pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_keliling, btn_luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_keliling = findViewById(R.id.btn_keliling);
        btn_luas = findViewById(R.id.btn_luas);

        btn_keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_keliling = new Intent(getApplicationContext(),LingkaranActivity.class);
                intent_keliling.putExtra("mode","keliling");
                startActivity(intent_keliling);
            }
        });

        btn_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_luas = new Intent(getApplicationContext(),LingkaranActivity.class);
                intent_luas.putExtra("mode","luas");
                startActivity(intent_luas);
            }
        });
    }
}
