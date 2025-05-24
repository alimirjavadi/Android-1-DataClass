package com.example.dataclass;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etFamily;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etFamily = findViewById(R.id.etFamily);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String family = etFamily.getText().toString();

            contact c = new contact(name, family);
            Intent intent = new Intent(MainActivity.this, Info_Activity.class);
            intent.putExtra("my_contact", c);
            startActivity(intent);
        });
    }
}
