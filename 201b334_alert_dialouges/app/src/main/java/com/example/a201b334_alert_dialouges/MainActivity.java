package com.example.a201b334_alert_dialouges;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this )
                .setIcon(R.drawable.ic_sj3)
                .setTitle("Be alert!!")
                .setMessage("Go studyy right now")
                .setNeutralButton("GOING", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Go fast", Toast.LENGTH_SHORT).show();
                    }
                }).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//was not able to open the image on the no