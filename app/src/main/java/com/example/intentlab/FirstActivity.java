package com.example.intentlab;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {

    private EditText mMessage;
    public static final String EXTRA_MSG_KEY = "EXTRA_MSG_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        mMessage = (EditText) findViewById(R.id.etMessage);
    }
    public void newIntentClick(View view){
        Intent secondActivityIntent = new Intent(FirstActivity.this, SecondActivity.class);
        secondActivityIntent.putExtra(EXTRA_MSG_KEY, mMessage.getText().toString());
        FirstActivity.this.startActivity(secondActivityIntent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
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