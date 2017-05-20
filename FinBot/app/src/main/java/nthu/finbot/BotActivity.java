package nthu.finbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class BotActivity extends AppCompatActivity {

    private int riskV = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);

        SeekBar sb = (SeekBar) findViewById(R.id.RiskSB);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                final String list[] = {"保守型", "穩健型", "成長型", "積極型"};
                riskV = progress;

                ((TextView) findViewById(R.id.RiskTV)).setText(list[progress]);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        sb = (SeekBar) findViewById(R.id.YearSB);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                final String list[] = {"3年以下", "3~7年", "7年以上"};

                ((TextView) findViewById(R.id.YearTV)).setText(list[progress]);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        sb = (SeekBar) findViewById(R.id.AgeSB);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ((TextView) findViewById(R.id.AgeTV)).setText((20+progress)+"歲");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        sb = (SeekBar) findViewById(R.id.TypeSB);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                final String list[] = {"購屋", "購車", "退休", "教育", "一般"};
                ((TextView) findViewById(R.id.TypeTV)).setText(list[progress]);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    public void pressBarButton(View v) {
        finish();
    }

    public void pressRecommandButton(View v) {
        setContentView(R.layout.activity_bot_cont);

        ImageView iv = (ImageView) findViewById(R.id.RiskIV);
        if(riskV == 0) {
            iv.setImageResource(R.drawable.bot_risk0);

        } else if (riskV == 1) {
            iv.setImageResource(R.drawable.bot_risk1);

        } else if (riskV == 2) {
            iv.setImageResource(R.drawable.bot_risk2);

        } else {
            iv.setImageResource(R.drawable.bot_risk3);

        }
    }

}
