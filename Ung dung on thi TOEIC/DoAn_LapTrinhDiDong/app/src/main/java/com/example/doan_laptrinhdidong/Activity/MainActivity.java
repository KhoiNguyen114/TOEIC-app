package com.example.doan_laptrinhdidong.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.doan_laptrinhdidong.DatabaseHelper;
import com.example.doan_laptrinhdidong.HomeFragment;
import com.example.doan_laptrinhdidong.MeFragment;
import com.example.doan_laptrinhdidong.R;
import com.example.doan_laptrinhdidong.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Fragment fragment;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new HomeFragment());
        //getSupportActionBar().setTitle("Home");
        getSupportActionBar().hide();
        bottomNavigationView = findViewById(R.id.bottomNavigation);

        khoiTaoDuLieu();

        BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new
                BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.navigation_home:
                                //getSupportActionBar().setTitle("Home");
                                getSupportActionBar().hide();
                                fragment = new HomeFragment();
                                loadFragment(fragment);
                                return true;
                            case R.id.navigation_search:
                                //getSupportActionBar().setTitle("Review");
                                fragment = new SearchFragment();
                                getSupportActionBar().hide();
                                loadFragment(fragment);
                                return true;
                            case R.id.navigation_me:
                                //getSupportActionBar().setTitle("Me");
                                getSupportActionBar().hide();
                                fragment = new MeFragment();
                                loadFragment(fragment);
                                return true;
                        }
                        return false;
                    }
                };
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

    }

    public void loadFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.nav_main,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void khoiTaoDuLieu()
    {
        databaseHelper = new DatabaseHelper(this);
        databaseHelper.dropTable();
        databaseHelper.createTable();
        databaseHelper.insertVocabulary();
        databaseHelper.insertListening();
        databaseHelper.insertGrammar();
        databaseHelper.insertFamilyWord();
        databaseHelper.insertChangeSentences();
        databaseHelper.insertBaiThiThu();
        databaseHelper.insertPart1();
        databaseHelper.insertPart2();
        databaseHelper.insertPart3();
        databaseHelper.insertPart4();
        databaseHelper.insertPart5();
        databaseHelper.insertPart6();
        databaseHelper.insertPart7();
        databaseHelper.insertDanhMucTu();
        databaseHelper.insertReview();
    }
}