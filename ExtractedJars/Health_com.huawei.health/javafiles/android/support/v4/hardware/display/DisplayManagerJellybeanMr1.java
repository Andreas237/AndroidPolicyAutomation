// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

final class DisplayManagerJellybeanMr1
{

	DisplayManagerJellybeanMr1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Display getDisplay(Object obj, int i)
	{
		return ((DisplayManager)obj).getDisplay(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class DisplayManager>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #19  <Method Display DisplayManager.getDisplay(int)>
	//    4    8:areturn         
	}

	public static Object getDisplayManager(Context context)
	{
		return context.getSystemService("display");
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <String "display">
	//    2    3:invokevirtual   #29  <Method Object Context.getSystemService(String)>
	//    3    6:areturn         
	}

	public static Display[] getDisplays(Object obj)
	{
		return ((DisplayManager)obj).getDisplays();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class DisplayManager>
	//    2    4:invokevirtual   #34  <Method Display[] DisplayManager.getDisplays()>
	//    3    7:areturn         
	}

	public static Display[] getDisplays(Object obj, String s)
	{
		return ((DisplayManager)obj).getDisplays(s);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class DisplayManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method Display[] DisplayManager.getDisplays(String)>
	//    4    8:areturn         
	}
}
