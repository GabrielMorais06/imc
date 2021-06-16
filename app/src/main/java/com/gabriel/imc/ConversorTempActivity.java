
package com.gabriel.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etTemp;
    Button btnconverter;
    TextView tvmensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnconverter = findViewById(R.id.btnconverter);
        etTemp = findViewById(R.id.etTemp);
        tvmensagem = findViewById(R.id.tvmensagem);
}
