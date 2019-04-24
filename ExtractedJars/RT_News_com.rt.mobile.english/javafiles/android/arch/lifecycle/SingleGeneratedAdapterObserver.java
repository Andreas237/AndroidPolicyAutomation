// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			GenericLifecycleObserver, GeneratedAdapter, LifecycleOwner

public class SingleGeneratedAdapterObserver
	implements GenericLifecycleObserver
{

	SingleGeneratedAdapterObserver(GeneratedAdapter generatedadapter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mGeneratedAdapter = generatedadapter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field GeneratedAdapter mGeneratedAdapter>
	//    5    9:return          
	}

	public void onStateChanged(LifecycleOwner lifecycleowner, Lifecycle.Event event)
	{
		mGeneratedAdapter.callMethods(lifecycleowner, event, false, ((MethodCallsLogger) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GeneratedAdapter mGeneratedAdapter>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:aconst_null     
	//    6    8:invokeinterface #28  <Method void GeneratedAdapter.callMethods(LifecycleOwner, Lifecycle$Event, boolean, MethodCallsLogger)>
		mGeneratedAdapter.callMethods(lifecycleowner, event, true, ((MethodCallsLogger) (null)));
	//    7   13:aload_0         
	//    8   14:getfield        #19  <Field GeneratedAdapter mGeneratedAdapter>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:iconst_1        
	//   12   20:aconst_null     
	//   13   21:invokeinterface #28  <Method void GeneratedAdapter.callMethods(LifecycleOwner, Lifecycle$Event, boolean, MethodCallsLogger)>
	//   14   26:return          
	}

	private final GeneratedAdapter mGeneratedAdapter;
}
