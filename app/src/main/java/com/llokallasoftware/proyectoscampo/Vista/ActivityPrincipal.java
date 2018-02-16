package com.llokallasoftware.proyectoscampo.Vista;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.llokallasoftware.proyectoscampo.R;
import com.llokallasoftware.proyectoscampo.Vista.Fragmentos.DatosCalculo;
import com.llokallasoftware.proyectoscampo.Vista.Fragmentos.DatosProyecto;

public class ActivityPrincipal extends AppCompatActivity {

    Fragment fragProy = new DatosProyecto();
    Fragment fragCalc = new DatosCalculo();

    FragmentManager fragMan;
    FragmentTransaction fragTrans;


    public String[] mApps = {
            "Instagram",
            "Pinterest",
            "Pocket",
            "Twitter"
    };


    Spinner listaProyectos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fragMan = getSupportFragmentManager();
        fragTrans = fragMan.beginTransaction();
        fragTrans.add(R.id.layRaiz, fragProy, "FragA");
        fragTrans.commit();

        setContentView(R.layout.activity_principal);


    }


    //dummy void
    public void siguienteActividad(View v){

        //Toast.makeText(this,"Cargando datos...",Toast.LENGTH_LONG).show();

        FragmentTransaction transaction = fragMan.beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
        transaction.replace(R.id.layRaiz, fragCalc);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();
  }

    @Override
    protected void onStart() {
        super.onStart();


        listaProyectos = fragMan.findFragmentByTag("FragA").getView().findViewById(R.id.spListaProy);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mApps);

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        listaProyectos.setAdapter(adaptador);
    }


}
