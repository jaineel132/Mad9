package com.example.q9;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    GridView g;
    String[] num = new String[15];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        for(int i=0;i<num.length;i++)
        {
            num[i] = String.valueOf(i+1);
        }

        g=findViewById(R.id.gv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,num);
        g.setAdapter(adapter);
        }
    }
