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

public class VectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView rv = (RecyclerView) findViewById(R.id.list);

        rv.setLayoutManager(new LinearLayoutManager(rv.getContext()));
        rv.setAdapter(new VectorRecyclerViewAdapter());
    }


    public static class VectorRecyclerViewAdapter extends RecyclerView.Adapter<VectorRecyclerViewAdapter.ViewHolder> {

        List<String> matrixPoint;

        public VectorRecyclerViewAdapter() {
            matrixPoint = new ArrayList<>();
            matrixPoint.add("Линейная зависимость/независимость системы векторов"); //0+
            matrixPoint.add("Проверка, явлиется ли вектора базисом");               //1+
            matrixPoint.add("Разложение вектора по базису");                        //2+
            matrixPoint.add("Матрица перехода");                                    //3+?
            matrixPoint.add("Связь между координатными столбцами");                 //4---
            matrixPoint.add("Ранг системы векторов");                               //5+
            matrixPoint.add("Процесс ортоганализациии");                            //6---
            matrixPoint.add("Нахождение скалярного произведения векторов");         //7+
            matrixPoint.add("Нахождение длины вектора(кормы)");                     //8+
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
                            Intent intent = new Intent(context,ZavisimosSistemOtVector.class);
                            context.startActivity(intent);
                        }
                    });
                }break;
                case 1:{
                    holder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context,BazisActivity.class);
                            context.startActivity(intent);
                        }
                    });
                }break;
                case 2:{
                    holder.cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Context context = v.getContext();
                            Intent intent = new Intent(context,RazlogenieVektora.class);
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
                            Intent intent = new Intent(context,RangSistemOfVectors.class);
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
                case 7:{
                        holder.cardView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Context context = v.getContext();
                                Intent intent = new Intent(context,ScolMultiplication.class);
                                context.startActivity(intent);
                            }
                        });
                }break;
                case 8:{
                        holder.cardView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Context context = v.getContext();
                                Intent intent = new Intent(context,lengthVectors.class);
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

