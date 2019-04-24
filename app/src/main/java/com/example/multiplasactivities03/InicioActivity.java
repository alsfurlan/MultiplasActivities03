package com.example.multiplasactivities03;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        String activity = getIntent().getStringExtra("activity");
        if(!activity.isEmpty()) {
            TextView activityTextView = findViewById(R.id.activityTextView);
            activityTextView.setText(activity);
            activityTextView.setVisibility(View.VISIBLE);
        }
    }

    public void voltar(View view) {
        Intent intent = getIntent();
        intent.putExtra("activity", "InicioActivity");
        setResult(RESULT_OK, intent);

        finish();
    }
}