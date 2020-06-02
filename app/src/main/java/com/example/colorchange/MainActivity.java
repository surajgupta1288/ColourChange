package com.example.colorchange;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
            private int alpha=250;
            private int redColor = 0;
            private int greencolor=0;
            private int bluecolor=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout backgroundHolder = findViewById(R.id.screen_back);
        final SeekBar redColorSlider = findViewById(R.id.color_slider_red);
        final SeekBar blueColorSlider = findViewById(R.id.color_slider_blue);
        final SeekBar greenColorSlider = findViewById(R.id.color_slider_green);
        Button restcolorButton =findViewById(R.id.btn_reset_color);

        backgroundHolder.setBackgroundColor(Color.argb(alpha,redColor,greencolor,bluecolor));

        redColorSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                redColor =(int)Math.round(progress*2.55);
                backgroundHolder.setBackgroundColor(Color.argb(alpha,redColor,greencolor,bluecolor));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        greenColorSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                greencolor =(int)Math.round(progress*2.55);
                backgroundHolder.setBackgroundColor(Color.argb(alpha,redColor,greencolor,bluecolor));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        blueColorSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                bluecolor =(int)Math.round(progress*2.55);
                backgroundHolder.setBackgroundColor(Color.argb(alpha,redColor,greencolor,bluecolor));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        restcolorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redColor = 0;
                greencolor = 0;
                bluecolor = 0;

                redColorSlider.setProgress(0);
                blueColorSlider.setProgress(0);
                greenColorSlider.setProgress(0);

                backgroundHolder.setBackgroundColor(Color.argb(alpha,redColor,greencolor,bluecolor));
            }
        });














    }
}
