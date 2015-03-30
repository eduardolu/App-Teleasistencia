package com.example.lorenasanchomayoral.prueba;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class Llamada extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamada);
    }

    public void volver(View v){
        Intent pasa=new Intent(this,MainActivity.class);
        startActivity(pasa);
    }
}
