package com.nuhaslan.hatahaneuygulamas;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Contact extends AppCompatActivity {
   ImageButton imageButton14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
       imageButton14 = (ImageButton) findViewById ( R.id.imageButton14 );


    }
   public void map(View view){


       AlertDialog.Builder builder = new AlertDialog.Builder(Contact.this);
       builder.setTitle("KULLANICI İZNİ");
       builder.setMessage("Kullanıcı İzni Gerekli!Devam Edilsin mi?");

       builder.setNegativeButton("İPTAL", new DialogInterface.OnClickListener(){
           public void onClick(DialogInterface dialog, int id) {

               //İptal butonuna basılınca yapılacaklar.Sadece kapanması isteniyorsa boş bırakılacak

           }
       });


       builder.setPositiveButton("DEVAM", new DialogInterface.OnClickListener() {
           public void onClick(DialogInterface dialog, int id) {
               //Tamam butonuna basılınca yapılacaklar
               Intent intent = new Intent (getApplicationContext (),MapsActivity.class );
               startActivity ( intent );
           }
       });


       builder.show();


    }


    public  void  tus(View view){
        Intent intent = new Intent ( getApplicationContext (),bilgi_iletisim.class );
        startActivity ( intent );
    }
}
