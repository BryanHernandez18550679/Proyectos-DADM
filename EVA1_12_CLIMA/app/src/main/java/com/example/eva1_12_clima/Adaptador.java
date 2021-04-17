package com.example.eva1_12_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adaptador extends ArrayAdapter<clima> {
    private Context context;
    private int layout;
    private clima[] cCiudades;


    public Adaptador(@NonNull Context context, int resource, @NonNull clima[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.cCiudades = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //fila no existe
        if (convertView == null) {//primera vez que se muestra la lista, no existe
            convertView = ((Activity)context).getLayoutInflater().inflate(layout,parent,false);
        } /*else {//fila si existe y hay que llenar
        }*/
        ImageView imgvwtormentaelectrica;
        TextView txtvwchihuahua, txtvwgrados, txtvwcontormentaselectricas;
        //vincularlas para poder usarlas  SSSSSASSS
        imgvwtormentaelectrica = convertView.findViewById(R.id.imgvwtormentaelectrica);
        txtvwgrados = convertView.findViewById(R.id.txtvwgrados);
        txtvwchihuahua = convertView.findViewById(R.id.txtvwchihuahua);
        txtvwcontormentaselectricas = convertView.findViewById(R.id.txtvwcontormentaselectricas);
        //llenar los arreglos con datos widget(arreglocCiudades)
        imgvwtormentaelectrica.setImageResource(cCiudades[position].getImagen());
        txtvwchihuahua.setText(cCiudades[position].getCiudad());
        txtvwgrados.setText(cCiudades[position].getGrados()+" °C");
        txtvwcontormentaselectricas.setText(cCiudades[position].getDescripcion());
        return convertView;

    }

}

