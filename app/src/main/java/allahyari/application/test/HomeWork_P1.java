package allahyari.application.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class HomeWork_P1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_home_work__p1);

        TextView txtCall = findViewById(R.id.txtCall);

        txtCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+989197257868"));
                startActivity(intent);
            }
        });
        TextView txtProfile = findViewById(R.id.txtProfile);
        txtProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeWork_P1.this, HomeWork_P2.class);
                startActivity(intent);
            }
        });
        TextView txtName = findViewById(R.id.txtName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtPhone = findViewById(R.id.txtPhone);
        String name = PreferenceManager.getDefaultSharedPreferences(HomeWork_P1.this)
                .getString("name", "Unknown name");
        String lastName = PreferenceManager.getDefaultSharedPreferences(HomeWork_P1.this)
                .getString("lastName", "Unknown last name");
        String email = PreferenceManager.getDefaultSharedPreferences(HomeWork_P1.this)
                .getString("email", "Unknown emale address");
        String phone = PreferenceManager.getDefaultSharedPreferences(HomeWork_P1.this)
                .getString("phone", "Unknown phone number");

        txtName.setText(name);
        txtLastName.setText(lastName);
        txtEmail.setText(email);
        txtPhone.setText(phone);
*/
        }
    /* /////////////////////////////////////////////////////////////////////////////////////*/
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

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu_p1,menu);

        menu.add(0,1,1,"Java Item");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.firstItem:
                Toast.makeText(HomeWork_P1.this,"Fisrt Item",Toast.LENGTH_SHORT).show();
                break;

            case R.id.secondItem:
                Toast.makeText(HomeWork_P1.this,"Second Item",Toast.LENGTH_SHORT).show();
                break;

            case R.id.thirdItem:
                Toast.makeText(HomeWork_P1.this,"Third Item",Toast.LENGTH_SHORT).show();
                break;

            case 1:
                Toast.makeText(HomeWork_P1.this,"Java Item",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
