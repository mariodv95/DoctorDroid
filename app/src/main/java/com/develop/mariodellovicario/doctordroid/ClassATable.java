package com.develop.mariodellovicario.doctordroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ClassATable extends AppCompatActivity {

    String alim = null;
    String fans = null;
    String eta = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_a_table);

        Bundle extras = getIntent().getExtras();
        if( extras != null){
            alim = extras.getString("alim");
            fans = extras.getString("fans");
            eta = extras.getString("eta");
        }

        TextView proto24 = (TextView)findViewById(R.id.protocolloA24Txt);
        TextView somm24 = (TextView)findViewById(R.id.somministr24txt);
        TextView farm24 = (TextView)findViewById(R.id.farmaci24Txt);
        TextView protSalv = (TextView)findViewById(R.id.protocolloASalvTxt);
        TextView sommSalv = (TextView)findViewById(R.id.somministrSalvtxt);
        TextView farmSalv = (TextView)findViewById(R.id.farmaciSalvTxt);
        TextView gastrSalv = (TextView)findViewById(R.id.gastroSalvTxt);

        if(alim == "siAlim" && fans == "tollerante"){
            proto24.setText("A3 prime 24 ore - il paziente si alimenta");
            somm24.setText("os");
            farm24.setText("Paracetamolo 1g/8h");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("os");
            farmSalv.setText("Ketoralac 10mg/12h  || Ketoprofene 100mg/12h");
            gastrSalv.setText("Pantoprazolo 40mg");
        }else if( alim == "siAlim" && fans == "intollerante"){
            proto24.setText("A4 prime 24 ore - il paziente si alimenta e FANS controindicati");
            somm24.setText("os");
            farm24.setText("Paracetamolo 1g/8h");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("os");
            farmSalv.setText("Tramadolo gtt(100mg/ml) 50-100mg(equivalenti a 20-40gtt) + Metoclopramide 10mg || " +
                    "Paracetamolo 500mg + Codeina 30mg(sospendere terapia con paracetamolo) 1-2 cpr o bustine/6h(max 6 cp o bustine/die)");
            gastrSalv.setText("");
        }else if( alim == "noAlim" && fans == "tollerante"){
            proto24.setText("A1 prime 24 ore - il paziente non si alimenta");
            somm24.setText("ev");
            farm24.setText("Paracetamolo 1g in 15' ogni 8h");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("ev");
            farmSalv.setText("Ketoralac 30mg ev in sol. fis. 100ml ripetibile ogni 8h");
            gastrSalv.setText("Pantoprazolo 40mg");
        }else if( alim == "noAlim" && fans == "tollerante" && eta == "piu65"){
            proto24.setText("A1 prime 24 ore - il paziente non si alimenta");
            somm24.setText("ev");
            farm24.setText("Paracetamolo 1g in 15' ogni 8h");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("ev");
            farmSalv.setText("Ketoralac 30mg ev in sol. fis. 100ml ripetibile ogni 12h");
            gastrSalv.setText("Pantoprazolo 40mg");
        }else if( alim == "noAlim" && fans == "intollerante"){
            proto24.setText("A2 prime 24 ore - il paziente non si alimenta e FANS controindicati");
            somm24.setText("ev");
            farm24.setText("Paracetamolo 1g in 15' ogni 8h");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("ev");
            farmSalv.setText("Tramadolo 10mg in 100ml di sol. fis. in 30' + Metoclopramide 10mg");
            gastrSalv.setText("");
        }
    }
}
