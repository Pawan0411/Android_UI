package com.example.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

import com.ekalips.fancybuttonproj.FancyButton;

//import br.com.simplepass.loadingbutton.customViews.CircularProgressButton;

public class MainActivity extends AppCompatActivity {

    TextView T1;
 //  CircularProgressButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        T1 = findViewById(R.id.sign_up);

       //  btn = (CircularProgressButton) findViewById(R.id.sign_in);

        final FancyButton button1 =  findViewById(R.id.sign_in);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view instanceof  FancyButton) {
                    if (((FancyButton) view).isExpanded())
                        ((FancyButton) view).collapse();

                    Toast.makeText(MainActivity.this, "Handle here your Activity", Toast.LENGTH_SHORT).show();
                }
                    else{
                        ((FancyButton)view).expand();
                }

            }
        };
        button1.setOnClickListener(listener);

        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}
