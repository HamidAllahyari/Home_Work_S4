package allahyari.application.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView ReadPre = findViewById(R.id.readPre);

        Button Save_btn = findViewById(R.id.saveId);

        Button btn_linkweb = findViewById(R.id.webLink);

        Button btn_Submeet = findViewById(R.id.btn_Submet);

        final EditText textIntent = findViewById(R.id.textIntent);

        //btn_Submeet.setText("SAVE...");

        String Username = PreferenceManager.getDefaultSharedPreferences(MainActivity.this).getString("name","Unknown name");
        ReadPre.setText(Username.toString());

        Save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textIntent.getText().toString();
                PreferenceManager.getDefaultSharedPreferences(MainActivity.this).edit().putString("name",name).apply();
            }
        });

        btn_linkweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://refah-bank.ir"));
                startActivity(intentLink);
            }
        });

        btn_Submeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this,"Hi Hamid...",Toast.LENGTH_LONG).show();

                //Log.d("TAG","btn_Submeet clic....");

                String age =textIntent.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("AGE",age.toString());
                startActivity(intent);

            }
        });

    }
}
