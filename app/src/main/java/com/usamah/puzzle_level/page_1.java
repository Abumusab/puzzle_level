package com.usamah.puzzle_level;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

public class page_1 extends AppCompatActivity {
        Button accept;
        Button hint;
        Button hintagain;
        EditText pass;
        TextView hintText;

        private  static  final String APP_ID="ca-app-pub-6106234088501382~7740051898";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1);


        MobileAds.initialize(this,APP_ID);

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        gamefinshs();

        hintagain=(Button)findViewById(R.id.hintagain);
        accept=(Button)findViewById(R.id.accept);
        hint = (Button)findViewById(R.id.hint);
        pass = (EditText) findViewById(R.id.pass);
        hintText = (TextView) findViewById(R.id.hintText);

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String acppass=pass.getText().toString();



                if (acppass.equals("2")){
                    Intent next=new Intent(page_1.this,page_2.class);
                    startActivity(next);
                }else {

                   Toast.makeText(getApplicationContext(),"إجابة خاطئة",Toast.LENGTH_SHORT).show();
                }

            }

        });
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintText.setText("مابعد الرقم 1");
                hintagain.setText("تلميحة أخرى؟");
            }
        });

        hintagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintText.setText("2");
            }
        });


    }
    private void gamefinshs(){

        AlertDialog.Builder game=new AlertDialog.Builder(page_1.this);

        game
            //تغير التعليمات
                //VV
                //vv
                .setMessage("تعتمد اجابة كل مرحلة على حصولك على رقم المرحلة التالية ففي المرحلة الأولى يظهر لك الرقم 1 فيجب أن تكون إجابتك 2  وفي المرحلة الثانية سيظهر لك (اثنين) فالجواب هو (ثلاثة) وإن كان السؤال غير الأرقام فيجب أن يرمز الجواب لرقم المرحلة مثلاً لو قلنا في سؤال المرحلة الخامسة (الإربعاء) سيكون الجواب (الخميس) لأنه يمثل اليوم السادس من الأسبوع")


                .setCancelable(false)
                .setPositiveButton("أستمرار",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }

                        });


        AlertDialog aleratDialog = game.create();
        aleratDialog.show();
    }
}
