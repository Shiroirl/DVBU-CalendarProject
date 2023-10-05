package com.gato.proyectoandroid;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2, card3, card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);

        card1.setOnClickListener((View.OnClickListener)this);
        card2.setOnClickListener((View.OnClickListener)this);
        card3.setOnClickListener((View.OnClickListener)this);
        card4.setOnClickListener((View.OnClickListener)this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        if (v.getId() == R.id.c1) {
            i = new Intent(this, Memo.class);
            startActivity(i);

        } else if (v.getId() == R.id.c2) {
            i = new Intent(this, Config.class);
            startActivity(i);

        } else if (v.getId() == R.id.c3) {
            i = new Intent(this, Home.class);
            startActivity(i);

        } else if (v.getId() == R.id.c4) {
            i = new Intent(this, Exit.class);
            startActivity(i);
        }
    }

}