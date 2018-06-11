package br.com.utp.brothersnetworks.models;

public class Feed {

    private String mNome = "";
    private String mEmail = "";
    private String mFotoUrl = "";

    public String getNome() {
        return mNome;
    }

    public void setNome(final String nome) {
        mNome = nome;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(final String email) {
        mEmail = email;
    }

    public String getFotoUrl() {
        return mFotoUrl;
    }

    public void setFotoUrl(final String fotoUrl) {
        mFotoUrl = fotoUrl;
    }
}
