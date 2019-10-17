package ahf.edu.tesoem.itics.p4angel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class RecibeParametros extends AppCompatActivity {

    TextView vnombre;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_parametros);

        vnombre = (TextView) findViewById(R.id.lbmnombre);
            Bundle parametros = getIntent().getExtras();
           vnombre.setText("Bienvenido" + parametros.getString("nombre"));
   }
}