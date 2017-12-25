package com.example.arturmusayelyan.dialogexample;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

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
        Dialog dialog = builder.create();

        return dialog;
    }
}
