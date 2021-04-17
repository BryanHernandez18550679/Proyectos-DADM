package com.example.eva1_4_findview;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
* <18550679>
* <16/04/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwmensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwmensaje = findViewById(R.id.txtVwmensaje);
        txtVwmensaje.setText("Hola mundo cruel!!");
    }
}