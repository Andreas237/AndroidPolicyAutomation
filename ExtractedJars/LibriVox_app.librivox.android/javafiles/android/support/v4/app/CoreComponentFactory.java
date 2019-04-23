// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.*;
import android.content.*;

// Referenced classes of package android.support.v4.app:
//			o

public class CoreComponentFactory extends AppComponentFactory
{

	public CoreComponentFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void AppComponentFactory()>
	//    2    4:return          
	}

	static Object a(Object obj)
	{
		if(obj instanceof o)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #13  <Class o>
	//*   2    4:ifeq            23
		{
			Object obj1 = ((o)obj).a();
	//    3    7:aload_0         
	//    4    8:checkcast       #13  <Class o>
	//    5   11:invokeinterface #16  <Method Object o.a()>
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
	{
		return (Activity)a(((Object) (super.instantiateActivity(classloader, s, intent))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #20  <Method Activity AppComponentFactory.instantiateActivity(ClassLoader, String, Intent)>
	//    5    7:invokestatic    #22  <Method Object a(Object)>
	//    6   10:checkcast       #24  <Class Activity>
	//    7   13:areturn         
	}

	public Application instantiateApplication(ClassLoader classloader, String s)
	{
		return (Application)a(((Object) (super.instantiateApplication(classloader, s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method Application AppComponentFactory.instantiateApplication(ClassLoader, String)>
	//    4    6:invokestatic    #22  <Method Object a(Object)>
	//    5    9:checkcast       #30  <Class Application>
	//    6   12:areturn         
	}

	public ContentProvider instantiateProvider(ClassLoader classloader, String s)
	{
		return (ContentProvider)a(((Object) (super.instantiateProvider(classloader, s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #34  <Method ContentProvider AppComponentFactory.instantiateProvider(ClassLoader, String)>
	//    4    6:invokestatic    #22  <Method Object a(Object)>
	//    5    9:checkcast       #36  <Class ContentProvider>
	//    6   12:areturn         
	}

	public BroadcastReceiver instantiateReceiver(ClassLoader classloader, String s, Intent intent)
	{
		return (BroadcastReceiver)a(((Object) (super.instantiateReceiver(classloader, s, intent))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #40  <Method BroadcastReceiver AppComponentFactory.instantiateReceiver(ClassLoader, String, Intent)>
	//    5    7:invokestatic    #22  <Method Object a(Object)>
	//    6   10:checkcast       #42  <Class BroadcastReceiver>
	//    7   13:areturn         
	}

	public Service instantiateService(ClassLoader classloader, String s, Intent intent)
	{
		return (Service)a(((Object) (super.instantiateService(classloader, s, intent))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #46  <Method Service AppComponentFactory.instantiateService(ClassLoader, String, Intent)>
	//    5    7:invokestatic    #22  <Method Object a(Object)>
	//    6   10:checkcast       #48  <Class Service>
	//    7   13:areturn         
	}
}
