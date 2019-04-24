// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.listener;

import android.view.MotionEvent;

public interface OnChartGestureListener
{

	public abstract void onChartDoubleTapped(MotionEvent motionevent);

	public abstract void onChartFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1);

	public abstract void onChartGestureEnd(MotionEvent motionevent, ChartTouchListener.ChartGesture chartgesture);

	public abstract void onChartGestureStart(MotionEvent motionevent, ChartTouchListener.ChartGesture chartgesture);

	public abstract void onChartLongPressed(MotionEvent motionevent);

	public abstract void onChartScale(MotionEvent motionevent, float f, float f1);

	public abstract void onChartSingleTapped(MotionEvent motionevent);

	public abstract void onChartTranslate(MotionEvent motionevent, float f, float f1);
}
