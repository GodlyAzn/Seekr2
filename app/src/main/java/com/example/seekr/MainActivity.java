package com.example.seekr;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;




public class MainActivity extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle toggle ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.seekr.R.layout.activity_main);
        dl = (DrawerLayout) findViewById(com.example.seekr.R.id.drawer);
        toggle = new ActionBarDrawerToggle(this,dl, R.string.Open, R.string.Close);
        dl = (DrawerLayout) findViewById(com.example.seekr.R.id.drawer);
        toggle = new ActionBarDrawerToggle(this,dl, com.example.seekr.R.string.Open, com.example.seekr.R.string.Close);
        dl.addDrawerListener(toggle);
        NavigationView nvDrawer = (NavigationView) findViewById(com.example.seekr.R.id.nv);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupDrawerContent(nvDrawer);
    }

    public void selectItemDrawer(MenuItem menuItem){
        Fragment myFragment = null;
        Class fragmentClass;
        switch (menuItem.getItemId()){
            case com.example.seekr.R.id.home:
                fragmentClass = Home.class;
                break;

            case com.example.seekr.R.id.event:
                fragmentClass = Event.class;
                break;

            case com.example.seekr.R.id.account:
                fragmentClass = Account.class;
                break;
            //change
            //case com.example.seekr.R.id.search:
                //fragmentClass = Search.class;
                //break;

            case com.example.seekr.R.id.setting:
                fragmentClass = Settings.class;
                break;

            default:
                fragmentClass = Home.class ;
        }
        try {
            myFragment = (Fragment) fragmentClass.newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(com.example.seekr.R.id.flcontent,myFragment).commit();
        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        dl.closeDrawers();
    }
    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectItemDrawer(item);
                return true;
            }
        });
    }
    //main button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

}
