package lco.exampledemo.com.lcologinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Const
    static final String EMAIL = "user121@gmail.com";
    static final String PASSWORD = "12345678";

    private ImageView gButton;
    private ImageView fButton;
    private EditText email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView logo = findViewById(R.id.logo);
        gButton = findViewById(R.id.g_button);
        fButton = findViewById(R.id.f_button);
        email = findViewById(R.id.fieldEmail);
        password = findViewById(R.id.fieldPassword);
        password.setTransformationMethod(new PasswordTransformationMethod());

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        logo.startAnimation(animation);

    }


    public void goToSignup(View view){
        startActivity(new Intent(this,SignUpActivity.class));
    }

    public void login(View view){

        if((email.length() > 0 && email.getText().toString().toLowerCase().trim().equals(EMAIL)) && (password.length() > 0 &&password.getText().toString().trim().equals(PASSWORD))){
            Intent intent = new Intent(this,WelcomeActivity.class);
            intent.putExtra("MESSAGE","Welcome Back");
            startActivity(intent);
        }else {
            email.setError("Email or Password is Invalid");
        }

    }


    @Override
    protected void onStart() {
        super.onStart();
        gButton.animate().rotation(360).setDuration(500);
        fButton.animate().rotation(360).setDuration(500);
    }


    @Override
    protected void onResume() {
        super.onResume();

        gButton.animate().rotation(360).setDuration(500);
        fButton.animate().rotation(360).setDuration(500);
    }
}
