package com.example.eva1_12_clima;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <16/04/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    clima[] aclimacd = {
            new clima(R.drawable.sunny, "Chihuahua", 28, "Despejado con viento"),
            new clima(R.drawable.atmospher, "Delicias", 15, "Vientos huracanados"),
            new clima(R.drawable.cloudy, "Camargo", 22.3, "Nublado con probabilidad de lluvia"),
            new clima(R.drawable.light_rain, "Casas grandes", 15, "Lluvia ligera"),
            new clima(R.drawable.rainy, "Parral", 11, "Lluvioso con tormentas electricas"),
            new clima(R.drawable.snow, "Cuauhtemoc", -3, "Nieve"),
            new clima(R.drawable.thunderstorm, "Madera", 24, "Tormentas fuertes"),
            new clima(R.drawable.tornado, "Guerrero", 17, "Run like hell"),
            new clima(R.drawable.sunny, "Creel", 12, "A todo dar"),
            new clima(R.drawable.light_rain, "Ahumada", 13, "Pal cafecito"),
    };
    ListView listvwclima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        listvwclima = findViewById(R.id.listvwclima);
        listvwclima.setAdapter(new Adaptador(this, R.layout.mi_lista_clima, aclimacd));
    }
}