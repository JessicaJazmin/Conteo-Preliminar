package com.example.jessica.conteopreliminar;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    TextView tvInf;
    EditText ptEma;
    EditText ptPas;
    Button btnAceptar;
    Button btnCrear;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bdConteo conteo = new bdConteo(this,"bdconteomovil",null,1);
        final SQLiteDatabase dbc = conteo.getWritableDatabase();

        tvInf = (TextView) findViewById(R.id.tvInf);
        ptEma=(EditText) findViewById(R.id.ptEma);
        ptPas=(EditText) findViewById(R.id.ptPas);
        btnAceptar=(Button) findViewById(R.id.btnAceptar);
        btnCrear= (Button) findViewById(R.id.btnCrear);
        btnReg = (Button) findViewById(R.id.btnReg);

        btnReg.setVisibility(View.GONE);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //*if (ptEma.getText().toString().isEmpty()&& ptPas.getText().toString().isEmpty()) {
               //     Toast toast = Toast.makeText(login.this, "Todos los campos deben ser rellenados", Toast.LENGTH_LONG);
               //     toast.show();
               // }else{
               //     Cursor fila = dbc.rawQuery("select * from Usuario where email = '"+ptEma.getText().toString()+"' AND password = '"+ ptPas.getText().toString()+"'",null);
               //     if (fila.moveToFirst()) {
                        Intent menu = new Intent(login.this, menu.class);
                        startActivity(menu);
               //     }else{
               //         Toast toast = Toast.makeText(login.this, "No tienes una cuenta", Toast.LENGTH_LONG);
               //         toast.show();
               //     }
               //}
            }
        });
     btnCrear.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            // tvInf.setText("Por favor de regrisarte con este pequeño formulario");
            // btnCrear.setVisibility(View.GONE);
            // btnAceptar.setVisibility(View.GONE);
            // btnReg.setVisibility(View.VISIBLE);
         }
     });
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //      ContentValues contentValues = new ContentValues();
              //      contentValues.put("email",ptEma.getText().toString());
              //      contentValues.put("password",ptPas.getText().toString());
              //      dbc.insert("Usuario", null, contentValues);
              //      Toast toast = Toast.makeText(login.this, "Este usuario esta registrado", Toast.LENGTH_LONG);
              //      toast.show();
              //      ptEma.setText("");
              //      ptPas.setText("");
              //     tvInf.setText("Iniciar sesion con el usuario y contraseña ");
              //     btnCrear.setVisibility(View.INVISIBLE);
              //    btnCrear.setClickable(false);
              //      btnAceptar.setVisibility(View.VISIBLE);
              //      btnReg.setVisibility(View.GONE);
                }
        });
    }

}

