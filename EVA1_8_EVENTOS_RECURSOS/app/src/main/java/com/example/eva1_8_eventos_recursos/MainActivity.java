package com.example.eva1_8_eventos_recursos;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <16/04/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements RadioGroup.OnCheckedChangeListener {
    TextView textonombre, textoapellido;
    EditText nombrehint, apellidohint;
    RadioGroup radgroupidioma;
    RadioButton radbtnespañol, radbtninglés;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textonombre = findViewById(R.id.textonombre);
        textoapellido = findViewById(R.id.textoapellido);
        nombrehint = findViewById(R.id.nombrehint);
        apellidohint = findViewById(R.id.apellidohint);
        radgroupidioma = findViewById(R.id.radgroupidioma);
        radbtnespañol = findViewById(R.id.radbtnespañol);
        radbtninglés = findViewById(R.id.radbtninglés);
        radgroupidioma.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.radbtnespañol) {
            textonombre.setText(R.string.textviewnombreesp);
            nombrehint.setHint(R.string.hintnombre);
            textoapellido.setText(R.string.textviewapellidoesp);
            apellidohint.setHint(R.string.hintapellidos);
            radbtnespañol.setText(R.string.radbuttonesp);
            radbtninglés.setText(R.string.radbuttoning);
        }
        else{
            textonombre.setText(R.string.textviewnombreeng);
            nombrehint.setHint(R.string.hintnombreeng);
            textoapellido.setText(R.string.textviewapellidoeng);
            apellidohint.setHint(R.string.hintapellidoseng);
            radbtnespañol.setText(R.string.radbuttonspanish);
            radbtninglés.setText(R.string.radbuttoningeng);
        }



    }

}
