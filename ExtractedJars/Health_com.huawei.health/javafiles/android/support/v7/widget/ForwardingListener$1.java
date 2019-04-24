// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ForwardingListener

class ForwardingListener$1
	implements android.view.ngeListener
{

	public void onViewAttachedToWindow(View view)
	{
	//    0    0:return          
	}

	public void onViewDetachedFromWindow(View view)
	{
		ForwardingListener.access$000(ForwardingListener.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ForwardingListener this$0>
	//    2    4:invokestatic    #26  <Method void ForwardingListener.access$000(ForwardingListener)>
	//    3    7:return          
	}

	final ForwardingListener this$0;

	ForwardingListener$1()
	{
		this$0 = ForwardingListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ForwardingListener this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
