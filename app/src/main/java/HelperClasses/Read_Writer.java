package HelperClasses;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.algebra.R;

public class Read_Writer {

    public static double[][] ReadSquareMatrix(int size,Fragment frag ){

        double[][] matrix = new double[size][size];

        switch (size){
            case 2: {
                matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());

                matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
            }break;
            case 3: {
                matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());

                matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());

                matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
            }break;
            case 4: {
                matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());

                matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());

                matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
                matrix[2][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a34)).getText().toString());

                matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());
                matrix[3][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a43)).getText().toString());
                matrix[3][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a44)).getText().toString());
            }break;
            case 5: {
                matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());
                matrix[0][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a15)).getText().toString());

                matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());
                matrix[1][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a25)).getText().toString());

                matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
                matrix[2][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a34)).getText().toString());
                matrix[2][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a35)).getText().toString());

                matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());
                matrix[3][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a43)).getText().toString());
                matrix[3][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a44)).getText().toString());
                matrix[3][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a45)).getText().toString());

                matrix[4][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a51)).getText().toString());
                matrix[4][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a52)).getText().toString());
                matrix[4][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a53)).getText().toString());
                matrix[4][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a54)).getText().toString());
                matrix[4][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a55)).getText().toString());
            }break;
        }

        return matrix;

    }

    public static double[] ReadRectangleMatrix(int sizeColumn,Fragment frag) {
        double[] Matrix = new double[sizeColumn];
        switch (sizeColumn) {
            case 2: {
                Matrix[0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                Matrix[1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
            } break;

            case 3: {
                Matrix[0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                Matrix[1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                Matrix[2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
            } break;

            case 4: {
                Matrix[0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                Matrix[1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                Matrix[2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                Matrix[3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());
            } break;

            case 5: {
                Matrix[0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                Matrix[1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                Matrix[2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                Matrix[3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());
                Matrix[4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a15)).getText().toString());
            } break;
        }

        return Matrix;
    }

    public static double[][] ReadRectangleMatrix(int sizeRow,int sizeColumn,Fragment frag ){
    try {
        double[][] Matrix = new double[sizeRow][sizeColumn];

        switch (sizeRow) {
            case 2: {
                switch (sizeColumn) {
                    case 2: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                    }
                    break;
                    case 3: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                    }
                    break;
                    case 4: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                        Matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                        Matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());
                    }
                    break;
                    case 5: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                        Matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());
                        Matrix[0][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a15)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                        Matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());
                        Matrix[1][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a25)).getText().toString());
                    }
                    break;
                }


            }
            break;
            case 3: {
                switch (sizeColumn) {
                    case 2: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                    }
                    break;
                    case 3: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                        Matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
                    }
                    break;
                    case 4: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                        Matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                        Matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                        Matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
                        Matrix[2][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a34)).getText().toString());
                    }
                    break;
                    case 5: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                        Matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());
                        Matrix[0][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a15)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                        Matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());
                        Matrix[1][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a25)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                        Matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
                        Matrix[2][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a34)).getText().toString());
                        Matrix[2][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a35)).getText().toString());
                    }
                    break;
                }
            }
            break;
            case 4: {
                switch (sizeColumn) {
                    case 2: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());

                        Matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                        Matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());
                    }
                    break;
                    case 3: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                        Matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());

                        Matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                        Matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());
                        Matrix[3][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a43)).getText().toString());

                    }
                    break;
                    case 4: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                        Matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                        Matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                        Matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
                        Matrix[2][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a34)).getText().toString());

                        Matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                        Matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());
                        Matrix[3][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a43)).getText().toString());
                        Matrix[3][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a44)).getText().toString());
                    }
                    break;
                    case 5: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                        Matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());
                        Matrix[0][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a15)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                        Matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());
                        Matrix[1][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a25)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                        Matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
                        Matrix[2][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a34)).getText().toString());
                        Matrix[2][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a35)).getText().toString());

                        Matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                        Matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());
                        Matrix[3][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a43)).getText().toString());
                        Matrix[3][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a44)).getText().toString());
                        Matrix[3][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a45)).getText().toString());
                    }
                    break;
                }
            }
            break;
            case 5: {
                switch (sizeColumn) {
                    case 2: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());

                        Matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                        Matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());

                        Matrix[4][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a51)).getText().toString());
                        Matrix[4][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a52)).getText().toString());
                    }
                    break;
                    case 3: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                        Matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());

                        Matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                        Matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());
                        Matrix[3][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a43)).getText().toString());

                        Matrix[4][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a51)).getText().toString());
                        Matrix[4][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a52)).getText().toString());
                        Matrix[4][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a53)).getText().toString());
                    }
                    break;
                    case 4: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                        Matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                        Matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                        Matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
                        Matrix[2][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a34)).getText().toString());

                        Matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                        Matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());
                        Matrix[3][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a43)).getText().toString());
                        Matrix[3][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a44)).getText().toString());

                        Matrix[4][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a51)).getText().toString());
                        Matrix[4][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a52)).getText().toString());
                        Matrix[4][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a53)).getText().toString());
                        Matrix[4][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a54)).getText().toString());
                    }
                    break;
                    case 5: {
                        Matrix[0][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a11)).getText().toString());
                        Matrix[0][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a12)).getText().toString());
                        Matrix[0][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a13)).getText().toString());
                        Matrix[0][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a14)).getText().toString());
                        Matrix[0][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a15)).getText().toString());

                        Matrix[1][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a21)).getText().toString());
                        Matrix[1][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a22)).getText().toString());
                        Matrix[1][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a23)).getText().toString());
                        Matrix[1][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a24)).getText().toString());
                        Matrix[1][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a25)).getText().toString());

                        Matrix[2][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a31)).getText().toString());
                        Matrix[2][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a32)).getText().toString());
                        Matrix[2][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a33)).getText().toString());
                        Matrix[2][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a34)).getText().toString());
                        Matrix[2][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a35)).getText().toString());

                        Matrix[3][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a41)).getText().toString());
                        Matrix[3][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a42)).getText().toString());
                        Matrix[3][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a43)).getText().toString());
                        Matrix[3][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a44)).getText().toString());
                        Matrix[3][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a45)).getText().toString());

                        Matrix[4][0] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a51)).getText().toString());
                        Matrix[4][1] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a52)).getText().toString());
                        Matrix[4][2] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a53)).getText().toString());
                        Matrix[4][3] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a54)).getText().toString());
                        Matrix[4][4] = Double.parseDouble(((EditText) frag.getView().findViewById(R.id.a55)).getText().toString());
                    }
                    break;
                }
            }
            break;
        }
        return Matrix;
    }catch (NullPointerException i){
        return null;
    }catch (NumberFormatException l){
        return null;
    }

    }



    public static void WriteSquareMatrix(int size,Fragment frag ){

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
