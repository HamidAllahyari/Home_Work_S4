package allahyari.application.test;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.PreferenceManager;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        TextView txtCall = findViewById(R.id.txtCall);
        txtCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "02188738394"));
                startActivity(intent);
            }
        });
        TextView txtProfile = findViewById(R.id.txtProfile);
        txtProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        TextView txtName = findViewById(R.id.txtName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtPhone = findViewById(R.id.txtPhone);

        String name = PreferenceManager.getDefaultSharedPreferences(MenuActivity.this)
                .getString("name", "Unknown name");
        String lastName = PreferenceManager.getDefaultSharedPreferences(MenuActivity.this)
                .getString("lastName", "Unknown last name");
        String email = PreferenceManager.getDefaultSharedPreferences(MenuActivity.this)
                .getString("email", "Unknown email address");
        String phone = PreferenceManager.getDefaultSharedPreferences(MenuActivity.this)
                .getString("phone", "Unknown phone number");

        txtName.setText(name);
        txtLastName.setText(lastName);
        txtEmail.setText(email);
        txtPhone.setText(phone);
    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.firstItem:
                DrawerLayout drawerLayout = findViewById(R.id.drawerMenu);
                drawerLayout.openDrawer(Gravity.LEFT);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    /* ////////////////////////Class Programing//////////////////////////////////////////*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.firstItem:
                DrawerLayout drawerLayout = findViewById(R.id.drawerMenu);
                drawerLayout.openDrawer(Gravity.LEFT);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
