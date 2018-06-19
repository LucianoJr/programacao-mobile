package br.com.utp.brothersnetworks.fragments;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import br.com.utp.brothersnetworks.R;
import br.com.utp.brothersnetworks.models.Estado;
import br.com.utp.brothersnetworks.networks.NetworkManager;
import br.com.utp.brothersnetworks.networks.WebserviceResponse;
import br.com.utp.brothersnetworks.util.Log;
import br.com.utp.brothersnetworks.views.adapters.FeedRecyclerViewAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@EFragment(R.layout.fragment_feed)
public class FeedFragment extends Fragment{

    /**
     * FragmentArg é usado para indicar que a variavel sera inicializada com
     * os dados vindos do build()
     */
    @FragmentArg
     String mTitulo;

    @ViewById(R.id.feed_recyclerview)
    RecyclerView mRecyclerView;

    @AfterViews
    protected void init() {
        Log.d("init: " + mTitulo);
        Toast.makeText(getContext(), "Foi", Toast.LENGTH_SHORT).show();

        final ArrayList<Estado> estados = new ArrayList<>();
        estados.add(new Estado());
        estados.add(new Estado());
        estados.add(new Estado());

//        FeedRecyclerViewAdapter adapter = new FeedRecyclerViewAdapter(estados);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setHasFixedSize(true);
//        mRecyclerView.setAdapter(adapter);
//        mRecyclerView.getAdapter().notifyDataSetChanged();



        NetworkManager.service().getEstados().enqueue(new Callback<WebserviceResponse<Estado[]>>() {
            @Override
            public void onResponse(final Call<WebserviceResponse<Estado[]>> call, final Response<WebserviceResponse<Estado[]>> response) {
                Log.d("FeedFragment.onResponse: " + response.raw());
                Log.d("FeedFragment.onResponse: " + response.message());
                if (response.body() != null) {
                    trataRespostaOk(response.body());
                } else {
                    trataRespostaErro(new RuntimeException("Nenhuma resposta de retorno"));
                }
            }

            @Override
            public void onFailure(final Call<WebserviceResponse<Estado[]>> call, final Throwable t) {
                trataRespostaErro(t);
            }
        });

    }

    private void trataRespostaErro(final Throwable t) {
        Log.e("FeedFragment.trataRespostaErro", t);
        Toast.makeText(getContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
    }

    private void trataRespostaOk(final WebserviceResponse<Estado[]> body) {

        // Recupera a lista de estados retornadas pelo webservice
        Log.d("trataRespostaOk: " + body.getResponse());

        final Estado[] result = body.getResponse().getResult();

        List<Estado> estados = new ArrayList<>();
        for (Estado estado : result) {
            estados.add(estado);
        }

        // Amarramos o recyclerview com um adapter
        FeedRecyclerViewAdapter adapter = new FeedRecyclerViewAdapter(estados);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.getAdapter().notifyDataSetChanged();

    }

}
