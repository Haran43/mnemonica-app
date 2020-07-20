package com.example.mnemonica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GeneratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generator);

        List<String> tamariz = Arrays.asList("4♣", "2♥", "7♦", "3♣", "4♥", "6♦", "A♠", "5♥", "9♠", "2♠", "Q♥", "3♦", "Q♣",
                "8♥", "6♠", "5♠", "9♥", "K♣", "2♦", "J♥", "3♠", "8♠", "6♥", "10♣", "5♦", "K♦",
                "2♣", "3♥", "8♦", "5♣", "K♠", "J♦", "8♣", "10♠", "K♥", "J♣", "7♠", "10♥", "A♦",
                "4♠", "7♥", "4♦", "A♣", "9♣", "J♠", "Q♦", "7♣", "Q♠", "10♦", "6♣", "A♥", "9♦");
        final ArrayList<String> stack = new ArrayList<>();
        stack.addAll(tamariz);
        final TextView txtCard = findViewById(R.id.textCard);
        final TextView txtNum = findViewById(R.id.textNum);
        final Button button1 = (Button) findViewById(R.id.RandomButton);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random rand = new Random();
                Random rand2 = new Random();
                int randomNum1 = rand.nextInt(52);
                int randomNum2 = rand2.nextInt(52);
                txtCard.setText(stack.get(randomNum1));
                txtNum.setText(Integer.toString(randomNum2+1));
            }
        });

    }
}