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

public class Schools extends AppCompatActivity {

    Spinner spinnersloc,spinnersdial;
    Button btndownload,btnregister;
    DownloadManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools);

        spinnersloc=(Spinner)findViewById(R.id.spinnersloc);
        spinnersdial=(Spinner)findViewById(R.id.spinnersdial);
        btndownload=(Button)findViewById(R.id.btndownload);
        btnregister=(Button)findViewById(R.id.btnregister);



        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://www.edutopia.org/sites/default/files/resources/stw-glenview-stress-reduction-activities.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
                request.setVisibleInDownloadsUi(true);
                long reference = manager.enqueue(request);

            }
        });
        spinnersdial.setOnItemSelectedListener(new Schools.MyOnItemSelected());
        spinnersloc.setOnItemSelectedListener(new Schools.MyOnItemSelected());

    }
    public class MyOnItemSelected implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String a = parent.getItemAtPosition(position).toString();

            switch (parent.getId()){
                case R.id.spinnersloc:
                    if (a.equals("Academic Heights Public School - (AHPS)")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Academic+Heights+Public+School+-+(AHPS)%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Akshar Center for Hearing Impaired Children Special School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Akshar+Center+for+Hearing+Impaired+Children+Special+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Alembic Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Alembic+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Ambe School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Ambe+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("American School of Baroda")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=American+School+of+Baroda%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Anand Vidya Vihar")  ) {
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Anand+Vidya+Vihar%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Andh Kanya Vidhyalaya Lion Blind Girls School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Andh+Kanya+Vidhyalaya+Lion+Blind+Girls+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Ashoka Hall Public School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Ashoka+Hall+Public+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Baby Pearl Play Center and KG School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Baby+Pearl+Play+Center+and+KG+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Bachpan A Play School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Bachpan+A+Play+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Baroda High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Baroda+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Bharatiya Vidya Bhavan V.M. Public School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Bharatiya+Vidya+Bhavan+V.M.+Public+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Bharatiya Vidya Bhavan Vallabhram Mehta Public School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=SBharatiya+Vidya+Bhavan+Vallabhram+Mehta+Public+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Billabong High International School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Billabong+High+International+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Bright School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Bright+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Busy Bees Kinderland - Munjmahuda")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Busy+Bees+Kinderland+-+Munjmahuda%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Busy Bees Kinderland - Padra")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Busy+Bees+Kinderland+-+Padra%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Convent of Jesus and Mary Girls High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Convent+of+Jesus+and+Mary+Girls+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Cygnus World School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Cygnus+World+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("D.R. Amin Memorial School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=D.R.+Amin+Memorial+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Delhi Public School- DPS Harni")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Delhi+Public+School-+DPS Harni%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Delhi Public School - DPS Vadodara")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Delhi+Public+School+-+DPS+Vadodara%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Disha Special School and Autism Centre")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Disha+Special+School+and+Autism+Centre%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Dreamz Play School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Dreamz+Play+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("DSC Public School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=DSC+Public+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("E-Campus One World Junior School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=E-Campus+One+World+Junior+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Elly Child Care")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Elly+Child+Care%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Eurokids - Gotri Road")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Eurokids+-+Gotri+Road%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Eurokids - Waghodia Road")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Eurokids+-+Waghodia+Road%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Fairyland English and Gujarati Medium School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Fairyland+English+and+Gujarati+Medium+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Fertilizernagar School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Fertilizernagar+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Global International School and College")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Global+International+School+and+College%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Global Public School (English Medium)")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Global+Public+School+(English Medium)%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Green Valley High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Green+Valley+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Gujarat Public School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Gujarat+Public+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Gujarat Refinery English Medium School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Gujarat+Refinery+English+Medium+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("H V Shroff Memorial High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=H+V+Shroff+Memorial+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Hello Kids - Gorwa")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Hello+Kids+-+Gorwa%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Hello Kids - Highflyers")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Hello+Kids+-+Highflyers%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Himgira Vidhyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Himgira+Vidhyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Jai Ambe Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Jai+Ambe+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Jawahar Navodaya Vidyalaya - JNV Vadodara")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Jawahar+Navodaya+Vidyalaya+-+JNV+Vadodara%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("JC Junior College")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=JC+Junior+College%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Jeevan Sadhna English Medium School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Jeevan+Sadhna+English+Medium+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Kelavani English Medium School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kelavani+English+Medium+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Kendriya Vidyalaya - KV No.1")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kendriya+Vidyalaya+-+KV+No.1%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Kendriya Vidyalaya - KV No.2")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kendriya+Vidyalaya+-+KV+No.2%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Kensho Early Learning Centre")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kensho+Early+Learning+Centre%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Kidzee - Waghodia Road")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kidzee+-+Waghodia+Road%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Ladharam High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Ladharam+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Maharani English Medium School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Maharani+English+Medium+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Mahedavia High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Mahedavia+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Mar Gregorios Memorial School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Mar+Gregorios+Memorial+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Mauryan High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Mauryan High School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Mayurhir Achievers Kinderland")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Mayurhir+Achievers+Kinderland%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Mira Kindergarten")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Mira+Kindergarten%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Mira the Happy School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Mira+the+Happy+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Nalanda International School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Nalanda+International+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Navjeevan High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Navjeevan+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Navpad Sarvajanik High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Navpad+Sarvajanik+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Navrachana and Vidyani Pre-Primary")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Navrachana+and+Vidyani+Pre-Primary%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Navrachana International School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Navrachana+International+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Parivar Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Parivar+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Podar International School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Podar+International+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Podar Jumbo Kids - Gotri")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Podar+Jumbo+Kids+-+Gotri%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Podar Jumbo Kids - Nizampura")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Podar+Jumbo+Kids+-+Nizampur%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Podar World School - Maneja")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Podar+World+School+-+Maneja%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Rangoli Preschool - Dabhoi Road")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Rangoli+Preschool+-+Dabhoi+Road%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Rangoli Preschool - Gotri")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Rangoli+Preschool+-+Gotri%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Rangoli Preschool - Sangam Centre")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Rangoli+Preschool+-+Sangam+Centre%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Roosevelt High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Roosevelt+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Rosary High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Rosary+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Roshan Memorial School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Roshan+Memorial+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Sabari Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Sabari+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Sadhu Vaswani Vidhya Mandir")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Sadhu+Vaswani+Vidhya+Mandir%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Saint Basil School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Saint+Basil+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Sanskaar Play School - Sunpharma Road")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Sanskaar+Play+School+-+Sunpharma+Road%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Sapphire Global School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Sapphire+Global+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Sardar Vallabhbhai Vidhyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Sardar+Vallabhbhai+Vidhyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Saurabh Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Saurabh+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Serra International Pre-School - Alkapuri")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Serra+International+Pre-School+-+Alkapuri%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shaishav School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shaishav+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shannen Kids")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shannen+Kids%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shannen The World School - STWS")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shannen+The+World+School+-+STWS%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shanti Juniors - Manjalpur")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shanti+Juniors+-+Manjalpur%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shanti Juniors - Nizampura")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shanti+Juniors+-+Nizampura%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shanti Juniors - Sama")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shanti+Juniors+-+Sama%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shree Ambe Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shree+Ambe+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shree Ankur Vidhyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shree+Ankur+Vidhyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shree Ganesh Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shree+Ganesh+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shree Jalaram Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shree+Jalaram+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shree Narayana International School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shree+Narayana+International+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shree Pragati Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shree+Pragati+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shree R.M. Dave Gnanodaya Vidhyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shree+R.M.+Dave+Gnanodaya+Vidhyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shree Raghukul Vidyalay")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shree+Raghukul+Vidyalay%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Shreyas Samarpan Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Shreyas+Samarpan+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Silver Oak School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Silver+Oak+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Smt. Kusumben Kadakia Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Smt.+Kusumben+Kadakia+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("SportyBeans")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=SportyBeans%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("St. Kabir Indian International School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=St.+Kabir+Indian+International+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("St. Kabir School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=St.+Kabir+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Stepping Stones Play School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Stepping+Stones+Play+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Tejas Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Tejas+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Tender Feet Academy")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Tender+Feet+Academy%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("The Bright School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=The+Bright+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("The Concept School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=The+Concept+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("The New Horizon School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=The+New+Horizon+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("The Tree House Play Group - Amrakunj")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=The+Tree+House+Play+Group+-+Amrakunj%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("TIME Kids - New Kareli Baugh")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=TIME+Kids+-+New+Kareli+Baugh%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Tree House High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Tree+House+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Unnati Vidyalaya")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Unnati+Vidyalaya%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Urmi School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Urmi+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Vibgyor High School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Vibgyor+High+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Wowkids Bornehave (House of Kids)")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Wowkids=Bornehave+(House of Kids)%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Wowkids Learning Tree")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Wowkids+Learning+Tree%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Zenith School")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Zenith+School%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);
                    }

                case R.id.spinnersdial:
                    if (a.equals("Academic Heights Public School - (AHPS)")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919601725300"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Akshar Center for Hearing Impaired Children Special School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919879455868"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Alembic Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2290278"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Ambe School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2633262"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("American School of Baroda")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919099056693"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Anand Vidya Vihar")  ) {
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2399541"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Andh Kanya Vidhyalaya Lion Blind Girls School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2437354"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Ashoka Hall Public School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-3298134"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Baby Pearl Play Center and KG School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2773681"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Bachpan A Play School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919925856694"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Baroda High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2644478"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Bharatiya Vidya Bhavan V.M. Public School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2635032"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Bharatiya Vidya Bhavan Vallabhram Mehta Public School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+917405015586"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Billabong High International School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2630800"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Bright School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2251151"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Busy Bees Kinderland - Munjmahuda")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919601022440"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Busy Bees Kinderland - Padra")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+917227033463"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Convent of Jesus and Mary Girls High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2791672"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Cygnus World School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2540027"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("D.R. Amin Memorial School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2333232"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Delhi Public School- DPS Harni")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+917574092914"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Delhi Public School - DPS Vadodara")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2681571"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Disha Special School and Autism Centre")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+917041732070"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Dreamz Play School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919374636465"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("DSC Public School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919898061794"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("E-Campus One World Junior School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-6530005"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Elly Child Care")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-6725149"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Eurokids - Gotri Road")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919727946370"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Eurokids - Waghodia Road")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+917573023989"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Fairyland English and Gujarati Medium School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(02663)-321777"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Fertilizernagar School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-3092665 "));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Global International School and College")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-3282075"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Global Public School (English Medium)")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918140657777"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Green Valley High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918238588855"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Gujarat Public School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2680215"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Gujarat Refinery English Medium School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2236587"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("H V Shroff Memorial High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2518055"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Hello Kids - Gorwa")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919724282300"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Hello Kids - Highflyers")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919737595989"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Himgira Vidhyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2340157"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Jai Ambe Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2483267"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Jawahar Navodaya Vidyalaya - JNV Vadodara")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(02662)-281394"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("JC Junior College")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2660941"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Jeevan Sadhna English Medium School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2429042"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kelavani English Medium School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2324852"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kendriya Vidyalaya - KV No.1")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2482021"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kendriya Vidyalaya - KV No.2")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2481551"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kensho Early Learning Centre")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919724302464"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kidzee - Waghodia Road")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919428066408"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Ladharam High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919909503854"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Maharani English Medium School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2410668"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Mahedavia High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(02663)-257251"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Mar Gregorios Memorial School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2711995"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Mauryan High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919099995356"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Mayurhir Achievers Kinderland")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-6595111"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Mira Kindergarten")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-6453798"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Mira the Happy School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2680068"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Nalanda International School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-6533855"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Navjeevan High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919909963732"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Navpad Sarvajanik High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(02663)-254604"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Navrachana and Vidyani Pre-Primary")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2784393"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Navrachana International School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-230770"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Parivar Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-3298407"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Podar International School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+916366437894"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Podar Jumbo Kids - Gotri")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919099548901"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Podar Jumbo Kids - Nizampura")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2760460"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Podar World School - Maneja")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+917046139000"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Rangoli Preschool - Dabhoi Road")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919998031650"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Rangoli Preschool - Gotri")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918238045005"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Rangoli Preschool - Sangam Centre")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919427899859"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Roosevelt High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919825047755"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Rosary High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2794137"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Roshan Memorial School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919662946766"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Sabari Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2251583"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Sadhu Vaswani Vidhya Mandir")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2480053"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Saint Basil School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2640279"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Sanskaar Play School - Sunpharma Road")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918449369369"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Sapphire Global School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919879224449"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Sardar Vallabhbhai Vidhyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-251728580"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Saurabh Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2353435"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Serra International Pre-School - Alkapuri")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918511910541"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shaishav School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2372031"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shannen Kids")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2482318"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shannen The World School - STWS")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919879997667"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shanti Juniors - Manjalpur")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919099990187"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shanti Juniors - Nizampura")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919099067912"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shanti Juniors - Sama")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+917575001531"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shree Ambe Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918141088880"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shree Ankur Vidhyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2240944"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shree Ganesh Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919898272279"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shree Jalaram Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919727961705"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shree Narayana International School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919998769432"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shree Pragati Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2254338"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shree R.M. Dave Gnanodaya Vidhyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2352985"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shree Raghukul Vidyalay")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-6545824"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Shreyas Samarpan Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2651362"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Silver Oak School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2630473"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Smt. Kusumben Kadakia Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2330019"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("SportyBeans")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918511118954"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("St. Kabir Indian International School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2253377"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("St. Kabir School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2253377"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Stepping Stones Play School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2485846"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Tejas Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2398086"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Tender Feet Academy")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919099039802"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("The Bright School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2250653"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("The Concept School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919825234153"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("The New Horizon School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2460765"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("The Tree House Play Group - Amrakunj")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919998816834"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("TIME Kids - New Kareli Baugh")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+917043973181"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Tree House High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2680068"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Unnati Vidyalaya")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:(0265)-2310848"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Urmi School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918306688899"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Vibgyor High School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+918306910301"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Wowkids Bornehave (House of Kids)")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919988811222"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Wowkids Learning Tree")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+919988811222"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Zenith School")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:+917226071801"));
                        startActivity(k);
                        Toast.makeText(Schools.this, "Verified", Toast.LENGTH_SHORT).show();
                    }


                    break;
            }


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}

