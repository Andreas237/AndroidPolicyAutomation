// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.WindowInsets;

class WindowInsetsCompatApi20
{

	WindowInsetsCompatApi20()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Object consumeSystemWindowInsets(Object obj)
	{
		return ((Object) (((WindowInsets)obj).consumeSystemWindowInsets()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #19  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
	//    3    7:areturn         
	}

	public static Object getSourceWindowInsets(Object obj)
	{
		return ((Object) (new WindowInsets((WindowInsets)obj)));
	//    0    0:new             #16  <Class WindowInsets>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:checkcast       #16  <Class WindowInsets>
	//    4    8:invokespecial   #23  <Method void WindowInsets(WindowInsets)>
	//    5   11:areturn         
	}

	public static int getSystemWindowInsetBottom(Object obj)
	{
		return ((WindowInsets)obj).getSystemWindowInsetBottom();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #28  <Method int WindowInsets.getSystemWindowInsetBottom()>
	//    3    7:ireturn         
	}

	public static int getSystemWindowInsetLeft(Object obj)
	{
		return ((WindowInsets)obj).getSystemWindowInsetLeft();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #31  <Method int WindowInsets.getSystemWindowInsetLeft()>
	//    3    7:ireturn         
	}

	public static int getSystemWindowInsetRight(Object obj)
	{
		return ((WindowInsets)obj).getSystemWindowInsetRight();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #34  <Method int WindowInsets.getSystemWindowInsetRight()>
	//    3    7:ireturn         
	}

	public static int getSystemWindowInsetTop(Object obj)
	{
		return ((WindowInsets)obj).getSystemWindowInsetTop();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #37  <Method int WindowInsets.getSystemWindowInsetTop()>
	//    3    7:ireturn         
	}

	public static boolean hasInsets(Object obj)
	{
		return ((WindowInsets)obj).hasInsets();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #42  <Method boolean WindowInsets.hasInsets()>
	//    3    7:ireturn         
	}

	public static boolean hasSystemWindowInsets(Object obj)
	{
		return ((WindowInsets)obj).hasSystemWindowInsets();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #45  <Method boolean WindowInsets.hasSystemWindowInsets()>
	//    3    7:ireturn         
	}

	public static boolean isRound(Object obj)
	{
		return ((WindowInsets)obj).isRound();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:invokevirtual   #48  <Method boolean WindowInsets.isRound()>
	//    3    7:ireturn         
	}

	public static Object replaceSystemWindowInsets(Object obj, int i, int j, int k, int l)
	{
		return ((Object) (((WindowInsets)obj).replaceSystemWindowInsets(i, j, k, l)));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class WindowInsets>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #53  <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//    7   12:areturn         
	}
}
