package com.tushant.intentlearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by sanchal on 6/23/2017.
 */

public class OtherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Intent i = getIntent();
        String s = i.getStringExtra("Text");
        TextView otherTextView = (TextView) findViewById(R.id.textView);
        otherTextView.setText(s);
    }
}
