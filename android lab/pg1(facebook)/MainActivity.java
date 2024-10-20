package com.example.facebook;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        username = (EditText) findViewById(R.id.uid);
        password = (EditText) findViewById(R.id.pw);
        button1 = (Button) findViewById(R.id.bt1);

        button1.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        if(view.getId()==R.id.bt1){
            String a = username.getText().toString();
            String b = password.getText().toString();
            if(a.equals("IHZAAN") && b.equals("12345")){
                Toast.makeText(this, "Login succesful", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
            }

        }
    }
}