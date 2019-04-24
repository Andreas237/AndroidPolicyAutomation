// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;


// Referenced classes of package android.support.design.widget:
//			Snackbar

public static class Snackbar$Callback extends mBar.BaseCallback
{

	public void onDismissed(Snackbar snackbar, int i)
	{
	//    0    0:return          
	}

	public volatile void onDismissed(Object obj, int i)
	{
		onDismissed((Snackbar)obj, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class Snackbar>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #29  <Method void onDismissed(Snackbar, int)>
	//    5    9:return          
	}

	public void onShown(Snackbar snackbar)
	{
	//    0    0:return          
	}

	public volatile void onShown(Object obj)
	{
		onShown((Snackbar)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #7   <Class Snackbar>
	//    3    5:invokevirtual   #34  <Method void onShown(Snackbar)>
	//    4    8:return          
	}

	public static final int DISMISS_EVENT_ACTION = 1;
	public static final int DISMISS_EVENT_CONSECUTIVE = 4;
	public static final int DISMISS_EVENT_MANUAL = 3;
	public static final int DISMISS_EVENT_SWIPE = 0;
	public static final int DISMISS_EVENT_TIMEOUT = 2;

	public Snackbar$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BaseTransientBottomBar$BaseCallback()>
	//    2    4:return          
	}
}
