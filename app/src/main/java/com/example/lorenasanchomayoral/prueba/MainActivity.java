package com.example.lorenasanchomayoral.prueba;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;



public class MainActivity extends Activity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public ImageButton makeCall;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        representacion();




      /*  makeCall = (ImageButton)findViewById(R.id.button1);

        makeCall.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //llamar();
              /*  Context context=getApplicationContext();
                CharSequence text="prueba!";
                int duracion= Toast.LENGTH_SHORT;

                Toast toast= Toast.makeText(context,text,duracion);
                toast.show();
            }
        });*/
    }

   /* private void call() {
        try {
            callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:123456789"));
            startActivity(callIntent);
        } catch (ActivityNotFoundException activityException) {
            Log.e("dialing-example", "Call failed", activityException);
        }
    }
*/
    public void llamadas(View v){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent pasa=new Intent(this,Llamada.class);
        startActivity(pasa);
    }

    private void llamar(){
        Uri uri= Uri.parse("tel:639287903");
        Intent miActividad=new Intent(Intent.ACTION_CALL, uri);
        startActivity(miActividad);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void datos(View v){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent guardar=new Intent(this,Datos.class);
        startActivity(guardar);
    }

    private void representacion(){
        TextView tvBd = (TextView) findViewById(R.id.textView4);
        TextView textGlucosa = (TextView) findViewById(R.id.textView5);
        String retension = getIntent().getStringExtra("tension");
        String reglucosa = getIntent().getStringExtra("glucosa");
        if(retension != null) {
            tvBd.setText(retension);
        }
        if(reglucosa != null) {
            textGlucosa.setText(reglucosa);
        }
    }
}
