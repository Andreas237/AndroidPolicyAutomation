// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.view.View;

// Referenced classes of package android.databinding:
//			ViewDataBinding

static final class ViewDataBinding$6
	implements android.view.ChangeListener
{

	public void onViewAttachedToWindow(View view)
	{
		ViewDataBinding.access$100(ViewDataBinding.getBinding(view)).run();
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method ViewDataBinding ViewDataBinding.getBinding(View)>
	//    2    4:invokestatic    #26  <Method Runnable ViewDataBinding.access$100(ViewDataBinding)>
	//    3    7:invokeinterface #31  <Method void Runnable.run()>
		view.removeOnAttachStateChangeListener(((android.view.ChangeListener) (this)));
	//    4   12:aload_1         
	//    5   13:aload_0         
	//    6   14:invokevirtual   #37  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//    7   17:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
	//    0    0:return          
	}

	ViewDataBinding$6()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
