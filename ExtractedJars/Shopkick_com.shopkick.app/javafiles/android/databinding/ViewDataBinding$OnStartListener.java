// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.arch.lifecycle.LifecycleObserver;

// Referenced classes of package android.databinding:
//			ViewDataBinding

public class ViewDataBinding$OnStartListener
	implements LifecycleObserver
{

	public void onStart()
	{
		executePendingBindings();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ViewDataBinding this$0>
	//    2    4:invokevirtual   #30  <Method void ViewDataBinding.executePendingBindings()>
	//    3    7:return          
	}

	final ViewDataBinding this$0;

	private ViewDataBinding$OnStartListener()
	{
		this$0 = ViewDataBinding.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ViewDataBinding this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	ViewDataBinding$OnStartListener(ViewDataBinding._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void ViewDataBinding$OnStartListener(ViewDataBinding)>
	//    3    5:return          
	}
}
