package giancarlo.estacio.com.pnr_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivia3);
    }

    public void display2(View v){
        Intent i = new Intent(this,Screen2.class);
        startActivity(i);
    }
    public void Fares(View v) {
        Intent i = new Intent(this, Fares.class);
        startActivity(i);
    }
    public void trivia2(View v){
        Intent i= new Intent(this, trivia2.class);
        startActivity(i);
    }
    public void trivia4(View v){
        Intent i= new Intent(this, trivia4.class);
        startActivity(i);
    }
}
