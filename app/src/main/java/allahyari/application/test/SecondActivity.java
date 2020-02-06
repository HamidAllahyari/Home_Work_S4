package allahyari.application.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView inputtextIntent = findViewById(R.id.inputtextIntent);

        Intent intent = getIntent();
        String age = intent.getStringExtra("AGE");

        inputtextIntent.setText(age);
    }
}
