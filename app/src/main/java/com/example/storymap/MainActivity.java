package com.example.storymap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button submitbtn;
    private Button readbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitbtn = (Button) findViewById(R.id.submitbtn);
        readbtn = (Button) findViewById(R.id.readbtn);
        submitbtn.setOnClickListener(this);
        readbtn.setOnClickListener(this);
    }

    public void onClick(View v) {
        /** Called when the user taps the read story button */
        if (v == readbtn) {
            Intent home_intent = new Intent(getApplicationContext(), MapActivity.class)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(home_intent);
        }
        /** Called when the user taps the submit story button */
        if (v == submitbtn) {
            Intent home_intent = new Intent(getApplicationContext(), SubmitActivity.class)
                    .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(home_intent);
        }
    }


}