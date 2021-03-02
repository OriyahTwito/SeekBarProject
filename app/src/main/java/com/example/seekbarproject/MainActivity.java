package com.example.seekbarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewSB; // Set TextView
    private SeekBar seekBarSB; // Set SeekBar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // The design of MainActivity

        initUI();
        getTasks();
    }

    private void initUI() {
        // Id of TextView
        textViewSB = findViewById(R.id.textViewSB);
        // Id of SeekBar
        seekBarSB = findViewById(R.id.seekBarSB);
    }

    private void getTasks() {
        // Listen to changes of SeekBar
        seekBarSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewSB.setText(progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

}
