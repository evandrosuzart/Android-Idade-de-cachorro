package idadedecachorro.studio.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caixaTexto = (EditText) findViewById(R.id.id_valor_inserido);
        botaoIdade = (Button) findViewById(R.id.id_botao);
        resultado = (TextView) findViewById(R.id.id_resultado);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Salvando o valor digitado na caixa de texto para cazer o calculo

                String valorDigitado = caixaTexto.getText().toString();
                if (valorDigitado.isEmpty()){
                    resultado.setText("Por favor, insira um valor numérico!");
                    caixaTexto.selectAll();
                    caixaTexto.setText("");
                }else{

                    int idade = Integer.parseInt(valorDigitado);
                    int idadeHumano;
                    idadeHumano=idade*7;

                    resultado.setText("A idade do cachoro é: "+idade+" anos, isso em anos humanos é igual a "+idade+" anos!");
                    caixaTexto.selectAll();
                    caixaTexto.setText("");
                }
                }
        });
    }
}
