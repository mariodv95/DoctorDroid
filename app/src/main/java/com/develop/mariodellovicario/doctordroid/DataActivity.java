package com.develop.mariodellovicario.doctordroid;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
        RadioGroup radioGroupEta;
        RadioGroup radioGroupPeso;
        RadioGroup radioGroupAlim;
        RadioGroup radioGroupASA;
        final RadioButton radioButtonMeno65;
        RadioButton radioButtonPiu65;
        RadioButton radioButtonMeno50kg;
        RadioButton radioButtonPiu50kg;
        RadioButton radioButtonSiAlim;
        RadioButton radioButtonNoAlim;
        RadioButton radioButtonAsa1;
        RadioButton radioButtonAsa2;
        RadioButton radioButtonAsa3;
        RadioButton radioButtonAsa4;
        RadioButton radioButtonAsa5;
        CheckBox checkBoxFans;
        CheckBox checkBoxInsuff;

        String group = null;
        String operation = null;
        String tabToShow = null;
        String etaData = null;
        String pesoData = null;
        String alimData = null;
        String asaData = null;

        Bundle extras = getIntent().getExtras();
        if( extras != null){
            group = extras.getString("group");
            operation = extras.getString("operation");
            tabToShow = extras.getString("table");
        }

        opSelectedTxt = (TextView)findViewById(R.id.selectedOpTxt);
        opSelectedTxt.setText(group + ": "+operation);

        //LOGICA RADIO BUTTONS

        /*radioGroupEta = (RadioGroup)findViewById(R.id.radioGroupEta);
        radioGroupPeso = (RadioGroup)findViewById(R.id.radioGroupPeso);
        radioGroupAlim = (RadioGroup)findViewById(R.id.radioGroupAlim);
        radioGroupASA = (RadioGroup)findViewById(R.id.radioGroupAsa);*/
        radioButtonMeno65 = (RadioButton)findViewById(R.id.radioUnder65);
        radioButtonPiu65 = (RadioButton)findViewById(R.id.radioOver65);
        radioButtonMeno50kg = (RadioButton)findViewById(R.id.radioUnder50kg);
        radioButtonPiu50kg = (RadioButton)findViewById(R.id.radioOver50kg);
        radioButtonNoAlim = (RadioButton)findViewById(R.id.radioNoAlim);
        radioButtonSiAlim = (RadioButton)findViewById(R.id.radioSiAlim);
        radioButtonAsa1 = (RadioButton)findViewById(R.id.radioAsa1);
        radioButtonAsa2 = (RadioButton)findViewById(R.id.radioAsa2);
        radioButtonAsa3 = (RadioButton)findViewById(R.id.radioAsa3);
        radioButtonAsa4 = (RadioButton)findViewById(R.id.radioAsa4);
        radioButtonAsa5 = (RadioButton)findViewById(R.id.radioAsa5);

        if (radioButtonMeno65.isChecked()){
            etaData = "meno65";
        }else if(radioButtonPiu65.isChecked()){
            etaData = "piu65";
        }else if (!radioButtonMeno65.isChecked() && !radioButtonPiu65.isChecked()){
            Toast.makeText(getApplicationContext(),"Inserisci i dati realtivi all'età per continuare", Toast.LENGTH_SHORT).show();
        }

        if (radioButtonMeno50kg.isChecked()){
            pesoData = "meno50kg";
        }else if(radioButtonPiu50kg.isChecked()){
            pesoData = "piu50kg";
        }else if (!radioButtonMeno65.isChecked() && !radioButtonPiu65.isChecked()){
            Toast.makeText(getApplicationContext(),"Inserisci i dati realtivi al peso per continuare", Toast.LENGTH_SHORT).show();
        }

        if (radioButtonNoAlim.isChecked()){
            alimData = "noAlim";
        }else if(radioButtonSiAlim.isChecked()){
            alimData = "siAlim";
        }else if (!radioButtonMeno65.isChecked() && !radioButtonPiu65.isChecked()){
            Toast.makeText(getApplicationContext(),"Inserisci i dati realtivi all'alimentazione per continuare", Toast.LENGTH_SHORT).show();
        }

        if (radioButtonAsa1.isChecked()){
            asaData = "asa1";
        }else if(radioButtonAsa2.isChecked()){
            asaData = "asa2";
        }else if(radioButtonAsa3.isChecked()){
            asaData = "asa3";
        }else if(radioButtonAsa4.isChecked()){
            asaData = "asa4";
        }else if(radioButtonAsa5.isChecked()){
            asaData = "asa5";
        }else if (!radioButtonMeno65.isChecked() && !radioButtonPiu65.isChecked()){
            Toast.makeText(getApplicationContext(),"Inserisci i dati realtivi all'ASA per continuare", Toast.LENGTH_SHORT).show();
        }


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
