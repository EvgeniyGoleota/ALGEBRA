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
import Fragments.Fragment_system_2_2;
import Fragments.Fragment_system_3_3;
import Fragments.Fragment_system_4_4;
import Fragments.Fragment_system_5_5;
import HelperClasses.Matrix;
import HelperClasses.Read_Writer;
import HelperClasses.Variables;

public class SystemActivity extends AppCompatActivity {

    FragmentTransaction ftran;

    CardView createButton;
    EditText matrixSizeRow, matrixSizeColumn;
    int sizeRow, sizeColumn;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        answer = (TextView) findViewById(R.id.answer);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragA = getFragmentManager().findFragmentById(R.id.fragmentsContA);
                Matrix.rectangleMatrixA = Read_Writer.ReadRectangleMatrix(Variables.sizeRow, Variables.sizeColumn+1, fragA);
                if (Matrix.rectangleMatrixA == null){
                    Snackbar.make(view, "Элементы системы не заполнены", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();return;
                }

                Solution(Matrix.rectangleMatrixA);

                /*Intent intent = new Intent(view.getContext(),AnswerActivity.class);
                intent.putExtra("OPERATION","k*A = ");
                view.getContext().startActivity(intent);*/

//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });

        createButton = (CardView) findViewById(R.id.createCardView);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //matrixSizeRow      = (EditText) findViewById(R.id.system_col_Rows);
                matrixSizeColumn = (EditText) findViewById(R.id.system_col_variables);

                //sizeRow    = Integer.parseInt(matrixSizeRow.getText().toString());
                //sizeColumn = Integer.parseInt(matrixSizeColumn.getText().toString());
                int size = Integer.parseInt(matrixSizeColumn.getText().toString());

                //Variables.sizeRow    = sizeRow;
                //Variables.sizeColumn = sizeColumn;
                Variables.sizeRow = size;
                Variables.sizeColumn = size;

                ftran = getFragmentManager().beginTransaction().setCustomAnimations(R.animator.shoy, R.animator.shoy);
                switch (size) {
                    case 2: {
                        ftran.add(R.id.fragmentsContA, new Fragment_system_2_2());
                    }
                    break;
                    case 3: {
                        ftran.add(R.id.fragmentsContA, new Fragment_system_3_3());
                    }
                    break;
                    case 4: {
                        ftran.add(R.id.fragmentsContA, new Fragment_system_4_4());
                    }
                    break;
                    case 5: {
                        ftran.add(R.id.fragmentsContA, new Fragment_system_5_5());
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

    public static void obnulenie(double[][]mass,int z,int n){
        int e=1;okr(mass,n);
        while(e+z<n){okr(mass,n);
            int w = 0;
            for(int j=0;j<n;j++){if (mass[z][j]!=0){w=j;break;}}
            double q=(-1)*(mass[z+e][w]/mass[z][w]);
            for(int j=0;j<n+1;j++){okr(mass,n);
                mass[z+e][j]=mass[z][j]*q+mass[z+e][j];
            }e++;}
    }
    //--------------------------------------------------------------------
    public static boolean proverka(double[][] mass,int n){
        for(int i=0;i<n;i++){
            int x=0;okr(mass,n);
            for(int j=0;j<n;j++){okr(mass,n);
                if(mass[i][j]!=0){x=1;}
            }if(x==0){return true;}
        }return false;
    }
    //-------------------------------------------------------------------
    public static void naxodX(double[][]mass,double[]X,int n,int i){
        int u=0;
        for(int j=0;j<n;j++){okr(mass,n);
            if (mass[i][j]!=0){u=j;break;}
        }

        if(u==2){X[2]=mass[n-1][n]/mass[n-1][n-1];}
        else {double sum=mass[i][n];
            for(int j=n-1;j>u;j--){
                sum=sum-mass[i][j];okr(mass,n);
            }okr(mass,n);okrX(X,n);
            X[i]=sum/mass[i][u];okr(mass,n);okrX(X,n);
        }
        if(i>0){for(int l=i-1;l>=0;l--){okrX(X,n);
            mass[l][u]=mass[l][u]*X[i];okr(mass,n);
        }}
    }
    //---------------------------------------------------------------------
    public static void okr(double[][]mass,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                mass[i][j]=mass[i][j]*1000000;double q=Math.round(mass[i][j]);
                mass[i][j]=q/1000000;
            }}
    }
    //---------------------------------------------------------------------
    public static void okrX(double[]mass,int n){
        for(int i=0;i<n;i++){
            mass[i]=mass[i]*1000000;double q=Math.round(mass[i]);
            mass[i]=q/1000000;
        }
    }
    //--------------------------------------------------------------------
    public void Solution(double[][] matr) {
        int n=Variables.sizeRow;
        //double[][] matr = Matrix.rectangleMatrixA;
        double[] X=new double[n];
        //for(int s=0;s<n-1;s++)
        for(int i=0;i<n-1;i++){
            obnulenie(matr,i,n);
        }
        if(proverka(matr,n)){System.out.println("Sistem has infinite number of solutions");return;}
        for(int i=n-1;i>=0;i--){
            naxodX(matr,X,n,i);
        }
        switch (n){
            case 2:{
                answer.setText("X1 = "+X[0]+"\n"+"X2 = "+X[1]);
            }break;
            case 3:{
                answer.setText("X1 = "+X[0]+"\n"+"X2 = "+X[1]+"\n"+"X3 = "+X[2]);
            }break;
            case 4:{
                answer.setText("X1 = "+X[0]+"\n"+"X2 = "+X[1]+"\n"+"X3 = "+X[2]+"\n"+"X4 = "+X[3]);
            }break;
            case 5:{
                answer.setText("X1 = "+X[0]+"\n"+"X2 = "+X[1]+"\n"+"X3 = "+X[2]+"\n"+"X4 = "+X[3]+"\n"+"X5 = "+X[4]);
            }break;
        }
    }




}
