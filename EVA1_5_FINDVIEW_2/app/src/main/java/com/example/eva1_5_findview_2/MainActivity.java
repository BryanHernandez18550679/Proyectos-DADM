package com.example.eva1_5_findview_2;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <16/04/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgVwmostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgVwmostrar = findViewById(R.id.imgVwmostrar);
        imgVwmostrar.setImageResource(R.drawable.cruzroja);
    }
}