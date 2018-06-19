package br.com.utp.brothersnetworks.networks;

import com.google.gson.annotations.SerializedName;

public class WebserviceResponse<T> {

    @SerializedName("RestResponse")
    protected RestResponse<T> mResponse;

    public RestResponse<T> getResponse() {
        return mResponse;
    }

    public void setResponse(final RestResponse<T> response) {
        mResponse = response;
    }
}
