package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PoliceDepts extends AppCompatActivity {

    Spinner spinner,spinner2;
    Button btndownload,btnregister;
    DownloadManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_depts);

        spinner=(Spinner)findViewById(R.id.spinner);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        btndownload=(Button)findViewById(R.id.btndownload);
        btnregister=(Button)findViewById(R.id.btnregister);



        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://www.hyderabadpolice.gov.in/acts/Indianpenalcode1860.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
                request.setVisibleInDownloadsUi(true);
                long reference = manager.enqueue(request);
                Toast.makeText(PoliceDepts.this, "Downloading Check Your Downloads", Toast.LENGTH_SHORT).show();

            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PoliceDepts.this,WebviewPolicedept.class);
                startActivity(i);
            }
        });

        spinner.setOnItemSelectedListener(new MyOnItemSelected());
        spinner2.setOnItemSelectedListener(new MyOnItemSelected());

    }

    public class MyOnItemSelected implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String a = parent.getItemAtPosition(position).toString();

           switch (parent.getId()){
               case R.id.spinner:
                    if (a.equals("J P Road Police Station")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=J+P+Road+Police+Station%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                   if (a.equals("Gotri Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Gotri+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Raopura Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:geo:0,0?q=Raopura+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Karelibaug Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Karelibaug+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Gorwa Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Gorwa+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Navapura Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Navapura+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("City Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=City+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Makarpura Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Makarpura+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Panigate Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Panigate+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Laxmipura Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Laxmipura+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Saiyajiganj Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Saiyajiganj+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Sama Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Sama+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Bapod Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Bapod+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Police Bhavan")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Police+Bhavan%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Harni Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Harni+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Samta Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Sampta+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Wadi Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Wadi+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);

                   }
                   if (a.equals("Taluka Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Taluka+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);

                   }
                   if (a.equals("Sardar Estate Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Sardar+Estate+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Manjalpur Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Manjalpur+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Fatehgunj Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Fatehgunj+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Channi Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Channi+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Nandesari Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Nandesari+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Jawahar Nagar Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Jawahar+Nagar+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
                   if (a.equals("Warasiya Police Station")  ){
                       Intent k = new Intent(Intent.ACTION_VIEW);
                       k.setData(Uri.parse("geo:0,0?q=Warasiya+Police+Station%2C+Baroda"));
                       Intent i = Intent.createChooser(k,"Launch Maps");
                       startActivity(i);
                   }
               case R.id.spinner2:
                   if (a.equals("J P Road Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652358132"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Immidiate Dial Up")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:100"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }

                   if (a.equals("Gotri Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652373750"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Raopura Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652423500"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Karelibaug Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652432592"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Gorwa Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652281313"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Navapura Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652459461"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("City Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652561310"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Makarpura Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652651915"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Samta Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652399500"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Panigate Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652562899"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Laxmipura Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652399500"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Saiyajiganj Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652362400"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Sama Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652774446"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Bapod Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652510821"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Police Bhavan")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652431414"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Harni Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652541423"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Wadi Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652431400"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Manjalpur Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652635856"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Fatehgunj Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652771500"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   if (a.equals("Nandesari Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652840440"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();

                   }
                   if (a.equals("Jawahar Nagar Police Station")  ){
                       Intent k = new Intent((Intent.ACTION_DIAL));
                       k.setData(Uri.parse("tel:+912652232382"));
                       startActivity(k);
                       Toast.makeText(PoliceDepts.this, "Verified", Toast.LENGTH_SHORT).show();
                   }
                   break;
           }


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}