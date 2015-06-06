package com.example.irvingmartinez.listaclima;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by IRVINGMARTINEZ on 05/06/2015.
 */
public class Data extends BaseAdapter {
    Context context;
    String[] dia;
    int[] imagene;
    LayoutInflater inflater;
    String[] estado;
    String[] temperatura;

    public Data(Context context, String[] dia, int[] imagene, String[] estado, String[] temperatura) {
        this.context = context;
        this.dia = dia;
        this.imagene = imagene;
        this.estado = estado;
        this.temperatura = temperatura;
    }

    public String[] getDia() {
        return dia;
    }

    public int[] getImagene() {
        return imagene;
    }

    public String[] getEstado() {
        return estado;
    }

    public String[] getTemperatura() {
        return temperatura;
    }

    @Override
    public int getCount() {
        return dia.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_item_forescast, parent, false);

        TextView dias = (TextView) itemView.findViewById(R.id.dias);
        dias.setText(dia[position]);

        ImageView imagenes = (ImageView) itemView.findViewById(R.id.imagenes);
        imagenes.setImageResource(imagene[position]);

        TextView estados = (TextView) itemView.findViewById(R.id.estados);
        estados.setText(estado[position]);

        TextView temperaturas = (TextView) itemView.findViewById(R.id.temperaturas);
        temperaturas.setText(temperatura[position]);

        return itemView;

    }
}
