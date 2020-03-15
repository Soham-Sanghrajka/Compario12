package com.compario.compario;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Soham on 1/13/2020.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RViewHolder>{

    private List<RDataModel> datalist;

    public RecyclerAdapter(List<RDataModel> datalist)
    {
        this.datalist = datalist;
    }

    @Override
    public RViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        RViewHolder rViewHolder= new RViewHolder(v);
        return rViewHolder;
    }

    @Override
    public void onBindViewHolder(RViewHolder holder, int position) {
        holder.setData(datalist.get(position));
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
}
