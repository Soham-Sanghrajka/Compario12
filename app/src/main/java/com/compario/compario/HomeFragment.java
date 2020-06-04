package com.compario.compario;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.support.v4.app.Fragment;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Iterator;

/**
 * A simple {@link Fragment} subclass.
 */

@SuppressLint("ValidFragment")
public class HomeFragment extends Fragment implements DatePickerDialog.OnDateSetListener{

    AutoCompleteTextView from;
    AutoCompleteTextView to;
    EditText dateOfJrn;
    ImageButton search;
    ImageButton dateP;
    private FragmentCallback fragmentCallback;

    @SuppressLint("ValidFragment")
    public HomeFragment(FragmentCallback fragmentCallback){
        this.fragmentCallback = fragmentCallback;
    }

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        from=view.findViewById(R.id.fromA);
        to=view.findViewById(R.id.toB);
        search=view.findViewById(R.id.searchbtn);
        dateP=view.findViewById(R.id.datebtn);
        dateOfJrn=view.findViewById(R.id.dateInput);
        String json = null;
        String data = "";
        AssetManager assetManager = getActivity().getAssets();
        InputStream inputStream = null;
        try {
            inputStream = assetManager.open("busCityList.json");
            StringBuilder buf = new StringBuilder();
            BufferedReader in =
                    new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String str;
            while ((str = in.readLine()) != null) {
                buf.append(str);
            }
            in.close();
            data = buf.toString();
            JSONObject jsonObject=new JSONObject(data);
            Iterator iterator=jsonObject.keys();
            int size=jsonObject.length();
            String k[]=new String[size];
            int i=0;
            while (iterator.hasNext())
            {
                k[i]=(String)iterator.next();
                i++;
            }
            ArrayAdapter<String> arrayAdapter;
            arrayAdapter = new ArrayAdapter(view.getContext(), android.R.layout.select_dialog_item,k);
            from.setThreshold(2);
            from.setAdapter(arrayAdapter);
            to.setThreshold(2);
            to.setAdapter(arrayAdapter);
            dateP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DialogFragment newFragment = new DatePickerFragment();
                    newFragment.setTargetFragment(HomeFragment.this,0);
                    newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");
                }
            });
            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Destination=to.getText().toString();
                    Date date=new Date();
                    String Source=from.getText().toString();
                    SearchDataModel searchDataModel = new SearchDataModel();
                    searchDataModel.setFrom(Source);
                    searchDataModel.setTo(Destination);
                    searchDataModel.setDate(date);
                    fragmentCallback.onSearchClick(searchDataModel);
                }
            });
        }catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return view;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        StringBuilder sb = new StringBuilder().append(year).append("-").append(month + 1).append("-").append(dayOfMonth);
        String formattedDate = sb.toString();
        dateOfJrn.setText(formattedDate);
    }
}
