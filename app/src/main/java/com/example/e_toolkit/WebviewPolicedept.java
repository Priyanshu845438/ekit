package com.example.e_toolkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewPolicedept extends AppCompatActivity {
    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_policedept);

        wv1=(WebView)findViewById(R.id.wv1);
        WebSettings webSettings = wv1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://gujhome.gujarat.gov.in/portal");
        getSupportActionBar().hide();
    }
}