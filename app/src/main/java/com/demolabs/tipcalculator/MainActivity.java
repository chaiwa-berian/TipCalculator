package com.demolabs.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //@BindView(R.id.etBillAmount)
    //EditText etBillAmount = (EditText)findViewById(R.id.etBillAmount);
    //@BindView(R.id.tvTipPercent)
    TextView tvTipPercent = (TextView)findViewById(R.id.tvTipPercent);
    //@BindView(R.id.tvTipTotal)
    TextView tvTipTotal = (TextView)findViewById(R.id.tvTipTotal);
    //@BindView(R.id.tvBillTotal)
    TextView tvBillTotal = (TextView)findViewById(R.id.tvBillTotal);

    float percentage =0;
    float tipTotal=0;
    float finalBillAmount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ButterKnife.bind(this);

        setTipValues();


    }

    private void setTipValues() {
        tvTipPercent.setText(getString(R.string.main_msg_tipPercent, percentage));
        tvTipTotal.setText(getString(R.string.main_msg_tipTotal,tipTotal));
        tvBillTotal.setText(getString(R.string.main_msg_billTotal, finalBillAmount));
    }

    /*@OnClick({R.id.ibRegularService, R.id.ibGoodService, R.id.ibExcellentService})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.ibRegularService:
                break;
            case R.id.ibGoodService:
                break;
            case R.id.ibExcellentService:
                break;
            default:
                break;
        }
    }
    */

}
