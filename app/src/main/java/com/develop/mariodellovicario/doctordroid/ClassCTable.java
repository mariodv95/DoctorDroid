package com.develop.mariodellovicario.doctordroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ClassCTable extends AppCompatActivity {

    String alim = null;
    String fans = null;
    String eta = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_c_table);

        Bundle extras = getIntent().getExtras();
        if( extras != null){
            alim = extras.getString("alim");
            fans = extras.getString("fans");
            eta = extras.getString("eta");
        }

        TextView proto24 = (TextView)findViewById(R.id.protocolloA24Txt);

        TextView somm241 = (TextView)findViewById(R.id.somministr24txt1);
        TextView farm241 = (TextView)findViewById(R.id.farmaci24Txt1);
        TextView gastr241 = (TextView)findViewById(R.id.gastroTxt1);

        TextView somm242 = (TextView)findViewById(R.id.somministr24txt2);
        TextView farm242 = (TextView)findViewById(R.id.farmaci24Txt2);
        TextView gastr242 = (TextView)findViewById(R.id.gastroTxt2);

        TextView somm243 = (TextView)findViewById(R.id.somministr24txt3);
        TextView farm243 = (TextView)findViewById(R.id.farmaci24Txt3);
        TextView gastr243 = (TextView)findViewById(R.id.gastroTxt3);

        TextView somm244 = (TextView)findViewById(R.id.somministr24txt4);
        TextView farm244 = (TextView)findViewById(R.id.farmaci24Txt4);
        TextView gastr244 = (TextView)findViewById(R.id.gastroTxt4);

        TextView somm245 = (TextView)findViewById(R.id.somministr24txt5);
        TextView farm245 = (TextView)findViewById(R.id.farmaci24Txt5);
        TextView gastr245 = (TextView)findViewById(R.id.gastroTxt5);

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

        if(alim.equals("noAlim") && fans.equals("tollerante")){
            //PRIME 24 ORE
            proto24.setText("C1 prime 24 ore - il paziente non si alimenta");

            somm241.setText("ev bolo 30 min prima della fine dell'intervento chirurgico\n");
            farm241.setText("Morfina 0,10-0,15 mg/Kg + Paracetamolo 1 g + Ketorolac 30 mg + Ondansetron 4 mg\n");
            gastr241.setText("Pantoprazolo 40 mg/die\n");

            somm242.setText("ev infusione continua con pompa PCA\n");
            farm242.setText("Morfina  0,005-0,03 mg/Kg/ora (VEDI TABELLA MORFINA IN POMPA PCA)\nflusso basale  (ml / h): scegliere in base ai mg/kg/ora voluti  (VEDI TABELLA MORFINA IN POMPA PCA)\nbolo (mg e ml) : (VEDI TABELLA  MORFINA IN POMPA PCA)\nlockout (min): in base ai mg/kg/h voluti (VEDI TABELLA  MORFINA IN POMPA PCA)\ndose massima: 4 mg/ora\n");
            gastr242.setText("No");

            somm243.setText("ev infusione solo a richiesta con pompa PCA \n");
            farm243.setText("Morfina  0,005-0,03 mg/Kg/ora (VEDI TABELLA MORFINA IN POMPA PCA)\nflusso basale (ml/ora): zero\nbolo (mg e ml) : (VEDI TABELLA MORFINA IN POMPA PCA)\nlockout (min):  (VEDI TABELLA MORFINA IN POMPA PCA)\ndose massima: 4 mg/ora\n");
            gastr243.setText("No");

            somm244.setText("ev infusione solo a richiesta con pompa PCA in pazienti di età>65 anni, a rischio OSAS, ASA III-IV  \n");
            farm244.setText("Morfina  0,003-0,021 mg/Kg/ora (VEDI TABELLA MORFINA IN POMPA PCA)\nflusso basale (ml/ora): zero\nbolo (mg e ml) : (VEDI TABELLA MORFINA IN POMPA PCA)\nlockout (min):  (VEDI TABELLA MORFINA IN POMPA PCA)\ndose massima: 4 mg/ora\n");
            gastr244.setText("No");

            somm245.setText("ev infusione continua con elastomero\n");
            farm245.setText("(VEDI TABELLA MORFINA CON ELASTOMERO)\n");
            gastr245.setText("No");

            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("ev\n");
            farmSalv.setText("Morfina 0,05-0,10 mg/Kg in boli refratti ogni 5-10 min fino a NRS<4\n");
            gastrSalv.setText("No");
            //DOPO 24 ORE
            protoDp24.setText("C1 dopo 24 ore - il paziente non si alimenta");
            sommDp24.setText("ev");
            farmDp24.setText("Paracetamolo  1.000 mg in 15’ ogni 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalvDp24.setText("ev");
            farmSalvDp24.setText("°Se NRS tra 4 e 6: Ketorolac 30 mg ev  ripetibile ogni 8h (ogni 12/h se > 65 anni) OPPURE Ketoralac 30 mg  + Tramadolo 100 mg in Sol.Fis.100 ml  ripetibile ogni 8h (ogni 12/h se > 65 anni) + Metoclopramide 10 mg\n°Se NRS > 6: Morfina 0,05-0,10 mg/Kg + Ondansetron 4 mg\n");
            gastrSalvDp24.setText("Pantoprazolo 40 mg/die\n (SOLO per NRS tra 4 e 6)");

        }else if(alim.equals("noAlim") && fans.equals("intollerante")){
            //PRIME 24 ORE
            proto24.setText("C2 prime 24 ore - il paziente non si alimenta e FANS controindicati");

            somm241.setText("ev bolo 30 min prima della fine dell'intervento chirurgico\n");
            farm241.setText("Morfina 0,10-0,15 mg/Kg + Paracetamolo 1 g + Ondansetron 4 mg\n");
            gastr241.setText("Pantoprazolo 40 mg/die\n");

            somm242.setText("ev infusione continua con pompa PCA\n");
            farm242.setText("Morfina  0,005-0,03 mg/Kg/ora (VEDI TABELLA MORFINA IN POMPA PCA)\nflusso basale  (ml / h): scegliere in base ai mg/kg/ora voluti  (VEDI TABELLA MORFINA IN POMPA PCA)\nbolo (mg e ml) : (VEDI TABELLA  MORFINA IN POMPA PCA)\nlockout (min): in base ai mg/kg/h voluti (VEDI TABELLA  MORFINA IN POMPA PCA)\ndose massima: 4 mg/ora\n");
            gastr242.setText("No");

            somm243.setText("ev infusione solo a richiesta con pompa PCA \n");
            farm243.setText("Morfina  0,005-0,03 mg/Kg/ora (VEDI TABELLA MORFINA IN POMPA PCA)\nflusso basale (ml/ora): zero\nbolo (mg e ml) : (VEDI TABELLA MORFINA IN POMPA PCA)\nlockout (min):  (VEDI TABELLA MORFINA IN POMPA PCA)\ndose massima: 4 mg/ora\n");
            gastr243.setText("No");

            somm244.setText("ev infusione solo a richiesta con pompa PCA in pazienti di età>65 anni, a rischio OSAS, ASA III-IV  \n");
            farm244.setText("Morfina  0,003-0,021 mg/Kg/ora (VEDI TABELLA MORFINA IN POMPA PCA)\nflusso basale (ml/ora): zero\nbolo (mg e ml) : (VEDI TABELLA MORFINA IN POMPA PCA)\nlockout (min):  (VEDI TABELLA MORFINA IN POMPA PCA)\ndose massima: 4 mg/ora\n");
            gastr244.setText("No");

            somm245.setText("ev infusione continua con elastomero\n");
            farm245.setText("(VEDI TABELLA MORFINA CON ELASTOMERO)\n");
            gastr245.setText("No");

            protSalv.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalv.setText("ev\n");
            farmSalv.setText("Morfina 0,05-0,10 mg/Kg in boli refratti ogni 5-10 min fino a NRS<4\n");
            gastrSalv.setText("No");
            //DOPO 24 ORE
            protoDp24.setText("C1 dopo 24 ore - il paziente non si alimenta");
            sommDp24.setText("ev");
            farmDp24.setText("Paracetamolo  1.000 mg in 15’ ogni 8h\n");
            gastrDp24.setText("No");
            protoSalvDp24.setText("Operazioni terapeutiche di salvataggio da associare alla precedente se NRS > 3");
            sommSalvDp24.setText("ev");
            farmSalvDp24.setText("°Se NRS tra 4 e 6: Tramadolo 100 mg in Sol.Fis.100 ml  ripetibile ogni 8h (ogni 12/h se > 65 anni) + Metoclopramide 10 mg\n°Se NRS > 6: Morfina 0,05-0,10 mg/Kg + Ondansetron 4 mg\n");
            gastrSalvDp24.setText("Pantoprazolo 40 mg/die\n (SOLO per NRS tra 4 e 6)");

        }//QUI VANNO GLI ALTRI CASI CHE PERò NON CAPISCO COME INSERIRE////INOLTRE HO SCRITTO LE STESSE COSE ELIMINANDO IL KETOROLAC SIA DALLE PRIME CHE DOPO 24 ORE
    }
}
