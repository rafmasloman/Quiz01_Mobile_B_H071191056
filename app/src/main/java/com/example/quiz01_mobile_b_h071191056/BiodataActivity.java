package com.example.quiz01_mobile_b_h071191056;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }
    public void goHome(View view){
        Intent actionHome = new Intent(BiodataActivity.this,MainActivity.class);
        startActivity(actionHome);
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