package com.nuhaslan.hatahaneuygulamas;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Poliklinikler extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poliklinikler);
        ListView listView = (ListView) findViewById(R.id.listView);
        final ArrayList<String> poliklinikname = new ArrayList<String>();
        poliklinikname.add("ANESTEZİ POLİKLİNİĞİ");
        poliklinikname.add("BEYİN CERRAHİ POLİKLİNİĞİ");
        poliklinikname.add ( "CİLDİYE POLİKLİNİĞİ" );
        poliklinikname.add("ÇOCUK ALERJİSİ POLİKLİNİĞİ");
        poliklinikname.add ( "ÇOCUK CERRAHİ POLİKLİNİĞİ" );
        poliklinikname.add ( "ÇOCUK ENDOKRİN POLİKKLİNİĞİ" );
        poliklinikname.add ( "ÇOCUK ENFEKSİYON POLİKİNİĞİ" );
        poliklinikname.add ( "ÇOCUK GELİŞİMİ POLİKLİNİĞİ" );
        poliklinikname.add ( "ÇOCUK HEMATOLOJİ POLİKLİNİĞİ" );
        poliklinikname.add ( "ÇOCUK KARDİYOLOYİ POLİKLİNİĞİ" );
        poliklinikname.add ( "ÇOCUK PSİKİYATRİ POLİKLİNİĞİ" );
        poliklinikname.add ("ÇOCUK SAĞLILIĞI VE HASTALIKLARI");
        poliklinikname.add("DİYET POLİKLİNİĞİ");
        poliklinikname.add("ENFEKSİYON HASTALIKLARI POLİKLİNİĞİ");
        poliklinikname.add("FİZİK TEDAVİ");
        poliklinikname.add("GENEL CERRAHİ");
        poliklinikname.add("GÖZ POLİKLİNİĞİ");
        poliklinikname.add("KADIN HASTALIKLARI VE DOĞUM POLİKLİNİĞİ");
        poliklinikname.add("KALP VE DAMAR CERRAHİSİ");
        poliklinikname.add("KARDİOLOJİ POLİKLİNİĞİ");
        poliklinikname.add("KULAK-BURUN-BOĞAZ POLİKLİNİĞİ");
        poliklinikname.add("NÖROLOJİ POLİKLİNİĞİ");
        poliklinikname.add("ORTOPEDİ VE TRAVMATOLOJİ POLİKLİNİĞİ");
        poliklinikname.add("PLASTİK CERRAHİ");
        poliklinikname.add("PSİKYATRİ SERVİSİ");
        poliklinikname.add("ÜROLOJİ POLİKLİNİĞİ");



        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,poliklinikname);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent ( Intent.ACTION_VIEW );
                intent.setData ( Uri.parse ( "https://www.hastanerandevu.gov.tr/Randevu/login.xhtml" ) );
                intent.putExtra("Name",poliklinikname.get(i));
                startActivity(intent);
                Toast.makeText ( getApplicationContext (),"RANDEVU ALMA EKRANINA YÖNLENDİRİLİYOR",Toast.LENGTH_SHORT ).show ();
            }
        });
    }
}

