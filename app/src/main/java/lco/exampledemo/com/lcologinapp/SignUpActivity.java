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

public class SignUpActivity extends AppCompatActivity {

    private EditText email,password,confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ImageView logo = findViewById(R.id.logo);
        email = findViewById(R.id.fieldEmail);
        password = findViewById(R.id.fieldPassword);
        confirmPassword = findViewById(R.id.fieldConfirmPassword);
        password.setTransformationMethod(new PasswordTransformationMethod());
        confirmPassword.setTransformationMethod(new PasswordTransformationMethod());


        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        logo.startAnimation(animation);

    }


    public void signup(View view){

        if(email.length() > 0 && password.length() > 0 && password.getText().toString().trim().equals(confirmPassword.getText().toString().trim())){
            Intent intent = new Intent(this,WelcomeActivity.class);
            intent.putExtra("MESSAGE","Welcome to LCO");
            startActivity(intent);
        }else {
            email.setError("Email or Password is Invalid");
        }


    }


    public void goToLogin(View view){

        startActivity(new Intent(this,MainActivity.class));
    }


}
