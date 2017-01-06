package com.alephicabod.petagram.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alephicabod.petagram.R;
import com.alephicabod.petagram.pojo.Foto;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by angel on 03/01/2017.
 */

public class MiMascotaAdapter extends RecyclerView.Adapter<MiMascotaAdapter.MiMascotaHolderView> {

    private ArrayList<Foto> fotos;

    public MiMascotaAdapter(ArrayList<Foto> fotos) {
        this.fotos = fotos;
    }

    @Override
    public MiMascotaAdapter.MiMascotaHolderView onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mi_mascota,parent,false);
        return new MiMascotaHolderView(v);
    }

    @Override
    public void onBindViewHolder(MiMascotaAdapter.MiMascotaHolderView holder, int position) {
        Foto x=fotos.get(position);
        holder.foto.setImageResource(x.getFoto());
        holder.votos.setText(x.getVotos()+"");

    }

    @Override
    public int getItemCount() {
        return fotos.size();
    }

    public class MiMascotaHolderView extends  RecyclerView.ViewHolder{
        public  ImageView foto;
        public TextView votos;
        public MiMascotaHolderView(View itemView) {
            super(itemView);
            foto=(ImageView)itemView.findViewById(R.id.fotoMiMascota);
            votos=(TextView)itemView.findViewById(R.id.puntosFoto);
        }
    }
}