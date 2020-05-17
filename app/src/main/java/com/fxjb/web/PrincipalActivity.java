package com.fxjb.web;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void Webservice(View view){
        Intent webservice =  new Intent(this,MainActivity.class);
        startActivity(webservice);
    }

    public void Video(View view){
        Intent video = new Intent(this,VideoActivity.class);
        startActivity(video);
    }

    public void Foto(View view){
        Intent foto = new Intent(this,FotoActivity.class);
        startActivity(foto);
    }
}
