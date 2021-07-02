package com.example.eva3_6_handler_message;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <02/07/2021>*/
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView TxtvW;
    Thread thread;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            //AQUI PODEMOS MODIFICAR LA INTERFAZ GRAFICA
            //TRABAJO LIGERO--> TRABAJO INTENSO TRABA LA UI
            String cade = (String) msg.obj;
            int what = msg.what;
            TxtvW.append("El hilo= "+ what + "Imprime :" + cade + "\n");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TxtvW = findViewById(R.id.TxtvW);
        //TxtvW.setText("Hola mundo cruel!!");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(true){
                    try {
                        Thread.sleep(1000);
                        String cade = "i= " +i;
                        i++;
                       //SOLICITAMOS UN MENSAJE
                        //PONER INFO EN EL MENSAJE
                        Message message = handler.obtainMessage(1000,cade);
                        //DEVOLVERLO
                        handler.sendMessage(message);
                        Log.wtf("runnable",cade);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }

            }
        };
        thread = new Thread(runnable);
        thread.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        thread.interrupt();
    }
}