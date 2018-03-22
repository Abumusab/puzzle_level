package com.usamah.puzzle_level;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class page_3 extends AppCompatActivity {
    Button accept;
    Button hint;
    EditText pass;


    private  static  final String APP_ID="ca-app-pub-6106234088501382~7740051898";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_3);


        MobileAds.initialize(this,APP_ID);
        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        accept=(Button)findViewById(R.id.accept);
        hint = (Button)findViewById(R.id.hint);
        pass = (EditText) findViewById(R.id.pass);


        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String acppass=pass.getText().toString();



                if (acppass.equals("مربع")){
                    Intent next=new Intent(page_3.this,page_4.class);
                    startActivity(next);
                }else {
                    Toast.makeText(getApplicationContext(),"إجابة خاطئة",Toast.LENGTH_SHORT).show();
                }

            }

        });
    }
}
