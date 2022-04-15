package com.example.mtglifecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mPlayerOneUp;
    private Button mPlayerOneDown;
    private TextView mPlayerOneLife;

    private Button mPlayerTwoUp;
    private Button mPlayerTwoDown;
    private TextView mPlayerTwoLife;

    private Button mPlayerThreeUp;
    private Button mPlayerThreeDown;
    private TextView mPlayerThreeLife;

    private Button mPlayerFourUp;
    private Button mPlayerFourDown;
    private TextView mPlayerFourLife;

    private Button mReset;

    private int plr1Heath;
    private int plr2Heath;
    private int plr3Heath;
    private int plr4Heath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plr1Heath = 40;
        plr2Heath = 40;
        plr3Heath = 40;
        plr4Heath = 40;

        mPlayerOneUp = (Button) findViewById(R.id.PlayerOneUp);
        mPlayerOneDown = (Button) findViewById(R.id.PlayerOneDown);
        mPlayerOneLife = (TextView) findViewById(R.id.PlayerOneLife);

        mPlayerTwoUp = (Button) findViewById(R.id.PlayerTwoUp);
        mPlayerTwoDown = (Button) findViewById(R.id.PlayerTwoDown);
        mPlayerTwoLife = (TextView) findViewById(R.id.PlayerTwoLife);

        mPlayerThreeUp = (Button) findViewById(R.id.PlayerThreeUp);
        mPlayerThreeDown = (Button) findViewById(R.id.PlayerThreeDown);
        mPlayerThreeLife = (TextView) findViewById(R.id.PlayerThreeLife);

        mPlayerFourUp = (Button) findViewById(R.id.PlayerFourUp);
        mPlayerFourDown = (Button) findViewById(R.id.PlayerFourDown);
        mPlayerFourLife = (TextView) findViewById(R.id.PlayerFourLife);

        mReset = (Button) findViewById(R.id.Reset);

        //Make Life set to 40 and have buttons change the value
        mPlayerOneUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                plr1Heath += 1;
                RefreshHealth();
            }
        });
        mPlayerOneDown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                plr1Heath -= 1;
                RefreshHealth();
            }
        });
        mPlayerTwoUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                plr2Heath += 1;
                RefreshHealth();
            }
        });
        mPlayerTwoDown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                plr2Heath -= 1;
                RefreshHealth();
            }
        });
        mPlayerThreeUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                plr3Heath += 1;
                RefreshHealth();
            }
        });
        mPlayerThreeDown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                plr3Heath -= 1;
                RefreshHealth();
            }
        });
        mPlayerFourUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                plr4Heath += 1;
                RefreshHealth();
            }
        });
        mPlayerFourDown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                plr4Heath -= 1;
                RefreshHealth();
            }
        });

        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Reset();
            }
        });

        RefreshHealth();
    }
    private void RefreshHealth(){
        mPlayerOneLife.setText(String.valueOf(plr1Heath));
        mPlayerTwoLife.setText(String.valueOf(plr2Heath));
        mPlayerThreeLife.setText(String.valueOf(plr3Heath));
        mPlayerFourLife.setText(String.valueOf(plr4Heath));
    };

    private void Reset(){
        plr1Heath = 40;
        plr2Heath = 40;
        plr3Heath = 40;
        plr4Heath = 40;
        RefreshHealth();
    }

}