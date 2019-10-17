package ahf.edu.tesoem.itics.p4angel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vnombre = (EditText) findViewById(R.id.txtnombre);
    }

    public void Invocar(View v){
        Intent pantalla = new Intent(this,RecibeParametros.class);
                pantalla.putExtra("nombre",vnombre.getText().toString());
        startActivity(pantalla);
        finish();
    }
}
