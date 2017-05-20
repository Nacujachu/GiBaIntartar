package nthu.finbot;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.util.Log;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_menu);


    }

    private PopupWindow ppWindow;
    public void pressBarButton(View v) {
        System.out.println("Press Bar");

        getPopupWindow();
        ppWindow.showAtLocation(v, Gravity.LEFT, 0, 0);
    }
    private void getPopupWindow() {
        if(ppWindow == null) {
            final View ppWindowView = getLayoutInflater().inflate(R.layout.left_pop_up_window, null, false);
            ppWindow = new PopupWindow(ppWindowView, 250, ViewGroup.LayoutParams.MATCH_PARENT, true);
            ppWindow.setAnimationStyle(R.style.AnimationFade);
        } else {
            ppWindow.dismiss();
        }
    }

    public void pressOpenBotButton(View v) {

        System.out.println("Press OpenBot");
        startActivity(new Intent(this, BotActivity.class));
    }

    public void pressOpenPropertyButton(View v) {
        System.out.println("Press OpenProperty");
        startActivity(new Intent(this, PropertyActivity.class));
    }

    public void pressOpenQAButton(View v) {
        System.out.println("Press OpenQA");

        startActivity(new Intent(this, QAActivity.class));
    }

    public void pressOpenReservationButton(View v) {
        System.out.println("Press OpenReservation");
        startActivity(new Intent(this, ReservationActivity.class));
    }

    public void pressOpenNewsButton(View v) {
        AlertDialog.Builder alert = new AlertDialog.Builder(MainMenuActivity.this);
        alert.setView(LayoutInflater.from(MainMenuActivity.this).inflate(R.layout.popup_news, null));

        alert.show();
    }

}
