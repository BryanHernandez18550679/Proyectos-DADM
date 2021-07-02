package com.example.eva3_2_multitarea_2;
/* written by: <BRYAN ERNESTO HERNANDEZ CANO>
 * <18550679>
 * <02/07/2021>*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //THREAD --> CLASE PARA CREAR HILOS EN JAVA
        //Clase Thread() --> metodo run es generico
        //Crear propia clase que herede de Thread
        //Crear clase anonima
        //sobreescribir en metodo run(){}
Thread mihilo = new Thread(){
    //Aqui van las tareas en segundo plano
    @Override
    public void run() {
        super.run();
        for(int i = 0; i<10; i++){
            try {
                Thread.sleep(1000);//Detiene la ejecucion del hilo actual
                Log.wtf("HILO PRINCIPAL", "i = " + (i + 1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
};
mihilo.start();//iniciamos el hilo de ejecucion
        MiHilote miHilote = new MiHilote();
        //miHilote.run();//LLAMADA A FUNCION DEL HILO PRINCIPAL
        miHilote.start();
    }
}
class MiHilote extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 0; i<10; i++){
            try {
                Thread.sleep(1000);//Detiene la ejecucion del hilo actual
                Log.wtf("HILO MiHilote", "x = " + (i + 1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
