package com.example.sbscriptionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nameText;
    TextView emailText;
    Button buttonOk;
    Button buttonClear;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = (TextView) findViewById(R.id.nameText);
        emailText = (TextView) findViewById(R.id.emailText);
        buttonOk = (Button) findViewById(R.id.buttonOk);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        textView = (TextView) findViewById(R.id.textView4);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Подписка на рассылку успешно оформлена для пользователя <" + nameText.getText() + "> на электронный адрес <" + emailText.getText() + ">.");
            }

        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameText.setText("Имя");
                emailText.setText("введите e-mail");
                textView.setText("");

            }
        });


    }
}
