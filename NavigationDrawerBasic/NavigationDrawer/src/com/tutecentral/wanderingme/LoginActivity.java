package com.tutecentral.wanderingme;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.tutecentral.navigationdrawer.R;

/**
 * Created by Aimee on 2/28/2015.
 */
public class LoginActivity extends Activity {
    ActionBar ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logout);
        ab = getActionBar();
        ab.hide();


    }
    public void setReg(View v){
        setContentView(R.layout.registration);
        ab = getActionBar();
        ab.show();
    }

    public void goToHome(View v){
        Intent I = new Intent(this,MainActivity.class);
        startActivity(I);

    }

    public void submitForm (View v){
        setContentView(R.layout.start);
        ab = getActionBar();
        ab.hide();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
}
