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