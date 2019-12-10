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
import com.rujal.fragmentassignment.SwapMember;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwapVarFragment extends Fragment {

    private EditText etFirstNumber, etSecondNumber;

    private TextView tvVariableA, tvVariableB;

    private Button btnSwap;

    public SwapVarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swap_var, container, false);

        bindUI(view);

        btnSwap.setOnClickListener(i -> swap());

        return view;
    }

    private void swap() {
        try {
            SwapMember swappedMember = FragmentUtils.swapVariables(new SwapMember(
                    Integer.valueOf(etFirstNumber.getText().toString()),
                    Integer.valueOf(etSecondNumber.getText().toString())));

            tvVariableA.setText("First number: " + swappedMember.getA());
            tvVariableB.setText("Second number: " + swappedMember.getB());
        } catch (NumberFormatException ex) {
            tvVariableA.setText("Please enter valid numbers");
            tvVariableB.setText("Please enter valid numbers");
        }
    }

    private void bindUI(View view) {
        tvVariableA = view.findViewById(R.id.tvVariableA);
        tvVariableB = view.findViewById(R.id.tvVariableB);
        btnSwap = view.findViewById(R.id.btnSwap);
        etFirstNumber = view.findViewById(R.id.etFirstNumber);
        etSecondNumber = view.findViewById(R.id.etSecondNumber);
    }

}