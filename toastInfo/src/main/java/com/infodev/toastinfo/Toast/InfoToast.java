package com.infodev.toastinfo.Toast;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.infodev.toastinfo.R;

public class InfoToast {
    Context context;

    public InfoToast(Context context) {
        this.context = context;
    }

    public void showErrorToast(String message){
        if (context!=null){
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            View toastView = inflater.inflate(R.layout.toast_layout , null);
            LinearLayout linearLayout = (LinearLayout) toastView.findViewById(R.id.nams_toast);
            TextView toastMessageView = (TextView) toastView.findViewById(R.id.text);
            toastMessageView.setText(message);
            Toast toast = new Toast(context);
            toast.setView(toastView);
            toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL , 0 , 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
