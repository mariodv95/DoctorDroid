package com.develop.mariodellovicario.doctordroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ClassATable extends AppCompatActivity {

    String alim = null;
    String fans = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_a_table);

        TextView proto24 = (TextView)findViewById(R.id.protocolloA24Txt);
        TextView somm24 = (TextView)findViewById(R.id.somministr24txt);
        TextView farm24 = (TextView)findViewById(R.id.farmaci24Txt);
        TextView protSalv = (TextView)findViewById(R.id.protocolloASalvTxt);
        TextView sommSalv = (TextView)findViewById(R.id.somministrSalvtxt);
        TextView farmSalv = (TextView)findViewById(R.id.farmaciSalvTxt);
        TextView gastrSalv = (TextView)findViewById(R.id.gastroSalvTxt);

        Bundle extras = getIntent().getExtras();
        if( extras != null){
            alim = extras.getString("alim");
            fans = extras.getString("fans");
        }


    }
}
