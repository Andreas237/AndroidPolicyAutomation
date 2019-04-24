// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			TooltipCompat, TooltipCompatHandler

private static class TooltipCompat$BaseViewCompatImpl
	implements TooltipCompat.ViewCompatImpl
{

	public void setTooltipText(View view, CharSequence charsequence)
	{
		TooltipCompatHandler.setTooltipText(view, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #24  <Method void TooltipCompatHandler.setTooltipText(View, CharSequence)>
	//    3    5:return          
	}

	private TooltipCompat$BaseViewCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	TooltipCompat$BaseViewCompatImpl(TooltipCompat._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void TooltipCompat$BaseViewCompatImpl()>
	//    2    4:return          
	}
}
