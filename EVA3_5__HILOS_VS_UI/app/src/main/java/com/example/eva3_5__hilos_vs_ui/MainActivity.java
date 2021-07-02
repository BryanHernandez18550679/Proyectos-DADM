package com.example.eva3_5__hilos_vs_ui;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <02/07/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView TxtvW;
Thread thread;
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
                        TxtvW.append(cade + "\n");
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