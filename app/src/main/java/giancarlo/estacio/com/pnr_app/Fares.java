package giancarlo.estacio.com.pnr_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fares extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fares);
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
    public void displayAlabang(View v){
        Intent i = new Intent(this, Alabang.class);
        startActivity(i);
    }
    public void displayBicutan(View v){
        Intent i = new Intent(this, Bicutan.class);
        startActivity(i);
    }
    public void displayBinan(View v){
        Intent i = new Intent(this, Binan.class);
        startActivity(i);
    }
    public void displayBlumentritt(View v){
        Intent i = new Intent(this, Blumentritt.class);
        startActivity(i);
    }
    public void displayBuendia(View v){
        Intent i = new Intent(this, Buendia.class);
        startActivity(i);
    }
    public void displayCabuyao(View v){
        Intent i = new Intent(this, Cabuyao.class);
        startActivity(i);
    }
    public void displayCalamba(View v){
        Intent i = new Intent(this, Calamba.class);
        startActivity(i);
    }
    public void displayEdsa(View v){
        Intent i = new Intent(this, Edsa.class);
        startActivity(i);
    }
    public void displayEspana(View v){
        Intent i = new Intent(this, Espana.class);
        startActivity(i);
    }
    public void displayFoodTerm(View v){
        Intent i = new Intent(this, FoodT.class);
        startActivity(i);
    }
    public void displayGolden(View v){
        Intent i = new Intent(this, Golden.class);
        startActivity(i);
    }
    public void displayLaon(View v){
        Intent i = new Intent(this, Laon.class);
        startActivity(i);
    }
    public void displayMamatid(View v){
        Intent i = new Intent(this, Mamatid.class);
        startActivity(i);
    }
    public void displayManila(View v){
        Intent i = new Intent(this, Manila.class);
        startActivity(i);
    }
    public void displayMuntinlupa(View v){
        Intent i = new Intent(this, Muntinlupa.class);
        startActivity(i);
    }
    public void displayNichols(View v) {
        Intent i = new Intent(this, Nichols.class);
        startActivity(i);
    }
    public void displayPacita(View v) {
        Intent i = new Intent(this, Pacita.class);
        startActivity(i);
    }
    public void displayPaco(View v) {
        Intent i = new Intent(this, Paco.class);
        startActivity(i);
    }
    public void displayPandacan(View v) {
        Intent i = new Intent(this, Pandacan.class);
        startActivity(i);
    }
    public void displayPasay(View v) {
        Intent i = new Intent(this, PasayRoad.class);
        startActivity(i);
    }
    public void displaySanAndres(View v) {
        Intent i = new Intent(this, SanAndres.class);
        startActivity(i);
    }
    public void displaySanPedro(View v) {
        Intent i = new Intent(this, SanPedro.class);
        startActivity(i);
    }
    public void displayStaRosa(View v) {
        Intent i = new Intent(this, SantaRosa.class);
        startActivity(i);
    }
    public void displayStaMesa(View v) {
        Intent i = new Intent(this, StaMesa.class);
        startActivity(i);
    }
    public void displaySucat(View v) {
        Intent i = new Intent(this, Sucat.class);
        startActivity(i);
    }
    public void displayVitoCruz(View v) {
        Intent i = new Intent(this, VitoCruz.class);
        startActivity(i);
    }
}
