package giancarlo.estacio.com.pnr_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class trivia4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia4);
    }

    public void display2(View v){
        Intent i = new Intent(this,Screen2.class);
        startActivity(i);
    }
    public void Fares(View v) {
        Intent i = new Intent(this, Fares.class);
        startActivity(i);
    }
    public void trivia3(View v){
        Intent i= new Intent(this, Screen3.class);
        startActivity(i);
    }
    public void trivia5(View v){
        Intent i= new Intent(this, trivia5.class);
        startActivity(i);
    }

}
