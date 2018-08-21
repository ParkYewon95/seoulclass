package com.example.user.exampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClassListItem classListItem = new ClassListItem();

        /** ClassList information structure **/
        TextView tv = (TextView)findViewById(R.id.title);
        TextView tv1 = (TextView)findViewById(R.id.location);
        TextView tv2 = (TextView)findViewById(R.id.maxclassnm);
        TextView tv3 = (TextView)findViewById(R.id.minclassnm);
        TextView tv4 = (TextView)findViewById(R.id.pay);
        TextView tv5 = (TextView)findViewById(R.id.usetgtinfo);
        TextView tv6 = (TextView)findViewById(R.id.url);
        TextView tv7 = (TextView)findViewById(R.id.opnbgndt);
        TextView tv8 = (TextView)findViewById(R.id.opnenddt);
        TextView tv9 = (TextView)findViewById(R.id.rcptbgnt);
        TextView tv10 = (TextView)findViewById(R.id.rcptenddt);
        //

        /** ClassList information set string **/
        tv.setText(classListItem.getTitle());
        tv1.setText(classListItem.getLocation());
        tv2.setText(classListItem.getMaxclassnm());
        tv3.setText(classListItem.getMinclassnm());
        tv4.setText(classListItem.getPay());
        tv5.setText(classListItem.getUsetgtinfo());
        tv6.setText(classListItem.getUrl());
        tv7.setText(classListItem.getOpnbgndt());
        tv8.setText(classListItem.getOpnenddt());
        tv9.setText(classListItem.getRcptbgnt());
        tv10.setText(classListItem.getRcptenddt());
        //

   }
}

