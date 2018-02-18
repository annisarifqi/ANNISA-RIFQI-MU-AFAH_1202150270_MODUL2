package id.web.annisa.annisarifqimuafah_1202150270_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    //Menuju aktivitas Daftar Menu
    public void showDaftarMenu(View view) {
        Intent intent = new Intent(this, DaftarMenu.class);
        startActivity(intent);
    }
}
