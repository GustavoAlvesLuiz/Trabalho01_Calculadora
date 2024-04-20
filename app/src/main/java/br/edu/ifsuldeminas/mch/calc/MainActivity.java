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
    private Button buttonZero;
    private Button buttonUm;
    private Button buttonDois;
    private Button buttonTres;
    private Button buttonQuatro;
    private Button buttonCinco;
    private Button buttonSeis;
    private Button buttonSete;
    private Button buttonOito;
    private Button buttonNove;
    private Button buttonSoma;
    private Button buttonMult;
    private Button buttonDiv;
    private Button buttonSub;
    private Button buttonPorc;
    private Button buttonC;
    private Button buttonD;
    private Button buttonVirgula;
    private TextView textViewResultado;
    private TextView textViewUltimaExpressao;
    private String expressao = "";

    //função para digitar
    private void adicionarDigito(Button digito) {
        expressao += digito.getText();
        textViewUltimaExpressao.setText(expressao);
    }

    //função para limpar a empressão e o resultado
    private void limparExpressao() {
        expressao = "";
        textViewUltimaExpressao.setText(expressao);
        textViewResultado.setText("0");

    }

    //função para deletar o ultimo digito
    private void deletarUltimoCaractere() {
        if (!expressao.isEmpty()) { // Verifica se a string não está vazia
            expressao = expressao.substring(0, expressao.length() - 1);
            textViewUltimaExpressao.setText(expressao);
        }
    }

    //função para adicionar operadores
    private void adicionarOperador(Button operador) {
        if (!expressao.isEmpty()) {
            char ultimoCaractere = expressao.charAt(expressao.length() - 1);
            // Verifica se o último caractere não é um operador
            if (!isOperador(ultimoCaractere)) {
                expressao += operador.getText();
                textViewUltimaExpressao.setText(expressao);
            } else { // Substitui o último operador pelo operador atual
                expressao = expressao.substring(0, expressao.length() - 1) + operador.getText();
                textViewUltimaExpressao.setText(expressao);
            }
        }
    }


    // Função para verificar se um caractere é um operador
    private boolean isOperador(char caractere) {
        return caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/' || caractere == '%';
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonZero = findViewById(R.id.buttonZeroID);
        buttonUm = findViewById(R.id.buttonUmID);
        buttonDois = findViewById(R.id.buttonDoisID);
        buttonTres = findViewById(R.id.buttonTresID);
        buttonQuatro = findViewById(R.id.buttonQuatroID);
        buttonCinco = findViewById(R.id.buttonCincoID);
        buttonSeis = findViewById(R.id.buttonSeisID);
        buttonSete = findViewById(R.id.buttonSeteID);
        buttonOito = findViewById(R.id.buttonOitoID);
        buttonNove = findViewById(R.id.buttonNoveID);
        buttonSoma = findViewById(R.id.buttonSomaID);
        buttonSub = findViewById(R.id.buttonSubtracaoID);
        buttonMult = findViewById(R.id.buttonMultiplicacaoID);
        buttonDiv = findViewById(R.id.buttonDivisaoID);
        buttonPorc = findViewById(R.id.buttonPorcentoID);
        buttonVirgula = findViewById(R.id.buttonVirgulaID);
        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);
        buttonIgual = findViewById(R.id.buttonIgualID);
        buttonC = findViewById(R.id.buttonResetID);
        buttonD = findViewById(R.id.buttonDeleteID);


        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Calculable avaliadorExpressao = new ExpressionBuilder(expressao).build();
                    Double resultado = avaliadorExpressao.calculate();
                    textViewResultado.setText(resultado.toString());
                    expressao = "";
                    textViewUltimaExpressao.setText(expressao);
                } catch (Exception e) {
                    Log.d(TAG, e.getMessage());
                }
            }
        });

//        buttonIgual.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                try {
//                    char ultimoCaractere = expressao.charAt(expressao.length() - 1);
//                    if (isOperador(ultimoCaractere)) {
//                        expressao += expressao.substring(0, expressao.length() - 1); // Adiciona o último número novamente
//                    }
//                    Calculable avaliadorExpressao = new ExpressionBuilder(expressao).build();
//                    Double resultado = avaliadorExpressao.calculate();
//                    textViewResultado.setText(resultado.toString());
//                    expressao = "";
//                    textViewUltimaExpressao.setText(expressao);
//                } catch (Exception e) {
//                    Log.d(TAG, e.getMessage());
//                }
//            }
//        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonZero);
            }
        });

        buttonUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonUm);
            }
        });

        buttonDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonDois);
            }
        });

        buttonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonTres);
            }
        });

        buttonQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonQuatro);
            }
        });

        buttonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonCinco);
            }
        });

        buttonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonSeis);
            }
        });

        buttonSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonSete);
            }
        });

        buttonOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonOito);
            }
        });

        buttonNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDigito(buttonNove);
            }
        });

        buttonSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!expressao.isEmpty()){
                    adicionarOperador(buttonSoma);
                } else{
                    if(! textViewResultado.getText().equals("0")){
                        expressao += textViewResultado.getText();
                        adicionarOperador(buttonSoma);
                        textViewUltimaExpressao.setText(expressao);
                        textViewResultado.setText("0");
                    }
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!expressao.isEmpty()){
                    adicionarOperador(buttonSub);
                } else{
                    if(! textViewResultado.getText().equals("0")){
                        expressao += textViewResultado.getText();
                        adicionarOperador(buttonSub);
                        textViewUltimaExpressao.setText(expressao);
                        textViewResultado.setText("0");
                    }
                }
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!expressao.isEmpty()){
                    adicionarOperador(buttonMult);
                } else{
                    if(! textViewResultado.getText().equals("0")){
                        expressao += textViewResultado.getText();
                        adicionarOperador(buttonMult);
                        textViewUltimaExpressao.setText(expressao);
                        textViewResultado.setText("0");
                    }
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!expressao.isEmpty()){
                    adicionarOperador(buttonDiv);
                } else{
                    if(! textViewResultado.getText().equals("0")){
                        expressao += textViewResultado.getText();
                        adicionarOperador(buttonDiv);
                        textViewUltimaExpressao.setText(expressao);
                        textViewResultado.setText("0");
                    }
                }
            }
        });

        buttonPorc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!expressao.isEmpty()){
                    adicionarOperador(buttonPorc);
                } else{
                    if(! textViewResultado.getText().equals("0")){
                        expressao += textViewResultado.getText();
                        adicionarOperador(buttonPorc);
                        textViewUltimaExpressao.setText(expressao);
                        textViewResultado.setText("0");
                    }
                }
            }
        });

        buttonVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!expressao.isEmpty()){
                    adicionarDigito(buttonVirgula);
                } else{
                    if(! textViewResultado.getText().equals("0")){
                        expressao += textViewResultado.getText();
                        textViewUltimaExpressao.setText(expressao);
                        textViewResultado.setText("0");
                    }
                }
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deletarUltimoCaractere();
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limparExpressao();
            }
        });


    }

}