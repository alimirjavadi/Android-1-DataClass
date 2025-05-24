package com.example.dataclass;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Info_Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        textView = findViewById(R.id.textView);

        contact c = getIntent().getParcelableExtra("my_contact");
        if (c != null) {
            textView.setText("Name: " + c.getName() + "\nFamily: " + c.getFamily());
        }
    }
}

