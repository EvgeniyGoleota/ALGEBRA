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

public class RangSistemOfVectors extends AppCompatActivity {

    TextView nameA;
    TextView nameB;
    TextView nameC;
    TextView nameD;
    TextView nameE;
    FrameLayout fA;
    FrameLayout fB;
    FrameLayout fC;
    FrameLayout fD;
    FrameLayout fE;
    EditText vectorCount;
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
        setContentView(R.layout.activity_zavisimos_sistem_ot_vector);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameA = (TextView) findViewById(R.id.nameA);
        nameB = (TextView) findViewById(R.id.nameB);
        nameC = (TextView) findViewById(R.id.nameC);
        nameD = (TextView) findViewById(R.id.nameD);
        nameE = (TextView) findViewById(R.id.nameE);
        fA = (FrameLayout) findViewById(R.id.fragmentsContA);
        fB = (FrameLayout) findViewById(R.id.fragmentsContB);
        fC = (FrameLayout) findViewById(R.id.fragmentsContC);
        fD = (FrameLayout) findViewById(R.id.fragmentsContD);
        fE = (FrameLayout) findViewById(R.id.fragmentsContE);
        vectorCount = (EditText) findViewById(R.id.vector_count);
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

                vecCount = Integer.valueOf(vectorCount.getText().toString());
                coorCount = Integer.valueOf(coordCount.getText().toString());

