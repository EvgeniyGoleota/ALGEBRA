package com.example.administrator.algebra;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import Fragments.Fragment_Result_matrix_2_2;
import Fragments.Fragment_Result_matrix_3_3;
import Fragments.Fragment_Result_matrix_4_4;
import Fragments.Fragment_Result_matrix_5_5;
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

public class AnswerActivity extends AppCompatActivity {

    FragmentTransaction ftran;

    TextView tvText,tvMatrix;
    String matrix = "";
    Fragment frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvText   = (TextView) findViewById(R.id.tvText);
        tvMatrix = (TextView) findViewById(R.id.tvMatrix);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        Intent intent = getIntent();
        tvText.setText(intent.getStringExtra("OPERATION"));

/*
        ftran = getFragmentManager().beginTransaction();
        switch (Variables.sizeRow) {
            case 2: {
                switch (Variables.sizeColumn) {
                    case 2: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_Result_matrix_2_2());
                    }
                    break;
                    case 3: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_2_3());
                    }
                    break;
                    case 4: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_2_4());
                    }
                    break;
                    case 5: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_2_5());
                    }
                    break;
                }
            }
            break;
            case 3: {
                switch (Variables.sizeColumn) {
                    case 2: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_3_2());
                    }
                    break;
                    case 3: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_Result_matrix_3_3());
                    }
                    break;
                    case 4: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_3_4());
                    }
                    break;
                    case 5: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_3_5());
                    }
                    break;
                }
            }
            break;
            case 4: {
                switch (Variables.sizeColumn) {
                    case 2: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_4_2());
                    }
                    break;
                    case 3: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_4_3());
                    }
                    break;
                    case 4: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_Result_matrix_4_4());
                    }
                    break;
                    case 5: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_4_5());
                    }
                    break;
                }
            }
            break;
            case 5: {
                switch (Variables.sizeColumn) {
                    case 2: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_5_2());
                    }
                    break;
                    case 3: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_5_3());
                    }
                    break;
                    case 4: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_matrix_5_4());
                    }
                    break;
                    case 5: {
                        ftran.add(R.id.answer_Fragment_cont, new Fragment_Result_matrix_5_5());
                    }
                    break;
         }
}
break;
        }
        ftran.addToBackStack(null);
        ftran.commit();
*/

        writeMatrix();

