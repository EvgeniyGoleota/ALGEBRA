package com.example.administrator.algebra;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import HelperClasses.Matrix;
import HelperClasses.Variables;

public class AnswerNFActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_nf);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });

        Intent intent = getIntent();
        //tvText.setText(intent.getStringExtra("OPERATION"));
        writeMatrix();
    }

    private void writeMatrix() {
        ((TextView) findViewById(R.id.a11)).setText("" + Matrix.rectangleAnswerMatrix[0][0]);
        ((TextView) findViewById(R.id.a12)).setText("" + Matrix.rectangleAnswerMatrix[0][1]);
        if (Variables.sizeColumn > 2)
        ((TextView) findViewById(R.id.a13)).setText("" + Matrix.rectangleAnswerMatrix[0][2]);
        if (Variables.sizeColumn > 3)
        ((TextView) findViewById(R.id.a14)).setText("" + Matrix.rectangleAnswerMatrix[0][3]);
        if (Variables.sizeColumn > 4)
        ((TextView) findViewById(R.id.a15)).setText("" + Matrix.rectangleAnswerMatrix[0][4]);

        ((TextView) findViewById(R.id.a21)).setText("" + Matrix.rectangleAnswerMatrix[1][0]);
        ((TextView) findViewById(R.id.a22)).setText("" + Matrix.rectangleAnswerMatrix[1][1]);
        if (Variables.sizeColumn > 2)
        ((TextView) findViewById(R.id.a23)).setText("" + Matrix.rectangleAnswerMatrix[1][2]);
        if (Variables.sizeColumn > 3)
        ((TextView) findViewById(R.id.a24)).setText("" + Matrix.rectangleAnswerMatrix[1][3]);
        if (Variables.sizeColumn > 4)
        ((TextView) findViewById(R.id.a25)).setText("" + Matrix.rectangleAnswerMatrix[1][4]);

        if (Variables.sizeRow < 3)return;

        ((TextView) findViewById(R.id.a31)).setText("" + Matrix.rectangleAnswerMatrix[2][0]);
        ((TextView) findViewById(R.id.a32)).setText("" + Matrix.rectangleAnswerMatrix[2][1]);
        if (Variables.sizeColumn > 2)
        ((TextView) findViewById(R.id.a33)).setText("" + Matrix.rectangleAnswerMatrix[2][2]);
        if (Variables.sizeColumn > 3)
        ((TextView) findViewById(R.id.a34)).setText("" + Matrix.rectangleAnswerMatrix[2][3]);
        if (Variables.sizeColumn > 4)
        ((TextView) findViewById(R.id.a35)).setText("" + Matrix.rectangleAnswerMatrix[2][4]);

        if (Variables.sizeRow < 4)return;

        ((TextView) findViewById(R.id.a41)).setText("" + Matrix.rectangleAnswerMatrix[3][0]);
        ((TextView) findViewById(R.id.a42)).setText("" + Matrix.rectangleAnswerMatrix[3][1]);
        if (Variables.sizeColumn > 2)
        ((TextView) findViewById(R.id.a43)).setText("" + Matrix.rectangleAnswerMatrix[3][2]);
        if (Variables.sizeColumn > 3)
        ((TextView) findViewById(R.id.a44)).setText("" + Matrix.rectangleAnswerMatrix[3][3]);
        if (Variables.sizeColumn > 4)
        ((TextView) findViewById(R.id.a45)).setText("" + Matrix.rectangleAnswerMatrix[3][4]);

        if (Variables.sizeRow < 5)return;

        ((TextView) findViewById(R.id.a51)).setText("" + Matrix.rectangleAnswerMatrix[4][0]);
        ((TextView) findViewById(R.id.a52)).setText("" + Matrix.rectangleAnswerMatrix[4][1]);
        if (Variables.sizeColumn > 2)
        ((TextView) findViewById(R.id.a53)).setText("" + Matrix.rectangleAnswerMatrix[4][2]);
        if (Variables.sizeColumn > 3)
        ((TextView) findViewById(R.id.a54)).setText("" + Matrix.rectangleAnswerMatrix[4][3]);
        if (Variables.sizeColumn > 4)
        ((TextView) findViewById(R.id.a55)).setText("" + Matrix.rectangleAnswerMatrix[4][4]);
    }

}
