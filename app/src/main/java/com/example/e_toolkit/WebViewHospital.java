package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewHospital extends AppCompatActivity {
    WebView wv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_hospital);

        wv2=(WebView)findViewById(R.id.wv2);
        WebSettings webSettings = wv2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv2.setWebViewClient(new WebViewClient());
        wv2.loadUrl("https://www.baroda.com/listing/Sightseeing-In-Vadodara");
        getSupportActionBar().hide();
    }
}