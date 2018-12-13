package giancarlo.estacio.com.pnr_app;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class VitoCruz extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText Distance, Fare, FareO;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vitocruz);

        Distance = findViewById(R.id.eDistance);
        Fare = findViewById(R.id.eFare);
        FareO = findViewById(R.id.eFareO);
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinnerVitoCruz);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Tutuban");
        categories.add("Blumentritt");
        categories.add("Laon Laan");
        categories.add("Espana");
        categories.add("Sta. Mesa");
        categories.add("Pandacan");
        categories.add("Paco");
        categories.add("San Andres");
        categories.add("Buendia");
        categories.add("Pasay Road");
        categories.add("Edsa");
        categories.add("Nichols");
        categories.add("Food Terminal");
        categories.add("Bicutan");
        categories.add("Sucat");
        categories.add("Alabang");
        categories.add("MuntinLupa");
        categories.add("San Pedro");
        categories.add("Pacita Main Gate");
        categories.add("Golden City 1");
        categories.add("Binan");
        categories.add("Santa Rosa");
        categories.add("Cabuyao");
        categories.add("Mamatid");
        categories.add("Calamba");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }
    public void Fares(View v) {
        Intent i = new Intent(this, Fares.class);
        startActivity(i);
    }
    public void MapVitoCruz(View v){
               Intent i=null, chooser=null;
            if(v.getId()== R.id.VitoCruzMap){
                 i = new Intent(Intent.ACTION_VIEW);
                 i.setData(Uri.parse("geo:14.567364, 121.002775"));
                chooser = Intent.createChooser(i, "Select your Map app");
               startActivity(i);
            }

          }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        switch (item){
            case "Blumentritt":
                String dMB = "02.73 KM";
                Distance.setText(dMB);
                String FareAC_dMB = "15.00 PHP";
                Fare.setText(FareAC_dMB);
                String FareOrd_dMB = "12.00 PHP";
                FareO.setText(FareOrd_dMB);
                break;
            case "Laon Laan":
                String dMLL = "03.07 KM";
                Distance.setText(dMLL);
                String FareAC_dMLL = "15.00 PHP";
                Fare.setText(FareAC_dMLL);
                String FareOrd_dMLL = "12.00 PHP";
                FareO.setText(FareOrd_dMLL);
                break;
            case "Espana":
                String dME = "03.82 KM";
                Distance.setText(dME);
                String FareAC_dME = "15.00 PHP";
                Fare.setText(FareAC_dME);
                String FareOrd_dME = "12.00 PHP";
                FareO.setText(FareOrd_dME);
                break;
            case "Sta. Mesa":
                String dMSM = "06.49 KM";
                Distance.setText(dMSM);
                String FareAC_dMSM = "15.00 PHP";
                Fare.setText(FareAC_dMSM);
                String FareOrd_dMSM = "12.00 PHP";
                FareO.setText(FareOrd_dMSM);
                break;
            case "Pandacan":
                String dMPan = "07.79 KM";
                Distance.setText(dMPan);
                String FareAC_dMPan = "15.00 PHP";
                Fare.setText(FareAC_dMPan);
                String FareOrd_dMPan = "12.00 PHP";
                FareO.setText(FareOrd_dMPan);
                break;
            case "Paco":
                String dMPac = "09.40 KM";
                Distance.setText(dMPac);
                String FareAC_dMPac = "15.00 PHP";
                Fare.setText(FareAC_dMPac);
                String FareOrd_dMPac = "12.00 PHP";
                FareO.setText(FareOrd_dMPac);
                break;
            case "San Andres":
                String dMSA = "10.30 KM";
                Distance.setText(dMSA);
                String FareAC_dMSA = "15.00 PHP";
                Fare.setText(FareAC_dMSA);
                String FareOrd_dMSA = "12.00 PHP";
                FareO.setText(FareOrd_dMSA);
                break;
            case "Tutuban":
                String dMVC = "11.06 KM";
                Distance.setText(dMVC);
                String FareAC_dMVC = "15.00 PHP";
                Fare.setText(FareAC_dMVC);
                String FareOrd_dMVC = "12.00 PHP";
                FareO.setText(FareOrd_dMVC);
                break;
            case "Buendia":
                String dMBuen = "12.12 KM";
                Distance.setText(dMBuen);
                String FareAC_dMBuen = "15.00 PHP";
                Fare.setText(FareAC_dMBuen);
                String FareOrd_dMBuen = "12.00 PHP";
                FareO.setText(FareOrd_dMBuen);
                break;
            case "Pasay Road":
                String dMPR = "13.25 KM";
                Distance.setText(dMPR);
                String FareAC_dMPR = "15.00 PHP";
                Fare.setText(FareAC_dMPR);
                String FareOrd_dMPR = "12.00 PHP";
                FareO.setText(FareOrd_dMPR);
                break;
            case "Edsa":
                String dMEd = "14.35 KM";
                Distance.setText(dMEd);
                String FareAC_dMEd = "15.00 PHP";
                Fare.setText(FareAC_dMEd);
                String FareOrd_dMEd = "12.00 PHP";
                FareO.setText(FareOrd_dMEd);
                break;
            case "Nichols":
                String dMN = "16.00 KM";
                Distance.setText(dMN);
                String FareAC_dMN = "20.00 PHP";
                Fare.setText(FareAC_dMN);
                String FareOrd_dMN = "16.00 PHP";
                FareO.setText(FareOrd_dMN);
                break;
            case "Food Terminal":
                String dMFT = "18.60 KM";
                Distance.setText(dMFT);
                String FareAC_dMFT = "20.00 PHP";
                Fare.setText(FareAC_dMFT);
                String FareOrd_dMFT = "16.00 PHP";
                FareO.setText(FareOrd_dMFT);
                break;
            case "Bicutan":
                String dMBic = "20.62 KM";
                Distance.setText(dMBic);
                String FareAC_dMBic = "20.00 PHP";
                Fare.setText(FareAC_dMBic);
                String FareOrd_dMBic = "16.00 PHP";
                FareO.setText(FareOrd_dMBic);
                break;
            case "Sucat":
                String dMSuc = "25.01 KM";
                Distance.setText(dMSuc);
                String FareAC_dMSuc = "25.00 PHP";
                Fare.setText(FareAC_dMSuc);
                String FareOrd_dMSuc = "20.00 PHP";
                FareO.setText(FareOrd_dMSuc);
                break;
            case "Alabang":
                String dMAla = "28.09 KM";
                Distance.setText(dMAla);
                String FareAC_dMAla = "30.00 PHP";
                Fare.setText(FareAC_dMAla);
                String FareOrd_dMAla = "24.00 PHP";
                FareO.setText(FareOrd_dMAla);
                break;
            case "MuntinLupa":
                String dMMun = "32.10 KM";
                Distance.setText(dMMun);
                String FareAC_dMMun = "35.00 PHP";
                Fare.setText(FareAC_dMMun);
                String FareOrd_dMMun = "28.00 PHP";
                FareO.setText(FareOrd_dMMun);
                break;
            case "San Pedro":
                String dSP = "35.56KM";
                Distance.setText(dSP);
                String FareAC_dSP = "40.00 PHP";
                Fare.setText(FareAC_dSP);
                String FareOrd_dSP = "32.00 PHP";
                FareO.setText(FareOrd_dSP);
                break;
            case "Pacita Main Gate":
                String dMPMG = "37.55 KM";
                Distance.setText(dMPMG);
                String FareAC_dMPMG = "40.00 PHP";
                Fare.setText(FareAC_dMPMG);
                String FareOrd_dMPMG = "32.00 PHP";
                FareO.setText(FareOrd_dMPMG);
                break;
            case "Golden City 1":
                String dMGC1 = "38.72 KM";
                Distance.setText(dMGC1);
                String FareAC_dMGC1 = "45.00 PHP";
                Fare.setText(FareAC_dMGC1);
                String FareOrd_dMGC1 = "36.00 PHP";
                FareO.setText(FareOrd_dMGC1);
                break;
            case "Binan":
                String dMBin = "39.76 KM";
                Distance.setText(dMBin);
                String FareAC_dMBin = "45.00 PHP";
                Fare.setText(FareAC_dMBin);
                String FareOrd_dMBin = "36.00 PHP";
                FareO.setText(FareOrd_dMBin);
                break;
            case "Santa Rosa":
                String dMSR = "43.76 KM";
                Distance.setText(dMSR);
                String FareAC_dMSR = "45.00 PHP";
                Fare.setText(FareAC_dMSR);
                String FareOrd_dMSR = "36.00 PHP";
                FareO.setText(FareOrd_dMSR);
                break;
            case "Cabuyao":
                String dMCab = "47.42 KM";
                Distance.setText(dMCab);
                String FareAC_dMCab = "50.00 PHP";
                Fare.setText(FareAC_dMCab);
                String FareOrd_dMCab = "40.00 PHP";
                FareO.setText(FareOrd_dMCab);
                break;
            case "Mamatid":
                String dMM = "52.95 KM";
                Distance.setText(dMM);
                String FareAC_dMM = "55.00 PHP";
                Fare.setText(FareAC_dMM);
                String FareOrd_dMM = "44.00 PHP";
                FareO.setText(FareOrd_dMM);
                break;
            case "Calamba":
                String dMCal = "56.13 KM";
                Distance.setText(dMCal);
                String FareAC_dMCal = "60.00 PHP";
                Fare.setText(FareAC_dMCal);
                String FareOrd_dMCal = "48.00 PHP";
                FareO.setText(FareOrd_dMCal);
                break;


            default:
                Toast.makeText(parent.getContext(), "ERROR", Toast.LENGTH_LONG).show();
                break;
        }

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}


