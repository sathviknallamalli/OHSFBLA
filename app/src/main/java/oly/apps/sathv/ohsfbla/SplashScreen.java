package oly.apps.sathv.ohsfbla;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        pb = findViewById(R.id.pb);
        pb.setVisibility(View.VISIBLE);

        Thread thread = new Thread() {

            @Override
            public void run() {
                try {
                    pb.setVisibility(View.VISIBLE);
                    //1.5 seconds
                    sleep(2500);
                    //then start the next activity
                    Intent intent = new Intent(getApplicationContext(), LockScreen.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
