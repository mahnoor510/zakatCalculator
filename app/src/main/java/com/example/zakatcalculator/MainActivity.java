package com.example.zakatcalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnclick(View view){
        EditText cash = (EditText) findViewById(R.id.cash);
        EditText savings = (EditText) findViewById(R.id.saving);
        EditText gold = (EditText) findViewById(R.id.gold);
        EditText loan = (EditText) findViewById(R.id.loan);
        String cash1=cash.getText().toString();
        String savings1=savings.getText().toString();
        String gold1=gold.getText().toString();
        String loan1=loan.getText().toString();
        Double amount1=Double.parseDouble(cash1);
        Double amount2=Double.parseDouble(savings1);
        Double amount3=Double.parseDouble(gold1);
        Double amount4=Double.parseDouble(loan1);
        Double zakat=(amount1+amount2+amount3-amount4)*0.025;
        TextView t=(TextView) findViewById(R.id.answer);
        t.setText("Zakat = Rs." + zakat.toString() + "\n");
        String t1=t.getText().toString();
        System.out.println(t1);
        //Log.d(TAG,"btnclick: " + t1);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}