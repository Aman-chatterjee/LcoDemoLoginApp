package lco.exampledemo.com.lcologinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView message = findViewById(R.id.message);
        message.setText(getIntent().getStringExtra("MESSAGE"));

    }
}
