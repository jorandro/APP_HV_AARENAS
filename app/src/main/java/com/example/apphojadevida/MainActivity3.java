package com.example.apphojadevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity3 extends AppCompatActivity {
    private Button ACEPTAR;
    Switch miPrimerSwtich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ACEPTAR = (Button) findViewById(R.id.button4);
        miPrimerSwtich = (Switch) findViewById(R.id.switch1);
        miPrimerSwtich.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (miPrimerSwtich.isChecked()){
                    ACEPTAR.setEnabled(true);
                }else{
                    ACEPTAR.setEnabled(false);
                }
            }
        });
    }

    public void Back(View view){
        Intent Back = new Intent (this, MainActivity2.class);
        startActivity(Back);
    }
    public void COMPLET(View view){
        Intent COMPLET = new Intent (this, MainActivity4.class);
        startActivity(COMPLET);
    }

}