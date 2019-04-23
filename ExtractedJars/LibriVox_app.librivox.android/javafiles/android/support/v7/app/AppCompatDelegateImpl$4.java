// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.graphics.Rect;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

class AppCompatDelegateImpl$4
	implements android.support.v7.widget.tSystemWindowsListener
{

	public void onFitSystemWindows(Rect rect)
	{
		rect.top = updateStatusGuard(rect.top);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #12  <Field AppCompatDelegateImpl this$0>
	//    3    5:aload_1         
	//    4    6:getfield        #24  <Field int Rect.top>
	//    5    9:invokevirtual   #30  <Method int AppCompatDelegateImpl.updateStatusGuard(int)>
	//    6   12:putfield        #24  <Field int Rect.top>
	//    7   15:return          
	}

	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$4()
	{
		this$0 = AppCompatDelegateImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field AppCompatDelegateImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
