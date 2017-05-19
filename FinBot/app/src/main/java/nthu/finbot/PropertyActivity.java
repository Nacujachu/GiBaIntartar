package nthu.finbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PropertyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property);
    }

    public void pressBarButton(View v) {
        finish();
    }

    public void pressPlanAButton(View v) {
        ImageView iv = (ImageView) findViewById(R.id.PlanChartIV);
        iv.setImageResource(R.drawable.property_plan_a);
    }

    public void pressPlanBButton(View v) {
        ImageView iv = (ImageView) findViewById(R.id.PlanChartIV);
        iv.setImageResource(R.drawable.property_plan_b);
    }

    public void pressPlanCButton(View v) {
        ImageView iv = (ImageView) findViewById(R.id.PlanChartIV);
        iv.setImageResource(R.drawable.property_plan_c);
    }

    public void pressPlanDButton(View v) {
        ImageView iv = (ImageView) findViewById(R.id.PlanChartIV);
        iv.setImageResource(R.drawable.property_plan_d);
    }
}
