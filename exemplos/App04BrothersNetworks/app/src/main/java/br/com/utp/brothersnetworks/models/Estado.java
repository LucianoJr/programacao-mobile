package br.com.utp.brothersnetworks.models;

import com.google.gson.annotations.SerializedName;

public class Estado {

    @SerializedName("id")
    protected int mId = 0;

    @SerializedName("country")
    protected String mPais = "";

    @SerializedName("name")
    protected String mEstado = "";

    @SerializedName("abbr")
    protected String mAbreviacao = "";

    @SerializedName("area")
    protected String mArea = "";

    @SerializedName("largest_city")
    protected String mMaiorCidade = "";

    @SerializedName("capital")
    protected String mCapital = "";

    public int getId() {
        return mId;
    }

    public void setId(final int id) {
        mId = id;
    }

    public String getPais() {
        return mPais;
    }

    public void setPais(final String pais) {
        mPais = pais;
    }

    public String getEstado() {
        return mEstado;
    }

    public void setEstado(final String estado) {
        mEstado = estado;
    }

    public String getAbreviacao() {
        return mAbreviacao;
    }

    public void setAbreviacao(final String abreviacao) {
        mAbreviacao = abreviacao;
    }

    public String getArea() {
        return mArea;
    }

    public void setArea(final String area) {
        mArea = area;
    }

    public String getMaiorCidade() {
        return mMaiorCidade;
    }

    public void setMaiorCidade(final String maiorCidade) {
        mMaiorCidade = maiorCidade;
    }

    public String getCapital() {
        return mCapital;
    }

    public void setCapital(final String capital) {
        mCapital = capital;
    }
}
