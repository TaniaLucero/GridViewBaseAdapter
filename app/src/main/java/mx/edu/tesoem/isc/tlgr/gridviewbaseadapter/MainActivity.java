package mx.edu.tesoem.isc.tlgr.gridviewbaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;

    ArrayList<String> arreglo = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvdatos);
        contenido contenidoobj = new contenido(arreglo,this);
        gvdatos.setAdapter(contenidoobj);
        arreglo.add("Tania");
        arreglo.add("Lucero");
        arreglo.add("Gabriela");
        arreglo.add("Saul");
        arreglo.add("Adriana");
        arreglo.add("Cristobal");
        arreglo.add("Ivan");
        arreglo.add("Laura");
        arreglo.add("Pato");
        arreglo.add("Lucas");
    }
}