package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity  {
 private GoogleMap map;
 private LatLng ltlng;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  InitialiseMap();
  Button buttonreload1=(Button)findViewById(R.id.buttonreload);
  Button buttonreload2=(Button)findViewById(R.id.buttonreload2);
  buttonreload1.setOnClickListener(new View.OnClickListener() {
   
   @Override
   public void onClick(View v) {
    // TODO Auto-generated method stub
    map.clear();
    ltlng=new LatLng(55, 45);
    map.addMarker(new MarkerOptions()
          .position(ltlng)
          .title("Hello world1:"));
   }
  });
         buttonreload2.setOnClickListener(new View.OnClickListener() {
   
   @Override
   public void onClick(View v) {
    // TODO Auto-generated method stub
    map.clear();
    ltlng=new LatLng(75, 65);
    map.addMarker(new MarkerOptions()
          .position(ltlng)
          .title("Hello world2:"));
   }
   });
  
   }

 private void InitialiseMap() {
  // TODO Auto-generated method stub
   if (map == null) {
    map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_frag))
                              .getMap();
       
    if (map != null) {
         

        }
  
    map.setMyLocationEnabled(true);
     for (int i = 60; i < 70; i++) {
      ltlng=new LatLng(i, i+30);
    
      map.addMarker(new MarkerOptions()
          .position(ltlng)
          .title("Hello world:"+i));
   }
   }
}
}
