// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			ProcessLifecycleOwner

class ProcessLifecycleOwner$1
	implements Runnable
{

	public void run()
	{
		ProcessLifecycleOwner.access$000(ProcessLifecycleOwner.this);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ProcessLifecycleOwner this$0>
	//    2    4:invokestatic    #22  <Method void ProcessLifecycleOwner.access$000(ProcessLifecycleOwner)>
		ProcessLifecycleOwner.access$100(ProcessLifecycleOwner.this);
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field ProcessLifecycleOwner this$0>
	//    5   11:invokestatic    #25  <Method void ProcessLifecycleOwner.access$100(ProcessLifecycleOwner)>
	//    6   14:return          
	}

	final ProcessLifecycleOwner this$0;

	ProcessLifecycleOwner$1()
	{
		this$0 = ProcessLifecycleOwner.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ProcessLifecycleOwner this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
