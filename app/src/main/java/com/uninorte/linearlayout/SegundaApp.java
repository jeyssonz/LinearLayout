package com.uninorte.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaApp extends AppCompatActivity {

    TextView textView;
    int op,Tem,Act,operdor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_app);
        textView =(TextView) findViewById(R.id.textView);
    }

    public void Boton1(View view) {
        Tem =1;
        Act=Act*10 +Tem;
    textView.setText(String.valueOf(Act));
    }

    public void Boton4(View view) {
        Tem =4;
        Act=Act*10 +Tem;
        textView.setText(String.valueOf(Act));
    }

    public void Boton2(View view) {
        Tem =2;
        Act=Act*10 +Tem;
        textView.setText(String.valueOf(Act));
    }

    public void Boton5(View view) {
        Tem =5;
        Act=Act*10 +Tem;
        textView.setText(String.valueOf(Act));
    }

    public void Boton8(View view) {
        Tem =8;
        Act=Act*10 +Tem;
        textView.setText(String.valueOf(Act));
    }

    public void Boton3(View view) {
        Tem =3;
        Act=Act*10 +Tem;
        textView.setText(String.valueOf(Act));
    }

    public void Boton6(View view) {
        Tem =6;
        Act=Act*10 +Tem;
        textView.setText(String.valueOf(Act));
    }

    public void Boton9(View view) {
        Tem =9;
        Act=Act*10 +Tem;
        textView.setText(String.valueOf(Act));
    }

    public void Boton7(View view) {
        Tem =7;
        Act=Act*10 +Tem;
        textView.setText(String.valueOf(Act));
    }

    public void Boton0(View view) {
        Tem =0;
        Act=Act*10 +Tem;
        textView.setText(String.valueOf(Act));
    }


    public void Botonmas(View view) {
        op=1;
        Act=0;
        String Entrada = textView.getText().toString();
        operdor= Integer.parseInt(Entrada);
        textView.setText(String.valueOf(0));
    }

    public void Botonmenos(View view) {
        op=2;
        Act=0;
        String Entrada = textView.getText().toString();
        operdor= Integer.parseInt(Entrada);
        textView.setText(String.valueOf(0));
    }

    public void BotonIgual(View view) {

        if(op==1)
        {
            Act=Act+operdor;
            textView.setText(String.valueOf(Act));
            op=0;
        }
        if(op==2)
        {
            Act=operdor-Act;
            textView.setText(String.valueOf(Act));
            op=0;
        }
    }
}
