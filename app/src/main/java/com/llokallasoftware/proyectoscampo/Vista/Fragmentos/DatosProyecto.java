package com.llokallasoftware.proyectoscampo.Vista.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.llokallasoftware.proyectoscampo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatosProyecto extends Fragment {

    List<String> spinnerArray =  new ArrayList<String>();

    public String[] mApps = {
            "Instagram",
            "Pinterest",
            "Pocket",
            "Twitter"
    };

    Spinner listaProyectos;



    public DatosProyecto() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment // Required empty public constructor
        spinnerArray.add("dodo");
        spinnerArray.add("cucu");
        spinnerArray.add("nene");

       // listaProyectos = getView().findViewById(R.id.spListaProy);

       // ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getActivity(), R.layout.support_simple_spinner_dropdown_item, mApps);


        //listaProyectos.setAdapter(adaptador);
        return inflater.inflate(R.layout.fragdatosproy, container, false);
    }

}
