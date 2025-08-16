
package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AntiCorruption extends AppCompatActivity {
    Button btnaclaw, btnacloc, btnacdial;
    DownloadManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti_corruption);

        btnacdial = findViewById(R.id.btnacdial);
        btnaclaw = findViewById(R.id.btnaclaw);
        btnacloc = findViewById(R.id.btnacloc);

        btnaclaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://legislative.gov.in/sites/default/files/A1988-49.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
                long reference = manager.enqueue(request);
                Toast.makeText(AntiCorruption.this, "Downloading Check Your Downloads", Toast.LENGTH_SHORT).show();
            }
        });

        btnacloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Intent.ACTION_VIEW);
                k.setData(Uri.parse("geo:0,0?q=Anti+Corruption+Bureau%2C+Baroda"));
                Intent i = Intent.createChooser(k, "Launch Maps");
                startActivity(i);
            }
        });

        btnacdial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:02652415266"));
                startActivity(k);
                Toast.makeText(AntiCorruption.this, "Verified", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
