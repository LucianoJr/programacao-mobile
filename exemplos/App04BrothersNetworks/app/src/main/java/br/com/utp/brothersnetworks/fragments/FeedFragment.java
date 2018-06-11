package br.com.utp.brothersnetworks.fragments;

import android.support.v4.app.Fragment;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;

import br.com.utp.brothersnetworks.R;
import br.com.utp.brothersnetworks.util.Log;

@EFragment(R.layout.fragment_feed)
public class FeedFragment extends Fragment{

    /**
     * FragmentArg é usado para indicar que a variavel sera inicializada com
     * os dados vindos do build()
     */
    @FragmentArg
     String mTitulo;

    @AfterViews
    protected void init() {
        Log.d("init: " + mTitulo);
        Toast.makeText(getContext(), "Foi", Toast.LENGTH_SHORT).show();
    }






}
