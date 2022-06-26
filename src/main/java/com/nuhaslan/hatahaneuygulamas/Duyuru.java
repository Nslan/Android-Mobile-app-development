package com.nuhaslan.hatahaneuygulamas;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class Duyuru extends AppCompatActivity {
 private  WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duyuru);
     webView = (WebView)findViewById ( R.id.webViewww );
        WebSettings webSettings=webView.getSettings ();
        webSettings.setJavaScriptEnabled ( true );
        webView.loadUrl ( "http://www.trabzonkanuni.gov.tr/TR,100803/duyurular.html" );

    }
   /*
*/

}

