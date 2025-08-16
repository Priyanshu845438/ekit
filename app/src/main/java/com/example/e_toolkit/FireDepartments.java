package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class FireDepartments extends AppCompatActivity {
    Spinner spinnerfloc,spinnerfdial;
    Button btndownload;
    DownloadManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_departments);

        spinnerfdial=(Spinner)findViewById(R.id.spinnerfdial);
        spinnerfloc=(Spinner)findViewById(R.id.spinnerfloc);
        btndownload=(Button)findViewById(R.id.btndownload);

        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://www.kau.edu.sa/Files/0008750/Subjects/Fire-Safety%20lecture.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
                request.setVisibleInDownloadsUi(true);
                long reference = manager.enqueue(request);
                Toast.makeText(FireDepartments.this, "Downloading Check Your Downloads", Toast.LENGTH_SHORT).show();
            }
        });
        spinnerfloc.setOnItemSelectedListener(new FireDepartments.MyOnItemSelected());
        spinnerfdial.setOnItemSelectedListener(new FireDepartments.MyOnItemSelected());
    }
    public class MyOnItemSelected implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String a = parent.getItemAtPosition(position).toString();

            switch (parent.getId()){
                case R.id.spinnerfloc:
                    if (a.equals("Dandia Bazar Fire Station And Control room")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Dandia+Bazar+Fire+Station+And+Control+room%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Wadiwadi Fire Station")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Wadiwadi+Fire+Station%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Panigate Fire Station")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Panigate+Fire+Station%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("G.I.D.C. Fire Station")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=G.I.D.C.+Fire+Station%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Gajarawadi Fire Station")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Gajarawadi+Fire+Station%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("TP-13 - Chhani Fire Station")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=TP-13+-+Chhani+Fire+Station%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("ERC fire Station - Darjipura")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=ERC+fire+Station+-+Darjipura%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                case R.id.spinnerfdial:
                    if (a.equals("Immidiate Dial Up")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:101"));
                        startActivity(k);
                        Toast.makeText(FireDepartments.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Dandia Bazar Fire Station And Control room")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2420881"));
                        startActivity(k);
                        Toast.makeText(FireDepartments.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Wadiwadi Fire Station")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2343545"));
                        startActivity(k);
                        Toast.makeText(FireDepartments.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Panigate Fire Station")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-3513014"));
                        startActivity(k);
                        Toast.makeText(FireDepartments.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("G.I.D.C. Fire Station")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2631444"));
                        startActivity(k);
                        Toast.makeText(FireDepartments.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Gajarawadi Fire Station")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2580908"));
                        startActivity(k);
                        Toast.makeText(FireDepartments.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("TP-13 - Chhani Fire Station")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2772504"));
                        startActivity(k);
                        Toast.makeText(FireDepartments.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("ERC fire Station - Darjipura")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2541687"));
                        startActivity(k);
                        Toast.makeText(FireDepartments.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    break;
            }


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}