package com.develop.mariodellovicario.doctordroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ClassBTable extends AppCompatActivity {

    String alim = null;
    String fans = null;
    String eta = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_b_table);

        Bundle extras = getIntent().getExtras();
        if( extras != null){
            alim = extras.getString("alim");
            fans = extras.getString("fans");
            eta = extras.getString("eta");
        }

        TextView proto24a = (TextView)findViewById(R.id.protocolloBa24Txt);
        TextView somm24a = (TextView)findViewById(R.id.somministr24atxt);
        TextView farm24a = (TextView)findViewById(R.id.farmaci24aTxt);
        TextView gastr24a = (TextView)findViewById(R.id.gastroaTxt);
        TextView protSalva = (TextView)findViewById(R.id.protocolloBSalvTxt);
        TextView sommSalva = (TextView)findViewById(R.id.somministrSalvatxt);
        TextView farmSalva = (TextView)findViewById(R.id.farmaciSalvaTxt);
        TextView gastrSalva = (TextView)findViewById(R.id.gastroSalvaTxt);

        TextView proto24b = (TextView)findViewById(R.id.protocolloBb24Txt);
        TextView somm24b = (TextView)findViewById(R.id.somministr24btxt);
        TextView farm24b = (TextView)findViewById(R.id.farmaci24bTxt);
        TextView gastr24b = (TextView)findViewById(R.id.gastrobTxt);
        TextView protSalvb = (TextView)findViewById(R.id.protocolloBSalvbTxt);
        TextView sommSalvb = (TextView)findViewById(R.id.somministrSalvbtxt);
        TextView farmSalvb = (TextView)findViewById(R.id.farmaciSalvbTxt);
        TextView gastrSalvb = (TextView)findViewById(R.id.gastroSalvbTxt);

        TextView protoDp24 = (TextView)findViewById((R.id.ProtocolloDp24BTxt));
        TextView sommDp24 = (TextView)findViewById((R.id.somministrDp24BTxt));
        TextView farmDp24 = (TextView)findViewById((R.id.farmaciDp24BTxt));
        TextView gastrDp24 = (TextView)findViewById((R.id.gastroDp24BTxt));
        TextView protoSalvDp24 = (TextView)findViewById((R.id.ProtocolloDp24BSave));
        TextView sommSalvDp24 = (TextView)findViewById((R.id.somministrDp24BSalvTxt));
        TextView farmSalvDp24 = (TextView)findViewById((R.id.farmaciDp24BSalvTxt));
        TextView gastrSalvDp24 = (TextView)findViewById((R.id.gastroDp24BSalvTxt));

        //CASI VARI - VEDI CLASSE A PER COPIARE piu o meno

        if(alim.equals("siAlim") && fans.equals("tollerante") && eta.equals("meno65")){
            //PRIME 24 ORE
            proto24a.setText("B3a prime 24 ore - paziente tra i 14 ed i 65 anni che si alimenta");
            somm24a.setText("prima fase: ore 8.00 in reparto per os\nseconda fase : intraoperatoria ev\nterza fase : ore 20.00 in reparto per os \n");
            farm24a.setText("prima fase: Ossicodone+Naloxone cpr a lento rilascio 10+5 mg\n seconda fase:Paracetamolo 1 g + Ketorolac 30 mg\nterza fase: Ossicodone+Naloxone cpr a lento rilascio 10+5 mg +  Paracetamolo 1 g / 8h  \n");
            gastr24a.setText("No");
            protSalva.setText("Scelta A : Opzioni terapeutiche di salvataggio da associare alla precedente se NRS>3\n");
            sommSalva.setText("os");
            farmSalva.setText("Tramadolo gtt (100 mg/ml)  50-100 mg (equivalenti a 20-40 gtt) + Metoclopramide 10 mg\n");
            gastrSalva.setText("No");

            proto24b.setText("B3b prime 24 ore - paziente tra i 14 ed i 65 anni che si alimenta");
            somm24b.setText("prima fase: ore 8.00 in reparto per os\nseconda fase : intraoperatoria ev\nterza fase : ore 20.00 in reparto per os \n");
            farm24b.setText("prima fase: Ossicodone+Naloxone cpr a lento rilascio 5+2,5 mg\nParacetamolo 1 g + Ketorolac 30 mg\nOssicodone+Naloxone cpr a lento rilascio 5+2,5 mg +  Paracetamolo 1 g / 8h  \n");
            gastr24b.setText("No");
            protSalvb.setText("Scelta B: Opzioni terapeutiche di salvataggio da associare alla precedente se NRS>3\n");
            sommSalvb.setText("os");
            farmSalvb.setText("Tramadolo gtt (100 mg/ml)  50-100 mg (equivalenti a 20-40 gtt) + Metoclopramide 10 mg\n");
            gastrSalvb.setText("No");
            //DOPO 24 ORE
            protoDp24.setText("B3 dopo 24 ore - il paziente si alimenta");
            sommDp24.setText("os");
            farmDp24.setText("Paracetamolo cpr 1.000 mg 1cp/ 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalvDp24.setText("os");
            farmSalvDp24.setText("°Se NRS tra 4 e 6: Ibuprofene cpr 400-600 mg\n Paracetamolo 500 mg + Codeina 30 mg (sospendere terapia con paracetamolo) 1-2 cpr o bustine (max 6 cpr o bustine/die)\n" +
                    "°Se NRS > 6: Tramadolo gtt (100 mg/ml) 50-100 mg  (equivalenti a 20-40 gtt) + Metoclopramide 10 mg\n Buprenorfina 1 cpr da 0,2 mg \n");
            gastrSalvDp24.setText("Pantoprazolo 40mg/die (SOLO per ibuprofene in caso NRS tra 4 e 6");

        }else if(alim.equals("noAlim") && fans.equals("tollerante")){
            proto24a.setText("B1a prime 24 ore - il paziente non si alimenta");
            somm24a.setText("prima fase: ev in 30 min prima della fine dell'intervento chirurgico\nseconda fase:somministrazione  e.v. con elastomero\n");
            farm24a.setText("Paracetamolo 1g  + Tramadolo 100 mg + Metoclopramide 10 mg in Sol.Fis.100 ml\nKetoralac 30 mg + Tramadolo 200-300 mg in elastomero da 60 ml a 2ml/h  (durata 30 ore)\n");
            gastr24a.setText("Per seconda fase: Pantoprazolo 40 mg /die + Metoclopramide 1 ogni 12 ore\n");
            protSalva.setText("Scelta A: Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalva.setText("ev");
            farmSalva.setText("°se NRS tra 4 e 6 : Ketoralac 30 mg (massimo 3 al giorno)\n °se NRS > 6 : Morfina 0,05-0,10 mg/Kg + Ondansetron 4 mg\n");
            gastrSalva.setText("No");

            proto24b.setText("B1b prime 24 ore - il paziente non si alimenta");
            somm24b.setText("prima fase: ev in 30 min prima della fine dell'intervento chirurgico\nseconda fase: somministrazione a richiesta e.v.con pompa PCA\n");
            farm24b.setText("prima fase: Paracetamolo 1g  + Buprenorfina 0,15-0,20 mg  + Ondansetron 4 mg \nseconda fase: Buprenorfina 0,006 mg/ml (es: buprenorfina 0,6 mg + sol.fis.98 ml ) + Ondansetron 4 mg\nflusso basale: zero ml / ora\nbolo 0,03 mg (5 ml)\nlockout: 30 min\n");
            gastr24b.setText("No");
            protSalvb.setText("Scelta B: Opzioni terapeutiche di salvataggio da associare alla precedente se NRS>3\n");
            sommSalvb.setText("ev\n");
            farmSalvb.setText("°se NRS tra 4 e 6 :  ketorolac 30 mg\n°se NRS >6:  Buprenorfina 0,10 mg ogni 15 minuti fino a NRS < 3\n");
            gastrSalvb.setText("Per NRS tra 4 e 6: Pantoprazolo 40 mg/die\n");
            //DOPO 24 ORE
            protoDp24.setText("B1 dopo 24 ore - il paziente non si alimenta");
            sommDp24.setText("ev");
            farmDp24.setText("Paracetamolo  1.000 mg in 15’ ogni 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalvDp24.setText("ev");
            farmSalvDp24.setText("°Se NRS tra 4 e 6: Ketorolac 30 mg ev in Sol.Fis.100 ml  ripetibile ogni 8h (ogni 12/h se > 65 anni)\n°Se NRS > 6: Tramadolo 50-100 mg ev in Sol.Fis.100 ml in 30’ + Metoclopramide 10 mg\n");
            gastrSalvDp24.setText("Pantoprazolo 40mg/die (SOLO per ibuprofene in caso NRS tra 4 e 6");
        }else if(alim.equals("noAlim") && fans.equals("intollerante")){
            proto24a.setText("B2a prime 24 ore - il paziente non si alimenta e FANS controindicati");
            somm24a.setText("prima fase: ev in 30 min\nseconda fase: ev infusione continua\n");
            farm24a.setText("prima fase: Paracetamolo 1g  + Tramadolo 100 mg + Metoclopramide 10 mg in Sol.Fis.100 ml\nseconda fase: Tramadolo 200-300 mg + Metoclopramide 20 mg in elastomero da 60 ml a 2ml/h (durata 30 ore)\n");
            gastr24a.setText("No");
            protSalva.setText("Scelta A: Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalva.setText("ev");
            farmSalva.setText(" Morfina 0,05-0,10 mg/Kg\n");
            gastrSalva.setText("No");

            proto24b.setText("B2b prime 24 ore - il paziente non si alimenta e FANS controindicati");
            somm24b.setText("prima fase: ev in 30 min prima della fine dell'intervento chirurgico\nseconda fase: somministrazione e.v.con pompa PCA\n");
            farm24b.setText("prima fase: Paracetamolo 1g  + Buprenorfina 0,15-0,20 mg + Ondansetron 4 mg\nseconda fase: Buprenorfina 0,006 mg/ml (es: buprenorfina 0,6 mg + sol.fis.98 ml\nflusso basale: zero ml / ora\nbolo 0,03 mg (5 ml)\nlockout: 30 min\n");
            gastr24b.setText("No");
            protSalvb.setText("Scelta B: Opzioni terapeutiche di salvataggio da associare alla precedente se NRS>3\n");
            sommSalvb.setText("ev\n");
            farmSalvb.setText(" Buprenorfina 0,10 mg ogni 15 minuti fino a NRS < 3\n");
            gastrSalvb.setText("No");
            //DOPO 24 ORE
            protoDp24.setText("B2 dopo 24 ore - il paziente non si alimenta e FANS controindicati");
            sommDp24.setText("ev");
            farmDp24.setText("Paracetamolo 1.000 mg in 15’ ogni 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalvDp24.setText("ev");
            farmSalvDp24.setText("Tramadolo 50-100 mg ev in Sol.Fis.100 ml in 30’ + Metoclopramide 10 mg\n");
            gastrSalvDp24.setText("No");
    }else if(alim.equals("siAlim") && fans.equals("intollerante") && eta.equals("meno65")){
            proto24a.setText("B4a prime 24 ore - Paziente di età tra 18-65 anni che si alimenta e FANS controindicati\n");
            somm24a.setText("prima fase: ore 8.00 in reparto per os\nseconda fase : intraoperatoria ev\nterza fase : ore 20.00 in reparto per os \n");
            farm24a.setText("prima fase: Ossicodone+Naloxone cpr a lento rilascio 10 mg\nseconda fase: Paracetamolo 1 g\nterza fase: Ossicodone+Naloxone cpr a lento rilascio 10 mg +  Paracetamolo 1 g / 8h  \n");
            gastr24a.setText("No");
            protSalva.setText("Scelta A: Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalva.setText("os\n");
            farmSalva.setText("Tramadolo gtt (100 mg/ml)  50-100 mg (equivalenti a 20-40 gtt) + Metoclopramide 10 mg\n");
            gastrSalva.setText("No");

            proto24b.setText("B4b prime 24 ore - Paziente di età tra 18-65 anni che si alimenta e FANS controindicati\n");
            somm24b.setText("prima fase: ore 8.00 in reparto per os\nseconda fase : intraoperatoria ev\nterza fase : ore 20.00 in reparto per os \n");
            farm24b.setText("prima fase: Ossicodone+Naloxone cpr a lento rilascio 5+2,5 mg\nseconda fase: Paracetamolo 1 g\nterza fase: Ossicodone+Naloxone cpr a lento rilascio 5+2,5 mg +  Paracetamolo 1 g / 8h  \n");
            gastr24b.setText("No");
            protSalvb.setText("Scelta B: Opzioni terapeutiche di salvataggio da associare alla precedente se NRS>3\n");
            sommSalvb.setText("os\n");
            farmSalvb.setText("Tramadolo gtt (100 mg/ml)  50-100 mg (equivalenti a 20-40 gtt) + Metoclopramide 10 mg\n");
            gastrSalvb.setText("No");
            //DOPO 24 ORE
            protoDp24.setText("B4 dopo 24 ore - il paziente si alimenta e FANS controindicati");
            sommDp24.setText("os\n");
            farmDp24.setText("Paracetamolo cpr 1.000 mg 1cp/ 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Opzioni terapeutiche di salvataggio da associare alla precedente se NRS >3\n");
            sommSalvDp24.setText("os");
            farmSalvDp24.setText("°Se NRS tra 4 e 6: Paracetamolo 500 mg + Codeina 30 mg 1-2 cpr o bustine (max 6 cpr o bustine/die e sospendere altre terapie con paracetamolo)\n°se NRS > 6: Tramadolo gtt (100 mg/ml) 50-100 mg  (equivalenti a 20-40 gtt) + Metoclopramide 10 mg\nBuprenorfina 1 cpr da 0,2 mg \n");
            gastrSalvDp24.setText("No");
        }

    }
}
