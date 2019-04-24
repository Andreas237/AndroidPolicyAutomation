// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			TooltipCompat

private static class TooltipCompat$Api26ViewCompatImpl
	implements TooltipCompat.ViewCompatImpl
{

	public void setTooltipText(View view, CharSequence charsequence)
	{
		view.setTooltipText(charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #28  <Method void View.setTooltipText(CharSequence)>
	//    3    5:return          
	}

	private TooltipCompat$Api26ViewCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	TooltipCompat$Api26ViewCompatImpl(TooltipCompat._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void TooltipCompat$Api26ViewCompatImpl()>
	//    2    4:return          
	}
}
