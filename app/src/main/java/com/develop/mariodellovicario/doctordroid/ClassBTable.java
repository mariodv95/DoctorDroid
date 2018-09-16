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
    }


}
