package br.com.utp.brothersnetworks.networks;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RestResponse<T> {

    @SerializedName("messages")
    protected List<String> mMensagens = new ArrayList<>();

    @SerializedName("result")
    protected T mResult;

    public List<String> getMensagens() {
        return mMensagens;
    }

    public void setMensagens(final List<String> mensagens) {
        mMensagens = mensagens;
    }

    public T getResult() {
        return mResult;
    }

    public void setResult(final T result) {
        mResult = result;
    }
}
