// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

// Referenced classes of package android.support.v4.hardware.display:
//			DisplayManagerCompat

private static class DisplayManagerCompat$DisplayManagerCompatApi17Impl extends DisplayManagerCompat
{

	public Display getDisplay(int i)
	{
		return mDisplayManager.getDisplay(i);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DisplayManager mDisplayManager>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #32  <Method Display DisplayManager.getDisplay(int)>
	//    4    8:areturn         
	}

	public Display[] getDisplays()
	{
		return mDisplayManager.getDisplays();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DisplayManager mDisplayManager>
	//    2    4:invokevirtual   #36  <Method Display[] DisplayManager.getDisplays()>
	//    3    7:areturn         
	}

	public Display[] getDisplays(String s)
	{
		return mDisplayManager.getDisplays(s);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DisplayManager mDisplayManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method Display[] DisplayManager.getDisplays(String)>
	//    4    8:areturn         
	}

	private final DisplayManager mDisplayManager;

	DisplayManagerCompat$DisplayManagerCompatApi17Impl(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void DisplayManagerCompat()>
		mDisplayManager = (DisplayManager)context.getSystemService("display");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <String "display">
	//    5    8:invokevirtual   #23  <Method Object Context.getSystemService(String)>
	//    6   11:checkcast       #25  <Class DisplayManager>
	//    7   14:putfield        #27  <Field DisplayManager mDisplayManager>
	//    8   17:return          
	}
}
