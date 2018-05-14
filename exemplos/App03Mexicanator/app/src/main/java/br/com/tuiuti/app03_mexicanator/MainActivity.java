package br.com.tuiuti.app03_mexicanator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Main";

    // No Android, sempre declaramos atributos começando com o prefixo `m`
    private EditText mEdtEntrada;
    private Button mBtnTraduzir;
    private TextView mTxtSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Esta funcao retorna a view associada a um ID
        // - No onCreate extraimos as views do layout para facilitar a manipulacao
        mEdtEntrada = findViewById(R.id.main_edt_texto);

        mEdtEntrada.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(final TextView textView, final int i, final KeyEvent keyEvent) {
                Log.d(TAG, "onEditorAction: Clicou!");
                return false;
            }
        });

        mBtnTraduzir = findViewById(R.id.main_btn_traduzir);
        mTxtSaida = findViewById(R.id.main_txt_saida);

        mBtnTraduzir.setOnClickListener(this);

    }

    @Override
    public void onClick(final View view) {
        Log.d(TAG, "onClick: Botao clicado!");
        if (view.getId() == R.id.main_btn_traduzir) {
            String texto = mEdtEntrada.getText().toString();
            Log.d(TAG, "onClick: texto = " + texto);

            texto = texto.toLowerCase();
            texto = texto.replaceAll("\\bo\\b", "lo");
            texto = texto.replaceAll("\\ba\\b", "la");
            texto = texto.replaceAll("\\be\\b", "y");
            texto = texto.replaceAll("\\b(é|eh)\\b", "es");
            texto = texto.replaceAll("\\bnós\\b ", "nosotros");
            texto = texto.replaceAll("\\b(tu|vc|você)\\b", "usted");
            texto = texto.replaceAll("\\b(vcs|vocês)\\b", "ustedes");
            texto = texto.replaceAll("\\bj\\b", "shôta");
            texto = texto.replaceAll("\\bJ\\b", "Shôta");
            texto = texto.replaceAll("v", "b");
            texto = texto.replaceAll("ão\\b", "ión");
            texto = texto.replaceAll("ões\\b", "iónes");
            texto = texto.replaceAll("inha\\b", "ita");
            texto = texto.replaceAll("inho\\b", "ito");
            texto = texto.replaceAll("dade\\b", "dad");
            texto = texto.replaceAll("nh", "ñ");
            texto = texto.replaceAll("\\beu\\b", "jo");
            texto = texto.replaceAll("\\bmas\\b", "pero");
            texto = texto.replaceAll("\\bdo\\b", "del");
            texto = texto.replaceAll("\\bem\\b", "en");
            texto = texto.replaceAll("\\bum\\b", "uno");
            texto = texto.replaceAll("\\buma\\b", "una");
            texto = texto.replaceAll("\\b(meu|minha)\\b", "mi");
            texto = texto.replaceAll("\\bbom\\b", "bueno");
            texto = texto.replaceAll("\\bboa\\b", "buena");
            texto = texto.replaceAll("\\bcara\\b", "cabrón");
            texto = texto.replaceAll("\\bhoje\\b", "hoy");
            texto = texto.replaceAll("\\b(\\w)(o)(\\w{2,6})\\b", "$1ue$3");
            texto = texto.replaceAll("\\b(\\w)(e)(\\w{2,6})\\b", "$1ie$3");

            mTxtSaida.setText(texto);

            // Esconde o botao!
            //mBtnTraduzir.setVisibility(View.GONE); // remove do layout
            //mBtnTraduzir.setVisibility(View.INVISIBLE); // esconde mas mantem o espaco
            //mBtnTraduzir.setVisibility(View.VISIBLE); // exibe de volta
        }
    }
}
