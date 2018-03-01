//maths problems/pictures from Presh Talwalkar https://mindyourdecisions.com/blog/
package com.example.android.myquiz;
import static android.widget.Toast.LENGTH_LONG;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        //track checkboxes checked. somehow it lets radiogroups have checkboxes?
        int numberOfCheckboxesChecked = 0;


        EditText userName = findViewById(R.id.name_field);
        String name = userName.getText().toString();

        CheckBox q6a1checkbox = findViewById(R.id.q6_a1);
        CheckBox q6a2checkbox = findViewById(R.id.q6_a2);
        CheckBox q6a3checkbox = findViewById(R.id.q6_a3);
        CheckBox q6a4checkbox = findViewById(R.id.q6_a4);
        CheckBox q6a5checkbox = findViewById(R.id.q6_a5);

        boolean q6a1 = q6a1checkbox.isChecked();
        boolean q6a2 = q6a2checkbox.isChecked();
        boolean q6a3 = q6a3checkbox.isChecked();
        boolean q6a4 = q6a4checkbox.isChecked();
        boolean q6a5 = q6a5checkbox.isChecked();


        RadioGroup radioGroup1 = findViewById(R.id.question1);
        int question1Answer = radioGroup1.getCheckedRadioButtonId();

        RadioGroup radioGroup2 = findViewById(R.id.question2);
        int question2Answer = radioGroup2.getCheckedRadioButtonId();

        RadioGroup radioGroup3 = findViewById(R.id.question3);
        int question3Answer = radioGroup3.getCheckedRadioButtonId();

        RadioGroup radioGroup4 = findViewById(R.id.question4);
        int question4Answer = radioGroup4.getCheckedRadioButtonId();

        RadioGroup radioGroup5 = findViewById(R.id.question5);
        int question5Answer = radioGroup5.getCheckedRadioButtonId();

     //   CheckBox radioGroup6 = findViewById(R.id.question6);
        int question6Answer = q6checkbox(q6a1,q6a2,q6a3,q6a4,q6a5);

        EditText question7 = findViewById(R.id.question7);
        int question7Answer = Integer.parseInt(question7.getText().toString());

        RadioGroup radioGroup8 = findViewById(R.id.question8);
        int question8Answer = radioGroup8.getCheckedRadioButtonId();

        RadioGroup radioGroup9 = findViewById(R.id.question9);
        int question9Answer = radioGroup9.getCheckedRadioButtonId();

        RadioGroup radioGroup10 = findViewById(R.id.question10);
        int question10Answer = radioGroup10.getCheckedRadioButtonId();

        int score = calculateScore(question1Answer, question2Answer, question3Answer, question4Answer, question5Answer, question6Answer, question7Answer, question8Answer, question9Answer, question10Answer);

        Toast message = Toast.makeText(getApplicationContext(), "Thanks for playing " + name + ". Your score is " + score + "/10", LENGTH_LONG);
        message.show();
    }

    private int q6checkbox(boolean q6a1, boolean q6a2, boolean q6a3, boolean q6a4, boolean q6a5) {


        if (q6a1 && q6a4==true) {
            return 1;
//no matter what i write here the user can select all options and get a pont as correct answer as long as answer 1 and 4 are selected.....
            //tried adding a counter to limit amount of checkboxes that cna be pressed but it broke everything
             }

        return 0;
    }

    private int calculateScore(int answer1, int answer2, int answer3, int answer4, int answer5, int answer6, int answer7, int answer8, int answer9, int answer10) {

        int score = 0;


        if (answer1 == R.id.q1_a3) {
            score +=1;
        }

        if (answer2 == R.id.q2_a4) {
            score +=1;
        }

        if (answer3 == R.id.q3_a2) {
            score +=1;        }

        if (answer4 == R.id.q4_a5) {
            score +=1;        }

        if (answer5 == R.id.q5_a1) {
            score +=1;        }

        if (answer6 ==1) {
            score +=1;        }


        if (answer7 == 16) {
            score +=1;        }

        if (answer8 == R.id.q8_a3) {
            score +=1;        }

        if (answer9 == R.id.q9_a1) {
            score +=1;        }

        if (answer10 == R.id.q10_a4) {
            score +=1;        }

        return score;
    }

}