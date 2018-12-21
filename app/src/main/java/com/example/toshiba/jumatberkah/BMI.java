package com.example.toshiba.jumatberkah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    EditText ETtinggi,ETberat;
    TextView TVhasil;
    Button BTNsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        ETtinggi = (EditText) findViewById(R.id.tinggi);
        ETberat = (EditText) findViewById(R.id.berat);
        TVhasil = (TextView) findViewById(R.id.TVtampil);
        BTNsend = (Button) findViewById(R.id.btnkirim);

        BTNsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float tinggi = Integer.parseInt(ETtinggi.getText().toString());
                float berat = Integer.parseInt(ETberat.getText().toString());

                float tinggi2 = tinggi/100;

                float hasil = berat/(tinggi2*tinggi2);

                String muncul;

                if (hasil < 18.5)
                {
                    muncul = "Ceking";

                }
                else if(hasil >= 18.5 && hasil<24.5)
                {
                    muncul = "Normal";
                }
                else if(hasil >= 24.6 && hasil<30)
                {
                    muncul = "Over";
                }
                else
                {
                    muncul = "Obesitas";
                }

                TVhasil.setText(muncul);

            }
        });

    }
}
