package com.aalex.simpledictionary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonMagyarAngol;
    Button buttonMagyarJapan;
    Button buttonMagyarOlasz;
    Button buttonMagyarNemet;
    Button buttonVissza;
    String[] szavak;
    ArrayList<String> listaSzavak; //items
    ArrayAdapter<String> adapter;
    EditText editText;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        buttonMagyarAngol = (Button) findViewById(R.id.buttonMagyarAngol);
        buttonMagyarAngol.setOnClickListener(this);

        buttonMagyarJapan = (Button) findViewById(R.id.buttonMagyarJapan);
        buttonMagyarJapan.setOnClickListener(this);

        buttonMagyarOlasz = (Button) findViewById(R.id.buttonMagyarOlasz);
        buttonMagyarOlasz.setOnClickListener(this);

        buttonMagyarNemet = (Button) findViewById(R.id.buttonMagyarNemet);
        buttonMagyarNemet.setOnClickListener(this);


        final Intent intentBelepes = getIntent();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonMagyarAngol:
                Intent intentMagyarAngol = new Intent(MainMenuActivity.this, MagyarAngolLista.class);
                startActivity(intentMagyarAngol);
                break;
            case R.id.buttonMagyarJapan:
                Intent intentMagyarJapan = new Intent(MainMenuActivity.this, MagyarJapanLista.class);
                startActivity(intentMagyarJapan);
                break;

            case R.id.buttonMagyarOlasz:
                Intent intentMagyarOlasz = new Intent(MainMenuActivity.this, MagyarOlasz.class);
                startActivity(intentMagyarOlasz);
                break;

            case R.id.buttonMagyarNemet:
                Intent intentMagyarNemet = new Intent(MainMenuActivity.this, MagyarNemet.class);
                startActivity(intentMagyarNemet);
                break;


        }
    }

}
