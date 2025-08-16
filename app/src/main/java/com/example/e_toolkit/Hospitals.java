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

public class Hospitals extends AppCompatActivity {
    Spinner spinnerhloc,spinnerhdial;
    Button btndownload,btnregister;
    DownloadManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

        spinnerhdial=(Spinner)findViewById(R.id.spinnerhdial);
        spinnerhloc=(Spinner)findViewById(R.id.spinnerhloc);
        btndownload=(Button)findViewById(R.id.btndownload);
        btnregister=(Button)findViewById(R.id.btnregister);

        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://www.indianredcross.org/publications/FA-manual.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
                request.setVisibleInDownloadsUi(true);
                long reference = manager.enqueue(request);
                Toast.makeText(Hospitals.this, "Downloading Check Your Downloads", Toast.LENGTH_SHORT).show();

            }
        });
        spinnerhloc.setOnItemSelectedListener(new Hospitals.MyOnItemSelected());
        spinnerhdial.setOnItemSelectedListener(new Hospitals.MyOnItemSelected());
    }
    public class MyOnItemSelected implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String a = parent.getItemAtPosition(position).toString();

            switch (parent.getId()){
                case R.id.spinnerhloc:
                    if (a.equals("Bhailal Amin General Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Bhailal+Amin+General+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Eye-q Super Speciality Eye Hospitals Eye Care")  ){
                    Intent k = new Intent(Intent.ACTION_VIEW);
                    k.setData(Uri.parse("geo:0,0?q=Eye+-+q+Super+Speciality+Eye+Hospitals+Eye+Care%2C+Baroda"));
                    Intent i = Intent.createChooser(k,"Launch Maps");
                    startActivity(i);
                    }
                    if (a.equals("Centre For Sight Eye Care")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Centre+For+Sight+Eye+Care%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Baroda Heart Inst. And Heart Center")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Baroda+Heart+Inst.+And+Heart+Center%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Deep Intensive And Critical Care")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Deep+Intensive+And+Critical+Care%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Gupta Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Gupta+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Kamath Kidney And Eye Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kamath+Kidney+And+Eye+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Manjalpur Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Manjalpur+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Modi Clinic")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Modi+Clinic%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Patanjaly Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Patanjaly+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Rushab Nursing Home")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Rushab+Nursing+Home%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Samarpan Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Samarpan+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Uday Clinic")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Uday+Clinic%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shubhechha+Multi+Speciality+Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shubhechha+Multi+Speciality+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Vraj Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Vraj+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Navrang Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Navrang+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Baps Shashtri Maharaj Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Baps+Shashtri+Maharaj+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Bhumi Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Bhumi+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Sunshine Global Hospitals -manjalpur")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Sunshine+Global+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Indrapuri Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Indrapuri+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Dwarkesh+Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Dwarkesh+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Aashray Urology Institute")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Aashray+Urology+Institute%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Satyam Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Satyam+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Medical College - Anandpura")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Medical+College+-+Anandpura%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Smt. B.k.shah Medical Institute And Research Centre")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Smt.+B+.+k+.+shah+Medical+Institute+And+Research+Centre%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Gmers Medical College And Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Gmers+Medical+College+And+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shree+Vraj+Hospital")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shree+Vraj+Hospital%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                case R.id.spinnerhdial:
                    if (a.equals("Bhailal Amin General Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02656776222"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Immidiate Dial Up")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:108"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Eye-q Super Speciality Eye Hospitals Eye Care")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:078240 15453"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Centre For Sight Eye Care")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:1800 120 0477"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Baroda Heart Inst. And Heart Center")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265 232 5444"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Deep Intensive And Critical Care")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265 241 6182"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Gupta Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:079 4105 8558"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kamath Kidney And Eye Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265 232 2463"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Manjalpur Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652640030"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Modi Clinic")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652780504"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Patanjaly Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652394264"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Rushab Nursing Home")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652395576"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Samarpan Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652570570"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Uday Clinic")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652510678"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shubhechha+Multi+Speciality+Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919978694108"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Vraj Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02654000232"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Navrang Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:07947256133"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Baps Shashtri Maharaj Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919998991018"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Bhumi Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919429418778"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Sunshine Global Hospitals -manjalpur")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918469122777"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Indrapuri Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652515982"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Dwarkesh+Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652485376"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Aashray Urology Institute")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652356295"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Satyam Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652772375"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Medical College - Anandpura")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652421594"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Smt. B.k.shah Medical Institute And Research Centre")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02668245262"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Gmers Medical College And Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652398008"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shree+Vraj+Hospital")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02652252920"));
                        startActivity(k);
                        Toast.makeText(Hospitals.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                   break;
            }


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}