package hari.fragment.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import hari.fragment.Constant;
import hari.fragment.R;

/**
 * Created by Hari on 26/01/16.
 */
public class DetailFragment extends BaseFragment {
    private final static String TAG = DetailFragment.class.getSimpleName();
    private LinearLayout selected_color_ll;
    private String selectedColor;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            selectedColor = savedInstanceState.getString(Constant.SELECTED_COLOR);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        selected_color_ll = (LinearLayout) getActivity().findViewById(R.id.selected_color_ll);
        if (selectedColor != null)
            respondOnInfo(selectedColor);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(Constant.SELECTED_COLOR, selectedColor);
    }

    public void respondOnInfo(String info) {
        switch (info) {
            case Constant.RED:
                selectedColor = Constant.RED;
                Log.d(TAG + " respondOnInfo", selectedColor);
                selected_color_ll.setBackgroundColor(getColorWrapper(android.R.color.holo_red_dark));
                break;
            case Constant.GREEN:
                selectedColor = Constant.GREEN;
                Log.d(TAG + " respondOnInfo", selectedColor);
                selected_color_ll.setBackgroundColor(getColorWrapper(android.R.color.holo_green_dark));
                break;
            case Constant.BLUE:
                selectedColor = Constant.BLUE;
                Log.d(TAG + " respondOnInfo", selectedColor);
                selected_color_ll.setBackgroundColor(getColorWrapper(android.R.color.holo_blue_dark));
                break;
            default:
                selected_color_ll.setBackgroundColor(getColorWrapper(android.R.color.white));
                break;
        }

    }
}
