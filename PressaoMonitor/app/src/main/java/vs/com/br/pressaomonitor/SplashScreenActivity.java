package vs.com.br.pressaomonitor;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import vs.com.br.pressaomonitor.view.RegisterArterialPressureActivity;

public class SplashScreenActivity extends AppCompatActivity implements Runnable {
    private static final String Debug = " Debug: ";
    private static final String TAG = "Basic Network Demo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler action = new Handler();
        int DELAY = 5000;
        action.postDelayed(this, DELAY);

    }

    @Override
    public void run() {
        Log.d(Debug, "Method - run() ");
        //checkNetworkConnection();
        startApplication();
    }

    private void startApplication() {
        Log.d(Debug, "Method - startLogin() ");
        Intent intent = new Intent(this, RegisterArterialPressureActivity.class);
        intent.putExtra("message", "Splash");
        startActivity(intent);
        finish();
    }
}
