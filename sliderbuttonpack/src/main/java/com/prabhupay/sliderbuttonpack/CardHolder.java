package com.prabhupay.sliderbuttonpack;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class CardHolder extends FrameLayout {

    TextView yourName;

    public CardHolder(@NonNull Context context) {
        super(context);
        init(context,null);
    }

    public CardHolder(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,null);
    }

    public CardHolder(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, null);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CardHolder(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(Context context, View view){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view==null){
            view = inflater.inflate(R.layout.card_holder,this, true);
        }
        yourName = view.findViewById(R.id.yourName);
    }

    public void setValue(String name){
        if (name!=null){
            yourName.setText(name);
        }
        else {
            yourName.setText("Invalid");
        }
    }
}
