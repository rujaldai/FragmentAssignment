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
public class PalindromeFragment extends Fragment {

    private EditText etNumber;

    private Button btnCheck;

    private TextView tvIsPalindrome;


    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_palindrome, container, false);
        bindUI(view);

        btnCheck.setOnClickListener(i -> checkIfPalindrome());

        return view;
    }

    private void checkIfPalindrome() {
        if (isPalindromeNumber()) {
            tvIsPalindrome.setText(etNumber.getText().toString() + " is Palindrome number");
        } else {
            tvIsPalindrome.setText(etNumber.getText().toString() + " is not a Palindrome number");
        }
    }

    private boolean isPalindromeNumber() {
        if (FragmentUtils.isValidInt(etNumber.getText().toString())) {
            return FragmentUtils.isPalindromeNumber(etNumber.getText().toString());
        }
        return false;
    }

    private void bindUI(View view) {
        etNumber = view.findViewById(R.id.etNumber);
        btnCheck = view.findViewById(R.id.btnCheck);
        tvIsPalindrome = view.findViewById(R.id.tvIsPalindrome);
    }

}