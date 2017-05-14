package nthu.finbot;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void pressBarButton(View v) {
        System.out.println("Press Bar");
    }

    public void pressOpenBotButton(View v) {
        System.out.println("Press OpenBot");
    }

    public void pressOpenPropertyButton(View v) {
        System.out.println("Press OpenProperty");
    }

    public void pressOpenQAButton(View v) {
        System.out.println("Press OpenQA");
    }

    public void pressOpenReservationButton(View v) {
        System.out.println("Press OpenReservation");
    }

    public void pressOpenNewsButton(View v) {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainMenuActivity.this);
        alert.setView(LayoutInflater.from(MainMenuActivity.this).inflate(R.layout.popup_news, null));

        alert.show();
    }
}
