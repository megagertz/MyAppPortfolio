package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotify_streamer(View view){
        Toast.makeText(getApplicationContext(),R.string.spotify_streamer_toast, Toast.LENGTH_LONG).show();
    }

    public void scores(View view){
        Toast.makeText(getApplicationContext(), R.string.scores_toast, Toast.LENGTH_LONG).show();
    }
    public void library(View view){
        Toast.makeText(getApplicationContext(), R.string.library_toast, Toast.LENGTH_LONG).show();
    }
    public void build_it_bigger(View view){
        Toast.makeText(getApplicationContext(), R.string.build_it_bigger_toast, Toast.LENGTH_LONG).show();
    }
    public void xyz_reader(View view){
        Toast.makeText(getApplicationContext(), R.string.xyz_reader_toast, Toast.LENGTH_LONG).show();
    }
    public void capstone(View view){
        Toast.makeText(getApplicationContext(), R.string.capstone_toast, Toast.LENGTH_LONG).show();
    }




}
