package com.example.chaurideuralimunicipality.Activities;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.example.chaurideuralimunicipality.Adaptors.WardDetailsPagerAdapter;
import com.example.chaurideuralimunicipality.Fragments.WardInformationFragment;
import com.example.chaurideuralimunicipality.Fragments.WardPeopleFragment;
import com.example.chaurideuralimunicipality.R;
import com.example.chaurideuralimunicipality.model.WardDetailInformation;

public class WardDetailsActivity extends AppCompatActivity {

    Toolbar toolbar;
    FloatingActionButton fab;
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_details);

        //toolbar setting up
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Ward Details");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //tab and viewpager setting up
        tabLayout = findViewById(R.id.ward_tab);
        viewPager = findViewById(R.id.ward_viewpager);
        settingPageAdapter();
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    //getting name from ward list  which ward clicked
    public WardDetailInformation getWardinfo(){
        Intent intent = getIntent();
        WardDetailInformation detailinfo = (WardDetailInformation) intent.getSerializableExtra("wardinfo");
        return detailinfo;
    }

    private void settingPageAdapter() {

        WardDetailsPagerAdapter pagerAdapter = new WardDetailsPagerAdapter(getSupportFragmentManager());

        pagerAdapter.addFragment(new WardInformationFragment());
        pagerAdapter.addFragment(new WardPeopleFragment());

        //setting up adapter to viewpager
        viewPager.setAdapter(pagerAdapter);
        //setting viewpager to tab
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Information");
        tabLayout.getTabAt(1).setText("officers");
    }

}
