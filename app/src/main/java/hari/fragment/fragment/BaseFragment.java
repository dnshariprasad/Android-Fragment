package hari.fragment.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

import hari.fragment.activity.BaseActivity;

/**
 * Created by Hari on 26/01/16.
 */
public class BaseFragment extends Fragment {
    private BaseActivity baseActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.baseActivity = (BaseActivity) context;
    }
    public int getColorWrapper(int id) {
        return baseActivity.getColorWrapper(id);
    }
}
