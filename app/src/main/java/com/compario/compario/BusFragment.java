package com.compario.compario;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



@SuppressLint("ValidFragment")
public class BusFragment extends Fragment {

    private FragmentCallback fragmentCallback;

    @SuppressLint("ValidFragment")
    public BusFragment(FragmentCallback fragmentCallback){
        this.fragmentCallback = fragmentCallback;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bus, container, false);
    }

}
