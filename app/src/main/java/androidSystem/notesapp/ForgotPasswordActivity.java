package androidSystem.notesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText mforgotpasswordemail;
    private RelativeLayout mforgotpasswordbutton;
    private TextView mforgotpagenext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_forgot_password);

        mforgotpasswordemail = findViewById(R.id.forgotpasswordemail);
        mforgotpasswordbutton = findViewById(R.id.forgotpasswordbutton);
        mforgotpagenext = findViewById(R.id.forgotpagenext);


        mforgotpagenext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPasswordActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        mforgotpasswordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = mforgotpasswordemail.getText().toString().trim();
                if(mail.isEmpty()){
                    Toast.makeText(ForgotPasswordActivity.this, "Please enter email", Toast.LENGTH_SHORT).show();
                }else{
                    //Send password to recover email

                }

            }
        });
    }
}