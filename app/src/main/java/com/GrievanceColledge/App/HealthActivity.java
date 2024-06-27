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





public class HealthActivity extends AppCompatActivity {


    ImageButton myImageButtonEnvironmentQuality;
    ImageButton myImageButtonDrugAbuse;
    ImageButton myImageButtonHealthAccess;

    ImageButton myImageButtonRelatedHealth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);


        myImageButtonEnvironmentQuality = (ImageButton) findViewById(R.id.imageButton9);

        myImageButtonDrugAbuse = (ImageButton) findViewById(R.id.imageButton10);

        myImageButtonHealthAccess = (ImageButton) findViewById(R.id.imageButton11);

        myImageButtonRelatedHealth = (ImageButton) findViewById(R.id.imageButton12);






        myImageButtonEnvironmentQuality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HealthActivity.this, EnvironmentQualityActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });





        myImageButtonDrugAbuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HealthActivity.this,DrugAbuseActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });



        myImageButtonHealthAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HealthActivity.this, HealthAccessActivity.class);
                startActivity(intentLoadNewActivity);


            }
        });





        myImageButtonRelatedHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HealthActivity.this, com.GrievanceColledge.App.RelatedHealthActivity.class);
                startActivity(intent);
            }








            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.nav_cart) {
                    Intent intent = new Intent(HealthActivity.this, CartActivity.class);
                    startActivity(intent);
                } else if (id == R.id.nav_search) {
                    Intent intent = new Intent(HealthActivity.this, SearchProductsActivity.class);
                    startActivity(intent);

                } else if (id == R.id.nav_categories) {

                } else if (id == R.id.nav_settings) {
                    Intent intent = new Intent(HealthActivity.this, SettinsActivity.class);
                    startActivity(intent);

                } else if (id == R.id.nav_logout) {
                    Paper.book().destroy();
                    Intent intent = new Intent(HealthActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();

                }

                return true;
            }
        });}}