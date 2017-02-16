package com.example.sunxia.androiddemo.weight;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    private int mWidth;
    private int mHeight;
    private Paint mPaint;

    public Paint getmPaint() {
        return mPaint;
    }

    public void setmPaint(Paint mPaint) {
        this.mPaint = mPaint;
    }

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // 初始化画笔
        mPaint.setColor(Color.GRAY);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 获取View宽高与画笔并根据此绘制内容

        canvas.translate(mWidth / 2, mHeight / 2);
        canvas.drawCircle(0,0,100,mPaint);
    }
}