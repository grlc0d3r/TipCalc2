package constraints.karynboyd.com.tipcalc2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // setup all input views
    EditText groupInput;
    EditText tipInput;
    EditText billTotalInput;

    // setup all msg views
    TextView tipTotalMessage;
    TextView totalWithTipMessage;
    TextView totalPerPersonMessage;

    //setup generic variables
    double tipTotal;
    double tip;
    double totalWithTip;
    double totalPerPerson;
    int group;
    double tipPercent;
    double billTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link to input views
        groupInput = findViewById(R.id.groupInput);
        tipInput = findViewById(R.id.tipInput);
        billTotalInput = findViewById(R.id.billTotalInput);

        // link to msg views
        tipTotalMessage = findViewById(R.id.tipTotalMessage);
        totalWithTipMessage = findViewById(R.id.totalWithTipMessage);
        totalPerPersonMessage = findViewById(R.id.totalPerPersonMessage);
    }

    public void calculate(View view){
        group = Integer.parseInt(groupInput.getText().toString());
        tip = Double.parseDouble(tipInput.getText().toString());
        billTotal = Double.parseDouble(billTotalInput.getText().toString());

        tipPercent =  tip / 100;

        tipTotal = Math.round(billTotal * tipPercent);
        tipTotalMessage.setText(""+tipTotal);

        totalWithTip = Math.round(tipTotal + billTotal);
        totalWithTipMessage.setText(""+totalWithTip);

        totalPerPerson = Math.round(totalWithTip / group);
        totalPerPersonMessage.setText(""+totalPerPerson);
    }

/*
    public void reset(View v){
        tipTotal = Double.parseDouble(null);
        tip  = Double.parseDouble(null);
        totalWithTip  = Double.parseDouble(null);
        totalPerPerson  = Double.parseDouble(null);
        int group = 0;
        tipPercent = 0;
        billTotal  = Double.parseDouble(null);

        tipTotalMessage.setText(""+tipTotal);
        totalWithTipMessage.setText(""+totalWithTip);
        totalPerPersonMessage.setText(""+totalPerPerson);
    }
*/

}