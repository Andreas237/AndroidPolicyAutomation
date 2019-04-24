// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			ForwardingListener

private class ForwardingListener$TriggerLongPress
	implements Runnable
{

	public void run()
	{
		onLongPress();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ForwardingListener this$0>
	//    2    4:invokevirtual   #23  <Method void ForwardingListener.onLongPress()>
	//    3    7:return          
	}

	final ForwardingListener this$0;

	ForwardingListener$TriggerLongPress()
	{
		this$0 = ForwardingListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ForwardingListener this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
