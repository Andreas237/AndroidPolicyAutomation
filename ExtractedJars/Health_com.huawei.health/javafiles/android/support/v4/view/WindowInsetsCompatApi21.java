// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.WindowInsets;

class WindowInsetsCompatApi21
{

	WindowInsetsCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Object consumeStableInsets(Object obj)
	{
		return ((Object) (((WindowInsets)obj).consumeStableInsets()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #19  <Method WindowInsets WindowInsets.consumeStableInsets()>
	//    3    7:areturn         
	}

	public static int getStableInsetBottom(Object obj)
	{
		return ((WindowInsets)obj).getStableInsetBottom();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #24  <Method int WindowInsets.getStableInsetBottom()>
	//    3    7:ireturn         
	}

	public static int getStableInsetLeft(Object obj)
	{
		return ((WindowInsets)obj).getStableInsetLeft();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #27  <Method int WindowInsets.getStableInsetLeft()>
	//    3    7:ireturn         
	}

	public static int getStableInsetRight(Object obj)
	{
		return ((WindowInsets)obj).getStableInsetRight();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #30  <Method int WindowInsets.getStableInsetRight()>
	//    3    7:ireturn         
	}

	public static int getStableInsetTop(Object obj)
	{
		return ((WindowInsets)obj).getStableInsetTop();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #33  <Method int WindowInsets.getStableInsetTop()>
	//    3    7:ireturn         
	}

	public static boolean hasStableInsets(Object obj)
	{
		return ((WindowInsets)obj).hasStableInsets();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #38  <Method boolean WindowInsets.hasStableInsets()>
	//    3    7:ireturn         
	}

	public static boolean isConsumed(Object obj)
	{
		return ((WindowInsets)obj).isConsumed();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #41  <Method boolean WindowInsets.isConsumed()>
	//    3    7:ireturn         
	}

	public static Object replaceSystemWindowInsets(Object obj, Rect rect)
	{
		return ((Object) (((WindowInsets)obj).replaceSystemWindowInsets(rect)));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method WindowInsets WindowInsets.replaceSystemWindowInsets(Rect)>
	//    4    8:areturn         
	}
}
