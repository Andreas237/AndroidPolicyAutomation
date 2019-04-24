// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl

class FragmentManagerImpl$1
	implements Runnable
{

	public void run()
	{
		execPendingActions();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentManagerImpl this$0>
	//    2    4:invokevirtual   #23  <Method boolean FragmentManagerImpl.execPendingActions()>
	//    3    7:pop             
	//    4    8:return          
	}

	final FragmentManagerImpl this$0;

	FragmentManagerImpl$1()
	{
		this$0 = FragmentManagerImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field FragmentManagerImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
