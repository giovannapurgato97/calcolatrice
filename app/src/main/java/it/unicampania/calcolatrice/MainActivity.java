package it.unicampania.calcolatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    // Operandi
    private double op1;
    private double op2;

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
        vRisultato = findViewById(R.id.textRisultato);

        // Impostazione azioni pulsanti
        vSomma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leggiOperandi();
                mostraRisultato(op1 + op2);
            }
        });
        vDifferenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leggiOperandi();
                mostraRisultato(op1 - op2);
            }
        });
        vProdotto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leggiOperandi();
                mostraRisultato(op1 * op2);
            }
        });
        vRapporto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leggiOperandi();
                if (op2 == 0.0) {
                    mostraDivByZero();
                } else {
                    mostraRisultato(op1 / op2);
                }
            }
        });
    }

    /**
     * Legge i due operandi dagli EditText convertendoli in double
     */
    private void leggiOperandi() {
        try {
            op1 = Double.parseDouble(vOperando1.getText().toString());
        } catch (Exception e) {
            op1 = 0.0;
        }

        try {
            op2 = Double.parseDouble(vOperando2.getText().toString());
        } catch (Exception e) {
            op2 = 0.0;
        }
    }

    /**
     * Mostra il risultato nella TextView
     * @param risultato valore da mostrare
     */
    private void mostraRisultato(double risultato) {
        vRisultato.setText(String.format(getString(R.string.risultato), risultato));
    }

    /**
     * Mostra il messaggio d'errore per la divisione per zero
     */
    private void mostraDivByZero() {
        vRisultato.setText(R.string.divbyzero);
    }

}
