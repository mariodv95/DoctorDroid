package com.develop.mariodellovicario.doctordroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class SurgeryActivity extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    Button infContBtn;
    Button oppPerSubBtn;
    Button analPerContBolBtn;
    Button analPerContBtn;
    Button forDilBtn;


    //blocco toolbar inizio

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        Toast.makeText(getApplicationContext(), "info", Toast.LENGTH_SHORT).show();
        return true;
    }
    //blocco toolbar fine


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surgery);


        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {


            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        infContBtn = (Button) findViewById(R.id.btnInfCont);

        infContBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //thigs to do on button press...example toast:
                Toast.makeText(getApplicationContext(), "tabelle1", Toast.LENGTH_SHORT).show();
            }
        });

        oppPerSubBtn = (Button) findViewById(R.id.btnOppPerSub);

        oppPerSubBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //thigs to do on button press...example toast:
                Toast.makeText(getApplicationContext(), "tabelle2", Toast.LENGTH_SHORT).show();
            }
        });

        analPerContBolBtn = (Button) findViewById(R.id.btnAnalPerContBol);

        analPerContBolBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //thigs to do on button press...example toast:
                Toast.makeText(getApplicationContext(), "tabelle3", Toast.LENGTH_SHORT).show();
            }
        });

        analPerContBtn = (Button) findViewById(R.id.btnAnalPerCont);

        analPerContBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //thigs to do on button press...example toast:
                Toast.makeText(getApplicationContext(), "tabelle4", Toast.LENGTH_SHORT).show();
            }
        });

        forDilBtn = (Button) findViewById(R.id.btnForDil);

        forDilBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //thigs to do on button press...example toast:
                Toast.makeText(getApplicationContext(), "tabelle5", Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group expanded listener
        /*expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });*/

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                int clickedOpNumber = childPosition;
                String clickedOperation = listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition);
                String groupClicked = listDataHeader.get(groupPosition);
                String tableToShow = null;
                /*Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + clickedOperation + childPosition, Toast.LENGTH_SHORT)
                        .show();*/

                //ELENCO DI TUTTE LE OPERAZIONI CHIRURGICHE SELEZIONABILI PRESENTI NELLE LISTE

                if((groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 0 || clickedOpNumber == 1 ||
                        clickedOpNumber == 8 || clickedOpNumber == 9 ||
                        clickedOpNumber == 10 || clickedOpNumber == 12 || clickedOpNumber == 13 || clickedOpNumber == 14 ||
                        clickedOpNumber == 22 || clickedOpNumber == 24 || clickedOpNumber == 25 || clickedOpNumber == 28 ||
                        clickedOpNumber == 32 || clickedOpNumber == 39 || clickedOpNumber == 47 || clickedOpNumber == 67 ||
                        clickedOpNumber == 68 || clickedOpNumber == 69 || clickedOpNumber == 73 || clickedOpNumber == 74 ||
                        clickedOpNumber == 75 || clickedOpNumber == 77 || clickedOpNumber == 83 || clickedOpNumber == 87 ||
                        clickedOpNumber == 89 || clickedOpNumber == 91 || clickedOpNumber == 114 || clickedOpNumber == 115 ||
                        clickedOpNumber == 119 || clickedOpNumber == 120 || clickedOpNumber == 121 || clickedOpNumber == 122 ||
                        clickedOpNumber == 123 || clickedOpNumber == 124 || clickedOpNumber == 130 || clickedOpNumber == 133 ||
                        clickedOpNumber == 134 || clickedOpNumber == 137 || clickedOpNumber == 140 || clickedOpNumber == 146 ||
                        clickedOpNumber == 147 || clickedOpNumber == 148))
                        || (groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 6 || clickedOpNumber == 7 ||
                        clickedOpNumber == 9 || clickedOpNumber == 10 || clickedOpNumber == 13 || clickedOpNumber == 14 ||
                        clickedOpNumber == 15 || clickedOpNumber == 32 || clickedOpNumber == 33 || clickedOpNumber == 40 ||
                        clickedOpNumber == 41 || clickedOpNumber == 42 || clickedOpNumber == 43))
                        || (groupClicked == "Interventi di Oculistica" && (clickedOpNumber == 0 || clickedOpNumber == 1 ||
                        clickedOpNumber == 2 || clickedOpNumber == 3 || clickedOpNumber == 4 || clickedOpNumber == 5 ||
                        clickedOpNumber == 7 || clickedOpNumber == 8 || clickedOpNumber == 9 || clickedOpNumber == 10))
                        || (groupClicked == "Interventi di Radiologia" && (clickedOpNumber == 7 ))){
                    clickedOperation = clickedOperation; //CLASSE A
                    Toast.makeText(
                            getApplicationContext(),
                            "CLASSE A", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CLASSE A";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if((groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 11 || clickedOpNumber == 17 ||
                        clickedOpNumber == 18 || clickedOpNumber == 19 || clickedOpNumber == 20 || clickedOpNumber == 21 ||
                        clickedOpNumber == 29 || clickedOpNumber == 30 || clickedOpNumber == 34 || clickedOpNumber == 35 ||
                        clickedOpNumber == 37 || clickedOpNumber == 38 || clickedOpNumber == 46 || clickedOpNumber == 48 ||
                        clickedOpNumber == 49 || clickedOpNumber == 50 || clickedOpNumber == 55 || clickedOpNumber == 56 ||
                        clickedOpNumber == 57 || clickedOpNumber == 58 || clickedOpNumber == 59 || clickedOpNumber == 62 ||
                        clickedOpNumber == 70 || clickedOpNumber == 71 || clickedOpNumber == 78 || clickedOpNumber == 80 ||
                        clickedOpNumber == 81 || clickedOpNumber == 84 || clickedOpNumber == 88 || clickedOpNumber == 93 ||
                        clickedOpNumber == 94 || clickedOpNumber == 97 || clickedOpNumber == 98 || clickedOpNumber == 99 ||
                        clickedOpNumber == 101 || clickedOpNumber == 106 || clickedOpNumber == 110 || clickedOpNumber == 116 ||
                        clickedOpNumber == 126 || clickedOpNumber == 127 || clickedOpNumber == 135 || clickedOpNumber == 136 ||
                        clickedOpNumber == 138 || clickedOpNumber == 141 || clickedOpNumber == 142 || clickedOpNumber == 143 ||
                        clickedOpNumber == 144 || clickedOpNumber == 145 ))
                        || (groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 0 || clickedOpNumber == 34))
                        || (groupClicked == "Interventi di Oculistica" && (clickedOpNumber == 6 ))
                        || (groupClicked == "Interventi di Radiologia" && (clickedOpNumber == 0 || clickedOpNumber == 3 ||
                        clickedOpNumber == 5 || clickedOpNumber == 6 ))){
                    clickedOperation = clickedOperation; //CLASSE B
                    Toast.makeText(
                            getApplicationContext(),
                            "CLASSE B", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CLASSE B";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 2 || clickedOpNumber == 26 ||
                        clickedOpNumber == 76 || clickedOpNumber == 86 || clickedOpNumber == 103 || clickedOpNumber == 104 ||
                        clickedOpNumber == 105 || clickedOpNumber == 107 || clickedOpNumber == 108 || clickedOpNumber == 109 ||
                        clickedOpNumber == 111 || clickedOpNumber == 117 || clickedOpNumber == 129 || clickedOpNumber == 139)){
                    clickedOperation = clickedOperation; //CLASSE C
                    Toast.makeText(
                            getApplicationContext(),
                            "CLASSE C", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CLASSE C";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if((groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 3 || clickedOpNumber == 4 ||
                        clickedOpNumber == 5)) ||
                        (groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 1 || clickedOpNumber == 2 || clickedOpNumber == 3))){
                    clickedOperation = clickedOperation; //AMPUTAZIONE ARTO INFERIORE
                    Toast.makeText(
                            getApplicationContext(),
                            "AMPUTAZIONE ARTO INFERIORE", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "AMPUTAZIONE ARTO INFERIORE";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 6 || clickedOpNumber == 15 ||
                        clickedOpNumber == 16 || clickedOpNumber == 23 || clickedOpNumber == 27 || clickedOpNumber == 33 ||
                        clickedOpNumber == 36 || clickedOpNumber == 41 || clickedOpNumber == 42 || clickedOpNumber == 43 ||
                        clickedOpNumber == 44 || clickedOpNumber == 45 || clickedOpNumber == 51 || clickedOpNumber == 52 ||
                        clickedOpNumber == 53 || clickedOpNumber == 54 || clickedOpNumber == 60 || clickedOpNumber == 61 ||
                        clickedOpNumber == 66 || clickedOpNumber == 72 || clickedOpNumber == 79 || clickedOpNumber == 85 ||
                        clickedOpNumber == 92 || clickedOpNumber == 95 || clickedOpNumber == 96 || clickedOpNumber == 100 ||
                        clickedOpNumber == 118 || clickedOpNumber == 125 || clickedOpNumber == 128 || clickedOpNumber == 131 ||
                        clickedOpNumber == 149)){
                    clickedOperation = clickedOperation; //CHIRURGIA ADDOMINALE DOLORE INTENSO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ADDOMINALE DOLORE INTENSO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ADDOMINALE DOLORE INTENSO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 7)){
                    clickedOperation = clickedOperation; //CHIRURGIA ADDOMINALE DOLORE MODERATO - APPENDICECTOMIA
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ADDOMINALE DOLORE MODERATO - APPENDICECTOMIA", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ADDOMINALE DOLORE MODERATO - APPENDICECTOMIA";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 63 || clickedOpNumber == 64)){
                    clickedOperation = clickedOperation; //CHIRURGIA ADDOMINALE DOLORE MODERATO - ERNIOPLASTICA INGUINALE
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ADDOMINALE DOLORE MODERATO - ERNIOPLASTICA INGUINALE", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ADDOMINALE DOLORE MODERATO - ERNIOPLASTICA INGUINALE";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 40)) {
                    clickedOperation = clickedOperation; //CHIRURGIA ADDOMINALE DOLORE MODERATO - CHIRURGIA LAPOROSCOPICA NON RETROPERIOTONEALE
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ADDOMINALE DOLORE MODERATO - CHIRURGIA LAPOROSCOPICA NON RETROPERIOTONEALE", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ADDOMINALE DOLORE MODERATO - CHIRURGIA LAPOROSCOPICA NON RETROPERIOTONEALE";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 65)) {
                    clickedOperation = clickedOperation; //CHIRURGIA ADDOMINALE DOLORE MODERATO - ERNIOPLASTICA OMBELICALE
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ADDOMINALE DOLORE MODERATO - ERNIOPLASTICA OMBELICALE", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ADDOMINALE DOLORE MODERATO - ERNIOPLASTICA OMBELICALE";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 82)) {
                    clickedOperation = clickedOperation; //CHIRURGIA ADDOMINALE DOLORE MODERATO - LAPAROCELE MEDIANO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ADDOMINALE DOLORE MODERATO - LAPAROCELE MEDIANO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ADDOMINALE DOLORE MODERATO - LAPAROCELE MEDIANO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 102)) {
                    clickedOperation = clickedOperation; //CHIRURGIA ADDOMINALE DOLORE MODERATO - PARTO CESAREO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ADDOMINALE DOLORE MODERATO - PARTO CESAREO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ADDOMINALE DOLORE MODERATO - PARTO CESAREO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 112)) {
                    clickedOperation = clickedOperation; //CHIRURGIA MAMMELLA -1
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA MAMMELLA -1", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA MAMMELLA -1";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 113 || clickedOpNumber == 132)) {
                    clickedOperation = clickedOperation; //CHIRURGIA MAMMELLA -2
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA MAMMELLA -2", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA MAMMELLA -2";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 90)) {
                    clickedOperation = clickedOperation; //CHIRURGIA MAMMELLA -3
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA MAMMELLA -3", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA MAMMELLA -3";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Generale" && (clickedOpNumber == 31)) {
                    clickedOperation = clickedOperation; //CHIRURGIA TORACICA - TORACICA
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA TORACICA - TORACICA", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA TORACICA - TORACICA";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 5 || clickedOpNumber == 11 ||
                        clickedOpNumber == 12 || clickedOpNumber == 22 || clickedOpNumber == 38)) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO SUPERIORE - SPALLA OMERO PROSSIMALE CLAVICOLA
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - SPALLA OMERO PROSSIMALE CLAVICOLA", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - SPALLA OMERO PROSSIMALE CLAVICOLA";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 8 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DELLA MANO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DELLA MANO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DELLA MANO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 18 || clickedOpNumber == 26 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DELL'OMERO MEDIO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DELL'OMERO MEDIO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DELL'OMERO MEDIO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 27 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DISTALE OMERO GOMITO AVAMBRACCIO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DISTALE OMERO GOMITO AVAMBRACCIO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DISTALE OMERO GOMITO AVAMBRACCIO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 4 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO INFERIORE - ARTROPROTESI DI ANCA
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO INFERIORE - ARTROPROTESI DI ANCA", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO INFERIORE - ARTROPROTESI DI ANCA";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 36 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - ARTROPROTESI DI ANCA
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - ARTROPROTESI DI ANCA", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - ARTROPROTESI DI ANCA";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 16 || clickedOpNumber == 17 ||
                        clickedOpNumber == 19 || clickedOpNumber == 23 || clickedOpNumber == 24 || clickedOpNumber == 25 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - FEMORE E TESSUTI MOLLI COSCIA
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - FEMORE E TESSUTI MOLLI COSCIA", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - FEMORE E TESSUTI MOLLI COSCIA";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 20 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - CHIRURGIA DEL BACINO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - CHIRURGIA DEL BACINO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - CHIRURGIA DEL BACINO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 21 || clickedOpNumber == 29 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - CHIRURGIA DELLA GAMBA PROSSIMALE
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - CHIRURGIA DELLA GAMBA PROSSIMALE", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - CHIRURGIA DELLA GAMBA PROSSIMALE";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 28 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DEL POLSO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DEL POLSO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO SUPERIORE - CHIRURGIA DEL POLSO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 30 || clickedOpNumber == 35)) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO INFERIORE - CHIRURGIA DEL PIEDE
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO INFERIORE - CHIRURGIA DEL PIEDE", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO INFERIORE - CHIRURGIA DEL PIEDE";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 31 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO INFERIORE - CHIRURGIA DELLA GAMBA DISTALE
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO INFERIORE - CHIRURGIA DELLA GAMBA DISTALE", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO INFERIORE - CHIRURGIA DELLA GAMBA DISTALE";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 37 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - PROTESI DI GINOCCHIO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - PROTESI DI GINOCCHIO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO INFERIORE E BACINO - PROTESI DI GINOCCHIO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Ortopedia" && (clickedOpNumber == 39 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDIA ARTO INFERIORE - RICOSTRUZIONE DEL CROCIATO
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDIA ARTO INFERIORE - RICOSTRUZIONE DEL CROCIATO", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDIA ARTO INFERIORE - RICOSTRUZIONE DEL CROCIATO";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Radiologia" && (clickedOpNumber == 4 )) {
                    clickedOperation = clickedOperation; //CHIRURGIA ADDOMINALE DOLORE INTENSO (SOLO PERIDURALE CONTINUA)
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ADDOMINALE DOLORE INTENSO (SOLO PERIDURALE CONTINUA)", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ADDOMINALE DOLORE INTENSO (SOLO PERIDURALE CONTINUA)";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Radiologia" && (clickedOpNumber == 1)) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDICA ARTO INFERIORE - FEMORE TESSUTI MOLLI COSCIA
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDICA ARTO INFERIORE - FEMORE TESSUTI MOLLI COSCIA", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDICA ARTO INFERIORE - FEMORE TESSUTI MOLLI COSCIA";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Radiologia" && (clickedOpNumber == 2)) {
                    clickedOperation = clickedOperation; //CHIRURGIA ORTOPEDICA ARTO INFERIORE - CHIRURGIA DELLA GAMBA
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA ORTOPEDICA ARTO INFERIORE - CHIRURGIA DELLA GAMBA", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA ORTOPEDICA ARTO INFERIORE - CHIRURGIA DELLA GAMBA";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else if(groupClicked == "Interventi di Chirurgia Toracica" && (clickedOpNumber == 0)) {
                    clickedOperation = clickedOperation; //CHIRURGIA TORACICA - CHIRURGIA TORACICA
                    Toast.makeText(
                            getApplicationContext(),
                            "CHIRURGIA TORACICA - CHIRURGIA TORACICA", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "CHIRURGIA TORACICA - CHIRURGIA TORACICA";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);

                } else {
                    Toast.makeText(getApplicationContext(),
                            "ERRORE NELLA LOGICA CONDIZIONALE", Toast.LENGTH_SHORT)
                            .show();
                    tableToShow = "ERRORE NELLA LOGICA CONDIZIONALE";
                    Intent dataPageIntent = new Intent(SurgeryActivity.this, DataActivity.class);
                    dataPageIntent.putExtra("group", groupClicked);
                    dataPageIntent.putExtra("operation", clickedOperation);
                    dataPageIntent.putExtra("table", tableToShow);
                    startActivity(dataPageIntent);
                }


                //FINE ELENCO DI TUTTE LE OPERAZIONI CHIRURGICHE. INSERIRE GLI INTENT CHE LE COLLEGANO ALLE APPROPRIATE TABELLE


                /*switch(clickedOperation){
                    case /*value: */
                        /*do something
                        break;
                    case /*othervalue:*/
                        /*do something else
                        break;
                }*/
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Interventi di Chirurgia Generale");
        listDataHeader.add("Interventi di Ortopedia");
        listDataHeader.add("Interventi di Oculistica");
        listDataHeader.add("Interventi di Radiologia");
        listDataHeader.add("Interventi di Chirurgia Toracica");

        // Adding child data
        List<String> InterventiGen = new ArrayList<String>();
        InterventiGen.add("Adenoidectomia ");
        InterventiGen.add("Adenomectomia prostatica trans vescicale");
        InterventiGen.add("Amputazione del pene");
        InterventiGen.add("Amputazione di coscia");
        InterventiGen.add("Amputazione di gamba");
        InterventiGen.add("Amputazione di piede ");
        InterventiGen.add("Annessiectomia");
        InterventiGen.add("Appendicectomia (laparotomica e laparoscopica) ");
        InterventiGen.add("Ascesso regione glutea ");
        InterventiGen.add("Asportazione di nodulo mammario ");
        InterventiGen.add("Asportazione lipomi o cisti superficiali ");
        InterventiGen.add("Asportazioni di ghiandole salivari ");
        InterventiGen.add("Asprtazione cicatrici ");
        InterventiGen.add("Biopsia mammella ");
        InterventiGen.add("Biopsia vescicale ");
        InterventiGen.add("By pass aorto bifemorale ");
        InterventiGen.add("By pass aorto bisiliaco ");
        InterventiGen.add("By pass axillo bifemorale ");
        InterventiGen.add("By pass femoro distale ");
        InterventiGen.add("By pass femoro femorale");
        InterventiGen.add("By pass femoro popliteo");
        InterventiGen.add("Caldwell Luc (per sinusite cronica)");
        InterventiGen.add("Cerchiaggio della cervice uterina");
        InterventiGen.add("Chirurgia bariatrica");
        InterventiGen.add("Chirurgia cutanea di superfice");
        InterventiGen.add("Chirurgia cutanea di superfice");
        InterventiGen.add("Chirurgia della mastoide");
        InterventiGen.add("Chirurgia dell'esofago");
        InterventiGen.add("Chirurgia dell'orecchio esterno");
        InterventiGen.add("Chirurgia dell'orecchio medio");
        InterventiGen.add("Chirurgia stereotassica");
        InterventiGen.add("Chirurgia toracica");
        InterventiGen.add("Circoncisione");
        InterventiGen.add("Cistectomia");
        InterventiGen.add("Cisti del collo");
        InterventiGen.add("Cisti di Bartolino (asportazione)");
        InterventiGen.add("Cisti renale (asportazione)");
        InterventiGen.add("Cisti sacro-coccigea (asportazione");
        InterventiGen.add("Cistolitotrissia");
        InterventiGen.add("Cistoscopia diagnostica");
        InterventiGen.add("Colecistecomia laparoscopica  ( VLC ");
        InterventiGen.add("Colecistectomia laparotomica");
        InterventiGen.add("Colectomia laparoscopica");
        InterventiGen.add("Colectomia laparotomica");
        InterventiGen.add("Colpoisterectomia");
        InterventiGen.add("Colpoisterosacropessia");
        InterventiGen.add("Colpoisteroscopie");
        InterventiGen.add("Conizzazione della cervice uterina");
        InterventiGen.add("Cordectomia");
        InterventiGen.add("Cross over femoro femorale");
        InterventiGen.add("Discectomia");
        InterventiGen.add("Duodenocefalopancreasectomia");
        InterventiGen.add("Embolizzzazione di fibromi uterini");
        InterventiGen.add("Emicolectomia laparoscopica");
        InterventiGen.add("Emicolectomia laparotomica");
        InterventiGen.add("Emiglossectomia");
        InterventiGen.add("Emitiroidecomia ");
        InterventiGen.add("Emorroidectomia");
        InterventiGen.add("Endoprotesi aorta addominale endovascolare");
        InterventiGen.add("Endoprotesi aorta toracica endovascolare");
        InterventiGen.add("Enucleoresezione del rene");
        InterventiGen.add("Epatectomia");
        InterventiGen.add("Ernia iatale laparoscopica");
        InterventiGen.add("Ernioplastica inguinale");
        InterventiGen.add("Ernioplastica inguinale bilaterale");
        InterventiGen.add("Ernioplastica ombelicale");
        InterventiGen.add("Esclusione aneurisma aorta addom. laparotomico");
        InterventiGen.add("Estrazioni dentarie");
        InterventiGen.add("FAV");
        InterventiGen.add("Fimosi");
        InterventiGen.add("Fistola anale");
        InterventiGen.add("Fundoplicatio laparoscopica per ernia iatale");
        InterventiGen.add("Gastrectomia");
        InterventiGen.add("Idrocele");
        InterventiGen.add("Instillazione endovescicale botox");
        InterventiGen.add("Interruzione volontaria di gravidanza ( IVG )");
        InterventiGen.add("Interventi demolitivi del cavo orale");
        InterventiGen.add("Interventi per sinusite (ESS)");
        InterventiGen.add("Interventi sull’ipofisi");
        InterventiGen.add("Isterectomia laparotomica");
        InterventiGen.add("Lacerazioni vaginali (sutura)");
        InterventiGen.add("Laminectomia");
        InterventiGen.add("Laparocele mediano");
        InterventiGen.add("Laparoscopia diagnostica");
        InterventiGen.add("Laparoscopia operativa non retroperitoneale");
        InterventiGen.add("Laparoscopia operativa retroperitoneale");
        InterventiGen.add("Laringectomia ");
        InterventiGen.add("Lembi di rotazione");
        InterventiGen.add("Linfoadenectomia laterocervicale");
        InterventiGen.add("Linfonodo sentinella mammella (asportazione)");
        InterventiGen.add("Mastectomia con/senza impianto di protesi e/o svuotamento ascellare");
        InterventiGen.add("Microlaringoscopia ");
        InterventiGen.add("Miomectomia ");
        InterventiGen.add("Miringoplastica ");
        InterventiGen.add("Monarc ");
        InterventiGen.add("Nefrectomia ");
        InterventiGen.add("Nefroureterectomia ");
        InterventiGen.add("Neurochirurgia cranio encefalica");
        InterventiGen.add("Orchidopessi ");
        InterventiGen.add("Orchiectomia ");
        InterventiGen.add("Pancreasectomia ");
        InterventiGen.add("Parotidectomia ");
        InterventiGen.add("Parto cesareo (stark)");
        InterventiGen.add("PCNL (nefrolitotrissia percutanea)");
        InterventiGen.add("Peniectomia ");
        InterventiGen.add("Plastica del giunto pielo ureterale");
        InterventiGen.add("Polipectomia nasale");
        InterventiGen.add("Progenismo e prognatismo");
        InterventiGen.add("Prostatectomia laparoscopica");
        InterventiGen.add("Prostatectomia radicale");
        InterventiGen.add("Protesi endovascolare a cielo chiuso");
        InterventiGen.add("Protesi peniena");
        InterventiGen.add("Quadrantectomia mammaria interna con/senza linfonodo sentinella " +
                "oppure con/senza svuotamento ascellare");
        InterventiGen.add("Quadrantectomia mammaria esterna con/senza linfonodo sentinella " +
                "oppure con/senza svuotamento ascellare");
        InterventiGen.add("Noduli mammari (asportazione");
        InterventiGen.add("Raschiamento uterino ( RCU )");
        InterventiGen.add("Resettoscopia");
        InterventiGen.add("Resezione mandibolare");
        InterventiGen.add("Resezioni intestinali (colon e retto)");
        InterventiGen.add("Riduzione frattura ossa del massiccio facciale");
        InterventiGen.add("Riduzione frattura ossa nasali");
        InterventiGen.add("Rinosettoplastica nasale");
        InterventiGen.add("Rotazione lembi");
        InterventiGen.add("Safenectomia");
        InterventiGen.add("Settoturbinoplastica nasale (STPL)");
        InterventiGen.add("Sleeve gastrectomy");
        InterventiGen.add("SLING");
        InterventiGen.add("Sling transotturatorio");
        InterventiGen.add("Splenectomia ");
        InterventiGen.add("Stabilizzazione colonna vertebrale");
        InterventiGen.add("Stent ureterale");
        InterventiGen.add("Surrenectomia ");
        InterventiGen.add("Svuotamento ascellare");
        InterventiGen.add("TEA carotide");
        InterventiGen.add("TEA femorale comune");
        InterventiGen.add("Timpanoplastica");
        InterventiGen.add("Tiroidectomia");
        InterventiGen.add("Tonsillectomia");
        InterventiGen.add("Tracheostomia");
        InterventiGen.add("Trapianto di rene");
        InterventiGen.add("Trombectomia (fogarty)");
        InterventiGen.add("TUIP ");
        InterventiGen.add("TURB ");
        InterventiGen.add("TURP ");
        InterventiGen.add("TVT ");
        InterventiGen.add("Ureterolitotomia  (URS)");
        InterventiGen.add("Uretrotomia ");
        InterventiGen.add("Varici arto inferiore");
        InterventiGen.add("Varicocele ");
        InterventiGen.add("Vulvectomia  ");


        List<String> InterventiOrt = new ArrayList<String>();
        InterventiOrt.add("Alluce valgo");
        InterventiOrt.add("Amputazione di coscia");
        InterventiOrt.add("Amputazione di gamba");
        InterventiOrt.add("Amputazione di piede");
        InterventiOrt.add("Artroprotesi di anca");
        InterventiOrt.add("Artroscopia di spalla");
        InterventiOrt.add("Artroscopia diagnostica del ginocchio");
        InterventiOrt.add("Borsiti");
        InterventiOrt.add("Chirurgia della mano");
        InterventiOrt.add("Chirurgia diagnostica del ginocchio");
        InterventiOrt.add("Cisti tendinea (asportazione");
        InterventiOrt.add("Conflitto acromion-claveare");
        InterventiOrt.add("Cuffia dei rotatori");
        InterventiOrt.add("Dito a martello");
        InterventiOrt.add("Dito a scatto");
        InterventiOrt.add("Dupuytren");
        InterventiOrt.add("Endoprotesi di anca");
        InterventiOrt.add("Fasciotomia decompressiva arto inferior");
        InterventiOrt.add("Fissatori esterni arti superiori");
        InterventiOrt.add("Fissatori esterni coscia");
        InterventiOrt.add("Fissatori esterni di anca o di bacino");
        InterventiOrt.add("Frattura del piatto tibiale");
        InterventiOrt.add("Frattura di clavicola");
        InterventiOrt.add("Frattura di collo femore");
        InterventiOrt.add("Frattura di femore distale");
        InterventiOrt.add("Frattura di femore prossimale");
        InterventiOrt.add("Frattura di omero");
        InterventiOrt.add("Frattura di omero e gomito");
        InterventiOrt.add("Frattura di polso");
        InterventiOrt.add("Frattura di tibia e perone");
        InterventiOrt.add("Frattura metatarso");
        InterventiOrt.add("Frattura trimalleolare");
        InterventiOrt.add("Lussazione di anca");
        InterventiOrt.add("Lussazione di spalla");
        InterventiOrt.add("Meniscectomia");
        InterventiOrt.add("Piede equino varo");
        InterventiOrt.add("Protesi di anca");
        InterventiOrt.add("Protesi di ginocchio");
        InterventiOrt.add("Protesi di spalla");
        InterventiOrt.add("Ricostruzione di legamento crociato");
        InterventiOrt.add("Riduzione di fratture a cielo chiuso");
        InterventiOrt.add("Rimozione mezzi di sintesi");
        InterventiOrt.add("Suture tendinee");
        InterventiOrt.add("Tunnel carpale (decompressione nervosa)");



        List<String> InterventiOcul = new ArrayList<String>();
        InterventiOcul.add("Cataratta ");
        InterventiOcul.add("Chirurgia del glaucoma");
        InterventiOcul.add("Chirurgia della congiuntiva");
        InterventiOcul.add("Chirurgia delle palpebre");
        InterventiOcul.add("Chirurgia orbitaria");
        InterventiOcul.add("Chirurgia vitroretinica");
        InterventiOcul.add("Enucleazione o eviscerazione oculare");
        InterventiOcul.add("Interventi sulle vie lacrimali");
        InterventiOcul.add("Strabismo");
        InterventiOcul.add("Trapianto di cornea");
        InterventiOcul.add("Vitrectomia");


        List<String> InterventiRad = new ArrayList<String>();
        InterventiRad.add("Crioablazione osso altro distretto");
        InterventiRad.add("Crioablazione femore");
        InterventiRad.add("Crioablazione gamba");
        InterventiRad.add("Crioablazione osso arto superiore");
        InterventiRad.add("Embolizzazione arteria uterina per miomi");
        InterventiRad.add("HIFU osso arto inferiore");
        InterventiRad.add("HIFU osso arto superiore");
        InterventiRad.add("HIFU utero");


        List<String> InterventiTor = new ArrayList<String>();
        InterventiTor.add("Chirurgia toracica");

        listDataChild.put(listDataHeader.get(0), InterventiGen); // Header, Child data
        listDataChild.put(listDataHeader.get(1), InterventiOrt);
        listDataChild.put(listDataHeader.get(2), InterventiOcul);
        listDataChild.put(listDataHeader.get(3), InterventiRad);
        listDataChild.put(listDataHeader.get(4), InterventiTor);
    }
}