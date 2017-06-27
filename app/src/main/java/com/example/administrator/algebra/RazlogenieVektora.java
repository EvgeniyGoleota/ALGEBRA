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
import HelperClasses.Variables;

public class RazlogenieVektora extends AppCompatActivity {

    TextView nameB;
    TextView nameC;
    TextView nameD;
    TextView nameE;
    FrameLayout fA;
    FrameLayout fB;
    FrameLayout fC;
    FrameLayout fD;
    FrameLayout fE;
    EditText coordCount;
    RelativeLayout createCard;
    FloatingActionButton fab;

    FragmentTransaction ftran;
    int coorCount;
    ArrayList<double[]> vectorList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_razlogenie_vektora);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameB = (TextView) findViewById(R.id.nameB);
        nameC = (TextView) findViewById(R.id.nameC);
        nameD = (TextView) findViewById(R.id.nameD);
        nameE = (TextView) findViewById(R.id.nameE);
        fA = (FrameLayout) findViewById(R.id.fragmentsContA);
        fB = (FrameLayout) findViewById(R.id.fragmentsContB);
        fC = (FrameLayout) findViewById(R.id.fragmentsContC);
        fD = (FrameLayout) findViewById(R.id.fragmentsContD);
        fE = (FrameLayout) findViewById(R.id.fragmentsContE);
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

                coorCount = Integer.valueOf(coordCount.getText().toString());

                switch (coorCount + 1) {
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
                nameB.setText("");
                nameC.setText("");
                nameD.setText("");
                nameE.setText("");
                fC.setVisibility(View.VISIBLE);
                fD.setVisibility(View.VISIBLE);
                fE.setVisibility(View.VISIBLE);

                ftran = getFragmentManager().beginTransaction().setCustomAnimations(R.animator.shoy, R.animator.shoy);
                switch (Integer.valueOf(coordCount.getText().toString()) + 1) {
                    case 3:{
                        nameB.setText("A=");
                        nameC.setText("B=");
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
                        nameB.setText("A=");
                        nameC.setText("B=");
                        nameD.setText("C=");
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
                        nameB.setText("A=");
                        nameC.setText("B=");
                        nameD.setText("C=");
                        nameE.setText("D=");

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
        double[][] matr = new double[coorCount][coorCount + 1];
        for (double[] row: matr)
            Arrays.fill(row, 0);
        for (int i = 0; i < vectorList.size()-1; i++) {
            for (int j = 0; j < coorCount; j++) {
                matr[j][i] = vectorList.get(i+1)[j];
            }
        }
        for (int i = 0; i < coorCount; i++) {
            matr[i][coorCount] = Matrix.vectorA[i];
        }

        Solution(matr);
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
        int n = coorCount;
        //double[][] matr = Matrix.rectangleMatrixA;
        double[] X = new double[n];
        //for(int s=0;s<n-1;s++)
        for (int i = 0; i < n - 1; i++) {
            obnulenie(matr, i, n);
        }
        if (proverka(matr, n)) {
            System.out.println("Sistem has infinite number of solutions");
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            naxodX(matr, X, n, i);
        }
        switch (n) {
            case 2: {
                Toast.makeText(this, "X = " + X[0] +"A + " + X[1] +"B", Toast.LENGTH_LONG).show();
            }
            break;
            case 3: {
                Toast.makeText(this, "X = " + X[0] +"A + " + X[1] +"B + " +  X[2] + "C", Toast.LENGTH_LONG).show();
            }
            break;
            case 4: {
                Toast.makeText(this, "X = " + X[0] +"A + " + X[1] +"B + " + X[2] +"C + " + X[3] + "D", Toast.LENGTH_LONG).show();
            }
            break;
            case 5: {
                Toast.makeText(this, "X = " + X[0] +"A + " + X[1] +"B + " + X[2] +"C + " + X[3] +"D + " + X[4] + "E", Toast.LENGTH_LONG).show();
            }
            break;
        }
    }
}
