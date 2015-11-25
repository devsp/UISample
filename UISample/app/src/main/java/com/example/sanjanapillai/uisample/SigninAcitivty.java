package com.example.sanjanapillai.uisample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SigninAcitivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_acitivty);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_signin_acitivty, menu);
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


    public void validate(View view){
        Button signin = (Button)findViewById(R.id.btnLogin);
        EditText username = (EditText)findViewById(R.id.lblUsername);
        EditText password = (EditText)findViewById(R.id.lblPassword);

        if(username.getText().toString().equals(getString(R.string.username)) &&
                password.getText().toString().equals(getString(R.string.password))){
            Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT);
            Intent gotoHomePage = new Intent(SigninAcitivty.this, WelcomePage.class);
            startActivity(gotoHomePage);
        }
        else{
            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT);

        }

    }


    public void registerSignIn(View view){
        Button register = (Button)findViewById(R.id.btnRegister);
        Intent registerintent = new Intent(SigninAcitivty.this, RegisterActivity.class);
        startActivity(registerintent);
    }






}
