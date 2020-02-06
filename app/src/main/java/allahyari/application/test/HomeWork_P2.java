package allahyari.application.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeWork_P2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work__p2);

        /*Button btndialog = findViewById(R.id.btnDialog);
        btndialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog dialog = new AlertDialog.Builder(HomeWork_P2.this)
                        .setTitle("Attention!")
                        .setMessage("Are You Sure?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(HomeWork_P2.this,"Yes Click...",Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(HomeWork_P2.this,"No Click...",Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNeutralButton("Remind me Later", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(HomeWork_P2.this,"Remind me Later Click...",Toast.LENGTH_SHORT).show();

                            }
                        }).create();
                dialog.show();
            }
        });   */

        /*///////////////////////Home work//////////////////////*/

        /*TextView txtCall = findViewById(R.id.txtCall);
        txtCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "09197257868"));
                startActivity(intent);
            }
        });

        Button btnSave = findViewById(R.id.btnSave);



        TextView txtProfile = findViewById(R.id.txtProfile);
        txtProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeWork_P2.this, HomeWork_P1.class);
                startActivity(intent);
            }
        });

        TextView txtName = findViewById(R.id.txtName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtPhone = findViewById(R.id.txtPhone);

        String name = PreferenceManager.getDefaultSharedPreferences(HomeWork_P2.this)
                .getString("name", "Unknown name");
        String lastName = PreferenceManager.getDefaultSharedPreferences(HomeWork_P2.this)
                .getString("lastName", "Unknown last name");
        String email = PreferenceManager.getDefaultSharedPreferences(HomeWork_P2.this)
                .getString("email", "Unknown emale address");
        String phone = PreferenceManager.getDefaultSharedPreferences(HomeWork_P2.this)
                .getString("phone", "Unknown phone number");

        txtName.setText(name);
        txtLastName.setText(lastName);
        txtEmail.setText(email);
        txtPhone.setText(phone);

*/
    }
}
