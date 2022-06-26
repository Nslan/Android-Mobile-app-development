package com.nuhaslan.hatahaneuygulamas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pol(View view){

        Intent intent = new Intent(getApplicationContext(),Poliklinikler.class);
        startActivity(intent);
    }

    public void duy(View view){
        Intent intent = new Intent(getApplicationContext(),Duyuru.class);
        startActivity(intent);
    }
    public void ile(View view){
        Intent intent = new Intent(getApplicationContext(),Contact.class);
        startActivity(intent);
    }
    public void aya(View view){
        Intent intent = new Intent(getApplicationContext(),Servisler.class);
        startActivity(intent);
    }
}
