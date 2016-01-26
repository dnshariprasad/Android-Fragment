package hari.fragment.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import hari.fragment.Constant;
import hari.fragment.R;
import hari.fragment.fragment.DetailFragment;
import hari.fragment.fragment.ListFragment;
import hari.fragment.listener.Mediator;

public class MainActivity extends BaseActivity implements Mediator {
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private ListFragment listFragment;
    private DetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get fragment manager
        fragmentManager = getSupportFragmentManager();
        //begin fragment transaction add/replace /remove
        fragmentTransaction = fragmentManager.beginTransaction();

        //add list fragment
        listFragment = new ListFragment();

        fragmentTransaction.add(R.id.list_container_ll, listFragment, Constant.FRAGMENT_LIST);
        //add detail fragment
        detailFragment = new DetailFragment();

        //attach detail fragment
        fragmentTransaction.add(R.id.detail_containder_ll, detailFragment, Constant.FRAGMENT_DETAIL);

        //commit transactions
        fragmentTransaction.commitAllowingStateLoss();
    }

    @Override
    public void inform(String info) {
        DetailFragment detailFragment = (DetailFragment) fragmentManager.findFragmentByTag(Constant.FRAGMENT_DETAIL);
        if (detailFragment != null)
            detailFragment.respondOnInfo(info);
    }
}
