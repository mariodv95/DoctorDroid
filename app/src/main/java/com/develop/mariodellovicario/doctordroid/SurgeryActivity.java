package com.develop.mariodellovicario.doctordroid;

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
    Button oppPerBtn;
    Button oppSubBtn;


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

        oppPerBtn = (Button) findViewById(R.id.btnOppPer);

        oppPerBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //thigs to do on button press...example toast:
                Toast.makeText(getApplicationContext(), "tabelle2", Toast.LENGTH_SHORT).show();
            }
        });

        oppSubBtn = (Button) findViewById(R.id.btnOppSub);

        oppSubBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            //On click function
            public void onClick(View view) {
                //thigs to do on button press...example toast:
                Toast.makeText(getApplicationContext(), "tabelle3", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
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
        InterventiGen.add("Intervento 1");
        InterventiGen.add("Intervento 2");
        InterventiGen.add("Intervento 3");
        InterventiGen.add("Intervento 4");
        InterventiGen.add("Intervento 5");
        InterventiGen.add("Intervento 6");
        InterventiGen.add("Intervento 7");
        InterventiGen.add("Intervento 8");
        InterventiGen.add("Intervento 9");
        InterventiGen.add("Intervento 10");
        InterventiGen.add("Intervento 11");
        InterventiGen.add("Intervento 12");
        InterventiGen.add("Intervento 13");
        InterventiGen.add("Intervento 14");
        InterventiGen.add("Intervento 15");
        InterventiGen.add("Intervento 16");
        InterventiGen.add("Intervento 17");
        InterventiGen.add("Intervento 18");
        InterventiGen.add("Intervento 19");


        List<String> InterventiOrt = new ArrayList<String>();
        InterventiOrt.add("The Conjuring");
        InterventiOrt.add("Despicable Me 2");
        InterventiOrt.add("Turbo");
        InterventiOrt.add("Grown Ups 2");
        InterventiOrt.add("Red 2");
        InterventiOrt.add("The Wolverine");

        List<String> InterventiOcul = new ArrayList<String>();
        InterventiOcul.add("2 Guns");
        InterventiOcul.add("The Smurfs 2");
        InterventiOcul.add("The Spectacular Now");
        InterventiOcul.add("The Canyons");
        InterventiOcul.add("Europa Report");

        List<String> InterventiRad = new ArrayList<String>();
        InterventiRad.add("2 Guns");
        InterventiRad.add("The Smurfs 2");
        InterventiRad.add("The Spectacular Now");
        InterventiRad.add("The Canyons");
        InterventiRad.add("Europa Report");

        List<String> InterventiTor = new ArrayList<String>();
        InterventiTor.add("2 Guns");
        InterventiTor.add("The Smurfs 2");
        InterventiTor.add("The Spectacular Now");
        InterventiTor.add("The Canyons");
        InterventiTor.add("Europa Report");

        listDataChild.put(listDataHeader.get(0), InterventiGen); // Header, Child data
        listDataChild.put(listDataHeader.get(1), InterventiOrt);
        listDataChild.put(listDataHeader.get(2), InterventiOcul);
        listDataChild.put(listDataHeader.get(3), InterventiRad);
        listDataChild.put(listDataHeader.get(4), InterventiTor);
    }
}