// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;


// Referenced classes of package android.support.v4.view:
//			WindowInsetsCompat, WindowInsetsCompatApi20

static class WindowInsetsCompat$WindowInsetsCompatApi20Impl extends WindowInsetsCompat.WindowInsetsCompatBaseImpl
{

	public WindowInsetsCompat consumeSystemWindowInsets(Object obj)
	{
		return new WindowInsetsCompat(WindowInsetsCompatApi20.consumeSystemWindowInsets(obj));
	//    0    0:new             #6   <Class WindowInsetsCompat>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #19  <Method Object WindowInsetsCompatApi20.consumeSystemWindowInsets(Object)>
	//    4    8:invokespecial   #22  <Method void WindowInsetsCompat(Object)>
	//    5   11:areturn         
	}

	public Object getSourceWindowInsets(Object obj)
	{
		return WindowInsetsCompatApi20.getSourceWindowInsets(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method Object WindowInsetsCompatApi20.getSourceWindowInsets(Object)>
	//    2    4:areturn         
	}

	public int getSystemWindowInsetBottom(Object obj)
	{
		return WindowInsetsCompatApi20.getSystemWindowInsetBottom(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method int WindowInsetsCompatApi20.getSystemWindowInsetBottom(Object)>
	//    2    4:ireturn         
	}

	public int getSystemWindowInsetLeft(Object obj)
	{
		return WindowInsetsCompatApi20.getSystemWindowInsetLeft(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method int WindowInsetsCompatApi20.getSystemWindowInsetLeft(Object)>
	//    2    4:ireturn         
	}

	public int getSystemWindowInsetRight(Object obj)
	{
		return WindowInsetsCompatApi20.getSystemWindowInsetRight(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method int WindowInsetsCompatApi20.getSystemWindowInsetRight(Object)>
	//    2    4:ireturn         
	}

	public int getSystemWindowInsetTop(Object obj)
	{
		return WindowInsetsCompatApi20.getSystemWindowInsetTop(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #38  <Method int WindowInsetsCompatApi20.getSystemWindowInsetTop(Object)>
	//    2    4:ireturn         
	}

	public boolean hasInsets(Object obj)
	{
		return WindowInsetsCompatApi20.hasInsets(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method boolean WindowInsetsCompatApi20.hasInsets(Object)>
	//    2    4:ireturn         
	}

	public boolean hasSystemWindowInsets(Object obj)
	{
		return WindowInsetsCompatApi20.hasSystemWindowInsets(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method boolean WindowInsetsCompatApi20.hasSystemWindowInsets(Object)>
	//    2    4:ireturn         
	}

	public boolean isRound(Object obj)
	{
		return WindowInsetsCompatApi20.isRound(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #48  <Method boolean WindowInsetsCompatApi20.isRound(Object)>
	//    2    4:ireturn         
	}

	public WindowInsetsCompat replaceSystemWindowInsets(Object obj, int i, int j, int k, int l)
	{
		return new WindowInsetsCompat(WindowInsetsCompatApi20.replaceSystemWindowInsets(obj, i, j, k, l));
	//    0    0:new             #6   <Class WindowInsetsCompat>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:iload           5
	//    7   11:invokestatic    #53  <Method Object WindowInsetsCompatApi20.replaceSystemWindowInsets(Object, int, int, int, int)>
	//    8   14:invokespecial   #22  <Method void WindowInsetsCompat(Object)>
	//    9   17:areturn         
	}

	WindowInsetsCompat$WindowInsetsCompatApi20Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void WindowInsetsCompat$WindowInsetsCompatBaseImpl()>
	//    2    4:return          
	}
}
