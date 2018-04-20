package com.develop.mariodellovicario.doctordroid;

import android.content.Intent;
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
    String group = null;
    String operation = null;
    String tabToShow = null;
    String etaData = null;
    String pesoData = null;
    String alimData = null;
    String asaData = null;
    String intollFans = null;
    String insuff = null;

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
        checkBoxFans = (CheckBox)findViewById(R.id.checkBoxFans);
        checkBoxInsuff = (CheckBox)findViewById(R.id.checkBoxInsuff);

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

        if(checkBoxFans.isChecked()){
            intollFans = "intollerante";
        }else{
            intollFans = "tollerante";
        }
        if(checkBoxInsuff.isChecked()){
            insuff = "insuff";
        }else{
            insuff = "no";
        }


        //BOTTONE PER MOSTRARE TABELLA /////////////////////

        mostraTabellaBtn = (Button) findViewById(R.id.btnDataActivity);

        mostraTabellaBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //thigs to do on button press...example toast:
                Toast.makeText(getApplicationContext(), "Mostra Tabella Corrispondente", Toast.LENGTH_SHORT).show();
                //tabToShow = tabToShow + etaData + pesoData + alimData +  asaData;
                if(tabToShow == "CLASSE A"){
                    Intent classAIntent = new Intent(DataActivity.this, DataActivity.class);
                    classAIntent.putExtra("alim", alimData);
                    classAIntent.putExtra("fans", intollFans);
                    startActivity(classAIntent);
                }else if(tabToShow == "CLASSE B"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CLASSE C"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "AMPUTAZIONE ARTO INFERIORE"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ADDOMINALE DOLORE INTENSO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ADDOMINALE DOLORE MODERATO - APPENDICECTOMIA"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ADDOMINALE DOLORE MODERATO - ERNIOPLASTICA INGUINALE"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ADDOMINALE DOLORE MODERATO - CHIRURGIA LAPOROSCOPICA NON RETROPERIOTONEALE"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ADDOMINALE DOLORE MODERATO - ERNIOPLASTICA OMBELICALE"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ADDOMINALE DOLORE MODERATO - LAPAROCELE MEDIANO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ADDOMINALE DOLORE MODERATO - PARTO CESAREO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA MAMMELLA -1"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA MAMMELLA -2"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA MAMMELLA -3"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA TORACICA - TORACICA"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - SPALLA OMERO PROSSIMALE CLAVICOLA"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DELLA MANO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DELL'OMERO MEDIO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DISTALE OMERO GOMITO AVAMBRACCIO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO INFERIORE - ARTROPROTESI DI ANCA"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - ARTROPROTESI DI ANCA"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - FEMORE E TESSUTI MOLLI COSCIA"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - CHIRURGIA DEL BACINO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - CHIRURGIA DELLA GAMBA PROSSIMALE"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DEL POLSO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO INFERIORE - CHIRURGIA DEL PIEDE"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO INFERIORE - CHIRURGIA DELLA GAMBA DISTALE"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - PROTESI DI GINOCCHIO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDIA ARTO INFERIORE - RICOSTRUZIONE DEL CROCIATO"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ADDOMINALE DOLORE INTENSO (SOLO PERIDURALE CONTINUA)"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDICA ARTO INFERIORE - FEMORE TESSUTI MOLLI COSCIA"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA ORTOPEDICA ARTO INFERIORE - CHIRURGIA DELLA GAMBA"){
                    //controlla i dati e mostra tabella corrispondente
                }else if(tabToShow == "CHIRURGIA TORACICA - CHIRURGIA TORACICA"){
                    //controlla i dati e mostra tabella corrispondente
                }//else if...CONTINUA CON TUTTE LE ALTRE TABELLE (STESSA LISTA DELL'ACTIVITY PRECEDENTE)
            }
        });

        /////////////////////////////////////////////////
    }


}
