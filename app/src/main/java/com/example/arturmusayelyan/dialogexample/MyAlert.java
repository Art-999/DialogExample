package com.example.arturmusayelyan.dialogexample;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by artur.musayelyan on 25/12/2017.
 */

public class MyAlert extends DialogFragment {
    public MyAlert() {

    }

    public static MyAlert newInstance() {
        Bundle args = new Bundle();
        MyAlert fragment = new MyAlert();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //setCancelable(false);
        builder.setTitle("My Dialog");
       // builder.setMessage("Do you like this dialog?");
        builder.setMultiChoiceItems(R.array.days, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                Toast.makeText(getActivity(), "item was selected "+which+" was selected "+isChecked, Toast.LENGTH_SHORT).show();
            }
        });
        
        //List e avelasnum
//        builder.setItems(R.array.days, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(getActivity(), "item was selected "+which, Toast.LENGTH_SHORT).show();
//            }
//        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Negative button was clicked", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Positive button was clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Dialog dialog = builder.create();

        return dialog;
    }
}
