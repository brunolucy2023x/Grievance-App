package com.GrievanceColledge.App;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.GrievanceColledge.App.Model.Products;
import com.GrievanceColledge.App.Prevalent.Prevalent;
import com.GrievanceColledge.App.ViewHolder.ProductViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import io.paperdb.Paper;


import android.widget.ImageButton;




public class HomeActivity extends AppCompatActivity {


    ImageButton myImageButtonHealth;
    ImageButton myImageButtonStudies;
    ImageButton myImageButtonSecurity;

    ImageButton myImageButtonNotice;
    ImageButton myImageButtonInboxes;
    ImageButton myImageButtonFinance;
    ImageButton myImageButtonSetting;
    ImageButton myImageButtonMore;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        myImageButtonHealth = (ImageButton) findViewById(R.id.imageButton);

        myImageButtonStudies = (ImageButton) findViewById(R.id.imageButton2);

        myImageButtonSecurity = (ImageButton) findViewById(R.id.imageButton3);

        myImageButtonNotice = (ImageButton) findViewById(R.id.imageButton4);

        myImageButtonInboxes= (ImageButton) findViewById(R.id.imageButton5);


        myImageButtonFinance = (ImageButton) findViewById(R.id.imageButton6);

        myImageButtonSetting = (ImageButton) findViewById(R.id.imageButton7);

        myImageButtonMore = (ImageButton) findViewById(R.id.imageButton8);




        myImageButtonHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomeActivity.this, HealthActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });





        myImageButtonNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomeActivity.this, NoticesActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });



        myImageButtonInboxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomeActivity.this, InboxActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });





        myImageButtonFinance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomeActivity.this, FinanceActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });


        myImageButtonSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomeActivity.this, SettingActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });



        myImageButtonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomeActivity.this, MoreActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });












        myImageButtonStudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, com.GrievanceColledge.App.StudiesActivity.class);
                startActivity(intent);
            }
        });


        myImageButtonSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, com.GrievanceColledge.App.SecurityActivity.class);
                startActivity(intent);
            }








            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.nav_cart) {
                    Intent intent = new Intent(HomeActivity.this, CartActivity.class);
                    startActivity(intent);
                } else if (id == R.id.nav_search) {
                    Intent intent = new Intent(HomeActivity.this, SearchProductsActivity.class);
                    startActivity(intent);

                } else if (id == R.id.nav_categories) {

                } else if (id == R.id.nav_settings) {
                    Intent intent = new Intent(HomeActivity.this, SettinsActivity.class);
                    startActivity(intent);

                } else if (id == R.id.nav_logout) {
                    Paper.book().destroy();
                    Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();

                }

                return true;
            }
        });}}