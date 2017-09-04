package com.rosius.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Always declare a TAG constant in you class
    private static final String TAG = MainActivity.class.getSimpleName();

    public Button login;
    private Button register;
    private EditText fullNames,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login =(Button)findViewById(R.id.login);
        register =(Button)findViewById(R.id.register);
        fullNames = (EditText)findViewById(R.id.full_names);
        password =(EditText)findViewById(R.id.password);



        //onclick listener for login button.
        //What happens when the login button is clicked

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //get full names and password
                String fullnames = fullNames.getText().toString();
                String pass = password.getText().toString();
                Log.d(TAG, "onClick: "+fullnames + pass);
            }
        });

        //what happens when the register button is clicked
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                //open register activity.Don't forget to declare activity in Manifest 
                
                Intent intent = new Intent(MainActivity.this,Register.class);
                startActivity(intent);
                Log.d(TAG, "onClick: Register Button clicked");
            }
        });
        
    }


}
