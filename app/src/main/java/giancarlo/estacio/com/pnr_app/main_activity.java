package giancarlo.estacio.com.pnr_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
    }
    public void display2(View v){
        Intent i = new Intent(this,Screen2.class);
        startActivity(i);
    }

    public void display(View v){
        Intent i = new Intent(this,aboutus.class);
        startActivity(i);
    }

}

