package com.compario.compario;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Soham on 1/13/2020.
 */

public class RViewHolder extends RecyclerView.ViewHolder {

    View view;
    public RViewHolder(View itemView) {
        super(itemView);
        this.view = itemView;
    }

    public void setData(RDataModel rDataModel){
        ((TextView)view.findViewById(R.id.TravelName)).setText(rDataModel.getTravelAgency());
        ((TextView)view.findViewById(R.id.Type)).setText(rDataModel.getType());
        ((TextView)view.findViewById(R.id.ArrivalTime)).setText(rDataModel.getAhh()+ ":" + rDataModel.getAmm());
        ((TextView)view.findViewById(R.id.source)).setText(rDataModel.getSource());
        ((TextView)view.findViewById(R.id.DeprTime)).setText(rDataModel.getRhh()+ ":" + rDataModel.getRmm());
        ((TextView)view.findViewById(R.id.destination)).setText(rDataModel.getDestination());
        ((TextView)view.findViewById(R.id.Price)).setText(String.valueOf(rDataModel.getPrice()));
    }

}