package edu.sv.udb.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt1;
    private EditText txt2;
    private EditText txt3;
    private EditText txt4;
    private EditText txt5;
    private EditText txt6;
    private EditText txt7;
    private EditText txt8;
    private EditText txt9;
    private EditText txt10;
    private TextView txtV1;
    private TextView txtV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txt7 = findViewById(R.id.txt7);
        txt8 = findViewById(R.id.txt8);
        txt9 = findViewById(R.id.txt9);
        txt10 = findViewById(R.id.txt10);
        txtV1 = findViewById(R.id.txtV1);
        txtV2 = findViewById(R.id.txtV2);

    }

    public void calcular(View view){
        String nota1 = txt1.getText().toString();
        String nota2 = txt2.getText().toString();
        String nota3 = txt3.getText().toString();
        String nota4 = txt4.getText().toString();
        String nota5 = txt5.getText().toString();
        String nota6 = txt6.getText().toString();
        String nota7 = txt7.getText().toString();
        String nota8 = txt8.getText().toString();
        String nota9 = txt9.getText().toString();
        String nota10 = txt10.getText().toString();

        int n1 = Integer.parseInt(nota1);
        int n2 = Integer.parseInt(nota2);
        int n3 = Integer.parseInt(nota3);
        int n4 = Integer.parseInt(nota4);
        int n5 = Integer.parseInt(nota5);
        int n6 = Integer.parseInt(nota6);
        int n7 = Integer.parseInt(nota7);
        int n8 = Integer.parseInt(nota8);
        int n9 = Integer.parseInt(nota9);
        int n10 = Integer.parseInt(nota10);

        int contadorMayor = 0;
        int contadorMenor = 0;

        if (n1 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        if (n2 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        if (n3 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        if (n4 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        if (n5 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        if (n6 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        if (n7 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        if (n8 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        if (n9 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        if (n10 >= 7){
            contadorMayor++;
        }else{
            contadorMenor++;
        }

        txtV1.setText("Hay un total de " + contadorMayor + " alumnos con notas superiores o iguales a 7.0 ");
        txtV2.setText("Hay un total de " + contadorMenor + " alumnos con notas superiores o iguales a 7.0 ");
    }
}