package com.usamah.puzzle_level;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class test_coins extends AppCompatActivity {

     Button addcoins,hint10coins,hint15coins;
     TextView yourcoins,hint10,hint15;
        int coins=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_coins);

           addcoins =(Button)findViewById(R.id.addcoins);
        hint10coins =(Button)findViewById(R.id.hint10coins);
        hint15coins =(Button)findViewById(R.id.hint15coins);
        yourcoins =(TextView)findViewById(R.id.yourcoins);
        hint10 =(TextView)findViewById(R.id.hint10);
        hint15 =(TextView)findViewById(R.id.hint15);



        addcoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coins++;
                coins++;
                coins++;
                coins++;
                yourcoins.setText(Integer.toString(coins));
            }
        });


        hint10coins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int coin = Integer.parseInt(yourcoins.getText().toString());

                if (coin >=10){
                    Toast.makeText(getApplicationContext(),"تم شراء تلميحة ب 10 نقاط",Toast.LENGTH_SHORT).show();
                    hint10.setText("الجواب اثنين");
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    yourcoins.setText(Integer.toString(coins));
                }else {
                    Toast.makeText(getApplicationContext(),"ليس لديك نقاط",Toast.LENGTH_SHORT).show();
                }
            }
        });
        hint15coins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int coin = Integer.parseInt(yourcoins.getText().toString());

                if (coin >=15){
                    hint15.setText("الجواب رقم 5");
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    coins--;
                    yourcoins.setText(Integer.toString(coins));
                    Toast.makeText(getApplicationContext(),"تم شراء تلميحة ب 15 نقاط",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"ليس لديك نقاط",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
