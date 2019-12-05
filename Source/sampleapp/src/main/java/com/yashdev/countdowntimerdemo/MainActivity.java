package com.yashdev.countdowntimerdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.yashdev.countdowntimer.CountDownTimerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountDownTimerView countDownTimerView = findViewById(R.id.countDownTimerView);
        countDownTimerView.setTextSize(24);

        countDownTimerView.setOnTimerListener(new CountDownTimerView.TimerListener() {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

                Toast.makeText(getApplicationContext(),"Time up !",Toast.LENGTH_LONG).show();
            }
        });


        findViewById(R.id.customButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showTimerDialog();

            }
        });

    }

    void showTimerDialog(){

        int timeLeft = 7200000;

        AlertDialog.Builder timerDialog = new AlertDialog.Builder(this);
        timerDialog.setMessage("Timer Ends In");

        // Create CountDown TimerView
        CountDownTimerView timerView = new CountDownTimerView (this);
        timerView.setTime(timeLeft);
        timerView.setTextSize(24);
        timerView.setPadding(0,75,0,25);
        timerView.setGravity(Gravity.CENTER);
        timerView.startCountDown();

        timerDialog.setView(timerView);

        // add a button
        timerDialog.setPositiveButton("OK", null);

        // create and show the alert dialog
        AlertDialog dialog = timerDialog.create();
        dialog.show();

        TextView timerTitle = dialog.findViewById(android.R.id.message);

        if (timerTitle != null) {

            timerTitle.setTextSize(18);
            timerTitle.setGravity(Gravity.CENTER);
        }

    }
}
