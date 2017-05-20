package nthu.finbot;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class ReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
    }

    public void pressBarButton(View v) {
        finish();
    }

    public void pressGoReservationButton(View v) {
        System.out.println("Press GoReservation");

        DatePicker dp = (DatePicker) findViewById(R.id.ReservationDP);
        int y=dp.getYear(), m=dp.getMonth(), d=dp.getDayOfMonth();

        setContentView(R.layout.activity_reservation_cont);

        TextView tv = (TextView) findViewById(R.id.DateTV);
        tv.setText("  "+y+" / "+(m+1)+" / "+d+"  ");
    }

    public void pressTimeButton(View v) {
        System.out.println(getResources().getResourceEntryName(v.getId()));

        int cd = ((ColorDrawable) v.getBackground()).getColor();
        if(cd == -5592406) { // gray

        } else if (cd == -6697984) { // green
            v.setBackgroundColor(-48060);

        } else { // red
            v.setBackgroundColor(-6697984);

        }
    }

    public void pressEndReservationButton(View v) {
        Toast.makeText(v.getContext(), "感謝您的預約", Toast.LENGTH_LONG).show();

        finish();
    }
}
