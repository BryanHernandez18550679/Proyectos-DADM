package com.example.eva1_7_radiogroup;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <16/04/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v4.os.IResultReceiver;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radgroupcomida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radgroupcomida = findViewById(R.id.radgroupcomida);
        radgroupcomida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int id) {
               /*switch (id) {
                   case R.id.radioButton:
                       Toast.makeText(MainActivity.this, "Ha elegido Tacos", Toast.LENGTH_LONG).show();
                       break;
                   case R.id.radioButton2:
                       Toast.makeText(MainActivity.this, "Ha elegido Montados", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.radioButton3:
                       Toast.makeText(MainActivity.this, "Ha elegido Burritos", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.radioButton4:
                       Toast.makeText(MainActivity.this, "Ha elegido Alitas", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.radioButton5:
                       Toast.makeText(MainActivity.this, "Ha elegido Garnachas", Toast.LENGTH_SHORT).show();
                       break;
                   default:
                       Toast.makeText(MainActivity.this, "Ha elegido codorniz en salsa de nuez", Toast.LENGTH_SHORT).show();
               }*/
                RadioButton radbtnselect;
                radbtnselect = findViewById(id);
                Toast.makeText(MainActivity.this, radbtnselect.getText(), Toast.LENGTH_SHORT).show();
            }});}}