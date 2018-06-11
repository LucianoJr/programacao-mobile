package br.com.utp.brothersnetworks.views.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import br.com.utp.brothersnetworks.databinding.ItemFeedBinding;

public class FeedRecyclerViewAdapter extends RecyclerView.Adapter<FeedRecyclerViewAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemFeedBinding binding = ItemFeedBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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



    }



}
