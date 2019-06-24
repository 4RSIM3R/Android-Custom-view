package com.studio.suku.kesepuluh;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import static android.view.Gravity.CENTER;

public class MyButton extends android.support.v7.widget.AppCompatButton {

    private Drawable enabledBackground, disabledBackground;
    private int textColor;

    public MyButton(Context context) {
        super(context);
        init();
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackground(isEnabled() ? enabledBackground : disabledBackground);
        setTextColor(textColor);
        setTextSize(12.f);
        setGravity(CENTER);
        setText(isEnabled() ? "Submit" : "Isi Dulu");
    }

    private void init(){
        textColor = ContextCompat.getColor(getContext(), android.R.color.background_light);
        enabledBackground = getResources().getDrawable(R.drawable.bg_button);
        disabledBackground = getResources().getDrawable(R.drawable.bg_button_disable);
    }
}