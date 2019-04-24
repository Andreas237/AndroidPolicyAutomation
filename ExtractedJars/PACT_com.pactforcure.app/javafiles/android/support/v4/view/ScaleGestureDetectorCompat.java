// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ScaleGestureDetector;

public final class ScaleGestureDetectorCompat
{

	private ScaleGestureDetectorCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isQuickScaleEnabled(ScaleGestureDetector scalegesturedetector)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return scalegesturedetector.isQuickScaleEnabled();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #22  <Method boolean ScaleGestureDetector.isQuickScaleEnabled()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean isQuickScaleEnabled(Object obj)
	{
		return isQuickScaleEnabled((ScaleGestureDetector)obj);
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class ScaleGestureDetector>
	//    2    4:invokestatic    #26  <Method boolean isQuickScaleEnabled(ScaleGestureDetector)>
	//    3    7:ireturn         
	}

	public static void setQuickScaleEnabled(ScaleGestureDetector scalegesturedetector, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			scalegesturedetector.setQuickScaleEnabled(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #32  <Method void ScaleGestureDetector.setQuickScaleEnabled(boolean)>
	//    6   13:return          
	}

	public static void setQuickScaleEnabled(Object obj, boolean flag)
	{
		setQuickScaleEnabled((ScaleGestureDetector)obj, flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #19  <Class ScaleGestureDetector>
	//    2    4:iload_1         
	//    3    5:invokestatic    #35  <Method void setQuickScaleEnabled(ScaleGestureDetector, boolean)>
	//    4    8:return          
	}
}
