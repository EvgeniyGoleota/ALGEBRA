package com.example.administrator.algebra;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MatrixRecycler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrics_recycler);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        RecyclerView rv = (RecyclerView) findViewById(R.id.matrix_recyclerview);

        rv.setLayoutManager(new LinearLayoutManager(rv.getContext()));
        rv.setAdapter(new MatrixRecyclerViewAdapter());
    }


    public static class MatrixRecyclerViewAdapter extends RecyclerView.Adapter<MatrixRecyclerViewAdapter.ViewHolder> {

        List<String> matrixPoint;

        public MatrixRecyclerViewAdapter() {
            matrixPoint = new ArrayList<String>();
            matrixPoint.add("Сложение матриц");                 //0
            matrixPoint.add("Вычитание матриц");                //1
            matrixPoint.add("Произведение матрицы на число");   //2
            matrixPoint.add("Умножение матриц");                //3
            matrixPoint.add("Нахождение обратной матрицы");     //4
            matrixPoint.add("Транспонирование матрицы А");      //5
            matrixPoint.add("Нахождение определителя");         //6
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.matrix_recycler_item,parent,false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.text.setText(matrixPoint.get(position));
            switch (position){
                case 0:{
                    holder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context,SumActivity.class);
                            context.startActivity(intent);
                        }
                    });
                }break;
                case 1:{
                    holder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context,DifferenceActivity.class);
                            context.startActivity(intent);
                        }
                    });
                }break;
                case 2:{
                    holder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context,MultiplicationActivity.class);
                            context.startActivity(intent);
                        }
                    });
                }break;
                case 3:{
                    holder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context,MatrixMultiplication.class);
                            context.startActivity(intent);
                        }
                    });
                }break;
                case 4:{
                    holder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context,InverseMatrixActivity.class);
                            context.startActivity(intent);
                        }
                    });
                }break;
                case 5:{
                    holder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context,TranspositionActivity.class);
                            context.startActivity(intent);
                        }
                    });
                }break;
                case 6:{
                    holder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context,DeterminantActivity.class);
                            context.startActivity(intent);
                        }
                    });
                }break;
            }
        }

        @Override
        public int getItemCount() {return matrixPoint.size();}

        public class ViewHolder extends RecyclerView.ViewHolder{

            CardView cardView;
            TextView text;

            public ViewHolder(View itemView) {
                super(itemView);
                cardView = (CardView) itemView.findViewById(R.id.matrix_cardView);
                text = (TextView) itemView.findViewById(R.id.point_name);
            }
        }
    }


}
