package y2019.aoc.bayan.bayanaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Button buttonSignIn;
    //componenets
   TextView tvEmail,tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      String password = getIntent().getStringExtra("password");

      String email = getIntent().getStringExtra("email");
      tvEmail = findViewById(R.id.tvEmail);
      tvPassword = findViewById(R.id.tvPassword);
      tvEmail.setText(email);
      tvPassword.setText(password);

    }
    @Override
    public void onClick(View v){
        if (v== buttonSignIn){
            Toast.makeText(  this, "Sign In", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this,"Sign Up", Toast.LENGTH_LONG).show();
        }

    }


}
