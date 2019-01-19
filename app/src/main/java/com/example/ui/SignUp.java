package com.example.ui;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ekalips.fancybuttonproj.FancyButton;


public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sign_up);


        FancyButton button1 =  findViewById(R.id.sign_in);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view instanceof  FancyButton)
                {
                    if (((FancyButton)view).isExpanded())
                        ((FancyButton)view).collapse();
                    else
                        ((FancyButton)view).expand();
                }

            }
        };
        button1.setOnClickListener(listener);
    }
}
