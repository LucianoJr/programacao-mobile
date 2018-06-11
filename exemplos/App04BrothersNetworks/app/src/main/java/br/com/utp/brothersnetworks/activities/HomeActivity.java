package br.com.utp.brothersnetworks.activities;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import br.com.utp.brothersnetworks.R;
import br.com.utp.brothersnetworks.fragments.FeedFragment;
import br.com.utp.brothersnetworks.fragments.FeedFragment_;
import br.com.utp.brothersnetworks.util.Log;
import br.com.utp.brothersnetworks.views.adapters.HomeViewPagerAdapter;

@EActivity(R.layout.activity_home)
public class HomeActivity extends AppCompatActivity {

    @ViewById(R.id.home_toolbar)
    protected Toolbar mToolbar;

    @ViewById(R.id.container)
    protected ViewPager mContainer;

    private FeedFragment mFeedFragment;



    /**
     * Depois da criacao da activity (onCreate), o metodo com a anotacao
     * @AfterViews eh chamado
     */
    @AfterViews
    protected void init() {
        Log.d("HomeActivity.init");

        // Realiza o setup da toolbar
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }

        mFeedFragment = FeedFragment_.builder().mTitulo("Teste").build();

        List<Fragment> lista = new ArrayList<>();
        lista.add(mFeedFragment);
        lista.add(FeedFragment_.builder().mTitulo("Teste").build());
        lista.add(FeedFragment_.builder().mTitulo("Teste").build());
        lista.add(FeedFragment_.builder().mTitulo("Teste").build());

        // Define a classe adapter do viewpager
        HomeViewPagerAdapter adapter = new HomeViewPagerAdapter(
                                                getSupportFragmentManager(), lista);
        mContainer.setAdapter(adapter);


        // Alterna a exibicao de fragmentos
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//        transaction.replace(R.id.container, mFeedFragment);
//        transaction.commit();

    }



}
