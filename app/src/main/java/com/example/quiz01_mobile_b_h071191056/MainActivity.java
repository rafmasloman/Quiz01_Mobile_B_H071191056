package com.example.quiz01_mobile_b_h071191056;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void biodataPage(View view){
        Intent actionBio = new Intent(MainActivity.this,BiodataActivity.class);
        startActivity(actionBio);
    }

    public void myLocation(View view){
        Intent location = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:1.455560, 124.822589")).setPackage("com.google.android.apps.maps");
        startActivity(location);
    }

    public void telephone(View view){
        Intent telephone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "081342777362"));
        startActivity(telephone);
    }

    public void logout(View view){
        exitApp(this);
    }

    public void exitApp(Activity activity){
        AlertDialog.Builder build =new AlertDialog.Builder(activity);
        build.setTitle("Keluar");
        build.setMessage("Serius Mau Keluar");

        build.setPositiveButton("IYE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finishAffinity();
                System.exit(0);
            }
        });

        build.setNegativeButton("NDAJI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        build.show();
    }


}