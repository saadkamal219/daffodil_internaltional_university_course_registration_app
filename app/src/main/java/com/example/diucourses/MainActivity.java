package com.example.diucourses;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView daffodil_text = findViewById(R.id.daffodil);
    private SpannableString spannableString = new SpannableString("Daffodil International University");

    private TextView result;

    private CheckBox course1, course2, course3, course4, course5, course6, course7, course8;

    private Button regButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        spannableString.setSpan(new ForegroundColorSpan(Color.BLUE),0,7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(new ForegroundColorSpan(Color.GREEN),9,21, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        spannableString.setSpan(new ForegroundColorSpan(Color.BLACK),23,32, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        daffodil_text.setText(spannableString);

        course1 = findViewById(R.id.course1);
        course2 = findViewById(R.id.course2);
        course3 = findViewById(R.id.course3);
        course4 = findViewById(R.id.course4);
        course5 = findViewById(R.id.course5);
        course6 = findViewById(R.id.course6);
        course7 = findViewById(R.id.course7);
        course8 = findViewById(R.id.course8);

        regButton = findViewById(R.id.registrationButton);

        result = findViewById(R.id.result);

        regButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                StringBuilder stringbuilder = new StringBuilder();

                if (course1.isChecked()) {
                    String value = course1.getText().toString();
                    stringbuilder.append("\n" + " " + value);
                }
                if (course2.isChecked()) {
                    String value = course2.getText().toString();
                    stringbuilder.append("\n" + " " + value);
                }
                if (course3.isChecked()) {
                    String value = course3.getText().toString();
                    stringbuilder.append("\n" + " " + value);
                }
                if (course4.isChecked()) {
                    String value = course4.getText().toString();
                    stringbuilder.append("\n" + " " + value);
                }
                if (course5.isChecked()) {
                    String value = course5.getText().toString();
                    stringbuilder.append("\n" + " " + value);
                }
                if (course6.isChecked()) {
                    String value = course6.getText().toString();
                    stringbuilder.append("\n" + " " + value);
                }
                if (course7.isChecked()) {
                    String value = course7.getText().toString();
                    stringbuilder.append("\n" + " " + value);
                }
                if (course8.isChecked()) {
                    String value = course8.getText().toString();
                    stringbuilder.append("\n" + " " + value);
                }

                result.setText(stringbuilder);

            }
        });

    }
}