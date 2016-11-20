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
import android.widget.ArrayAdapter;
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
        spinner=(Spinner) insert.findViewById(R.id.spinner);

        conteo = new bdConteo(insert.getContext(),"bdconteomovil",null,1);
        final SQLiteDatabase dbc = conteo.getWritableDatabase();

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(insert.getContext(),android.R.layout.simple_spinner_dropdown_item, dbc.rawQuery("select id as _id, nombre from partidos",null), new String[]{"nombre"}, new int[]{android.R.id.text1});
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        return insert;

    }
}
