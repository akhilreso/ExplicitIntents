package com.app.first.explicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {
    Button buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        buttons=(Button)findViewById(R.id.button2);

    }
    public void doSomething(View v){

        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);


    }
}
