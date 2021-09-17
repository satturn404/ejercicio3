package com.adultoindependiente.mytoolbarr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.new_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"opcion1",Toast.LENGTH_LONG).show();
                return true;

            case R.id.inst:
                Intent intentINST = new Intent(getApplicationContext(),instagram.class);
                startActivity(intentINST);
                return true;

            case R.id.fb:
                Intent intentFB = new Intent(getApplicationContext(),facebook.class);
                startActivity(intentFB);
                return true;

            case R.id.ws:
                Intent intentWS = new Intent(getApplicationContext(),whatsapp.class);
                startActivity(intentWS);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}