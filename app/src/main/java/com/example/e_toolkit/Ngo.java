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

public class Ngo extends AppCompatActivity {
    Spinner spinnernloc,spinnerndial;
    Button btnwdis, btnwab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo);

        spinnerndial=(Spinner)findViewById(R.id.spinnerndial);
        spinnernloc=(Spinner)findViewById(R.id.spinnernloc);
        btnwab=(Button)findViewById(R.id.btnwab);
        btnwdis=(Button)findViewById(R.id.btnwdis);

        btnwdis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent k = new Intent((Intent.ACTION_DIAL));
                    k.setData(Uri.parse("tel:1091"));
                    startActivity(k);
                    Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();



            }
        });
        btnwab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:181"));
                startActivity(k);
                Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();


            }
        });
        spinnernloc.setOnItemSelectedListener(new Ngo.MyOnItemSelected());
        spinnerndial.setOnItemSelectedListener(new Ngo.MyOnItemSelected());

    }
    public class MyOnItemSelected implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String a = parent.getItemAtPosition(position).toString();

            switch (parent.getId()){
                case R.id.spinnernloc:
                    if (a.equals("AADHARTRUST - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=AADHARTRUST+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Adivasi Samaj Seva Trust - NGO ")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Adivasi+Samaj+Seva+Trust+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("APPLUS - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=APPLUS+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Astitva Foundation - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Astitva+Foundation+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Aum Narmade Foundation - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Aum+Narmade+Foundation+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Baroda Amateurs Dramatic Trust - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Baroda+Amateurs+Dramatic+Trust+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Bhagyodaya Yuva Vikas Mandal NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Bhagyodaya+Yuva+Vikas+Mandal+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Bhavin Charity Trust - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Bhavin+Charity+Trust+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("BhoolkanBhavan NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Bhoolka+Bhavan+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Bhvina Education Trust - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Bhvina+Education+Trust+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Centre For Environment Science And Community - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Centre+For+Environment+Science+And+Community+-+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Chaitali - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Chaitali+-+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Cosmo Foundation - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Cosmo+Foundation+-+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Deepak Foundation - NGO")  ){
                    Intent k = new Intent(Intent.ACTION_VIEW);
                    k.setData(Uri.parse("geo:0,0?q=Deepak+Foundation+-+NGO%2C+Baroda"));
                    Intent i = Intent.createChooser(k,"Launch Maps");
                    startActivity(i);

                }
                    if (a.equals("Divya Seva Trust - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Divya+Seva+Trust+-+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Dr Paramamitra Shastri Education And Charitable Trust")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Paramamitra+Shastri+Education+And+Charitable+Trust%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Faith Foundation Gujarat - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Faith+Foundation+Gujarat+-+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Gitanjali Education Trust - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Gitanjali+Education+Trust+-+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Greenlife Foundation - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Greenlife+Foundation+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Gujarat State Exarmy Family Women Organisation - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Gujarat+State+Exarmy+Family+Women+Organisation%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Indian Red Cross Society Vadodara District Branch - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Indian+Red+Cross+Society+Vadodara+District+Branch%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Jan Jagruti Gram Seva Faudetion Trust - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Jan+Jagruti+Gram+Seva+Faudetion+Trust%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Kisan Vikas Seva Mandal Raopura Vadodara - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kisan+Vikas+Seva+Mandal+Raopura%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("V Care Right And Duty Ngo - NGO ")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=V+Care+Right+And+Duty+Ngo+-+NGO+%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Vaishali Mahila Mandal - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Vaishali+Mahila+Mandal%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Vrunda Charitable And Education Trust - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Vrunda+Charitable+And+Education+Trust%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Way To Unity Trust - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Way+To+Unity+Trust%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Yug Abhiyaan Charitable Trust - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Yug+Abhiyaan+Charitable+Trust%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Zankar Kala Kendra - NGO")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Zankar+Kala+Kendra+NGO%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                case R.id.spinnerndial:
                    if (a.equals("AADHARTRUST - NGO")  ){
                            Intent k = new Intent((Intent.ACTION_DIAL));
                            k.setData(Uri.parse("tel: 079-26858647"));
                            startActivity(k);
                            Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();


                    }
                    if (a.equals("Adivasi Samaj Seva Trust - NGO ")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-222333"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("APPLUS - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-6583664"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Astitva Foundation - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2630410"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Aum Narmade Foundation - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2784418"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Baroda Amateurs Dramatic Trust - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2341864"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Bhagyodaya Yuva Vikas Mandal NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2341864"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Bhavin Charity Trust - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2524165"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("BhoolkanBhavan NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2774143"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Bhvina Education Trust - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2410421"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Centre For Environment Science And Community - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2653537"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Chaitali - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02667-222043"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Cosmo Foundation - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02666-232960"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Deepak Foundation - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-6562101"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Divya Seva Trust - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2488865"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Dr Paramamitra Shastri Education And Charitable Trust")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919998281366"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Faith Foundation Gujarat - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2783702"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Gitanjali Education Trust - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-222333"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Greenlife Foundation - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2280189"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Gujarat State Exarmy Family Women Organisation - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-6542300"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Indian Red Cross Society Vadodara District Branch - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2413382"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Jan Jagruti Gram Seva Faudetion Trust - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02668-210698"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Kisan Vikas Seva Mandal Raopura Vadodara - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-6535211"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("V Care Right And Duty Ngo - NGO ")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-6590008"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Vaishali Mahila Mandal - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:02667-222043"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Vrunda Charitable And Education Trust - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2663055"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Way To Unity Trust - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2416111"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Yug Abhiyaan Charitable Trust - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-3918067"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }
                    if (a.equals("Zankar Kala Kendra - NGO")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:0265-2291430"));
                        startActivity(k);
                        Toast.makeText(Ngo.this, "Verified", Toast.LENGTH_SHORT).show();

                    }

                    break;
            }


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}