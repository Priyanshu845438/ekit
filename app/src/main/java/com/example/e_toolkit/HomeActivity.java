
package com.example.e_toolkit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button btnpd, btnacd, btnarh, btntd, btnplaces, btntable, btnfd, btnhospital, btnkc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        btnpd = findViewById(R.id.btnpd);
        btnacd = findViewById(R.id.btnacd);
        btnarh = findViewById(R.id.btnarh);
        btntd = findViewById(R.id.btntd);
        btnplaces = findViewById(R.id.btnplaces);
        btntable = findViewById(R.id.btntable);
        btnfd = findViewById(R.id.btnfd);
        btnhospital = findViewById(R.id.btnhospital);
        btnkc = findViewById(R.id.btnkc);

        btnpd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this, PoliceDepts.class);
                startActivity(k);
            }
        });
        
        btnacd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this, AntiCorruption.class);
                startActivity(k);
            }
        });
        
        btnarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this, AntiRagging.class);
                startActivity(k);
            }
        });
        
        btntd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this, TrafficDepartment.class);
                startActivity(k);
            }
        });
        
        btnplaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this, WebViewHospital.class);
                startActivity(k);
            }
        });
        
        btntable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this, WebViewTable.class);
                startActivity(k);
            }
        });
        
        btnfd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this, FireDepartments.class);
                startActivity(k);
            }
        });
        
        btnhospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this, Hospitals.class);
                startActivity(k);
            }
        });
        
        btnkc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this, Kissancenter.class);
                startActivity(k);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
