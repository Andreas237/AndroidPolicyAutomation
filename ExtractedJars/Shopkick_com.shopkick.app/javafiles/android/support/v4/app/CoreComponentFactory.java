// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.*;
import android.content.*;

public class CoreComponentFactory extends AppComponentFactory
{
	public static interface CompatWrapped
	{

		public abstract Object getWrapper();
	}


	public CoreComponentFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AppComponentFactory()>
	//    2    4:return          
	}

	static Object checkCompatWrapper(Object obj)
	{
		if(obj instanceof CompatWrapped)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #6   <Class CoreComponentFactory$CompatWrapped>
	//*   2    4:ifeq            23
		{
			Object obj1 = ((CompatWrapped)obj).getWrapper();
	//    3    7:aload_0         
	//    4    8:checkcast       #6   <Class CoreComponentFactory$CompatWrapped>
	//    5   11:invokeinterface #29  <Method Object CoreComponentFactory$CompatWrapped.getWrapper()>
	//    6   16:astore_1        
			if(obj1 != null)
	//*   7   17:aload_1         
	//*   8   18:ifnull          23
				return obj1;
	//    9   21:aload_1         
	//   10   22:areturn         
		}
		return obj;
	//   11   23:aload_0         
	//   12   24:areturn         
	}

	public Activity instantiateActivity(ClassLoader classloader, String s, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (Activity)checkCompatWrapper(((Object) (super.instantiateActivity(classloader, s, intent))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #41  <Method Activity AppComponentFactory.instantiateActivity(ClassLoader, String, Intent)>
	//    5    7:invokestatic    #43  <Method Object checkCompatWrapper(Object)>
	//    6   10:checkcast       #45  <Class Activity>
	//    7   13:areturn         
	}

	public Application instantiateApplication(ClassLoader classloader, String s)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (Application)checkCompatWrapper(((Object) (super.instantiateApplication(classloader, s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #50  <Method Application AppComponentFactory.instantiateApplication(ClassLoader, String)>
	//    4    6:invokestatic    #43  <Method Object checkCompatWrapper(Object)>
	//    5    9:checkcast       #52  <Class Application>
	//    6   12:areturn         
	}

	public ContentProvider instantiateProvider(ClassLoader classloader, String s)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (ContentProvider)checkCompatWrapper(((Object) (super.instantiateProvider(classloader, s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #56  <Method ContentProvider AppComponentFactory.instantiateProvider(ClassLoader, String)>
	//    4    6:invokestatic    #43  <Method Object checkCompatWrapper(Object)>
	//    5    9:checkcast       #58  <Class ContentProvider>
	//    6   12:areturn         
	}

	public BroadcastReceiver instantiateReceiver(ClassLoader classloader, String s, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (BroadcastReceiver)checkCompatWrapper(((Object) (super.instantiateReceiver(classloader, s, intent))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #62  <Method BroadcastReceiver AppComponentFactory.instantiateReceiver(ClassLoader, String, Intent)>
	//    5    7:invokestatic    #43  <Method Object checkCompatWrapper(Object)>
	//    6   10:checkcast       #64  <Class BroadcastReceiver>
	//    7   13:areturn         
	}

	public Service instantiateService(ClassLoader classloader, String s, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (Service)checkCompatWrapper(((Object) (super.instantiateService(classloader, s, intent))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #68  <Method Service AppComponentFactory.instantiateService(ClassLoader, String, Intent)>
	//    5    7:invokestatic    #43  <Method Object checkCompatWrapper(Object)>
	//    6   10:checkcast       #70  <Class Service>
	//    7   13:areturn         
	}

	private static final String TAG = "CoreComponentFactory";
}
