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
public class ArmStrongFragment extends Fragment {

    private EditText etNumber;

    private Button btnCheck;

    private TextView tvIsArmStrongNumber;


    public ArmStrongFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_arm_strong, container, false);

        bindUI(view);

        btnCheck.setOnClickListener(i -> checkIfArmStrong());

        return view;
    }

    private void checkIfArmStrong() {
        if (isArmStrongNumber()) {
            tvIsArmStrongNumber.setText(etNumber.getText().toString() + " is Armstrong number");
        } else {
            tvIsArmStrongNumber.setText(etNumber.getText().toString() + " is not an Armstrong number");
        }
    }

    private boolean isArmStrongNumber() {
        if (FragmentUtils.isValidInt(etNumber.getText().toString())) {
            return FragmentUtils.isArmStrongNumber(etNumber.getText().toString());
        }
        return false;
    }

    private void bindUI(View view) {
        etNumber = view.findViewById(R.id.etNumber);
        btnCheck = view.findViewById(R.id.btnCheck);
        tvIsArmStrongNumber = view.findViewById(R.id.tvIsArmStrongNumber);
    }

}
