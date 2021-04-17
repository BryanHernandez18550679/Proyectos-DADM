package com.example.eva1_6_eventos;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MiClaseOnClick implements View.OnClickListener {
    Context context;
    @Override
    public void onClick(View view) {
        Toast.makeText(context, "Evento por clase", Toast.LENGTH_SHORT).show();
        Log.wtf("APP","Evento por clase");
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
