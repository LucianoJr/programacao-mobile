package br.com.utp.brothersnetworks.views.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import br.com.utp.brothersnetworks.databinding.ItemFeedBinding;
import br.com.utp.brothersnetworks.models.Estado;
import br.com.utp.brothersnetworks.util.Log;

public class FeedRecyclerViewAdapter extends RecyclerView.Adapter<FeedRecyclerViewAdapter.ViewHolder> {

    // Lista de itens a serem exibidos no recyclerview
    private final List<Estado> mList;

    // No construtor recebemos os itens a serem exibidos pelo recycler view
    // e tambem o objeto para tratar eventos
    public FeedRecyclerViewAdapter(List<Estado> feeds) {
        mList = feeds;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        // onCreateViewHolder: Cria o layout que sera inflado dentro de cada item do recycler view
        Log.d("FeedRecyclerViewAdapter.onCreateViewHolder");

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemFeedBinding binding = ItemFeedBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        // onBindViewHolder: Chamado qndo o item do recycler view for ser exibido
        Log.d("FeedRecyclerViewAdapter.onBindViewHolder");

        final Estado feed = mList.get(position);
        holder.bind(feed);
    }

    @Override
    public int getItemCount() {
        // Retorna o numero de itens da lista
//        Log.d("FeedRecyclerViewAdapter.getItemCount: " + mList.size());
        return mList.size();
    }

    /**
     * Classe ViewHolder: que representa os dados que devem ser exibidos
     * para cada item do recycler view
     */
    class ViewHolder extends RecyclerView.ViewHolder {

        private final ItemFeedBinding mBinding;

        ViewHolder(ItemFeedBinding binding) {
             super(binding.getRoot());
             mBinding = binding;
         }

         void bind(Estado feed) {
             // Atualiza os dados do objeto na tela
             mBinding.setEstado(feed);
             mBinding.executePendingBindings();
         }


    }



}
