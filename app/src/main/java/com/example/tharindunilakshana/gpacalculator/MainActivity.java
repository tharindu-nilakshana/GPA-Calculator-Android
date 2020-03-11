package com.example.tharindunilakshana.gpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button Add,Clear,Calculate;
    EditText creditmodule,obtainmodule,totalgpa;
    TextView subtotal,finalgpa;
    double sumtotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Get All Button and inputs
        creditmodule = (EditText) findViewById(R.id.txtCredit);
        obtainmodule = (EditText) findViewById(R.id.txtgradepoint);
        totalgpa = (EditText) findViewById(R.id.txtsubcredit);
        Clear = (Button) findViewById(R.id.btnclear);
        Calculate = (Button) findViewById(R.id.btncalgpa);
        Add = (Button) findViewById(R.id.btnAdd);
        subtotal = (TextView) findViewById(R.id.txttotal);
        finalgpa = (TextView) findViewById(R.id.txtfinalgpa);

        // When click Add button do this
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Assign them to string
                String one = creditmodule.getText().toString();
                String two = obtainmodule.getText().toString();

                double creditmodule = Float.parseFloat(one);
                double obtainmodule = Float.parseFloat(two);



                sumtotal = (creditmodule * obtainmodule) + sumtotal;


                subtotal.setText(String.valueOf(sumtotal));




            }
        })

        ;




    }
}
