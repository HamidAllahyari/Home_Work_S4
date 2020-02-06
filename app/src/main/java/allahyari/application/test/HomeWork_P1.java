package allahyari.application.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class HomeWork_P1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work__p1);

        }

    @Override
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
    }
}
