package demo.video.com.ljgchina.net.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

/**
 * Author:XWQ
 * Time   2018/8/22
 * Descrition: this is TemperatureView
 */

public class TemperatureView extends View
{
    private Paint paint_stoken;

    private Paint ciclePaint;

    private int width, height;

    private Paint paint;

    private ArrayList<coordinate> list = new ArrayList<>();

    public TemperatureView(Context context)
    {
        this(context, null);
    }

    public TemperatureView(Context context, @Nullable AttributeSet attrs)
    {
        this(context, attrs, 0);
    }

    public TemperatureView(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context)
    {
        ciclePaint = new Paint();
        ciclePaint.setAntiAlias(true);
        ciclePaint.setStyle(Paint.Style.FILL);
        ciclePaint.setColor(Color.parseColor("#FF7256"));

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(20.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Color.parseColor("#FF7256"));

        paint_stoken = new Paint();
        paint_stoken.setAntiAlias(true);
        paint_stoken.setStyle(Paint.Style.STROKE);
        paint_stoken.setStrokeWidth(5.0f);
        paint_stoken.setStrokeCap(Paint.Cap.ROUND);
        paint_stoken.setColor(Color.parseColor("#CD3700"));
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        width = getWidth();
        height = getHeight();
        canvas.drawCircle(width / 2, height / 2 + 50, 50, ciclePaint);
        canvas.drawLine(width / 2, 100, width / 2, height / 2, paint);
        canvas.drawLine(width / 2, 100, width / 2, height / 2, paint_stoken);
    }
}

