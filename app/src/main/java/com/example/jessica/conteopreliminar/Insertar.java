package com.example.jessica.conteopreliminar;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 */
public class Insertar extends Fragment {
    bdConteo conteo;

    Spinner spinner;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View insert=inflater.inflate(R.layout.fragment_insertar, container, false);
        conteo = new bdConteo(insert.getContext(),"bdconteomovil",null,1);
        final SQLiteDatabase dbc = conteo.getWritableDatabase();
        spinner=(Spinner) insert.findViewById(R.id.spinner);
        Cursor fila = dbc.rawQuery("select * from partidos",null);
        Log.e("HOLA",fila.getString(1));
        /*Log.e("HOLA",fila.getString(2));
        Log.e("HOLA",fila.getString(3));
        Log.e("HOLA",fila.getString(4));
        Log.e("HOLA",fila.getString(5));
        Log.e("HOLA",fila.getString(6));
        Log.e("HOLA",fila.getString(7));*/
        //SimpleCursorAdapter adapter = new SimpleCursorAdapter(getContext(),android.R.layout.simple_dropdown_item_1line, fila, new String[]{"nombre"}, new int[]{android.R.id.text1});
        //adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        //spinner.setAdapter(adapter);
        return insert;

    }
}
