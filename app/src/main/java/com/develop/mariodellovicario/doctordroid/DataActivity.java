package com.develop.mariodellovicario.doctordroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DataActivity extends AppCompatActivity {

    Button mostraTabellaBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView opSelectedTxt;
        String group = null;
        String operation = null;
        String tabToShow = null;

        Bundle extras = getIntent().getExtras();
        if( extras != null){
            group = extras.getString("group");
            operation = extras.getString("operation");
            tabToShow = extras.getString("table");
        }

        opSelectedTxt = (TextView)findViewById(R.id.selectedOpTxt);
        opSelectedTxt.setText(group + ": "+operation);

        //BOTTONE PER MOSTRARE TABELLA /////////////////////

        mostraTabellaBtn = (Button) findViewById(R.id.btnDataActivity);

        mostraTabellaBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //thigs to do on button press...example toast:
                Toast.makeText(getApplicationContext(), "Mostra Tabella Corrispondente", Toast.LENGTH_SHORT).show();
            }
        });

        /////////////////////////////////////////////////
    }

}
