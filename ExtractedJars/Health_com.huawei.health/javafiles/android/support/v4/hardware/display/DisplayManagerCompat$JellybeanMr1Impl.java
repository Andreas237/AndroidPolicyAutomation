// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.display;

import android.content.Context;
import android.view.Display;

// Referenced classes of package android.support.v4.hardware.display:
//			DisplayManagerCompat, DisplayManagerJellybeanMr1

static class DisplayManagerCompat$JellybeanMr1Impl extends DisplayManagerCompat
{

	public Display getDisplay(int i)
	{
		return DisplayManagerJellybeanMr1.getDisplay(mDisplayManagerObj, i);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object mDisplayManagerObj>
	//    2    4:iload_1         
	//    3    5:invokestatic    #26  <Method Display DisplayManagerJellybeanMr1.getDisplay(Object, int)>
	//    4    8:areturn         
	}

	public Display[] getDisplays()
	{
		return DisplayManagerJellybeanMr1.getDisplays(mDisplayManagerObj);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object mDisplayManagerObj>
	//    2    4:invokestatic    #31  <Method Display[] DisplayManagerJellybeanMr1.getDisplays(Object)>
	//    3    7:areturn         
	}

	public Display[] getDisplays(String s)
	{
		return DisplayManagerJellybeanMr1.getDisplays(mDisplayManagerObj, s);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object mDisplayManagerObj>
	//    2    4:aload_1         
	//    3    5:invokestatic    #35  <Method Display[] DisplayManagerJellybeanMr1.getDisplays(Object, String)>
	//    4    8:areturn         
	}

	private final Object mDisplayManagerObj;

	public DisplayManagerCompat$JellybeanMr1Impl(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void DisplayManagerCompat()>
		mDisplayManagerObj = DisplayManagerJellybeanMr1.getDisplayManager(context);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #18  <Method Object DisplayManagerJellybeanMr1.getDisplayManager(Context)>
	//    5    9:putfield        #20  <Field Object mDisplayManagerObj>
	//    6   12:return          
	}
}
