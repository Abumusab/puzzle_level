package com.usamah.puzzle_level;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class page_5 extends AppCompatActivity {


    Button accept;
    Button hint;
    Button hintagain;
    EditText pass;
    TextView hintText;


    private  static  final String APP_ID="ca-app-pub-6106234088501382~7740051898";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_5);

        MobileAds.initialize(this,APP_ID);
        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        hintagain=(Button)findViewById(R.id.hintagain);
        accept=(Button)findViewById(R.id.accept);
        hint = (Button)findViewById(R.id.hint);
        pass = (EditText) findViewById(R.id.pass);
        hintText = (TextView) findViewById(R.id.hintText);

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String acppass = pass.getText().toString();


                if (acppass.equals("vi")) {
                    Intent next = new Intent(page_5.this, page_6.class);
                    startActivity(next);
                } else {

                    if (acppass.equals("VI")) {
                        Intent next = new Intent(page_5.this, page_6.class);
                        startActivity(next);
                    } else {
                        if (acppass.equals("Vi")) {
                            Intent next = new Intent(page_5.this, page_6.class);
                            startActivity(next);
                        } else {
                            if (acppass.equals("vI")) {
                                Intent next = new Intent(page_5.this, page_6.class);
                                startActivity(next);
                            } else {
                                if (acppass.equals("next")) {
                                    Intent next = new Intent(page_5.this, page_6.class);
                                    startActivity(next);
                                }else {

                                Toast.makeText(getApplicationContext(), "إجابة خاطئة", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }
            }

        });
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintText.setText("v<<رقم");
                hintagain.setText("تلميحة أخرى؟");
            }
        });

        hintagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintText.setText("أرقام لاتينية");
            }
        });
    }
}
