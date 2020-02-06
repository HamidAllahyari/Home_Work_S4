package allahyari.application.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeWork_P2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work__p2);

        Button btndialog = findViewById(R.id.btnDialog);
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
        });
    }
}
