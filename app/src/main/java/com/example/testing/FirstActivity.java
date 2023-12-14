package com.example.testing;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class FirstActivity extends AppCompatActivity {
    String TAG ="codetrix";
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d(TAG,"OnCreate is called.");
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(FirstActivity.this);
                    builder.setTitle("Alert");
                    builder.setMessage("This is an alert message.");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Do something when the "OK" button is clicked
                            Toast.makeText(FirstActivity.this, "You clicked OK", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Do something when the "Cancel" button is clicked
                            Toast.makeText(FirstActivity.this, "You clicked Cancel", Toast.LENGTH_SHORT).show();
                        }
                    });
                    builder.show();

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"OnStart is called.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"OnPause is called.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"OnResume is called.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"OnStop is called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"OnDestroy is called.");
    }
}