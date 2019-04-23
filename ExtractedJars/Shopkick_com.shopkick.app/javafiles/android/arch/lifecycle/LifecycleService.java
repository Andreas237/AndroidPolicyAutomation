// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

// Referenced classes of package android.arch.lifecycle:
//			LifecycleOwner, ServiceLifecycleDispatcher, Lifecycle

public class LifecycleService extends Service
	implements LifecycleOwner
{

	public LifecycleService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ServiceLifecycleDispatcher>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #17  <Method void ServiceLifecycleDispatcher(LifecycleOwner)>
	//    7   13:putfield        #19  <Field ServiceLifecycleDispatcher mDispatcher>
	//    8   16:return          
	}

	public Lifecycle getLifecycle()
	{
		return mDispatcher.getLifecycle();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ServiceLifecycleDispatcher mDispatcher>
	//    2    4:invokevirtual   #24  <Method Lifecycle ServiceLifecycleDispatcher.getLifecycle()>
	//    3    7:areturn         
	}

	public IBinder onBind(Intent intent)
	{
		mDispatcher.onServicePreSuperOnBind();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ServiceLifecycleDispatcher mDispatcher>
	//    2    4:invokevirtual   #31  <Method void ServiceLifecycleDispatcher.onServicePreSuperOnBind()>
		return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
	}

	public void onCreate()
	{
		mDispatcher.onServicePreSuperOnCreate();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ServiceLifecycleDispatcher mDispatcher>
	//    2    4:invokevirtual   #36  <Method void ServiceLifecycleDispatcher.onServicePreSuperOnCreate()>
		super.onCreate();
	//    3    7:aload_0         
	//    4    8:invokespecial   #38  <Method void Service.onCreate()>
	//    5   11:return          
	}

	public void onDestroy()
	{
		mDispatcher.onServicePreSuperOnDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ServiceLifecycleDispatcher mDispatcher>
	//    2    4:invokevirtual   #42  <Method void ServiceLifecycleDispatcher.onServicePreSuperOnDestroy()>
		super.onDestroy();
	//    3    7:aload_0         
	//    4    8:invokespecial   #44  <Method void Service.onDestroy()>
	//    5   11:return          
	}

	public void onStart(Intent intent, int i)
	{
		mDispatcher.onServicePreSuperOnStart();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ServiceLifecycleDispatcher mDispatcher>
	//    2    4:invokevirtual   #49  <Method void ServiceLifecycleDispatcher.onServicePreSuperOnStart()>
		super.onStart(intent, i);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #51  <Method void Service.onStart(Intent, int)>
	//    7   13:return          
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		return super.onStartCommand(intent, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #55  <Method int Service.onStartCommand(Intent, int, int)>
	//    5    7:ireturn         
	}

	private final ServiceLifecycleDispatcher mDispatcher = new ServiceLifecycleDispatcher(((LifecycleOwner) (this)));
}
