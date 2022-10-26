package com.example.ikisayitoplam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editText,editText1;
    Button add;
    int s1,s2, sonuc=0;
    Context context = this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=findViewById(R.id.add);
        editText=findViewById(R.id.editTextTextPersonName);
        editText1=findViewById(R.id.editTextTextPersonName2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 s1= Integer.parseInt(editText.getText().toString());
                 s2= Integer.parseInt(editText1.getText().toString());

                sonuc=s1+s2;


                Toast.makeText(MainActivity.this,"Sonuc: "+sonuc,Toast.LENGTH_LONG).show();


            }
        });








    }
}