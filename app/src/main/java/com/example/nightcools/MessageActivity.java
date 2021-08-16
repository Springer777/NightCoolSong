package com.example.nightcools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public void sendMessage (View v) {
        String message = ((EditText)(findViewById(R.id.editText_Message))).getText().toString();
        TextView textView = (TextView) findViewById(R.id.editText_Number);
        String smsNumber = String.format("smsto: %s", textView.getText().toString());
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
        smsIntent.setData(Uri.parse(smsNumber));
        smsIntent.putExtra("sms_body", message);
        startActivity(smsIntent);
    }
}