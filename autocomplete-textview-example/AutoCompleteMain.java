package com.example.bakoa.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteMain extends AppCompatActivity {

    static final String[] cityNames = new String[] {"Budapest", "Bukarest", "Krakkó", "Bécs"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_main);

        AutoCompleteTextView tv = (AutoCompleteTextView)findViewById(R.id.autoCompleteTv1);
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line, cityNames
        );
        tv.setAdapter(cityAdapter);
    }
}
