package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class review extends AppCompatActivity {
    TextView tvfeedback;
    RatingBar rbStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        tvfeedback =findViewById(R.id.tvfeedback);
        rbStar =findViewById(R.id.rbStar);

        rbStar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating==0)
                {
                    tvfeedback.setText("Vary Dissatisfied");
                }
                else if(rating==1)
                {
                    tvfeedback.setText("Dissatisfied");
                }
                else if (rating==2 ||rating==3)
                {
                    tvfeedback.setText("Ok");
                }
                else if(rating==4)
                {
                    tvfeedback.setText("Satisfied");
                }
                else
                    {
                        tvfeedback.setText("Very Satisfied");
                }
            }
        });
    }
}