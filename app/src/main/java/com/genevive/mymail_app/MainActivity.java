package com.genevive.mymail_app;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView mytext;
    EditText myedit;
    Button   mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(getResources().getColor(R.color.back));
        linearLayout.setGravity(Gravity.CENTER);


        mytext = new TextView(this);


        myedit = new EditText(this);
        myedit.setHint("Enter email");

        mybutton = new Button(this);
        mybutton.setText("Login");




        linearLayout.addView(myedit);
        linearLayout.addView(mytext);
        linearLayout.addView(mybutton);


        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enter_email  = myedit.getText().toString();

                //creating logic for validating email
                if (enter_email.contains("@")){
                    mytext.setText("VALID");
                } else if (enter_email.isEmpty()){
                    myedit.setError("Type in email");
                }else {
                   mytext.setText("INVALID");

                }
            }
        });

        setContentView(linearLayout);


    }
}
