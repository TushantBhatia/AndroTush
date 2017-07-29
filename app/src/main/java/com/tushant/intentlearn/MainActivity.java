package com.tushant.intentlearn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText)findViewById(R.id.edit);
        Button button ;
        button = (Button) findViewById(R.id.buttonhello);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                Intent i = new Intent(getBaseContext(),OtherActivity.class);
              //  i.setAction(Intent.ACTION_DIAL);
                //i.setData(Uri.parse("9716717299"));
                i.putExtra("Text",s);
                startActivity(i);
                finish();
            }
        });
    }
}
