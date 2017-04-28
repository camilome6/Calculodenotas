package com.example.ingenieria.calculodenotas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.content.SharedPreferences;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private EditText res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acercade(View view) {
        Intent i = new Intent(this, AcercaDe.class );
        startActivity(i);
    }
}
