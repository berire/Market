package com.example.user.market;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;

import static com.google.android.gms.plus.PlusOneDummyView.TAG;

/**
 * Created by user on 10.7.2017.
 */

public class Menu extends Activity {
    Button A,B;
    private FirebaseAuth mAuth;
    static String LoggedIn_User_Email;
    FirebaseDatabase database;
    DatabaseReference myRef;
    String uid;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent intent = this.getIntent();
        A= (Button) findViewById(R.id.button2);

        B= (Button) findViewById(R.id.button3);

    }

}