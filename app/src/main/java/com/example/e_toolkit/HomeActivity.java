package com.example.e_toolkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btnpd, btnacd, btnarh, btntd, btnplaces, btntable, btnfd, btnhospital, btnkc;
    Button btnpolice, btnschool, btnngo, btnkissan, btnfire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // 🔹 Connect buttons from XML
        btnpd = findViewById(R.id.btnpd);
        btnacd = findViewById(R.id.btnacd);
        btnarh = findViewById(R.id.btnarh);
        btntd = findViewById(R.id.btntd);
        btnplaces = findViewById(R.id.btnplaces);
        btntable = findViewById(R.id.btntable);
        btnfd = findViewById(R.id.btnfd);
        btnhospital = findViewById(R.id.btnhospital);
        btnkc = findViewById(R.id.btnkc);

        btnpolice = findViewById(R.id.btnpolice);
        btnschool = findViewById(R.id.btnschool);
        btnngo = findViewById(R.id.btnngo);
        btnkissan = findViewById(R.id.btnkissan);
        btnfire = findViewById(R.id.btnfire);

        // 🔹 Set click listeners
        btnpd.setOnClickListener(v -> startActivity(new Intent(this, PeriodicTableActivity.class)));
        btnacd.setOnClickListener(v -> startActivity(new Intent(this, AntiCorruption.class)));
        btnarh.setOnClickListener(v -> startActivity(new Intent(this, AntiRagging.class)));
        btntd.setOnClickListener(v -> startActivity(new Intent(this, TrafficDepartment.class)));
        btnplaces.setOnClickListener(v -> startActivity(new Intent(this, PlacesActivity.class)));
        btntable.setOnClickListener(v -> startActivity(new Intent(this, RailwayTableActivity.class)));
        btnfd.setOnClickListener(v -> startActivity(new Intent(this, FormulaDictionary.class)));
        btnhospital.setOnClickListener(v -> startActivity(new Intent(this, Hospitals.class)));
        btnkc.setOnClickListener(v -> startActivity(new Intent(this, KnowledgeCenter.class)));

        btnpolice.setOnClickListener(v -> startActivity(new Intent(this, PoliceDepts.class)));
        btnschool.setOnClickListener(v -> startActivity(new Intent(this, SchoolsActivity.class)));
        btnngo.setOnClickListener(v -> startActivity(new Intent(this, NGOActivity.class)));
        btnkissan.setOnClickListener(v -> startActivity(new Intent(this, KissanCenter.class)));
        btnfire.setOnClickListener(v -> startActivity(new Intent(this, FireDepartments.class)));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu); // make sure res/menu/menu.xml exists
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle menu clicks here
        return super.onOptionsItemSelected(item);
    }
}
