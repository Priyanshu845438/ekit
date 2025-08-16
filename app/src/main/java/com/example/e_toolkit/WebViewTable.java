package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewTable extends AppCompatActivity {
WebView wv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_table);
        wv3=(WebView)findViewById(R.id.wv3);
        WebSettings webSettings = wv3.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv3.setWebViewClient(new WebViewClient());
        wv3.loadUrl("https://www.baroda.com/railway-timetable");
        getSupportActionBar().hide();
    }
}