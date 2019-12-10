package com.rujal.fragmentassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.rujal.fragmentassignment.FragmentUtils;
import com.rujal.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CircleAreaFragment extends Fragment {

    private EditText etRadius;

    private TextView tvArea;

    private Button btnAreaOfCircle;

    private float areaOfCircle;


    public CircleAreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circle_area, container, false);

        etRadius = view.findViewById(R.id.etRadius);

        btnAreaOfCircle.setOnClickListener(i -> calculateAreaOfCircle());

        return view;
    }

    private void calculateAreaOfCircle() {
        try {
            /*
             * Resetting...
             */
            areaOfCircle = 0.00f;
            tvArea.setText("Area: " + areaOfCircle);

            float radius = Float.valueOf(etRadius.getText().toString());
            areaOfCircle = FragmentUtils.getAreaOfCircle(radius);
            tvArea.setText("Area: " + areaOfCircle);
        } catch (NumberFormatException ex) {
            System.out.println("Radius is not a number");
        }
    }

}
