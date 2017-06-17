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

import Fragments.Fragment_Result_matrix_2_2;
import Fragments.Fragment_Result_matrix_3_3;
import Fragments.Fragment_Result_matrix_4_4;
import Fragments.Fragment_Result_matrix_5_5;
import Fragments.Fragment_matrix_2_2;
import Fragments.Fragment_matrix_3_3;
import Fragments.Fragment_matrix_4_4;
import Fragments.Fragment_matrix_5_5;
import HelperClasses.Matrix;
import HelperClasses.Read_Writer;
import HelperClasses.Variables;

public class DeterminantActivity extends AppCompatActivity {

    FragmentTransaction ftran;

    CardView createButton;
    EditText matrixSize;
    TextView answer, nameA;
    int size;
    double determinant;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinant);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        answer = (TextView) findViewById(R.id.answer);
        nameA = (TextView) findViewById(R.id.nameA);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = getFragmentManager().findFragmentById(R.id.fragmentsCont);
                Matrix.determinantMatrix = Read_Writer.ReadRectangleMatrix(size, size, frag);
               // Matrix.determinantMatrix = Read_Writer.ReadSquareMatrix(size, frag);
                if (Matrix.determinantMatrix == null){
                    Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();return;
                }
                Determinant(size);
                answer.setText("det|A|= "+determinant);

                /*Intent intent = new Intent(view.getContext(),AnswerActivity.class);
                intent.putExtra("OPERATION", "det|A| = ");
                view.getContext().startActivity(intent);*/
            }
        });

        createButton = (CardView) findViewById(R.id.createCardView);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText("");
                nameA.setText("A=");

                matrixSize = (EditText) findViewById(R.id.matrixSize);
                size = Integer.parseInt(matrixSize.getText().toString());

                Variables.sizeRow = size;
                Variables.sizeColumn = size;

                ftran = getFragmentManager().beginTransaction() .setCustomAnimations(R.animator.shoy,R.animator.shoy);
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

    public void obnulenie(double[][]mass,int z,int n){
        int e=1;okr(mass,n);
        while(e+z<n){okr(mass,n);
            int w = 0;
            for(int j=0;j<n;j++){if (mass[z][j]!=0){w=j;break;}}
            double q=(-1)*(mass[z+e][w]/mass[z][w]);
            for(int j=0;j<n;j++){okr(mass,n);
                mass[z+e][j]=mass[z][j]*q+mass[z+e][j];
            }e++;}
    }
    //---------------------------------------------------------------------
    public void okr(double[][]mass,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mass[i][j]=mass[i][j]*1000000;double q=Math.round(mass[i][j]);
                mass[i][j]=q/1000000;
            }}
    }
    //---------------------------------------------------------------------

    public void Determinant(int size){

        for(int i=0;i<size-1;i++){
            obnulenie(Matrix.determinantMatrix,i,size);
        }
        determinant = 1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){determinant = determinant * Matrix.determinantMatrix[i][j];}
            }}
    }
}
