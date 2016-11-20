package com.example.jessica.conteopreliminar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jessica on 16/11/2016.
 */

public class bdConteo extends SQLiteOpenHelper {

    public bdConteo(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE usuario(id INTEGER PRIMARY KEY, email TEXT, password TEXT);");
        db.execSQL("CREATE TABLE partidos(id INTEGER PRIMARY KEY, nombre TEXT, votos INT)");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('PRD')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('PAN')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('PRI')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('PT')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('VERDE')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('MORENA')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('MC')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('NA')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists usuario");
        db.execSQL("drop table if exists partidos");
        db.execSQL("CREATE TABLE usuario(id INTEGER PRIMARY KEY, email TEXT, password TEXT);");
        db.execSQL("CREATE TABLE partidos(id INTEGER PRIMARY KEY, nombre TEXT, votos INT)");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('PRD')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('PAN')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('PRI')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('PT')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('VERDE')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('MORENA')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('MC')");
        db.execSQL("INSERT INTO partidos(nombre)VALUES('NA')");

    }
}


