package com.example.administrator.algebra;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import Fragments.Fragment_matrix_2_5;
import HelperClasses.Matrix;
import HelperClasses.Read_Writer;

public class ScolMultiplication extends AppCompatActivity {

    TextView nameA;
    TextView nameB;
    FrameLayout fA;
    FrameLayout fB;
    EditText coordCount;
    RelativeLayout createCard;
    FloatingActionButton fab;

    FragmentTransaction ftran;
    int vecCount;
    int coorCount;
    ArrayList<double[]> vectorList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scol_multiplication);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameA = (TextView) findViewById(R.id.nameA);
        nameB = (TextView) findViewById(R.id.nameB);
        fA = (FrameLayout) findViewById(R.id.fragmentsContA);
        fB = (FrameLayout) findViewById(R.id.fragmentsContB);
        coordCount = (EditText) findViewById(R.id.coord_count);
        createCard = (RelativeLayout) findViewById(R.id.createCard);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        setListeners();
    }

    private void setListeners() {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vectorList.clear();

                vecCount = 2;
                coorCount = Integer.valueOf(coordCount.getText().toString());

                Fragment fragA = getFragmentManager().findFragmentById(R.id.fragmentsContA);
                Matrix.vectorA = Read_Writer.ReadRectangleMatrix(coorCount,fragA);
                if (Matrix.vectorA == null){
                    Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();return;
                }

                Fragment fragB = getFragmentManager().findFragmentById(R.id.fragmentsContB);
                Matrix.vectorB = Read_Writer.ReadRectangleMatrix(coorCount,fragB);
                if (Matrix.vectorB == null){
                    Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();return;
                }
                vectorList.addAll(Arrays.asList(Matrix.vectorA, Matrix.vectorB));

                calculate();
            }
        });

        createCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameA.setText("");
                nameB.setText("");

                ftran = getFragmentManager().beginTransaction().setCustomAnimations(R.animator.shoy, R.animator.shoy);

                nameA.setText("A=");
                nameB.setText("B=");

                Bundle bundle = new Bundle();
                bundle.putInt("coord", Integer.valueOf(coordCount.getText().toString()));

                Fragment_matrix_2_5 frag1 = new Fragment_matrix_2_5();
                frag1.setArguments(bundle);
                ftran.add(R.id.fragmentsContA, frag1);

                Fragment_matrix_2_5 frag2 = new Fragment_matrix_2_5();
                frag2.setArguments(bundle);
                ftran.add(R.id.fragmentsContB, frag2);

                ftran.addToBackStack(null);
                ftran.commit();
            }
        });
    }

    public void calculate(){
        double scalMult = 0;

        for (int i = 0; i < coorCount; i++) {
            scalMult += Matrix.vectorA[i] * Matrix.vectorB[i];
        }

        Toast.makeText(this, "Скалярное произведение векторов = " + scalMult, Toast.LENGTH_LONG).show();
    }
}
