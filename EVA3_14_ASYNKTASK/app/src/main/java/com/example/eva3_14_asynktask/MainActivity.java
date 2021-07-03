package com.example.eva3_14_asynktask;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <02/07/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvw = findViewById(R.id.txtvw);
        Miclaseasincrona miCla = new Miclaseasincrona();
        miCla.execute(10,500);
        //15--> Banner_Asynktask
        //16--> Loas_image_Asynktask
    }
    class Miclaseasincrona extends AsyncTask<Integer,String,Void>{
        public Miclaseasincrona() {
            super();
        }

        @Override
        protected void onPreExecute() {//se pueden interactuar con interfaz grafica
            super.onPreExecute();
            txtvw.append("INICIANDO LA TAREA ASINCRONA!!\n");
        }

        @Override// no se puede interactuar con la ui
        protected Void doInBackground(Integer... integers) {// equivalente a un run() en un Thread
            int limite = integers[0], time = integers[1];
           for (int i = 0; i < limite ; i++){
               try {
                   Thread.sleep(time);
                   publishProgress("i= "+i);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {//si pueden interactuar con la ui
            super.onProgressUpdate(values);
            txtvw.append(values[0] + "\n");
        }
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            txtvw.append("FIN DE LA TAREA ASINCRONA!!\n");
        }
    }
}