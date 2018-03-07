package com.example.android.inclassassignment07_pimnipak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText= (TextView) findViewById(R.id.text);
    }

    public void addPupper(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, KEY.REQUEST_ADD_PUPPER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == KEY.REQUEST_ADD_PUPPER && resultCode == RESULT_OK) {
            Pupper pupper = (Pupper) data.getSerializableExtra(KEY.PUPPER_KEY);
            displayText.setText(pupper.toString());
        }
    }

}
