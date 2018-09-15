package com.develop.mariodellovicario.doctordroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
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
        TextView gastr24 = (TextView)findViewById(R.id.gastroTxt);
        TextView protSalv = (TextView)findViewById(R.id.protocolloASalvTxt);
        TextView sommSalv = (TextView)findViewById(R.id.somministrSalvtxt);
        TextView farmSalv = (TextView)findViewById(R.id.farmaciSalvTxt);
        TextView gastrSalv = (TextView)findViewById(R.id.gastroSalvTxt);

        TextView protoDp24 = (TextView)findViewById((R.id.ProtocolloDp24Txt));
        TextView sommDp24 = (TextView)findViewById((R.id.somministrDp24Txt));
        TextView farmDp24 = (TextView)findViewById((R.id.farmaciDp24Txt));
        TextView gastrDp24 = (TextView)findViewById((R.id.gastroDp24Txt));
        TextView protoSalvDp24 = (TextView)findViewById((R.id.ProtocolloDp24Save));
        TextView sommSalvDp24 = (TextView)findViewById((R.id.somministrDp24SalvTxt));
        TextView farmSalvDp24 = (TextView)findViewById((R.id.farmaciDp24SalvTxt));
        TextView gastrSalvDp24 = (TextView)findViewById((R.id.gastroDp24SalvTxt));


        if(alim.equals("siAlim") && fans.equals("tollerante")){
            //PRIME 24 ORE
            proto24.setText("A3 prime 24 ore - il paziente si alimenta");
            somm24.setText("os");
            farm24.setText("Paracetamolo 1g/8h");
            gastr24.setText("No");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("os");
            farmSalv.setText("Ketoralac 10mg/12h  || Ketoprofene 100mg/12h");
            gastrSalv.setText("Pantoprazolo 40mg");
            //DOPO 24 ORE
            protoDp24.setText("A3 dopo 24 ore - il paziente si alimenta");
            sommDp24.setText("os");
            farmDp24.setText("Paracetamolo 1g/8h");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalvDp24.setText("os");
            farmSalvDp24.setText("Tramadolo gtt (100 mg/ml) 50-100 mg (equivalenti a 20-40 gtt) + Metoclopramide 10 mg\nIbuprofene 400-600 mg \nParacetamolo 500 mg + Codeina 30 mg (sospendere terapia con paracetamolo)  1-2 cpr o bustine (max 6 cpr o bustine/die)");
            gastrSalvDp24.setText("Pantoprazolo 40 mg/die (solo per Ibuprofene)\n");

        }else if( alim.equals("siAlim") && fans.equals("intollerante")){
            //PRIME 24 ORE
            proto24.setText("A4 prime 24 ore - il paziente si alimenta e FANS controindicati");
            somm24.setText("os");
            farm24.setText("Paracetamolo 1g/8h");
            gastr24.setText("No");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("os");
            farmSalv.setText("Tramadolo gtt(100mg/ml) 50-100mg(equivalenti a 20-40gtt) + Metoclopramide 10mg || " +
                    "Paracetamolo 500mg + Codeina 30mg(sospendere terapia con paracetamolo) 1-2 cpr o bustine/6h(max 6 cp o bustine/die)");
            gastrSalv.setText("No");
            //DOPO 24 ORE
            protoDp24.setText("A4 dopo 24 ore - il paziente si alimenta e FANS controindicati");
            sommDp24.setText("os");
            farmDp24.setText("Paracetamolo 1 g / 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalvDp24.setText("os\n");
            farmSalvDp24.setText("Tramadolo gtt (100 mg/ml) 50-100 mg (equivalenti a 20-40 gtt) + Metoclopramide 10 mg\nParacetamolo 500 mg + Codeina 30 mg (sospendere terapia con paracetamolo)  1-2 cpr o bustine (max 6 cpr o bustine/die)\n");
            gastrSalvDp24.setText("No");

        }else if( alim.equals("noAlim") && fans.equals("tollerante")){
            //PRIME 24 ORE
            proto24.setText("A1 prime 24 ore - il paziente non si alimenta");
            somm24.setText("ev");
            farm24.setText("Paracetamolo 1g in 15' ogni 8h");
            gastr24.setText("No");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("ev");
            farmSalv.setText("Ketoralac 30mg ev in sol. fis. 100ml ripetibile ogni 8h");
            gastrSalv.setText("Pantoprazolo 40mg");
            //DOPO 24 ORE
            protoDp24.setText("A1 dopo 24 ore- il paziente non si alimenta");
            sommDp24.setText("ev\n");
            farmDp24.setText("Paracetamolo 1 g in 15’ ogni 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalvDp24.setText("ev\n");
            farmSalvDp24.setText("Tramadolo 50-100 mg in Sol.Fis.100 ml in 30’ + Metoclopramide 10 mg\nKetoprofene 160 mg in Sol.Fis.100 ml in 15'\n");
            gastrSalvDp24.setText("Pantoprazolo 40 mg/die\n (solo per Ketoprofene)");

        }else if( alim.equals("noAlim") && fans.equals("tollerante") && eta.equals("piu65")){
            //PRIME 24 ORE
            proto24.setText("A1 prime 24 ore - il paziente non si alimenta");
            somm24.setText("ev");
            farm24.setText("Paracetamolo 1g in 15' ogni 8h");
            gastr24.setText("No");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("ev");
            farmSalv.setText("Ketoralac 30mg ev in sol. fis. 100ml ripetibile ogni 12h");
            gastrSalv.setText("Pantoprazolo 40mg");
            //DOPO 24 ORE
            protoDp24.setText("A1 dopo 24 ore- il paziente non si alimenta");
            sommDp24.setText("ev\n");
            farmDp24.setText("Paracetamolo 1 g in 15’ ogni 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalvDp24.setText("ev\n");
            farmSalvDp24.setText("Tramadolo 50-100 mg in Sol.Fis.100 ml in 30’ + Metoclopramide 10 mg\nKetoprofene 160 mg in Sol.Fis.100 ml in 15'\n");
            gastrSalvDp24.setText("Pantoprazolo 40 mg/die\n (solo per Ketoprofene)");

        }else if( alim.equals("noAlim") && fans.equals("intollerante")){
            //PRIME 24 ORE
            proto24.setText("A2 prime 24 ore - il paziente non si alimenta e FANS controindicati");
            somm24.setText("ev");
            farm24.setText("Paracetamolo 1g in 15' ogni 8h");
            gastr24.setText("No");
            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("ev");
            farmSalv.setText("Tramadolo 10mg in 100ml di sol. fis. in 30' + Metoclopramide 10mg");
            gastrSalv.setText("No");
            //DOPO 24 ORE
            protoDp24.setText("A2 dopo 24 ore - il paziente non si alimenta e FANS controindicati");
            sommDp24.setText("ev\n");
            farmDp24.setText("Paracetamolo 1 g in 15’ ogni 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalvDp24.setText("ev\n");
            farmSalvDp24.setText("Tramadolo 50-100 mg in Sol.Fis.100 ml in 30’ + Metoclopramide 10 mg\n");
            gastrSalvDp24.setText("No");

        }
    }
}
