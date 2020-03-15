package com.compario.compario;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

@SuppressLint("ValidFragment")
public class BlankFragment extends Fragment {

    private FragmentCallback fragmentCallback;
    private SearchDataModel searchDataModel;
    public TextView textView;
    private RecyclerView recyclerView;
    @SuppressLint("ValidFragment")
    public BlankFragment(FragmentCallback fragmentCallback,SearchDataModel searchDataModel){
        this.fragmentCallback = fragmentCallback;
        this.searchDataModel = searchDataModel;
    }

    View v;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_blank, container, false);
        recyclerView = v.findViewById(R.id.Recycler);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getDataList());
        recyclerView.setLayoutManager(new LinearLayoutManager(v.getContext()));
        recyclerView.setAdapter(recyclerAdapter);
        String from=searchDataModel.getFrom();
        return v;
    }

    private List<RDataModel> getDataList(){
        ArrayList<RDataModel> arrayList = new ArrayList<>();
        arrayList.add(new RDataModel("Ea","lux","Rajkot","ahmedabad",11,30,4,30,500));
        arrayList.add(new RDataModel("Ead","semi lux","Anand","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","sleeper","Surat","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","lux","Junagadh","ahmedabad",11,30,4,30,500));
        arrayList.add(new RDataModel("Ead","semi lux","Jamnagar","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","sleeper","Jaipur","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","lux","pune","ahmedabad",11,30,4,30,500));
        arrayList.add(new RDataModel("Ead","semi lux","Mumbai","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","sleeper","Surat","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","lux","Rajkot","delhi",11,30,4,30,500));
        arrayList.add(new RDataModel("Ead","semi lux","Anand","navsari",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","sleeper","Surat","vasad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","lux","Rajkot","porbandar",11,30,4,30,500));
        arrayList.add(new RDataModel("Ead","semi lux","Anand","somnath",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","sleeper","Surat","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","lux","Rajkot","sasan gir",11,30,4,30,500));
        arrayList.add(new RDataModel("Ead","semi lux","Anand","wakaner",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","sleeper","Surat","pune",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","lux","Ahmedabad","haridwar",11,30,4,30,500));
        arrayList.add(new RDataModel("Ead","semi lux","Anand","jaisalmer",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","sleeper","Surat","mumbai",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","lux","Rajkot","pune",11,30,4,30,500));
        arrayList.add(new RDataModel("Ead","semi lux","Anand","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","sleeper","Surat","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","lux","Rajkot","ahmedabad",11,30,4,30,500));
        arrayList.add(new RDataModel("Ead","semi lux","Anand","ahmedabad",12,30,4,30,500));
        arrayList.add(new RDataModel("Ea","sleeper","Surat","ahmedabad",12,30,4,30,500));
        return arrayList;
    }


}
