package br.edu.ifsuldeminas.mch.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ifsuldeminas.mch.calc";
    private Button buttonIgual;
    private TextView textViewResultado;
    private TextView textViewUltimaExpressao;

    private void adicionarDigito(String digito) {
        String expressaoAtual = textViewResultado.getText().toString();
        // Verifica se a expressão atual é "0"
        if (expressaoAtual.equals("0")) {
            textViewResultado.setText(digito);
        } else {
            String novaExpressao = expressaoAtual + digito;
            textViewResultado.setText(novaExpressao);
        }
    }

    private void limparExpressao() {
        textViewResultado.setText("0");
    }

    private void deletarUltimoCaractere() {
        String expressaoAtual = textViewResultado.getText().toString();
        if (expressaoAtual.length() > 0) {
            String novaExpressao = expressaoAtual.substring(0, expressaoAtual.length() - 1);
            textViewResultado.setText(novaExpressao);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);

        buttonIgual = findViewById(R.id.buttonIgualID);
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculable avaliadorExpressao = null;
                try {
                    String expressao = "5+1+4*2";
                    avaliadorExpressao = new ExpressionBuilder(expressao).build();

                    Double resultado = avaliadorExpressao.calculate();

                    textViewUltimaExpressao.setText(expressao);
                    textViewResultado.setText(resultado.toString());
                } catch (Exception e) {
                    Log.d(TAG, e.getMessage());
                }
            }
        });

        Button buttonZero = findViewById(R.id.buttonZeroID);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_zero));
            }
        });

        Button buttonUm = findViewById(R.id.buttonUmID);
        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_um));
            }
        });

        Button buttonDois = findViewById(R.id.buttonDoisID);
        buttonDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_dois));
            }
        });

        Button buttonTres = findViewById(R.id.buttonTresID);
        buttonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_tres));
            }
        });

        Button buttonQuatro = findViewById(R.id.buttonQuatroID);
        buttonQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_quatro));
            }
        });

        Button buttonCinco = findViewById(R.id.buttonCincoID);
        buttonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_cinco));
            }
        });

        Button buttonSeis = findViewById(R.id.buttonSeisID);
        buttonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_seis));
            }
        });

        Button buttonSete = findViewById(R.id.buttonSeteID);
        buttonSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_sete));
            }
        });

        Button buttonOito = findViewById(R.id.buttonOitoID);
        buttonOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_oito));
            }
        });

        Button buttonNove = findViewById(R.id.buttonNoveID);
        buttonNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_nove));
            }
        });

        Button buttonSoma = findViewById(R.id.buttonSomaID);
        buttonSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_soma));
            }
        });

        Button buttonSubtracao = findViewById(R.id.buttonSubtracaoID);
        buttonSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_subtracao));
            }
        });

        Button buttonMultiplicacao = findViewById(R.id.buttonMultiplicacaoID);
        buttonMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_multiplicacao));
            }
        });

        Button buttonDivisao = findViewById(R.id.buttonDivisaoID);
        buttonDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_divisao));
            }
        });

        Button buttonPorcentagem = findViewById(R.id.buttonPorcentoID);
        buttonPorcentagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(getString(R.string.button_porcentagem));
            }
        });

        Button buttonC = findViewById(R.id.buttonResetID);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limparExpressao();
            }
        });

        Button buttonD = findViewById(R.id.buttonDeleteID);
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deletarUltimoCaractere();
            }
        });


    }
}