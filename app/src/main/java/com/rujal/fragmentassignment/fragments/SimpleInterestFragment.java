package com.rujal.fragmentassignment.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.rujal.fragmentassignment.FragmentUtils;
import com.rujal.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterestFragment extends Fragment {

    private EditText etPrincipal, etRate, etTime;

    private Button btnCalculate;

    private TextView tvSimpleInterest;

    private double simpleInterestAmount;

    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);

        bindUI(view);

        btnCalculate.setOnClickListener(i -> calculateSimpleInterest());

        return view;
    }

    private void calculateSimpleInterest() {
        try {
            float principal = Float.valueOf(etPrincipal.getText().toString());
            float rate = Float.valueOf(etRate.getText().toString());
            float timeInYears = Float.valueOf(etTime.getText().toString());
            simpleInterestAmount = FragmentUtils.getSimpleInterest(principal, timeInYears, rate);
            tvSimpleInterest.setText("Simple Interest: " + simpleInterestAmount);
        } catch (NumberFormatException ex) {
            tvSimpleInterest.setText("Please enter valid amouts");
        }
    }

    private void bindUI(View view) {
        etPrincipal = view.findViewById(R.id.etPrincipal);
        etRate = view.findViewById(R.id.etRate);
        etTime = view.findViewById(R.id.etTimeInYears);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        tvSimpleInterest = view.findViewById(R.id.tvSimpleInterest);
    }

}
