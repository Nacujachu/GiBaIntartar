package nthu.finbot;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ui.DetectionActivity;
import ui.PersonVerificationActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getString(R.string.subscription_key).startsWith("Please")) {
            new AlertDialog.Builder(this)
                    .setTitle(getString(R.string.add_subscription_key_tip_title))
                    .setMessage(getString(R.string.add_subscription_key_tip))
                    .setCancelable(false)
                    .show();
        }


        setContentView(R.layout.activity_login);
    }

    public void pressLoginButton(View v) {
       // startActivity(new Intent(this, MainMenuActivity.class));
        Intent intent = new Intent(this, PersonVerificationActivity.class);
        startActivity(intent);

    }
}
