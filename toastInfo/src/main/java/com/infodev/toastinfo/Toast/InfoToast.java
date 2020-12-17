package com.infodev.toastinfo.Toast;

import android.app.Activity;
import android.content.Context;
import android.icu.text.IDNA;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;
import com.infodev.toastinfo.R;

public class InfoToast {
    Context context;
    TextView toastMessageView;
    View toastView;
    ImageView toastImage;
    CardView mainView;
    Toast toast ;
    private static final String TAG = "InfoToast";

    public InfoToast(Context context) {
        this.context = context;
        init();
    }

    public void init() {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        toastView = inflater.inflate(R.layout.info_toast_layout, null);
        toast = new Toast(context);
        LinearLayout linearLayout = (LinearLayout) toastView.findViewById(R.id.nams_toast);
        toastMessageView = (TextView) toastView.findViewById(R.id.toastMessage);
        mainView = (CardView) toastView.findViewById(R.id.mainView);
        toastImage = (ImageView) toastView.findViewById(R.id.toastImage);

    }


    public void error(String message) {
        if (context != null) {
            mainView.setCardBackgroundColor(context.getColor(R.color.colorError));
            Glide.with(context).load(context.getDrawable(R.drawable.ic_errormessage)).into(toastImage);
            toastMessageView.setText(message);

            toast.setView(toastView);
            toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void sucess(String message){
        if (context!=null){
            mainView.setCardBackgroundColor(context.getColor(R.color.colorSucess));
            Glide.with(context).load(context.getDrawable(R.drawable.ic_sucess)).into(toastImage);
            toastMessageView.setText(message);
            toast.setView(toastView);
            toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public void info(String message){
        if (context!=null){
            mainView.setCardBackgroundColor(context.getColor(R.color.colorInfo));
            Glide.with(context).load(context.getDrawable(R.drawable.ic_info)).into(toastImage);
            toastMessageView.setText(message);
            toast.setView(toastView);
            toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
        }

    }

    public InfoToast setTextSize(float value){
        toastMessageView.setTextSize(value);
        return this;
    }

    public InfoToast setDuration(int value){
        toast.setDuration(value);
        return this;
    }

    public InfoToast hideImage(){
        toastImage.setVisibility(View.GONE);
        return this;
    }

    public InfoToast setToastColor(int color){
        mainView.setCardBackgroundColor(color);
        return this;
    }

    public InfoToast setTextColor(int color){
        toastMessageView.setTextColor(color);
        return this;
    }



}
