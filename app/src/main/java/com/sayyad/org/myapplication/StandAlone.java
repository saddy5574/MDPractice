package com.sayyad.org.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by SAYYAD on 19-Nov-17.
 */

public class StandAlone extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stand_alone);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitle("Main Tool Bar");
        toolbar.setSubtitle("Sayyad Khan");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);

    }
}
