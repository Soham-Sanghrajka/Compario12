package com.compario.compario;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements FragmentCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setTitle("Login Page");

        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                switch (id)
                {
                    case R.id.home:
                        setTitle("Home");
                        fragmentTransaction.replace(R.id.frag_main,new HomeFragment(MainActivity.this));
                        fragmentTransaction.commit();

                        break;
                    case R.id.buses:
                        setTitle("Buses");
                        fragmentTransaction.replace(R.id.frag_main,new BusFragment(MainActivity.this));
                        fragmentTransaction.commit();
                        break;
                    case R.id.offers:
                        setTitle("Offers");
                        fragmentTransaction.replace(R.id.frag_main,new OfferFragment(MainActivity.this));
                        fragmentTransaction.commit();
                        break;
                    case R.id.profile:
                        setTitle("Profile");
                        fragmentTransaction.replace(R.id.frag_main,new ProfileFragment(MainActivity.this));
                        fragmentTransaction.commit();
                        break;
                }
                return true;
            }
            //FragmentManager fragmentManager=getFragmentManager();
            //FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();



        });

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag_main,new HomeFragment(MainActivity.this));
        fragmentTransaction.commit();


    }

    @Override
    public void onSearchClick(SearchDataModel searchDataModel) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag_main,new BlankFragment(MainActivity.this,searchDataModel));
        fragmentTransaction.commit();
    }
}
