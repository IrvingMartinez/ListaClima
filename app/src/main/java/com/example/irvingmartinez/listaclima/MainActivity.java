package com.example.irvingmartinez.listaclima;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;



public class MainActivity extends ActionBarActivity {


    String[] dias = new String[]{
            "Lunes",
    };
    String[] estados = new String[]{
            "Nublado",
    };
    String[] temperaturas = new String[]{
            "20/15",
    };
    int[] imagens ={
            R.drawable.nublado,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ListView lista = (ListView) findViewById(R.id.listview_forecast);
        Data adapter = new Data(this, dias, imagens, estados, temperaturas);
        lista.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
