package hari.fragment.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hari.fragment.Constant;
import hari.fragment.R;
import hari.fragment.listener.Mediator;

/**
 * Created by Hari on 26/01/16.
 */
public class ListFragment extends BaseFragment implements View.OnClickListener {
    private Mediator mediator;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mediator = (Mediator) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //init listeners
        getActivity().findViewById(R.id.red_btn).setOnClickListener(this);
        getActivity().findViewById(R.id.green_btn).setOnClickListener(this);
        getActivity().findViewById(R.id.blue_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.red_btn:
                mediator.inform(Constant.RED);
                break;
            case R.id.green_btn:
                mediator.inform(Constant.GREEN);
                break;
            case R.id.blue_btn:
                mediator.inform(Constant.BLUE);
                break;
        }

    }
}
