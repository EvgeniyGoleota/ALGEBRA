package Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TableRow;

import com.example.administrator.algebra.R;

public class Fragment_matrix_2_5 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.matrix_2_5, null);
        if (getArguments() != null) {
            TableRow secondRow = (TableRow) view.findViewById(R.id.secondRow);
            secondRow.setVisibility(View.GONE);

            int coord = getArguments().getInt("coord");

            switch (coord) {
                case 2: {
                    (view.findViewById(R.id.a13)).setVisibility(View.GONE);
                    (view.findViewById(R.id.a14)).setVisibility(View.GONE);
                    (view.findViewById(R.id.a15)).setVisibility(View.GONE);
                } break;
                case 3: {
                    (view.findViewById(R.id.a14)).setVisibility(View.GONE);
                    (view.findViewById(R.id.a15)).setVisibility(View.GONE);
                } break;
                case 4: {
                    (view.findViewById(R.id.a15)).setVisibility(View.GONE);
                } break;
            }
        }
        return view;
    }
}
