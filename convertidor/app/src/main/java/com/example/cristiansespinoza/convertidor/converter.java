package com.example.cristiansespinoza.convertidor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        final EditText tempe=(EditText)findViewById(R.id.tempbox);
        final RadioButton cel2far=(RadioButton)findViewById(R.id.c2f);
        final RadioButton far2cel=(RadioButton)findViewById(R.id.f2c);
        final Button con=(Button)findViewById(R.id.conbtn);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                double kika= new Double(tempe.getText().toString());
                if (far2cel.isChecked())
                    kika=Unitconverter.Farenheit2Celsuis(kika);

                else kika=Unitconverter.Celsuis2Farenheit(kika);
                tempe.setText(new Double(kika).toString());


            }
        });
    }
}
