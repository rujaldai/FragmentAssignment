package com.rujal.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.rujal.fragmentassignment.enums.FragmentEnum;
import com.rujal.fragmentassignment.fragments.ArmStrongFragment;
import com.rujal.fragmentassignment.fragments.AutomorphicFragment;
import com.rujal.fragmentassignment.fragments.CircleAreaFragment;
import com.rujal.fragmentassignment.fragments.PalindromeFragment;
import com.rujal.fragmentassignment.fragments.SimpleInterestFragment;
import com.rujal.fragmentassignment.fragments.SwapVarFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnCalculateArea, btnCalculateSI, btnPalindrome, btnSwapVariable,
             btnAutoMorphic, btnArmStrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindUI();

        setOnClickListener();
    }

    private void setOnClickListener() {
        btnCalculateArea.setOnClickListener(i -> changeFragment(FragmentEnum.AREA_OF_CIRCLE));
        btnCalculateSI.setOnClickListener(i -> changeFragment(FragmentEnum.SIMPLE_INTEREST));
        btnPalindrome.setOnClickListener(i -> changeFragment(FragmentEnum.PALINDROME));
        btnSwapVariable.setOnClickListener(i -> changeFragment(FragmentEnum.SWAP_VAR));
        btnAutoMorphic.setOnClickListener(i -> changeFragment(FragmentEnum.AUTO_MORPHIC));
        btnArmStrong.setOnClickListener(i -> changeFragment(FragmentEnum.ARMSTRONG));
    }

    private void changeFragment(FragmentEnum areaOfCircle) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (areaOfCircle) {
            case AREA_OF_CIRCLE:
                CircleAreaFragment circleAreaFragment = new CircleAreaFragment();
                fragmentTransaction.replace(R.id.fragmentContainers, circleAreaFragment);
                fragmentTransaction.commit();
                break;
            case SWAP_VAR:
                SwapVarFragment swapVarFragment = new SwapVarFragment();
                fragmentTransaction.replace(R.id.fragmentContainers, swapVarFragment);
                fragmentTransaction.commit();
                break;
            case ARMSTRONG:
                ArmStrongFragment armStrongFragment = new ArmStrongFragment();
                fragmentTransaction.replace(R.id.fragmentContainers, armStrongFragment);
                fragmentTransaction.commit();
                break;
            case PALINDROME:
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainers, palindromeFragment);
                fragmentTransaction.commit();
                break;
            case AUTO_MORPHIC:
                AutomorphicFragment automorphicFragment = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainers, automorphicFragment);
                fragmentTransaction.commit();
                break;
            case SIMPLE_INTEREST:
                SimpleInterestFragment simpleInterestFragment = new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.fragmentContainers, simpleInterestFragment);
                fragmentTransaction.commit();
                break;
        }
    }

    private void bindUI() {
        btnCalculateArea = findViewById(R.id.btnAreaOfCircle);
        btnCalculateSI = findViewById(R.id.btnSimpleInterest);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSwapVariable = findViewById(R.id.btnSwapVariable);
        btnAutoMorphic = findViewById(R.id.btnAutomorphic);
        btnArmStrong = findViewById(R.id.btnArmStrong);
    }
}
