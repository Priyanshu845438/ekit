package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AntiRagging extends AppCompatActivity {
    Button btnpolice,btnfire,btnpoison,btnanti,btnrag,btntpolice,btngas,btnaids,btnchild,btnrailway,btnambulance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti_ragging);

        btnpolice=(Button)findViewById(R.id.btnpolice);
        btnfire=(Button)findViewById(R.id.btnfire);
        btnpoison=(Button)findViewById(R.id.btnpoison);
        btnanti=(Button)findViewById(R.id.btnanti);
        btnrag=(Button)findViewById(R.id.btnrag);
        btntpolice=(Button)findViewById(R.id.btntpolice);
        btngas=(Button)findViewById(R.id.btngas);
        btnaids=(Button)findViewById(R.id.btnaids);
        btnchild=(Button)findViewById(R.id.btnchild);
        btnrailway=(Button)findViewById(R.id.btnrailway);
        btnambulance=(Button)findViewById(R.id.btnambulance);

        btnpolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:100"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btnfire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:101"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btnpoison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:1066"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btnanti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:1031"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btnrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:18001805522"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btntpolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:103"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btngas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:1906"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btnaids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:1097"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btnchild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:1098"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btnrailway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:139"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
        btnambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:108"));
                startActivity(k);
                Toast.makeText(AntiRagging.this, "Verified", Toast.LENGTH_SHORT).show();
            }
        });



    }
}