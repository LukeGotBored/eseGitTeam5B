package mlitts.voltapg.esegitteam5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v) {
        Toast toast = Toast.makeText(getApplicationContext(), R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
}