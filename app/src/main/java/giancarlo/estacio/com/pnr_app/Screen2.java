package giancarlo.estacio.com.pnr_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trivias);
    }

    public void home(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void display2(View v) {
        Intent i = new Intent(this, Screen2.class);
        startActivity(i);
    }

    public void trivia2(View v) {
        Intent i = new Intent(this, trivia2.class);
        startActivity(i);
    }
    public void Fares(View v) {
        Intent i = new Intent(this, Fares.class);
        startActivity(i);

    }

}
