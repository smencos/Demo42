package com.example.demo1.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class ErrorDialogFragment extends DialogFragment {
	private Dialog dialog;
	public ErrorDialogFragment(){
		super();
	}
	
	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstance){
		return dialog;
		
	}

}
