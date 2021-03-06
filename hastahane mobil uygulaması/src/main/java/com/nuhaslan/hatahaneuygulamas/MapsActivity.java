package com.nuhaslan.hatahaneuygulamas;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    LocationManager locationManager;
    LocationListener locationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_maps );
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById ( R.id.map );
        mapFragment.getMapAsync ( this );
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
         locationManager = (LocationManager) this.getSystemService ( Context.LOCATION_SERVICE );
         locationListener = new LocationListener () {
            @Override
            public void onLocationChanged(Location location) {
                System.out.println ("location:"+location.toString ());
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }
        };
         /* if (Build.VERSION.SDK_INT>= 26){
             if (checkSelfPermission ( Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
                 requestPermissions ( new String[] {Manifest.permission.ACCESS_FINE_LOCATION},1 );
             }else {
                 locationManager.requestLocationUpdates ( LocationManager.GPS_PROVIDER,0,0,locationListener );
             }
         }else {
             locationManager.requestLocationUpdates ( LocationManager.GPS_PROVIDER,0,0,locationListener );
         }*/
       if(ContextCompat.checkSelfPermission ( this,Manifest.permission.ACCESS_FINE_LOCATION )!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions ( this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1 );
        }else {
            locationManager.requestLocationUpdates ( LocationManager.GPS_PROVIDER,5000,50,locationListener );
        }
        // Add a marker in Sydney and move the camera
        LatLng Trabzon = new LatLng ( 41.0050705,39.7069697 );
        mMap.addMarker ( new MarkerOptions ().position ( Trabzon ).title ( "Marker in Trabzon" ) );
        mMap.moveCamera ( CameraUpdateFactory.newLatLngZoom ( Trabzon,17 ) );

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (grantResults.length>0){
            if (requestCode == 1){
                if (ContextCompat.checkSelfPermission ( this,Manifest.permission.ACCESS_FINE_LOCATION )== PackageManager.PERMISSION_GRANTED){
                    locationManager.requestLocationUpdates ( LocationManager.GPS_PROVIDER,0,0,locationListener );
                }
            }
        }
        super.onRequestPermissionsResult ( requestCode, permissions, grantResults );
    }
}
