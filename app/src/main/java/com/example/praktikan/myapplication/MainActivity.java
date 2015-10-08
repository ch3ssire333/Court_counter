package com.example.praktikan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tvScoreTeamA;
    private TextView tvScoreTeamB;
    private Button btn3a;
    private Button btn2a;
    private Button btn1a;
    private Button btn3b;
    private Button btn2b;
    private Button btn1b;
    private Button btnReset;
    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
    tvScoreTeamA = (TextView) findViewById(R.id.tv_skora);
    tvScoreTeamB = (TextView) findViewById(R.id.tv_skorb);
        btn3a = (Button) findViewById(R.id.btn_3a);
        btn2a = (Button) findViewById(R.id.btn_2a);
        btn1a = (Button) findViewById(R.id.btn_1a);
        btn3b = (Button) findViewById(R.id.btn_3b);
        btn2b = (Button) findViewById(R.id.btn_2b);
        btn1b = (Button) findViewById(R.id.btn_1b);
        btnReset = (Button) findViewById(R.id.btn_reset);
        scoreTeamA = scoreTeamB = 0;

        btn3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamA(3);
            }

            private void addPointToTeamA(int point) {
                scoreTeamA += point;
            }
        });

        btn2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamA(2);
            }
            private void addPointToTeamA(int point) {
                scoreTeamA += point;
            }
        });
        btn1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamA(1);
            }
            private void addPointToTeamA(int point) {
                scoreTeamA += point;
            }
        });

        btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamB(3);
            }
            private void addPointToTeamB (int point) {
                scoreTeamB += point;
            }
        });
        btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamB(2);
            }
            private void addPointToTeamB (int point) {
                scoreTeamB += point;
            }

            });
        btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPointToTeamB(1);

            }
            private void addPointToTeamB (int point) {
                scoreTeamB += point;
            }
            });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamB = 0;
                tvScoreTeamA.setText(scoreTeamA + "");
                tvScoreTeamB.setText(scoreTeamB + "");
            }
        });
    }


}

