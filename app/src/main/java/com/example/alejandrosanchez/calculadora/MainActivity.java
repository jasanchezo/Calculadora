package com.example.alejandrosanchez.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button boton1 = (Button)findViewById(R.id.button1);
        boton1.setText("No has pulsado el boton");

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicks++;
                boton1.setText("Has pulsado el boton "+clicks+" veces");
            }
        });
    }


}
