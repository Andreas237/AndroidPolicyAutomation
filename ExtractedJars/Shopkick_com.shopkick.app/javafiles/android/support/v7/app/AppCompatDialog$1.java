// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.KeyEvent;

// Referenced classes of package android.support.v7.app:
//			AppCompatDialog

class AppCompatDialog$1
	implements android.support.v4.view..Component
{

	public boolean superDispatchKeyEvent(KeyEvent keyevent)
	{
		return AppCompatDialog.this.superDispatchKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AppCompatDialog this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method boolean AppCompatDialog.superDispatchKeyEvent(KeyEvent)>
	//    4    8:ireturn         
	}

	final AppCompatDialog this$0;

	AppCompatDialog$1()
	{
		this$0 = AppCompatDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AppCompatDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
