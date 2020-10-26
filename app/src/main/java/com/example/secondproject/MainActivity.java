package com.example.secondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText provision, mounting, implausible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        provision = (EditText) findViewById(R.id.assurance1);
        mounting = (EditText) findViewById(R.id.assurance2);
        implausible = (EditText) findViewById(R.id.implausible);

    }

    public void eloquent(View view) {
        String s = provision.getText().toString();
        int key = Integer.parseInt(mounting.getText().toString());

        implausible.setText(encrypt(s, key));
    }

    public String encrypt (String s, int k) {
        s = s.toUpperCase(); // toLowerCase
        int module = 26;
        int offset = 'A'; // or 65..90
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            answer += ((char) (((s.charAt(i) - offset + k) % module) + offset));
        }

        return answer;
    }
}