package com.geektech.kurs2homework6jildiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText gMail = findViewById(R.id.edit_text);
        TextView log = findViewById(R.id.log);
        TextView tv = findViewById(R.id.text_view_3);
        EditText password = findViewById(R.id.edit_text_2);
        Button button = findViewById(R.id.big_button);


        button.setOnClickListener(view -> {
            if (!gMail.getText().toString().equals("Admin") && !gMail.getText().toString().equals("Admin")) {
                Toast.makeText(this, "Пароль не верный!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Вы успешно вошли!", Toast.LENGTH_SHORT).show();
                gMail.setVisibility(View.INVISIBLE);
                log.setVisibility(View.INVISIBLE);
                password.setVisibility(View.INVISIBLE);
                button.setVisibility(View.INVISIBLE);
                tv.setVisibility(View.INVISIBLE);

            }
        });

       gMail.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s,int start, int count, int after) {


           }
           @SuppressLint("MissingInflatedId")
           @Override
           public void onTextChanged(CharSequence s,int start, int count, int after) {

               if (gMail.getText().toString().isEmpty()){
                   button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
               }else {
                   button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
               }

//               if (!s.toString().isEmpty() || !password.getText().toString().isEmpty()){
//                   button.setBackgroundColor(Color.parseColor("#4C4A4C"));
//               }else {
//                   button.setBackgroundColor(Color.parseColor("#F65B00"));
//               }

           }

           @Override
           public void afterTextChanged(Editable s) {

           }
       });
       password.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if (password.getText().toString().isEmpty()){
                   button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));
               }else {
                   button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
               }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });


    }
}