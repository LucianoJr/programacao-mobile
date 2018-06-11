package br.com.utp.brothersnetworks.util;

public class Log {

    private static final String TAG = "BrothersNetworks";

    public static void d(String mensagem) {
        android.util.Log.d(TAG, mensagem);
    }

    public static void e(String mensagem) {
        android.util.Log.e(TAG, mensagem);
    }

    public static void e(String mensagem, Throwable erro) {
        android.util.Log.e(TAG, mensagem, erro);
    }


}
