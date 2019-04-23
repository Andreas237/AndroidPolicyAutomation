// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

private static class ViewCompat$OnUnhandledKeyEventListenerWrapper
	implements android.view.View.OnUnhandledKeyEventListener
{

	public boolean onUnhandledKeyEvent(View view, KeyEvent keyevent)
	{
		return mCompatListener.onUnhandledKeyEvent(view, keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewCompat$OnUnhandledKeyEventListenerCompat mCompatListener>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #28  <Method boolean ViewCompat$OnUnhandledKeyEventListenerCompat.onUnhandledKeyEvent(View, KeyEvent)>
	//    5   11:ireturn         
	}

	private ViewCompat.OnUnhandledKeyEventListenerCompat mCompatListener;

	ViewCompat$OnUnhandledKeyEventListenerWrapper(ViewCompat.OnUnhandledKeyEventListenerCompat onunhandledkeyeventlistenercompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mCompatListener = onunhandledkeyeventlistenercompat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field ViewCompat$OnUnhandledKeyEventListenerCompat mCompatListener>
	//    5    9:return          
	}
}
