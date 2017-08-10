package com.android.airbnb.main;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.android.airbnb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HostRoomsFragment extends Fragment implements View.OnClickListener{

    private HostMainActivity hostMainActivity;
    private TextView txtTitle, txtDescription;
    private ImageButton imgBtnAddRooms;


    public HostRoomsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        hostMainActivity = (HostMainActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_host_rooms, container, false);
        setViews(view);
        setListeners();
        return view;
    }

    private void setViews(View view){
        txtTitle = (TextView) view.findViewById(R.id.txtTitle);
        txtDescription = (TextView) view.findViewById(R.id.txtDescription);
        imgBtnAddRooms = (ImageButton) view.findViewById(R.id.imgBtnAddRooms);
    }

    private void setListeners(){
        imgBtnAddRooms.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgBtnAddRooms:
                Toast.makeText(hostMainActivity, "숙소 추가버튼 클릭", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
