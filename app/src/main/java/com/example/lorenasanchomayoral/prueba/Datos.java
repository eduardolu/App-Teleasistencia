package com.example.lorenasanchomayoral.prueba;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;


public class Datos extends Activity {

    private EditText  mTension;
    private EditText mGlucosa;
    private Switch mGas;
    private Switch mAcele;
    private Switch mTemp;
    public String tension;
    public String glucosa;
    public int gas = 0;
    public int aceleracion =0;
    public int temperatura = 0;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);



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
    public void datosGuardados(View v){
        mTension = (EditText) findViewById(R.id.editText);
        mGlucosa = (EditText) findViewById(R.id.editText2);
        mGas = (Switch) findViewById(R.id.switch2);
        mAcele = (Switch) findViewById(R.id.switch1);
        mTemp = (Switch) findViewById(R.id.switch3);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tension =  mTension.getText().toString();
        glucosa =  mGlucosa.getText().toString();

        if(mGas.isChecked()){
            gas = 1;
        }else{
            gas = 0;
        }

        if(mAcele.isChecked()){
            aceleracion = 1;
        }else{
            aceleracion = 0;
        }

        if(mTemp.isChecked()){
            temperatura = 1;
        }else{
            temperatura = 0;
        }

        System.out.println(gas);
        System.out.println(tension);
        Intent pasa=new Intent(this,MainActivity.class);
        pasa.putExtra("tension", tension);
        pasa.putExtra("glucosa", glucosa);
        startActivity(pasa);

    }



   /* @Override
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
    }*/
}

