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
    Button btnpolice,btnschool,btnhospital,btnkissan,btnngo,btnfire,btnacd,btnarh,btntd,btnplaces,btntable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnpolice=(Button)findViewById(R.id.btnpolice);
        btnschool=(Button)findViewById(R.id.btnschool);
        btnhospital=(Button)findViewById(R.id.btnhospital);
        btnkissan=(Button)findViewById(R.id.btnkissan);
        btnngo=(Button)findViewById(R.id.btnngo);
        btnfire=(Button)findViewById(R.id.btnfire);
        btnacd=(Button)findViewById(R.id.btnacd);
        btnarh=(Button)findViewById(R.id.btnarh);
        btntd=(Button)findViewById(R.id.btntd);
        btnplaces=(Button)findViewById(R.id.btnplaces);
        btntable=(Button)findViewById(R.id.btntable);

        btnpolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,PoliceDepts.class);
                startActivity(k);
            }
        });
        btnschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,Schools.class);
                startActivity(k);
            }
        });
        btnhospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,Hospitals.class);
                startActivity(k);
            }
        });
        btnkissan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,Kissancenter.class);
                startActivity(k);
            }
        });
        btnngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,Ngo.class);
                startActivity(k);
            }
        });
        btnfire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,FireDepartments.class);
                startActivity(k);
            }
        });
        btnacd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,AntiCorruption.class);
                startActivity(k);
            }
        });
        btnarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,AntiRagging.class);
                startActivity(k);
            }
        });
        btntd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,TrafficDepartment.class);
                startActivity(k);
            }
        });
        btnplaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,WebViewHospital.class);
                startActivity(k);
            }
        });
        btntable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(HomeActivity.this,WebViewTable.class);
                startActivity(k);

            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
               Intent sendIntent = new Intent();
               sendIntent.setAction(Intent.ACTION_SEND);
               sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my link to send.");
               sendIntent.setType("text/plain");
               Intent shareIntent = Intent.createChooser(sendIntent, null);
               startActivity(shareIntent);
               return true;

            case R.id.itemabout:
                Intent l = new Intent(HomeActivity.this,About.class);
                startActivity(l);
                return true;

            case R.id.itemcontact:

                return true;

            case R.id.itemnumber:
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:+919104017901"));
                startActivity(k);
                return true;

            case R.id.itememail:
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"rahilsaiyed00@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, "Query Regarding E-ToolKit");
                email.putExtra(Intent.EXTRA_TEXT, "");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}