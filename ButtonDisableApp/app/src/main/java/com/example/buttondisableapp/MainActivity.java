package com.example.buttondisableapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonDisable;
    private Button buttonEnable;
    private TextView licznik;
    private int liczbaKlikniec = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable = findViewById(R.id.buttonEnable);
        licznik = findViewById(R.id.licznik);

        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liczbaKlikniec++;


                buttonDisable.setEnabled(false);


                licznik.setText("Liczba kliknięć: " + liczbaKlikniec);

                // Wyświetlenie powiadomienia 
                Toast.makeText(MainActivity.this, "Duży przycisk został wyłączony", Toast.LENGTH_SHORT).show();
            }
        });


        buttonEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonDisable.setEnabled(true);

                // Wyświetlenie powiadomienia
                Toast.makeText(MainActivity.this, "Duży przycisk został aktywowany", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
