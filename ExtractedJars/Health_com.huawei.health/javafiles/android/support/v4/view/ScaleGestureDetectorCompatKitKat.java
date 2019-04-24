// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ScaleGestureDetector;

class ScaleGestureDetectorCompatKitKat
{

	private ScaleGestureDetectorCompatKitKat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isQuickScaleEnabled(Object obj)
	{
		return ((ScaleGestureDetector)obj).isQuickScaleEnabled();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class ScaleGestureDetector>
	//    2    4:invokevirtual   #19  <Method boolean ScaleGestureDetector.isQuickScaleEnabled()>
	//    3    7:ireturn         
	}

	public static void setQuickScaleEnabled(Object obj, boolean flag)
	{
		((ScaleGestureDetector)obj).setQuickScaleEnabled(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class ScaleGestureDetector>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #24  <Method void ScaleGestureDetector.setQuickScaleEnabled(boolean)>
	//    4    8:return          
	}
}
