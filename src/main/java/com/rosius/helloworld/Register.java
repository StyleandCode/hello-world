package com.rosius.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Ndimofor Ateh Rosius on 30-Aug-17.
 */

public class Register extends AppCompatActivity {

    private static final String TAG = Register.class.getSimpleName();

    private Button register,login;
    private EditText fullNames,password,location,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        login =(Button)findViewById(R.id.login);
        register =(Button)findViewById(R.id.login);
        fullNames = (EditText)findViewById(R.id.full_names);
        password =(EditText)findViewById(R.id.password);
        location =(EditText)findViewById(R.id.password);
        email =(EditText)findViewById(R.id.password);

      register.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String locate = location.getText().toString();
              Toast.makeText(Register.this,"register button was clicked",Toast.LENGTH_LONG).show();
              Log.e(TAG,locate);
          }
      });

    }


}
