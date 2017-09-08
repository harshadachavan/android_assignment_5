package com.example.harshadachavan.blinkingeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Define button animation and textview
    Animation animBlink;
    Button btnBlink;
    TextView txtBlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnBlink = (Button) findViewById(R.id.animate);
        txtBlink=(TextView) findViewById(R.id.txt_blink);

        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.animation);
        // blink
        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtBlink.setVisibility(View.VISIBLE);
                txtBlink.startAnimation(animBlink);
            }
        });
    }
}
