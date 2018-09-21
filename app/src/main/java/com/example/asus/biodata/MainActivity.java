package com.example.asus.biodata;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gosite(View v) {
        Uri uri = Uri.parse("http://my-computernetworking.blogspot.com/");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void gotomaps(View v) {
        Uri uri = Uri.parse("geo:0,0?q=-6.9842247, 110.3235577");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }

    public void callnumber(View v) {
        Uri uri = Uri.parse("tel:08995665631");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
}
