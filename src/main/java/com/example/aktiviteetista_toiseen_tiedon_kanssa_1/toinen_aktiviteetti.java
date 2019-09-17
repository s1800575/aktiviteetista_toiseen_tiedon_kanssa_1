package com.example.aktiviteetista_toiseen_tiedon_kanssa_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class toinen_aktiviteetti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toinen_aktiviteetti);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int numero = intent.getIntExtra(MainActivity.EXTRA_NUMERO, 0);

        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);

        textView6.setText(text);
        textView7.setText(""+numero);



    }
}
