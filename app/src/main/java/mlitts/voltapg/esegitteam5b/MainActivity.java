package mlitts.voltapg.esegitteam5b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button mainButton;

    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.mainbutton);
        layout = findViewById(R.id.mainlayout);

    }

    public void showText(View v){
        Toast.makeText(this, "Perché l'hai fatto?", Toast.LENGTH_SHORT).show();


    }

}