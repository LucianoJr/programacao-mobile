package br.com.utp.brothersnetworks.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

import br.com.utp.brothersnetworks.R;
import br.com.utp.brothersnetworks.databinding.ActivityLoginBinding;
import br.com.utp.brothersnetworks.util.Log;

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    // --------------------------------------------------------
    // ATRIBUTOS
    // --------------------------------------------------------

    private ActivityLoginBinding mBinding;

    // --------------------------------------------------------
    // METODOS
    // --------------------------------------------------------

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

    }

    /**
     * Este método é chamado assim que as views forem inicializados no
     * onCreate()
     */
    @AfterViews
    protected void init() {

        // Inicializa o data binding
        mBinding = ActivityLoginBinding.inflate(getLayoutInflater());

        // Maneira antiga de acessar views do xml
        // Button btn = findViewById(R.id.login_btn_facebook);
        // btn.setVisibility(View.GONE);

        // Maneira nova usando databinding
//        mBinding.loginBtnFacebook.setVisibility(View.VISIBLE);

        // Maneira tradicional de amarrar eventos de botao
//        mBinding.loginBtnFacebook.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View view) {
//                // executa a logica qndo o botao for clicado
//            }
//        });

        final CallbackManager callbackManager = CallbackManager.Factory.create();

        mBinding.loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(final LoginResult loginResult) {
                Toast.makeText(LoginActivity.this, "SUCESSO", Toast.LENGTH_SHORT).show();

                Log.d("LoginActivity.onSuccess: " + loginResult.getAccessToken());


                AccessToken accessToken = AccessToken.getCurrentAccessToken();
                boolean isLoggedIn = accessToken != null && !accessToken.isExpired();


            }

            @Override
            public void onCancel() {
                Toast.makeText(LoginActivity.this, "CANCELA", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(final FacebookException error) {
                Toast.makeText(LoginActivity.this, "ERRO", Toast.LENGTH_SHORT).show();
            }
        });



        // Exibe a tela de loading por 3s e apresenta a tela inicial
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(LoginActivity.this, "FOI!", Toast.LENGTH_SHORT).show();
                //mBinding.loginLayoutProgress.setVisibility(View.GONE);
                //mBinding.loginProgressBar.setVisibility(View.GONE);
            }
        }, 10000);




    }

//    @Click(R.id.login_btn_facebook)
//    protected void loginFacebookClick() {
//        Toast.makeText(this, "Clicou botao facebook", Toast.LENGTH_LONG).show();
//    }

    @Click(R.id.login_btn_semlogin)
    protected void loginNormalClick() {
        Toast.makeText(this, "Clicou botao normal", Toast.LENGTH_SHORT).show();
    }






}
