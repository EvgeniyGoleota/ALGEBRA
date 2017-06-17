package com.example.administrator.algebra;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import Fragments.Fragment_matrix_2_2;
import Fragments.Fragment_matrix_3_3;
import Fragments.Fragment_matrix_4_4;
import Fragments.Fragment_matrix_5_5;
import HelperClasses.Matrix;
import HelperClasses.Read_Writer;
import HelperClasses.Variables;

public class InverseMatrixActivity extends AppCompatActivity {

    FragmentTransaction ftran;

    CardView createButton;
    EditText matrixSize;
    TextView answer, nameA;
    int size;
    double determinant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverse_matrix);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameA = (TextView) findViewById(R.id.nameA);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = getFragmentManager().findFragmentById(R.id.fragmentsCont);
                Matrix.rectangleAnswerMatrix = Read_Writer.ReadRectangleMatrix(size, size, frag);
                // Matrix.determinantMatrix = Read_Writer.ReadSquareMatrix(size, frag);
                if (Matrix.rectangleAnswerMatrix == null){
                    Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();return;
                }

                inversion(Matrix.rectangleAnswerMatrix, size);



                Intent intent = new Intent(view.getContext(),AnswerNFActivity.class);
                intent.putExtra("OPERATION", "A = ");
                view.getContext().startActivity(intent);
            }
        });

        createButton = (CardView) findViewById(R.id.createCardView);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nameA.setText("A=");

                matrixSize = (EditText) findViewById(R.id.matrixSize);
                size = Integer.parseInt(matrixSize.getText().toString());

                Variables.sizeRow = size;
                Variables.sizeColumn = size;

                ftran = getFragmentManager().beginTransaction().setCustomAnimations(R.animator.shoy, R.animator.shoy);
                switch (size) {
                    case 2: {
                        ftran.add(R.id.fragmentsCont, new Fragment_matrix_2_2());
                    }
                    break;
                    case 3: {
                        ftran.add(R.id.fragmentsCont, new Fragment_matrix_3_3());
                    }
                    break;
                    case 4: {
                        ftran.add(R.id.fragmentsCont, new Fragment_matrix_4_4());
                    }
                    break;
                    case 5: {
                        ftran.add(R.id.fragmentsCont, new Fragment_matrix_5_5());
                    }
                    break;
                }
                ftran.addToBackStack(null);
                ftran.commit();
                if (size < 2 || size > 5) {
                    Snackbar.make(v, "Размер указан не верно", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });
    }

    void inversion(double [][]A, int N)
    {
        double temp;

        double [][] E = new double[N][N];


        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            {
                E[i][j] = 0f;

                if (i == j)
                    E[i][j] = 1f;
            }

        for (int k = 0; k < N; k++)
        {
            temp = A[k][k];

            for (int j = 0; j < N; j++)
            {
                A[k][j] /= temp;
                E[k][j] /= temp;
            }

            for (int i = k + 1; i < N; i++)
            {
                temp = A[i][k];

                for (int j = 0; j < N; j++)
                {
                    A[i][j] -= A[k][j] * temp;
                    E[i][j] -= E[k][j] * temp;
                }
            }
        }

        for (int k = N - 1; k > 0; k--)
        {
            for (int i = k - 1; i >= 0; i--)
            {
                temp = A[i][k];

                for (int j = 0; j < N; j++)
                {
                    A[i][j] -= A[k][j] * temp;
                    E[i][j] -= E[k][j] * temp;
                }
            }
        }

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                A[i][j] = E[i][j];
        okr(A,N);

    }
    //---------------------------------------------------------------------
    public void okr(double[][]mass,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mass[i][j]=mass[i][j]*100;double q=Math.round(mass[i][j]);
                mass[i][j]=q/100;
            }}
    }
}
