package com.example.thebigapple.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/*
The following resources were used:
https://developer.android.com/guide/topics/ui/notifiers/toasts.html
https://www.mkyong.com/android/android-toast-example/
http://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();
        final CharSequence text = "This button will launch ";
        final int duration = Toast.LENGTH_SHORT;

        final Button b1 = (Button) findViewById(R.id.button1);
        final Button b2 = (Button) findViewById(R.id.button2);
        final Button b3 = (Button) findViewById(R.id.button3);
        final Button b4 = (Button) findViewById(R.id.button4);
        final Button b5 = (Button) findViewById(R.id.button5);
        final Button b6 = (Button) findViewById(R.id.button6);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, text + b1.getText().toString(), duration).show();
            }
        });

        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, text + b2.getText().toString(), duration).show();
            }
        });

        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, text + b3.getText().toString(), duration).show();
            }
        });

        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, text + b4.getText().toString(), duration).show();
            }
        });

        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, text + b5.getText().toString(), duration).show();
            }
        });

        b6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, text + b6.getText().toString(), duration).show();
            }
        });

    }
}
