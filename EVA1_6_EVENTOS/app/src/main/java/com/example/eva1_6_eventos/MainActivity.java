package com.example.eva1_6_eventos;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <16/04/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    Button btnListener, btnclaseanonima, btnporclase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnclaseanonima = findViewById(R.id.btnclaseanonima);
        btnporclase = findViewById(R.id.btnporclase);
        btnListener.setOnClickListener(this);
        btnclaseanonima.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Toast.makeText(getApplicationContext(), "Evento por clase anonima", Toast.LENGTH_SHORT).show();
                                               }
                                           }

        );
        MiClaseOnClick objCLICK = new MiClaseOnClick();
        objCLICK.setContext(this);
        btnporclase.setOnClickListener(objCLICK);
    }
    public void miClick(View arg) {
        Toast.makeText(this, "Evento por onClick xml", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Evento por listener", Toast.LENGTH_SHORT).show();
    }

}
