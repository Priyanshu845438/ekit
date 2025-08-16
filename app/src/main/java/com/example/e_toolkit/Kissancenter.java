package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Kissancenter extends AppCompatActivity {

    Spinner spinnerkloc,spinnerkdial;
    Button btnkhd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kissancenter);

        spinnerkdial=(Spinner)findViewById(R.id.spinnerkdial);
        spinnerkloc=(Spinner)findViewById(R.id.spinnerkloc);
        btnkhd=(Button)findViewById(R.id.btnkhd);

        btnkhd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:1800-180-1551"));
                startActivity(k);
                Toast.makeText(Kissancenter.this, "Verified", Toast.LENGTH_SHORT).show();



            }
        });
        spinnerkloc.setOnItemSelectedListener(new Kissancenter.MyOnItemSelected());
        spinnerkdial.setOnItemSelectedListener(new Kissancenter.MyOnItemSelected());
    }
    public class MyOnItemSelected implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String a = parent.getItemAtPosition(position).toString();

            switch (parent.getId()){
                case R.id.spinnerkloc:
                    if (a.equals("Kishan Agro Traders")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kishan+Agro+Traders%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Unity Traders and Kisan Kendra")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Unity+Traders+and+Kisan+Kendra%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Kisan Grow Industries")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kisan+Grow+Industries%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("KISANeSTORE")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=KISANeSTORE%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Kisan Filters Pvt. Ltd.")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kisan+Filters+Pvt.+Ltd.%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }
                    if (a.equals("Kishan Beej Bhandar")  ){
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kishan+Beej+Bhandar%2C+Baroda"));
                        Intent i = Intent.createChooser(k,"Launch Maps");
                        startActivity(i);

                    }




                case R.id.spinnerkdial:
                    if (a.equals("Kishan Agro Traders")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:098983 33634"));
                        startActivity(k);
                        Toast.makeText(Kissancenter.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kisan Grow Industries")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:097264 90777"));
                        startActivity(k);
                        Toast.makeText(Kissancenter.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("KISANeSTORE")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:098988 95488"));
                        startActivity(k);
                        Toast.makeText(Kissancenter.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kisan Filters Pvt. Ltd")  ){
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:098985 76699"));
                        startActivity(k);
                        Toast.makeText(Kissancenter.this, "Verified", Toast.LENGTH_SHORT).show();
                    }


                    break;
            }


        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}