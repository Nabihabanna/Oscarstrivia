package com.example.android.oscarstrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateScore(View v) {
        // when the user chooses the correct Radio Button answer .
        RadioButton wyler = (RadioButton) findViewById(R.id.william_wyler);
        boolean hasWyler = wyler.isChecked();
        RadioButton steven = (RadioButton) findViewById(R.id.steven_spielberg);
        boolean hasSteven = steven.isChecked();
        RadioButton ford = (RadioButton) findViewById(R.id.john_ford);
        boolean hasFord = ford.isChecked();
        RadioButton capra = (RadioButton) findViewById(R.id.frank_capra);
        boolean hasCapra = capra.isChecked();

        RadioButton streep = (RadioButton) findViewById(R.id.meryl_streep);
        boolean hasStreep = streep.isChecked();
        RadioButton ingrid = (RadioButton) findViewById(R.id.ingrid_bergman);
        boolean hasIngrid = ingrid.isChecked();
        RadioButton hepburn = (RadioButton) findViewById(R.id.katharine_hepburn);
        boolean hasHepburn = hepburn.isChecked();
        RadioButton nicholson = (RadioButton) findViewById(R.id.jack_nicholson);
        boolean hasNicholson = nicholson.isChecked();

        RadioButton d1929 = (RadioButton) findViewById(R.id.d1929);
        boolean hasD1929 = d1929.isChecked();
        RadioButton d1910 = (RadioButton) findViewById(R.id.d1910);
        boolean hasD1910 = d1910.isChecked();
        RadioButton d1925 = (RadioButton) findViewById(R.id.d1925);
        boolean hasD1925 = d1925.isChecked();
        RadioButton d1942 = (RadioButton) findViewById(R.id.d1942);
        boolean hasD1942 = d1942.isChecked();

        RadioButton sunrise = (RadioButton) findViewById(R.id.Sunrise);
        boolean hasSunrise = sunrise.isChecked();
        RadioButton wings = (RadioButton) findViewById(R.id.Wings);
        boolean hasWings = wings.isChecked();
        RadioButton broadway = (RadioButton) findViewById(R.id.the_broadway_melody);
        boolean hasBroadway = broadway.isChecked();
        RadioButton quiet = (RadioButton) findViewById(R.id.all_quiet);
        boolean hasQuiet = quiet.isChecked();

        RadioButton meryl = (RadioButton) findViewById(R.id.meryl_streep1);
        boolean hasMeryl = meryl.isChecked();
        RadioButton edith = (RadioButton) findViewById(R.id.edith_head);
        boolean hasEdith = edith.isChecked();
        RadioButton sofia = (RadioButton) findViewById(R.id.sofia_coppola);
        boolean hasSofia = sofia.isChecked();
        RadioButton fran = (RadioButton) findViewById(R.id.fran_walsh);
        boolean hasFran = fran.isChecked();

        RadioButton doro = (RadioButton) findViewById(R.id.dorothy_dandridge);
        boolean hasDoro = doro.isChecked();
        RadioButton head = (RadioButton) findViewById(R.id.edith_head1);
        boolean hasHead = head.isChecked();
        RadioButton hattie = (RadioButton) findViewById(R.id.hattie_mcDaniel);
        boolean hasHattie = hattie.isChecked();
        RadioButton james = (RadioButton) findViewById(R.id.james_baskett);
        boolean hasJames = james.isChecked();

        CheckBox pool = (CheckBox) findViewById(R.id.deadpool);
        boolean hasPool = pool.isChecked();
        CheckBox hail = (CheckBox) findViewById(R.id.hail_caesar);
        boolean hasHail = hail.isChecked();
        CheckBox silence = (CheckBox) findViewById(R.id.silence);
        boolean hasSilence = silence.isChecked();
        CheckBox zodiac = (CheckBox) findViewById(R.id.zodiac);
        boolean hasZodiac = zodiac.isChecked();

        RadioButton d3 = (RadioButton) findViewById(R.id.d3);
        boolean has3 = d3.isChecked();
        RadioButton d1 = (RadioButton) findViewById(R.id.d1);
        boolean has1 = d1.isChecked();
        RadioButton d2 = (RadioButton) findViewById(R.id.d2);
        boolean has2 = d2.isChecked();
        RadioButton d4 = (RadioButton) findViewById(R.id.d4);
        boolean has4 = d4.isChecked();

        RadioButton japan = (RadioButton) findViewById(R.id.japan);
        boolean hasJapan = japan.isChecked();
        RadioButton sweden = (RadioButton) findViewById(R.id.sweden);
        boolean hasSweden = sweden.isChecked();
        RadioButton france = (RadioButton) findViewById(R.id.france);
        boolean hasFrance = france.isChecked();
        RadioButton italy = (RadioButton) findViewById(R.id.italy);
        boolean hasItaly = italy.isChecked();

        RadioButton titanic = (RadioButton) findViewById(R.id.titanic);
        boolean hasTitanic = titanic.isChecked();
        RadioButton ben = (RadioButton) findViewById(R.id.ben_hur);
        boolean hasBen = ben.isChecked();
        RadioButton lord = (RadioButton) findViewById(R.id.lord);
        boolean hasLord = lord.isChecked();
        RadioButton gone = (RadioButton) findViewById(R.id.gone);
        boolean hasGone = gone.isChecked();

        int totalScore = firstCalculateScore(hasWyler, hasSteven, hasFord, hasCapra, hasStreep, hasIngrid, hasHepburn,
                hasNicholson, hasD1929, hasD1910, hasD1925, hasD1942, hasSunrise, hasWings, hasBroadway, hasQuiet, hasMeryl,
                hasEdith, hasSofia, hasFran, hasDoro, hasHead, hasHattie, hasJames, hasPool, hasHail, hasSilence, hasZodiac, has3,
                has1, has2, has4, hasJapan, hasSweden, hasFrance, hasItaly, hasTitanic, hasBen, hasLord, hasGone) ;
        String orderMessage = createOrderScore(totalScore);

        display (orderMessage  ) ;
    }

    private int firstCalculateScore(boolean hasWyler,boolean hasSteven, boolean hasFord,boolean hasCapra,boolean hasStreep,
                                    boolean hasIngrid,boolean hasHepburn,boolean hasNicholson, boolean hasD1929, boolean hasD1910,
                                    boolean hasD1925, boolean hasD1942, boolean hasSunrise, boolean hasWings, boolean hasBroadway,
                                    boolean hasQuiet, boolean hasMeryl, boolean hasEdith, boolean hasSofia, boolean hasFran, boolean hasDoro,
                                    boolean hasHead, boolean hasHattie, boolean hasJames, boolean hasPool, boolean hasHail, boolean hasSilence,
                                    boolean hasZodiac, boolean has3, boolean has1, boolean has2, boolean has4, boolean hasJapan, boolean hasSweden,
                                    boolean hasFrance, boolean hasItaly, boolean hasTitanic, boolean hasBen, boolean hasLord, boolean hasGone) {
        int totalScore = 0 ;

        if (hasFord == true)
            totalScore = totalScore + 1 ;
        if (hasWyler == false && hasSteven == false && hasCapra == false );

        if (hasHepburn == true)
            totalScore = totalScore + 1;
        if (hasStreep == false && hasIngrid == false && hasNicholson == false );

        if (hasD1929 == true)
            totalScore = totalScore + 1;
        if (hasD1910 == false && hasD1925 == false && hasD1942 == false );

        if (hasWings == true)
            totalScore = totalScore + 1;
        if (hasSunrise == false && hasBroadway == false && hasQuiet == false );

        if (hasFran == true)
            totalScore = totalScore + 1;
        if (hasMeryl == false && hasEdith == false && hasSofia == false );

        if (hasHattie == true)
            totalScore = totalScore + 1;
        if (hasDoro == false && hasHead == false && hasJames == false );

        if (hasPool == true && hasZodiac == true)
            totalScore = totalScore + 1;
        if (hasHail == false && hasSilence == false );

        if (has3 == true)
            totalScore = totalScore + 1;
        if (has1 == false && has2 == false && has4 == false );

        if (hasItaly == true)
            totalScore = totalScore + 1;
        if (hasJapan == false && hasSweden == false && hasFrance == false );

        if (hasLord == true)
            totalScore = totalScore + 1;
        if (hasBen == false && hasTitanic == false && hasGone == false );
        return totalScore;
    }

    private String createOrderScore( int totalScore) {
        EditText text = (EditText)findViewById(R.id.insert_name);
        String value = text.getText(). toString();
        String scoreMessage = value + ", your score is " + totalScore + " / 10";
        TextView ordermessage = (TextView)findViewById(R.id.button);
        ordermessage.setVisibility(View.VISIBLE);
        Toast.makeText(getApplicationContext(), scoreMessage, Toast.LENGTH_LONG).show();
        return scoreMessage;
    }

    private void display(String totalScore) {
        TextView quantityTextView = (TextView) findViewById(R.id.number_of_score);
        quantityTextView.setText("" + totalScore);
    }
}
