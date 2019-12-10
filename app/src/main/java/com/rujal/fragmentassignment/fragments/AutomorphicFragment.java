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
public class AutomorphicFragment extends Fragment {

    private EditText etNumber;

    private Button btnCheck;

    private TextView tvIsAutomorphicNumber;

    public AutomorphicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);

        bindUI(view);

        btnCheck.setOnClickListener(i -> checkIfAutomorphic());

        return view;
    }

    private void checkIfAutomorphic() {
        if (isAutomorphicNumber()) {
            tvIsAutomorphicNumber.setText(etNumber.getText().toString() + " is Automorphic number");
        } else {
            tvIsAutomorphicNumber.setText(etNumber.getText().toString() + " is not an Automorphic number");
        }
    }

    private boolean isAutomorphicNumber() {
        if (FragmentUtils.isValidInt(etNumber.getText().toString())) {
            return FragmentUtils.isAutomorphicNumber(etNumber.getText().toString());
        }
        return false;
    }

    private void bindUI(View view) {
        etNumber = view.findViewById(R.id.etNumber);
        btnCheck = view.findViewById(R.id.btnCheck);
        tvIsAutomorphicNumber = view.findViewById(R.id.tvIsAutomorphicNumber);
    }

}
