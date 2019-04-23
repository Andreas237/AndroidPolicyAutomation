// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

public static abstract class BaseTransientBottomBar$BaseCallback
{
	public static interface DismissEvent
		extends Annotation
	{
	}


	public void onDismissed(Object obj, int i)
	{
	//    0    0:return          
	}

	public void onShown(Object obj)
	{
	//    0    0:return          
	}

	public static final int DISMISS_EVENT_ACTION = 1;
	public static final int DISMISS_EVENT_CONSECUTIVE = 4;
	public static final int DISMISS_EVENT_MANUAL = 3;
	public static final int DISMISS_EVENT_SWIPE = 0;
	public static final int DISMISS_EVENT_TIMEOUT = 2;

	public BaseTransientBottomBar$BaseCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}
}
