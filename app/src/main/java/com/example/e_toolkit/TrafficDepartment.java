package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TrafficDepartment extends AppCompatActivity {
    Button btntdial,btntloc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_department);

        btntdial=(Button)findViewById(R.id.btntdial);
        btntloc=(Button)findViewById(R.id.btntloc);

        btntloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Intent.ACTION_VIEW);
                k.setData(Uri.parse("geo:0,0?q=RTO+Vadodara+National+Highway+8+Dumad+Service+Road"));
                Intent i = Intent.createChooser(k,"Launch Maps");
                startActivity(i);

            }
        });
        btntdial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent((Intent.ACTION_DIAL));
                k.setData(Uri.parse("tel:0265-2540016"));
                startActivity(k);
                Toast.makeText(TrafficDepartment.this, "Verified", Toast.LENGTH_SHORT).show();

            }
        });
    }
}