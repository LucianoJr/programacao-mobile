package br.com.utp.brothersnetworks.networks;

import br.com.utp.brothersnetworks.models.Estado;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestService {

    @GET("state/get/USA/all")
    Call<WebserviceResponse<Estado[]>> getEstados();

    //@GET("escola/getaluno.php")
    //Call<WebserviceResponse<Aluno[]>> getAluno();

}
