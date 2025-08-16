
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

    Spinner spinnerkloc, spinnerkdial;
    Button btnkhd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kissancenter);

        spinnerkloc = findViewById(R.id.spinnerkloc);
        spinnerkdial = findViewById(R.id.spinnerkdial);
        btnkhd = findViewById(R.id.btnkhd);

        spinnerkloc.setOnItemSelectedListener(new MyOnItemSelected());
        spinnerkdial.setOnItemSelectedListener(new MyOnItemSelected());

        btnkhd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kissancenter.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    public class MyOnItemSelected implements AdapterView.OnItemSelectedListener {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String a = parent.getItemAtPosition(position).toString();

            switch (parent.getId()) {
                case R.id.spinnerkloc:
                    if (a.equals("Kishan Agro Traders")) {
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kishan+Agro+Traders"));
                        Intent i = Intent.createChooser(k, "Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Kisan Grow Industries")) {
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kisan+Grow+Industries"));
                        Intent i = Intent.createChooser(k, "Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("KISANeSTORE")) {
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=KISANeSTORE"));
                        Intent i = Intent.createChooser(k, "Launch Maps");
                        startActivity(i);
                    }
                    if (a.equals("Kisan Filters Pvt. Ltd")) {
                        Intent k = new Intent(Intent.ACTION_VIEW);
                        k.setData(Uri.parse("geo:0,0?q=Kisan+Filters+Pvt+Ltd"));
                        Intent i = Intent.createChooser(k, "Launch Maps");
                        startActivity(i);
                    }
                    break;

                case R.id.spinnerkdial:
                    if (a.equals("Kishan Agro Traders")) {
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:09898333634"));
                        startActivity(k);
                        Toast.makeText(Kissancenter.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kisan Grow Industries")) {
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:09726490777"));
                        startActivity(k);
                        Toast.makeText(Kissancenter.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("KISANeSTORE")) {
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:09898895488"));
                        startActivity(k);
                        Toast.makeText(Kissancenter.this, "Verified", Toast.LENGTH_SHORT).show();
                    }
                    if (a.equals("Kisan Filters Pvt. Ltd")) {
                        Intent k = new Intent((Intent.ACTION_DIAL));
                        k.setData(Uri.parse("tel:09898576699"));
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
