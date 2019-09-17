package com.example.aktiviteetista_toiseen_tiedon_kanssa_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.aktiviteetista_toiseen_tiedon_kanssa_1.EXTRA_TEXT";
    public static final String EXTRA_NUMERO = "com.example.aktiviteetista_toiseen_tiedon_kanssa_1.EXTRA_NUMERO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toiseenAktiviteettiin();

            }
        });

    }

    public void toiseenAktiviteettiin() {

        EditText editText1 = (EditText) findViewById(R.id.editText1);
        String text = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        int numero = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, toinen_aktiviteetti.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_NUMERO, numero);

        startActivity(intent);

    }


}
