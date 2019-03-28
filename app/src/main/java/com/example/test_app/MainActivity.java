package com.example.test_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;

    FirebaseAuth xyz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        sp=getSharedPreferences("com.example.test_app", MODE_PRIVATE);
        SharedPreferences.Editor ed= sp.edit();
        ed.putString("user", "kishansinghverma");
        ed.apply();
        */

    }
    public  void run(View v)
    {
        /*
        Intent sms= new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:"+num));
        sms.putExtra("sms_body", "Hello rajat");
        startActivity(sms);


        Intent call= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+num));
        startActivity(call);



        Intent mail=new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:kishan@gmail.com"));
        mail.putExtra(Intent.EXTRA_SUBJECT, "Hello");
        mail.putExtra(Intent.EXTRA_TEXT, "hi there");
        startActivity(mail);




        Intent web=new Intent(Intent.ACTION_VIEW, Uri.parse("http:google.com"));
        startActivity(web);


        String str=sp.getString("user", "null");

        ((TextView)findViewById(R.id.textView)).setText(str);

        */
    }
}
