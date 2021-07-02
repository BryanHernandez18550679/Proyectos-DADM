package com.example.eva2_4_sendto;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <02/07/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {
EditText edtxtnotel, edtxtmensaje;
Button btnenviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxtnotel = findViewById(R.id.edtxtnotel);
        edtxtmensaje = findViewById(R.id.edtxtmensaje);
        btnenviar = findViewById(R.id.btnenviar);
        btnenviar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
String sTel, sMensa;
sTel = "smsto:" + edtxtnotel.getText().toString();
sMensa = edtxtmensaje.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        intent.putExtra("sms_bodu",sMensa);
        startActivity(intent);
    }
}