// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;

// Referenced classes of package android.support.v4.view:
//			WindowInsetsCompat, WindowInsetsCompatApi21

static class WindowInsetsCompat$WindowInsetsCompatApi21Impl extends WindowInsetsCompat$WindowInsetsCompatApi20Impl
{

	public WindowInsetsCompat consumeStableInsets(Object obj)
	{
		return new WindowInsetsCompat(WindowInsetsCompatApi21.consumeStableInsets(obj));
	//    0    0:new             #6   <Class WindowInsetsCompat>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #19  <Method Object WindowInsetsCompatApi21.consumeStableInsets(Object)>
	//    4    8:invokespecial   #22  <Method void WindowInsetsCompat(Object)>
	//    5   11:areturn         
	}

	public int getStableInsetBottom(Object obj)
	{
		return WindowInsetsCompatApi21.getStableInsetBottom(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method int WindowInsetsCompatApi21.getStableInsetBottom(Object)>
	//    2    4:ireturn         
	}

	public int getStableInsetLeft(Object obj)
	{
		return WindowInsetsCompatApi21.getStableInsetLeft(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method int WindowInsetsCompatApi21.getStableInsetLeft(Object)>
	//    2    4:ireturn         
	}

	public int getStableInsetRight(Object obj)
	{
		return WindowInsetsCompatApi21.getStableInsetRight(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method int WindowInsetsCompatApi21.getStableInsetRight(Object)>
	//    2    4:ireturn         
	}

	public int getStableInsetTop(Object obj)
	{
		return WindowInsetsCompatApi21.getStableInsetTop(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method int WindowInsetsCompatApi21.getStableInsetTop(Object)>
	//    2    4:ireturn         
	}

	public boolean hasStableInsets(Object obj)
	{
		return WindowInsetsCompatApi21.hasStableInsets(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #39  <Method boolean WindowInsetsCompatApi21.hasStableInsets(Object)>
	//    2    4:ireturn         
	}

	public boolean isConsumed(Object obj)
	{
		return WindowInsetsCompatApi21.isConsumed(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method boolean WindowInsetsCompatApi21.isConsumed(Object)>
	//    2    4:ireturn         
	}

	public WindowInsetsCompat replaceSystemWindowInsets(Object obj, Rect rect)
	{
		return new WindowInsetsCompat(WindowInsetsCompatApi21.replaceSystemWindowInsets(obj, rect));
	//    0    0:new             #6   <Class WindowInsetsCompat>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #47  <Method Object WindowInsetsCompatApi21.replaceSystemWindowInsets(Object, Rect)>
	//    5    9:invokespecial   #22  <Method void WindowInsetsCompat(Object)>
	//    6   12:areturn         
	}

	WindowInsetsCompat$WindowInsetsCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void WindowInsetsCompat$WindowInsetsCompatApi20Impl()>
	//    2    4:return          
	}
}
