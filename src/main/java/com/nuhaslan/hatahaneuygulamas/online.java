package com.nuhaslan.hatahaneuygulamas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class online extends AppCompatActivity {
    private  WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_online );
        webView = (WebView)findViewById ( R.id.webb );
        WebSettings webSettings=webView.getSettings ();
        webSettings.setJavaScriptEnabled ( true );
        webView.loadUrl ("http://www.trabzonkanuni.gov.tr/TR,98507/online-hizmetler.html" );
    }
}