                switch (Integer.valueOf(vectorCount.getText().toString())) {
                    case 2: {
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
                    } break;

                    case 3: {
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

                        Fragment fragC = getFragmentManager().findFragmentById(R.id.fragmentsContC);
                        Matrix.vectorC = Read_Writer.ReadRectangleMatrix(coorCount,fragC);
                        if (Matrix.vectorC == null){
                            Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();return;
                        }
                        vectorList.addAll(Arrays.asList(Matrix.vectorA, Matrix.vectorB, Matrix.vectorC));
                    } break;

                    case 4: {
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

                        Fragment fragC = getFragmentManager().findFragmentById(R.id.fragmentsContC);
                        Matrix.vectorC = Read_Writer.ReadRectangleMatrix(coorCount,fragC);
                        if (Matrix.vectorC == null){
                            Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();return;
                        }

                        Fragment fragD = getFragmentManager().findFragmentById(R.id.fragmentsContD);
                        Matrix.vectorD = Read_Writer.ReadRectangleMatrix(coorCount,fragD);
                        if (Matrix.vectorD == null){
                            Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();return;
                        }
                        vectorList.addAll(Arrays.asList(Matrix.vectorA, Matrix.vectorB, Matrix.vectorC, Matrix.vectorD));
                    } break;

                    case 5: {
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

                        Fragment fragC = getFragmentManager().findFragmentById(R.id.fragmentsContC);
                        Matrix.vectorC = Read_Writer.ReadRectangleMatrix(coorCount,fragC);
                        if (Matrix.vectorC == null){
                            Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();return;
                        }

                        Fragment fragD = getFragmentManager().findFragmentById(R.id.fragmentsContD);
                        Matrix.vectorD = Read_Writer.ReadRectangleMatrix(coorCount,fragD);
                        if (Matrix.vectorD == null){
                            Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();return;
                        }
                        Fragment fragE = getFragmentManager().findFragmentById(R.id.fragmentsContE);
                        Matrix.vectorE = Read_Writer.ReadRectangleMatrix(coorCount,fragE);
                        if (Matrix.vectorE == null){
                            Snackbar.make(view, "Матрица не заполнена", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();return;
                        }
                        vectorList.addAll(Arrays.asList(Matrix.vectorA, Matrix.vectorB, Matrix.vectorC, Matrix.vectorD, Matrix.vectorE));
                    } break;
                }

                calculate();
            }
        });

        createCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameA.setText("");
                nameB.setText("");
                nameC.setText("");
                nameD.setText("");
                nameE.setText("");
                fC.setVisibility(View.VISIBLE);
                fD.setVisibility(View.VISIBLE);
                fE.setVisibility(View.VISIBLE);

                ftran = getFragmentManager().beginTransaction().setCustomAnimations(R.animator.shoy, R.animator.shoy);
                switch (Integer.valueOf(vectorCount.getText().toString())) {
                    case 2:{
                        nameA.setText("A=");
                        nameB.setText("B=");
                        fC.setVisibility(View.GONE);
                        fD.setVisibility(View.GONE);
                        fE.setVisibility(View.GONE);

                        Bundle bundle = new Bundle();
                        bundle.putInt("coord", Integer.valueOf(coordCount.getText().toString()));

                        Fragment_matrix_2_5 frag1 = new Fragment_matrix_2_5();
                        frag1.setArguments(bundle);
                        ftran.add(R.id.fragmentsContA, frag1);

                        Fragment_matrix_2_5 frag2 = new Fragment_matrix_2_5();
                        frag2.setArguments(bundle);
                        ftran.add(R.id.fragmentsContB, frag2);
                    } break;
                    case 3:{
                        nameA.setText("A=");
                        nameB.setText("B=");
                        nameC.setText("C=");
                        fD.setVisibility(View.GONE);
                        fE.setVisibility(View.GONE);

                        Bundle bundle = new Bundle();
                        bundle.putInt("coord", Integer.valueOf(coordCount.getText().toString()));

                        Fragment_matrix_2_5 frag1 = new Fragment_matrix_2_5();
                        frag1.setArguments(bundle);
                        ftran.add(R.id.fragmentsContA, frag1);

                        Fragment_matrix_2_5 frag2 = new Fragment_matrix_2_5();
                        frag2.setArguments(bundle);
                        ftran.add(R.id.fragmentsContB, frag2);

                        Fragment_matrix_2_5 frag3 = new Fragment_matrix_2_5();
                        frag3.setArguments(bundle);
                        ftran.add(R.id.fragmentsContC, frag3);
                    } break;
                    case 4:{
                        nameA.setText("A=");
                        nameB.setText("B=");
                        nameC.setText("C=");
                        nameD.setText("D=");
                        fE.setVisibility(View.GONE);

                        Bundle bundle = new Bundle();
                        bundle.putInt("coord", Integer.valueOf(coordCount.getText().toString()));

                        Fragment_matrix_2_5 frag1 = new Fragment_matrix_2_5();
                        frag1.setArguments(bundle);
                        ftran.add(R.id.fragmentsContA, frag1);

                        Fragment_matrix_2_5 frag2 = new Fragment_matrix_2_5();
                        frag2.setArguments(bundle);
                        ftran.add(R.id.fragmentsContB, frag2);

                        Fragment_matrix_2_5 frag3 = new Fragment_matrix_2_5();
                        frag3.setArguments(bundle);
                        ftran.add(R.id.fragmentsContC, frag3);

                        Fragment_matrix_2_5 frag4 = new Fragment_matrix_2_5();
                        frag4.setArguments(bundle);
                        ftran.add(R.id.fragmentsContD, frag4);
                    } break;
                    case 5: {
                        nameA.setText("A=");
                        nameB.setText("B=");
                        nameC.setText("C=");
                        nameD.setText("D=");
                        nameE.setText("E=");

                        Bundle bundle = new Bundle();
                        bundle.putInt("coord", Integer.valueOf(coordCount.getText().toString()));

                        Fragment_matrix_2_5 frag1 = new Fragment_matrix_2_5();
                        frag1.setArguments(bundle);
                        ftran.add(R.id.fragmentsContA, frag1);

                        Fragment_matrix_2_5 frag2 = new Fragment_matrix_2_5();
                        frag2.setArguments(bundle);
                        ftran.add(R.id.fragmentsContB, frag2);

                        Fragment_matrix_2_5 frag3 = new Fragment_matrix_2_5();
                        frag3.setArguments(bundle);
                        ftran.add(R.id.fragmentsContC, frag3);

                        Fragment_matrix_2_5 frag4 = new Fragment_matrix_2_5();
                        frag4.setArguments(bundle);
                        ftran.add(R.id.fragmentsContD, frag4);

                        Fragment_matrix_2_5 frag5 = new Fragment_matrix_2_5();
                        frag5.setArguments(bundle);
                        ftran.add(R.id.fragmentsContE, frag5);
                    } break;
                }

                ftran.addToBackStack(null);
                ftran.commit();
            }
        });
    }

    public void calculate(){
        Matrix.rectangleAnswerMatrix = new double[1][coorCount];
        if (coorCount != vecCount) {
            Toast.makeText(this, "Размер указан не верно", Toast.LENGTH_SHORT).show();
            return;
        }
        double[][] matr = new double[coorCount][vecCount];
        for (double[] row: matr)
            Arrays.fill(row, 0);
        for (int i = 0; i < vectorList.size(); i++) {
            for (int j = 0; j < coorCount; j++) {
                matr[j][i] = vectorList.get(i)[j];
            }
        }
        Solution(matr);
    }

    public static void obnulenie(double[][]mass,int z,int n){
        int e=1;okr(mass,n);
        while(e+z<n){okr(mass,n);
            int w = 0;
            for(int j=0;j<n;j++){if (mass[z][j]!=0){w=j;break;}}
            double q=(-1)*(mass[z+e][w]/mass[z][w]);
            for(int j=0;j<n;j++){okr(mass,n);
                mass[z+e][j]=mass[z][j]*q+mass[z+e][j];
            }e++;}
    }
    //--------------------------------------------------------------------
    public int proverka(double[][] mass,int n){
        int x=0;
        for(int i=0;i<n;i++) {
            okr(mass,n);
            for(int j=0;j<n;j++) {
                okr(mass,n);
                if(mass[i][j]!=0) {
                    x+=1;
                    break;
                }
            }
        }
        return x;
    }
    //---------------------------------------------------------------------
    public static void okr(double[][]mass,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mass[i][j]=mass[i][j]*1000000;double q=Math.round(mass[i][j]);
                mass[i][j]=q/1000000;
            }}
    }
    //--------------------------------------------------------------------
    public void Solution(double[][] matr) {
        int n = coorCount;
        for (int i = 0;i < n - 1;i++){
            obnulenie(matr,i,n);
        }
            Toast.makeText(this, "Система векторов имеет ранг " + proverka(matr,n), Toast.LENGTH_LONG).show();
    }
}
