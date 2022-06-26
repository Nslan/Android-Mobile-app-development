package com.nuhaslan.hatahaneuygulamas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Servisler extends AppCompatActivity {
  ImageButton imageButton10;
  ImageButton imageButton9;
  ImageButton imageButton6;
  ImageButton imageButton8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servisler);
        imageButton10 =(ImageButton)findViewById(R.id.imageButton10);
        imageButton9 = (ImageButton)findViewById ( R.id.imageButton9 );
        imageButton6 = (ImageButton)findViewById ( R.id.imageButton6 );
        imageButton8 = (ImageButton)findViewById ( R.id.imageButton8 );
    }

    public void on(View view) {
        Intent intent;
        intent = new Intent(getApplicationContext(), online.class);
        startActivity(intent);
    }
    public void bakan(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData( Uri.parse ("https://www.turkiye.gov.tr/saglik-bakanligi"));
        startActivity ( intent );
    }
    public void mhrs(View view){
        Intent intent1 = new Intent (Intent.ACTION_VIEW);
        intent1.setData(Uri.parse ( "https://www.mhrs.gov.tr/Vatandas/" ));
        startActivity ( intent1 );
    }
    public void ecz(View view){
        Intent intent = new Intent (Intent.ACTION_VIEW);
        intent.setData ( Uri.parse ( "http://www.nobetcieczaneler.org/1/trabzon-nobetci-eczaneleri.html" ) );
        startActivity ( intent );
    }
    public  void alo(View view){
        Intent intent = new Intent ( Intent.ACTION_VIEW );
        intent.setData ( Uri.parse ( "https://alo171.saglik.gov.tr/" ) );
        startActivity ( intent );
    }
}
