// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package android.support.v4.app:
//			CoreComponentFactory

public class AppComponentFactory extends android.app.AppComponentFactory
{

	public AppComponentFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void android.app.AppComponentFactory()>
	//    2    4:return          
	}

	public final Activity instantiateActivity(ClassLoader classloader, String s, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (Activity)CoreComponentFactory.checkCompatWrapper(((Object) (instantiateActivityCompat(classloader, s, intent))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #23  <Method Activity instantiateActivityCompat(ClassLoader, String, Intent)>
	//    5    7:invokestatic    #29  <Method Object CoreComponentFactory.checkCompatWrapper(Object)>
	//    6   10:checkcast       #31  <Class Activity>
	//    7   13:areturn         
	}

	public Activity instantiateActivityCompat(ClassLoader classloader, String s, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		classloader = ((ClassLoader) ((Activity)classloader.loadClass(s).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #44  <Method Class ClassLoader.loadClass(String)>
	//    3    5:iconst_0        
	//    4    6:anewarray       Class[]
	//    5    9:invokevirtual   #50  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    6   12:iconst_0        
	//    7   13:anewarray       Object[]
	//    8   16:invokevirtual   #58  <Method Object Constructor.newInstance(Object[])>
	//    9   19:checkcast       #31  <Class Activity>
	//   10   22:astore_1        
		return ((Activity) (classloader));
	//   11   23:aload_1         
	//   12   24:areturn         
		classloader;
	//   13   25:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   14   26:goto            30
		classloader;
	//   15   29:astore_1        
		throw new RuntimeException("Couldn't call constructor", ((Throwable) (classloader)));
	//   16   30:new             #60  <Class RuntimeException>
	//   17   33:dup             
	//   18   34:ldc1            #62  <String "Couldn't call constructor">
	//   19   36:aload_1         
	//   20   37:invokespecial   #65  <Method void RuntimeException(String, Throwable)>
	//   21   40:athrow          
	}

	public final Application instantiateApplication(ClassLoader classloader, String s)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (Application)CoreComponentFactory.checkCompatWrapper(((Object) (instantiateApplicationCompat(classloader, s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #72  <Method Application instantiateApplicationCompat(ClassLoader, String)>
	//    4    6:invokestatic    #29  <Method Object CoreComponentFactory.checkCompatWrapper(Object)>
	//    5    9:checkcast       #74  <Class Application>
	//    6   12:areturn         
	}

	public Application instantiateApplicationCompat(ClassLoader classloader, String s)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		classloader = ((ClassLoader) ((Application)classloader.loadClass(s).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #44  <Method Class ClassLoader.loadClass(String)>
	//    3    5:iconst_0        
	//    4    6:anewarray       Class[]
	//    5    9:invokevirtual   #50  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    6   12:iconst_0        
	//    7   13:anewarray       Object[]
	//    8   16:invokevirtual   #58  <Method Object Constructor.newInstance(Object[])>
	//    9   19:checkcast       #74  <Class Application>
	//   10   22:astore_1        
		return ((Application) (classloader));
	//   11   23:aload_1         
	//   12   24:areturn         
		classloader;
	//   13   25:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   14   26:goto            30
		classloader;
	//   15   29:astore_1        
		throw new RuntimeException("Couldn't call constructor", ((Throwable) (classloader)));
	//   16   30:new             #60  <Class RuntimeException>
	//   17   33:dup             
	//   18   34:ldc1            #62  <String "Couldn't call constructor">
	//   19   36:aload_1         
	//   20   37:invokespecial   #65  <Method void RuntimeException(String, Throwable)>
	//   21   40:athrow          
	}

	public final ContentProvider instantiateProvider(ClassLoader classloader, String s)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (ContentProvider)CoreComponentFactory.checkCompatWrapper(((Object) (instantiateProviderCompat(classloader, s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #79  <Method ContentProvider instantiateProviderCompat(ClassLoader, String)>
	//    4    6:invokestatic    #29  <Method Object CoreComponentFactory.checkCompatWrapper(Object)>
	//    5    9:checkcast       #81  <Class ContentProvider>
	//    6   12:areturn         
	}

	public ContentProvider instantiateProviderCompat(ClassLoader classloader, String s)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		classloader = ((ClassLoader) ((ContentProvider)classloader.loadClass(s).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #44  <Method Class ClassLoader.loadClass(String)>
	//    3    5:iconst_0        
	//    4    6:anewarray       Class[]
	//    5    9:invokevirtual   #50  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    6   12:iconst_0        
	//    7   13:anewarray       Object[]
	//    8   16:invokevirtual   #58  <Method Object Constructor.newInstance(Object[])>
	//    9   19:checkcast       #81  <Class ContentProvider>
	//   10   22:astore_1        
		return ((ContentProvider) (classloader));
	//   11   23:aload_1         
	//   12   24:areturn         
		classloader;
	//   13   25:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   14   26:goto            30
		classloader;
	//   15   29:astore_1        
		throw new RuntimeException("Couldn't call constructor", ((Throwable) (classloader)));
	//   16   30:new             #60  <Class RuntimeException>
	//   17   33:dup             
	//   18   34:ldc1            #62  <String "Couldn't call constructor">
	//   19   36:aload_1         
	//   20   37:invokespecial   #65  <Method void RuntimeException(String, Throwable)>
	//   21   40:athrow          
	}

	public final BroadcastReceiver instantiateReceiver(ClassLoader classloader, String s, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (BroadcastReceiver)CoreComponentFactory.checkCompatWrapper(((Object) (instantiateReceiverCompat(classloader, s, intent))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #86  <Method BroadcastReceiver instantiateReceiverCompat(ClassLoader, String, Intent)>
	//    5    7:invokestatic    #29  <Method Object CoreComponentFactory.checkCompatWrapper(Object)>
	//    6   10:checkcast       #88  <Class BroadcastReceiver>
	//    7   13:areturn         
	}

	public BroadcastReceiver instantiateReceiverCompat(ClassLoader classloader, String s, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		classloader = ((ClassLoader) ((BroadcastReceiver)classloader.loadClass(s).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #44  <Method Class ClassLoader.loadClass(String)>
	//    3    5:iconst_0        
	//    4    6:anewarray       Class[]
	//    5    9:invokevirtual   #50  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    6   12:iconst_0        
	//    7   13:anewarray       Object[]
	//    8   16:invokevirtual   #58  <Method Object Constructor.newInstance(Object[])>
	//    9   19:checkcast       #88  <Class BroadcastReceiver>
	//   10   22:astore_1        
		return ((BroadcastReceiver) (classloader));
	//   11   23:aload_1         
	//   12   24:areturn         
		classloader;
	//   13   25:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   14   26:goto            30
		classloader;
	//   15   29:astore_1        
		throw new RuntimeException("Couldn't call constructor", ((Throwable) (classloader)));
	//   16   30:new             #60  <Class RuntimeException>
	//   17   33:dup             
	//   18   34:ldc1            #62  <String "Couldn't call constructor">
	//   19   36:aload_1         
	//   20   37:invokespecial   #65  <Method void RuntimeException(String, Throwable)>
	//   21   40:athrow          
	}

	public final Service instantiateService(ClassLoader classloader, String s, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		return (Service)CoreComponentFactory.checkCompatWrapper(((Object) (instantiateServiceCompat(classloader, s, intent))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #93  <Method Service instantiateServiceCompat(ClassLoader, String, Intent)>
	//    5    7:invokestatic    #29  <Method Object CoreComponentFactory.checkCompatWrapper(Object)>
	//    6   10:checkcast       #95  <Class Service>
	//    7   13:areturn         
	}

	public Service instantiateServiceCompat(ClassLoader classloader, String s, Intent intent)
		throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		classloader = ((ClassLoader) ((Service)classloader.loadClass(s).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #44  <Method Class ClassLoader.loadClass(String)>
	//    3    5:iconst_0        
	//    4    6:anewarray       Class[]
	//    5    9:invokevirtual   #50  <Method Constructor Class.getDeclaredConstructor(Class[])>
	//    6   12:iconst_0        
	//    7   13:anewarray       Object[]
	//    8   16:invokevirtual   #58  <Method Object Constructor.newInstance(Object[])>
	//    9   19:checkcast       #95  <Class Service>
	//   10   22:astore_1        
		return ((Service) (classloader));
	//   11   23:aload_1         
	//   12   24:areturn         
		classloader;
	//   13   25:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   14   26:goto            30
		classloader;
	//   15   29:astore_1        
		throw new RuntimeException("Couldn't call constructor", ((Throwable) (classloader)));
	//   16   30:new             #60  <Class RuntimeException>
	//   17   33:dup             
	//   18   34:ldc1            #62  <String "Couldn't call constructor">
	//   19   36:aload_1         
	//   20   37:invokespecial   #65  <Method void RuntimeException(String, Throwable)>
	//   21   40:athrow          
	}
}
