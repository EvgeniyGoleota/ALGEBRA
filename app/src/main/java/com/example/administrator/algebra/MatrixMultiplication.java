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
import Fragments.Fragment_matrix_2_3;
import Fragments.Fragment_matrix_2_4;
import Fragments.Fragment_matrix_2_5;
import Fragments.Fragment_matrix_3_2;
import Fragments.Fragment_matrix_3_3;
import Fragments.Fragment_matrix_3_4;
import Fragments.Fragment_matrix_3_5;
import Fragments.Fragment_matrix_4_2;
import Fragments.Fragment_matrix_4_3;
import Fragments.Fragment_matrix_4_4;
import Fragments.Fragment_matrix_4_5;
import Fragments.Fragment_matrix_5_2;
import Fragments.Fragment_matrix_5_3;
import Fragments.Fragment_matrix_5_4;
import Fragments.Fragment_matrix_5_5;
import HelperClasses.Matrix;
import HelperClasses.Read_Writer;
import HelperClasses.Variables;

public class MatrixMultiplication extends AppCompatActivity {

    FragmentTransaction ftran;

    CardView createButton;
    EditText matrixSizeRowA, matrixSizeColumnA;
    EditText matrixSizeRowB, matrixSizeColumnB;
    TextView nameB, nameA;
    int sizeRowA, sizeColumnA;
    int sizeRowB, sizeColumnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_multiplication);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameA = (TextView) findViewById(R.id.nameA);
        nameB = (TextView) findViewById(R.id.nameB);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragA = getFragmentManager().findFragmentById(R.id.fragmentsContA);
                Matrix.rectangleMatrixA = Read_Writer.ReadRectangleMatrix(sizeRowA, sizeColumnA, fragA);
                if (Matrix.rectangleMatrixA == null){
                    Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();return;
                }

                Fragment fragB = getFragmentManager().findFragmentById(R.id.fragmentsContB);
                Matrix.rectangleMatrixB = Read_Writer.ReadRectangleMatrix(sizeRowB,sizeColumnB,fragB);
                if (Matrix.rectangleMatrixB == null){
                    Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();return;
                }

                matrixMultiplication();

                Intent intent = new Intent(view.getContext(),AnswerNFActivity.class);
                intent.putExtra("OPERATION","A * B = ");
                view.getContext().startActivity(intent);

//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });

        createButton = (CardView) findViewById(R.id.createCardView);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameA.setText("A=");
                nameB.setText("B=");

                matrixSizeRowA    = (EditText) findViewById(R.id.matrixSizeRowA);
                matrixSizeColumnA = (EditText) findViewById(R.id.matrixSizeColumnA);

                matrixSizeRowB    = (EditText) findViewById(R.id.matrixSizeRowB);
                matrixSizeColumnB = (EditText) findViewById(R.id.matrixSizeColumnB);

                sizeRowA    = Integer.parseInt(matrixSizeRowA.getText().toString());
                sizeColumnA = Integer.parseInt(matrixSizeColumnA.getText().toString());

                sizeRowB    = Integer.parseInt(matrixSizeRowB.getText().toString());
                sizeColumnB = Integer.parseInt(matrixSizeColumnB.getText().toString());

                Variables.sizeRow    = sizeRowA;
                Variables.sizeColumn = sizeColumnB;

                Variables.sizeRowB    = sizeRowB;
                Variables.sizeColumnB = sizeColumnB;

                if (sizeRowA < 2 || sizeRowA > 5 || sizeColumnA < 2 || sizeColumnA > 5
                        || sizeRowB < 2 || sizeRowB > 5 || sizeColumnB < 2 || sizeColumnB > 5) {
                    Snackbar.make(v, "Размер указан не верно", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }

                if (sizeColumnA != sizeRowB) {
                    Snackbar.make(v, "Размер указан не верно", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    return;
                }

                ftran = getFragmentManager().beginTransaction().setCustomAnimations(R.animator.shoy, R.animator.shoy);
                switch (sizeRowA) {
                    case 2: {
                        switch (sizeColumnA) {
                            case 2: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_2_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_2_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_2_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_2_5());
                            }
                            break;
                        }
                    }
                    break;
                    case 3: {
                        switch (sizeColumnA) {
                            case 2: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_3_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_3_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_3_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_3_5());
                            }
                            break;
                        }
                    }
                    break;
                    case 4: {
                        switch (sizeColumnA) {
                            case 2: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_4_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_4_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_4_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_4_5());
                            }
                            break;
                        }
                    }
                    break;
                    case 5: {
                        switch (sizeColumnA) {
                            case 2: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_5_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_5_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_5_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_5_5());
                            }
                            break;
                        }
                    }
                    break;
                }
//--------------------------------------------------------------------------------------------------
                switch (sizeRowB) {
                    case 2: {
                        switch (sizeColumnB) {
                            case 2: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_2_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_2_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_2_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_2_5());
                            }
                            break;
                        }
                    }
                    break;
                    case 3: {
                        switch (sizeColumnB) {
                            case 2: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_3_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_3_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_3_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_3_5());
                            }
                            break;
                        }
                    }
                    break;
                    case 4: {
                        switch (sizeColumnB) {
                            case 2: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_4_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_4_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_4_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_4_5());
                            }
                            break;
                        }
                    }
                    break;
                    case 5: {
                        switch (sizeColumnB) {
                            case 2: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_5_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_5_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_5_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_5_5());
                            }
                            break;
                        }
                    }
                    break;
                }
                ftran.addToBackStack(null);
                ftran.commit();
            }
        });
    }

    public void matrixMultiplication(){
        Matrix.rectangleAnswerMatrix = new double[sizeRowA][sizeColumnB];
        for(int i=0;i<sizeRowA;i++)
             for(int j=0;j<sizeColumnB;j++) {
                 for (int k = 0; k < sizeColumnA; k++) {
                     Matrix.rectangleAnswerMatrix[i][j] += Matrix.rectangleMatrixA[i][k] * Matrix.rectangleMatrixB[k][j];
                 }
             }
    }



}
