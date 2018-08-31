package demo.video.com.ljgchina.net.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Author:XWQ
 * Time   2018/8/22
 * Descrition: this is Temper
 */

public class Temper extends ViewGroup
{
    private Paint paint;

    private TemperatureView temperatureView;

    public Temper(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public Temper(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec,heightMeasureSpec);
    }

    private void init(Context context)
    {
        paint=new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Color.parseColor("#FF7256"));
        temperatureView=new TemperatureView(context);
        addView(temperatureView);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3)
    {
        //Log.d("data","============="+getWidth());
        //Log.d("data","============="+getHeight());
        temperatureView.layout(0,0,getWidth(),getHeight());
    }
}