        //Fragment frag = getFragmentManager().findFragmentById(R.id.answer_Fragment_cont);
        //frag = getFragmentManager().findFragmentById(R.id.answer_Fragment_cont);
        //Read_Writer.WriteSquareMatrix(Variables.sizeColumn,frag);
        //WriteSquareMatrix(Variables.sizeColumn);

    }

    public void writeMatrix(){
        for(int i=0;i< Variables.sizeRow;i++) {
            for (int j = 0; j < Variables.sizeColumn; j++) {
                matrix = matrix + Matrix.rectangleAnswerMatrix[i][j] + " ";
            }
            matrix = matrix + "\n";
            //System.getProperty("line.separator");
        }
        tvMatrix.setText(matrix);
        if (Variables.sizeColumn > 3)tvMatrix.setTextSize(15);
    }

    public  void WriteSquareMatrix(int size){

        switch (size){
            case 2: {
                ((TextView) frag.getView().findViewById(R.id.r11)).setText(""+Matrix.rectangleAnswerMatrix[0][0]);
                ((TextView) frag.getView().findViewById(R.id.r12)).setText(""+Matrix.rectangleAnswerMatrix[0][1]);

                ((TextView) frag.getView().findViewById(R.id.r21)).setText(""+Matrix.rectangleAnswerMatrix[1][0]);
                ((TextView) frag.getView().findViewById(R.id.r22)).setText(""+Matrix.rectangleAnswerMatrix[1][1]);
            }break;
            case 3: {

                ((TextView) frag.getView().findViewById(R.id.a11)).setText(""+Matrix.rectangleAnswerMatrix[0][0]);
                ((TextView) frag.getView().findViewById(R.id.a12)).setText(""+Matrix.rectangleAnswerMatrix[0][1]);
                ((TextView) frag.getView().findViewById(R.id.a13)).setText(""+Matrix.rectangleAnswerMatrix[0][2]);

                ((TextView) frag.getView().findViewById(R.id.a21)).setText(""+Matrix.rectangleAnswerMatrix[1][0]);
                ((TextView) frag.getView().findViewById(R.id.a22)).setText(""+Matrix.rectangleAnswerMatrix[1][1]);
                ((TextView) frag.getView().findViewById(R.id.a23)).setText(""+Matrix.rectangleAnswerMatrix[1][2]);

                ((TextView) frag.getView().findViewById(R.id.a31)).setText(""+Matrix.rectangleAnswerMatrix[2][0]);
                ((TextView) frag.getView().findViewById(R.id.a32)).setText(""+Matrix.rectangleAnswerMatrix[2][1]);
                ((TextView) frag.getView().findViewById(R.id.a33)).setText(""+Matrix.rectangleAnswerMatrix[2][2]);
            }break;
            case 4: {
                ((TextView) frag.getView().findViewById(R.id.a11)).setText(""+Matrix.rectangleAnswerMatrix[0][0]);
                ((TextView) frag.getView().findViewById(R.id.a12)).setText(""+Matrix.rectangleAnswerMatrix[0][1]);
                ((TextView) frag.getView().findViewById(R.id.a13)).setText(""+Matrix.rectangleAnswerMatrix[0][2]);
                ((TextView) frag.getView().findViewById(R.id.a14)).setText(""+Matrix.rectangleAnswerMatrix[0][3]);

                ((TextView) frag.getView().findViewById(R.id.a21)).setText(""+Matrix.rectangleAnswerMatrix[1][0]);
                ((TextView) frag.getView().findViewById(R.id.a22)).setText(""+Matrix.rectangleAnswerMatrix[1][1]);
                ((TextView) frag.getView().findViewById(R.id.a23)).setText(""+Matrix.rectangleAnswerMatrix[1][2]);
                ((TextView) frag.getView().findViewById(R.id.a24)).setText(""+Matrix.rectangleAnswerMatrix[1][3]);

                ((TextView) frag.getView().findViewById(R.id.a31)).setText(""+Matrix.rectangleAnswerMatrix[2][0]);
                ((TextView) frag.getView().findViewById(R.id.a32)).setText(""+Matrix.rectangleAnswerMatrix[2][1]);
                ((TextView) frag.getView().findViewById(R.id.a33)).setText(""+Matrix.rectangleAnswerMatrix[2][2]);
                ((TextView) frag.getView().findViewById(R.id.a34)).setText(""+Matrix.rectangleAnswerMatrix[2][3]);

                ((TextView) frag.getView().findViewById(R.id.a41)).setText(""+Matrix.rectangleAnswerMatrix[3][0]);
                ((TextView) frag.getView().findViewById(R.id.a42)).setText(""+Matrix.rectangleAnswerMatrix[3][1]);
                ((TextView) frag.getView().findViewById(R.id.a43)).setText(""+Matrix.rectangleAnswerMatrix[3][2]);
                ((TextView) frag.getView().findViewById(R.id.a44)).setText(""+Matrix.rectangleAnswerMatrix[3][3]);
            }break;
            case 5: {
                ((TextView) frag.getView().findViewById(R.id.a11)).setText(""+Matrix.rectangleAnswerMatrix[0][0]);
                ((TextView) frag.getView().findViewById(R.id.a12)).setText(""+Matrix.rectangleAnswerMatrix[0][1]);
                ((TextView) frag.getView().findViewById(R.id.a13)).setText(""+Matrix.rectangleAnswerMatrix[0][2]);
                ((TextView) frag.getView().findViewById(R.id.a14)).setText(""+Matrix.rectangleAnswerMatrix[0][3]);
                ((TextView) frag.getView().findViewById(R.id.a15)).setText(""+Matrix.rectangleAnswerMatrix[0][4]);

                ((TextView) frag.getView().findViewById(R.id.a21)).setText(""+Matrix.rectangleAnswerMatrix[1][0]);
                ((TextView) frag.getView().findViewById(R.id.a22)).setText(""+Matrix.rectangleAnswerMatrix[1][1]);
                ((TextView) frag.getView().findViewById(R.id.a23)).setText(""+Matrix.rectangleAnswerMatrix[1][2]);
                ((TextView) frag.getView().findViewById(R.id.a24)).setText(""+Matrix.rectangleAnswerMatrix[1][3]);
                ((TextView) frag.getView().findViewById(R.id.a25)).setText(""+Matrix.rectangleAnswerMatrix[1][4]);

                ((TextView) frag.getView().findViewById(R.id.a31)).setText(""+Matrix.rectangleAnswerMatrix[2][0]);
                ((TextView) frag.getView().findViewById(R.id.a32)).setText(""+Matrix.rectangleAnswerMatrix[2][1]);
                ((TextView) frag.getView().findViewById(R.id.a33)).setText(""+Matrix.rectangleAnswerMatrix[2][2]);
                ((TextView) frag.getView().findViewById(R.id.a34)).setText(""+Matrix.rectangleAnswerMatrix[2][3]);
                ((TextView) frag.getView().findViewById(R.id.a35)).setText(""+Matrix.rectangleAnswerMatrix[2][4]);

                ((TextView) frag.getView().findViewById(R.id.a41)).setText(""+Matrix.rectangleAnswerMatrix[3][0]);
                ((TextView) frag.getView().findViewById(R.id.a42)).setText(""+Matrix.rectangleAnswerMatrix[3][1]);
                ((TextView) frag.getView().findViewById(R.id.a43)).setText(""+Matrix.rectangleAnswerMatrix[3][2]);
                ((TextView) frag.getView().findViewById(R.id.a44)).setText(""+Matrix.rectangleAnswerMatrix[3][3]);
                ((TextView) frag.getView().findViewById(R.id.a45)).setText(""+Matrix.rectangleAnswerMatrix[3][4]);

                ((TextView) frag.getView().findViewById(R.id.a51)).setText(""+Matrix.rectangleAnswerMatrix[4][0]);
                ((TextView) frag.getView().findViewById(R.id.a52)).setText(""+Matrix.rectangleAnswerMatrix[4][1]);
                ((TextView) frag.getView().findViewById(R.id.a53)).setText(""+Matrix.rectangleAnswerMatrix[4][2]);
                ((TextView) frag.getView().findViewById(R.id.a54)).setText(""+Matrix.rectangleAnswerMatrix[4][3]);
                ((TextView) frag.getView().findViewById(R.id.a55)).setText(""+Matrix.rectangleAnswerMatrix[4][4]);
            }break;
        }


    }

}
