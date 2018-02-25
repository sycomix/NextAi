package com.bot.chatbot.chatbot;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VoiceSearch extends AppCompatActivity {


    private TextView textView1,textView2,textView3;
    private Button find;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice_search);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        find=(Button)findViewById(R.id.find);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialogMethod();
            }
        });






    }
    private void alertDialogMethod(){

        AlertDialog.Builder MyBuild= new AlertDialog.Builder(VoiceSearch.this);
        MyBuild.setTitle("Elias Hossain");
        MyBuild.setMessage("SWE Department of DIU\nelias.diu860@gmail.com");
        MyBuild.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                // finish();
                // startActivity(new Intent(getApplicationContext(),StarsAndPlanetActivity.class));


            }
        });

        AlertDialog obj= MyBuild.create();
        obj.show();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
