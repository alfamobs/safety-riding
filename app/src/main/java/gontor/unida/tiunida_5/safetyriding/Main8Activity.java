package gontor.unida.tiunida_5.safetyriding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    public void mulai(View view) {
        Intent intent = new Intent(Main8Activity.this, MainActivity.class);
        startActivity(intent);
    }
}
