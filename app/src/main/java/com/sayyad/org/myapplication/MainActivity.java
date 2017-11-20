package com.sayyad.org.myapplication;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =  (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitle("Main Tool Bar");
        toolbar.setSubtitle("Sayyad Khan");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            toolbar.setElevation(10f);
        } else {

        }
    }

    public void standAloneToolbarAction(View view) {
        Intent intent = new Intent(this,StandAlone.class);
        startActivity(intent);
    }

    public void ActionBarToolbarAction(View view) {
        Intent intent = new Intent(this,ActionBar.class);
        startActivity(intent);
    }

    public void contextualMenuAction(View view) {
        Intent intent = new Intent(this,Contextual.class);
        startActivity(intent);
    }
}
