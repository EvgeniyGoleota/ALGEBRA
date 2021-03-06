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

public class DifferenceActivity extends AppCompatActivity {

    FragmentTransaction ftran;

    CardView createButton;
    EditText matrixSizeRow, matrixSizeColumn;
    TextView nameB, nameA;
    int sizeRow, sizeColumn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difference);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameA = (TextView) findViewById(R.id.nameA);
        nameB = (TextView) findViewById(R.id.nameB);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragA = getFragmentManager().findFragmentById(R.id.fragmentsContA);
                Matrix.rectangleMatrixA = Read_Writer.ReadRectangleMatrix(sizeRow, sizeColumn, fragA);
                if (Matrix.rectangleMatrixA == null){
                    Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();return;
                }

                Fragment fragB = getFragmentManager().findFragmentById(R.id.fragmentsContB);
                Matrix.rectangleMatrixB = Read_Writer.ReadRectangleMatrix(sizeRow,sizeColumn,fragB);
                if (Matrix.rectangleMatrixB == null){
                    Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();return;
                }

                matrixDifference();

                Intent intent = new Intent(view.getContext(),AnswerNFActivity.class);
                intent.putExtra("OPERATION","A - B = ");
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

                matrixSizeRow    = (EditText) findViewById(R.id.matrixSizeRow);
                matrixSizeColumn = (EditText) findViewById(R.id.matrixSizeColumn);

                sizeRow    = Integer.parseInt(matrixSizeRow.getText().toString());
                sizeColumn = Integer.parseInt(matrixSizeColumn.getText().toString());

                Variables.sizeRow    = sizeRow;
                Variables.sizeColumn = sizeColumn;

                ftran = getFragmentManager().beginTransaction().setCustomAnimations(R.animator.shoy, R.animator.shoy);
                switch (sizeRow) {
                    case 2: {
                        switch (sizeColumn) {
                            case 2: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_2_2());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_2_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_2_3());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_2_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_2_4());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_2_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_2_5());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_2_5());
                            }
                            break;
                        }
                    }
                    break;
                    case 3: {
                        switch (sizeColumn) {
                            case 2: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_3_2());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_3_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_3_3());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_3_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_3_4());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_3_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_3_5());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_3_5());
                            }
                            break;
                        }
                    }
                    break;
                    case 4: {
                        switch (sizeColumn) {
                            case 2: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_4_2());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_4_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_4_3());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_4_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_4_4());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_4_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_4_5());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_4_5());
                            }
                            break;
                        }
                    }
                    break;
                    case 5: {
                        switch (sizeColumn) {
                            case 2: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_5_2());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_5_2());
                            }
                            break;
                            case 3: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_5_3());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_5_3());
                            }
                            break;
                            case 4: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_5_4());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_5_4());
                            }
                            break;
                            case 5: {
                                ftran.add(R.id.fragmentsContA, new Fragment_matrix_5_5());
                                ftran.add(R.id.fragmentsContB, new Fragment_matrix_5_5());
                            }
                            break;
                        }
                    }
                    break;
                }
                ftran.addToBackStack(null);
                ftran.commit();
                if (sizeRow < 2 || sizeRow > 5 || sizeColumn < 2 || sizeColumn > 5) {
                    Snackbar.make(v, "Размер указан не верно", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });
    }

    public void matrixDifference(){
        Matrix.rectangleAnswerMatrix = new double[sizeRow][sizeColumn];
        for(int i=0;i<sizeRow;i++)
            for(int j=0;j<sizeColumn;j++){
                Matrix.rectangleAnswerMatrix[i][j] = Matrix.rectangleMatrixA[i][j] - Matrix.rectangleMatrixB[i][j];
            }
    }



}
