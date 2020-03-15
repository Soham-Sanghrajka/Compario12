package com.compario.compario;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@SuppressLint("ValidFragment")
public class LoginFragment extends Fragment
{
    View view;
    EditText uid;
    EditText pwd;
    Button login;
    Button forgetpwd;
    private FragmentCallback fragmentCallback;


    @SuppressLint("ValidFragment")
    public LoginFragment(FragmentCallback fragmentCallback){
        this.fragmentCallback = fragmentCallback;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_login,container,false);
        uid=view.findViewById(R.id.uid);
        pwd=view.findViewById(R.id.pwd);
        login=view.findViewById(R.id.login);
        forgetpwd=view.findViewById(R.id.fpwd);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=uid.getText().toString(),password=pwd.getText().toString();
               // new Toast(v.getContext()).makeText(v.getContext(),username,Toast.LENGTH_SHORT).show();
                //new Toast(v.getContext()).makeText(v.getContext(),password,Toast.LENGTH_SHORT).show();
                if(username.equals("admin") && password.equals("admin"))
                {
                    new Toast(v.getContext()).makeText(v.getContext(), "Login Validated", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    new Toast(v.getContext()).makeText(v.getContext(), "Login Not Validated", Toast.LENGTH_SHORT).show();
                }
            }
        });
        forgetpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Toast(v.getContext()).makeText(v.getContext(), "Feature not added yet...", Toast.LENGTH_SHORT).show();
            }
        });
        Button newuser=view.findViewById(R.id.newuser);
        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Toast(v.getContext()).makeText(v.getContext(), "Feature not added yet...", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
