// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			ProcessLifecycleOwner

class ProcessLifecycleOwner$2
	implements nitializationListener
{

	public void onCreate()
	{
	//    0    0:return          
	}

	public void onResume()
	{
		activityResumed();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ProcessLifecycleOwner this$0>
	//    2    4:invokevirtual   #23  <Method void ProcessLifecycleOwner.activityResumed()>
	//    3    7:return          
	}

	public void onStart()
	{
		activityStarted();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ProcessLifecycleOwner this$0>
	//    2    4:invokevirtual   #27  <Method void ProcessLifecycleOwner.activityStarted()>
	//    3    7:return          
	}

	final ProcessLifecycleOwner this$0;

	ProcessLifecycleOwner$2()
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
