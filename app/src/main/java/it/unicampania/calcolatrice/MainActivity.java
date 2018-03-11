package it.unicampania.calcolatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // View del layout
    private EditText vOperando1;
    private EditText vOperando2;
    private Button vSomma;
    private Button vDifferenza;
    private Button vProdotto;
    private Button vRapporto;
    private TextView vRisultato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Impostazione dei riferimenti delle view
        vOperando1 = findViewById(R.id.editOperando1);
        vOperando2 = findViewById(R.id.editOperando2);
        vSomma = findViewById(R.id.btnSomma);
        vDifferenza = findViewById(R.id.btnDifferenza);
        vProdotto = findViewById(R.id.btnProdotto);
        vRapporto = findViewById(R.id.btnRapporto);
    }

    
}
