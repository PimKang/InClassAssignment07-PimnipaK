package com.example.android.inclassassignment07_pimnipak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void submitPupper(View view) {
        Pupper pupper = new Pupper("Mickey", 2,true);
        Intent data = new Intent();
        data.putExtra(KEY.PUPPER_KEY, pupper);
        setResult(RESULT_OK, data);
        finish();
    }

}
