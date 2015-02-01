package org.eclipse.paho.android.service.sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by looney on 1/30/2015.
 */

public class GarageDoorOpen extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return LayoutInflater.from(getActivity()).inflate(R.layout.garage_door, null);

    }
}
