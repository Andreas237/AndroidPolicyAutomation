// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

// Referenced classes of package com.crashlytics.android.answers:
//			EventLogger

public class AppMeasurementEventLogger
	implements EventLogger
{

	public AppMeasurementEventLogger(Object obj, Method method)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		logEventInstance = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field Object logEventInstance>
		logEventMethod = method;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #29  <Field Method logEventMethod>
	//    8   14:return          
	}

	private static Class getClass(Context context)
	{
		try
		{
			context = ((Context) (context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method ClassLoader Context.getClassLoader()>
	//    2    4:ldc1            #10  <String "com.google.android.gms.measurement.AppMeasurement">
	//    3    6:invokevirtual   #46  <Method Class ClassLoader.loadClass(String)>
	//    4    9:astore_0        
		}
	//*   5   10:aload_0         
	//*   6   11:areturn         
	//*   7   12:aconst_null     
	//*   8   13:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		return ((Class) (context));
	//*   9   14:astore_0        
	//*  10   15:goto            12
	}

	public static EventLogger getEventLogger(Context context)
	{
		Class class1 = getClass(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method Class getClass(Context)>
	//    2    4:astore_2        
		if(class1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		Object obj = getInstance(context, class1);
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:invokestatic    #53  <Method Object getInstance(Context, Class)>
	//   10   16:astore_1        
		if(obj == null)
	//*  11   17:aload_1         
	//*  12   18:ifnonnull       23
			return null;
	//   13   21:aconst_null     
	//   14   22:areturn         
		context = ((Context) (getLogEventMethod(context, class1)));
	//   15   23:aload_0         
	//   16   24:aload_2         
	//   17   25:invokestatic    #57  <Method Method getLogEventMethod(Context, Class)>
	//   18   28:astore_0        
		if(context == null)
	//*  19   29:aload_0         
	//*  20   30:ifnonnull       35
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		else
			return ((EventLogger) (new AppMeasurementEventLogger(obj, ((Method) (context)))));
	//   23   35:new             #2   <Class AppMeasurementEventLogger>
	//   24   38:dup             
	//   25   39:aload_1         
	//   26   40:aload_0         
	//   27   41:invokespecial   #59  <Method void AppMeasurementEventLogger(Object, Method)>
	//   28   44:areturn         
	}

	private static Object getInstance(Context context, Class class1)
	{
		try
		{
			context = ((Context) (class1.getDeclaredMethod("getInstance", new Class[] {
				android/content/Context
			}).invoke(((Object) (class1)), new Object[] {
				context
			})));
	//    0    0:aload_1         
	//    1    1:ldc1            #13  <String "getInstance">
	//    2    3:iconst_1        
	//    3    4:anewarray       Class[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #36  <Class Context>
	//    7   11:aastore         
	//    8   12:invokevirtual   #65  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:anewarray       Object[]
	//   12   20:dup             
	//   13   21:iconst_0        
	//   14   22:aload_0         
	//   15   23:aastore         
	//   16   24:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   17   27:astore_0        
		}
	//*  18   28:aload_0         
	//*  19   29:areturn         
	//*  20   30:aconst_null     
	//*  21   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return ((Object) (null));
		}
		return ((Object) (context));
	//*  22   32:astore_0        
	//*  23   33:goto            30
	}

	private static Method getLogEventMethod(Context context, Class class1)
	{
		try
		{
			context = ((Context) (class1.getDeclaredMethod("logEventInternal", new Class[] {
				java/lang/String, java/lang/String, android/os/Bundle
			})));
	//    0    0:aload_1         
	//    1    1:ldc1            #16  <String "logEventInternal">
	//    2    3:iconst_3        
	//    3    4:anewarray       Class[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #73  <Class String>
	//    7   11:aastore         
	//    8   12:dup             
	//    9   13:iconst_1        
	//   10   14:ldc1            #73  <Class String>
	//   11   16:aastore         
	//   12   17:dup             
	//   13   18:iconst_2        
	//   14   19:ldc1            #75  <Class Bundle>
	//   15   21:aastore         
	//   16   22:invokevirtual   #65  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   17   25:astore_0        
		}
	//*  18   26:aload_0         
	//*  19   27:areturn         
	//*  20   28:aconst_null     
	//*  21   29:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		return ((Method) (context));
	//*  22   30:astore_0        
	//*  23   31:goto            28
	}

	public void logEvent(String s, Bundle bundle)
	{
		logEvent("fab", s, bundle);
	//    0    0:aload_0         
	//    1    1:ldc1            #79  <String "fab">
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:invokevirtual   #82  <Method void logEvent(String, String, Bundle)>
	//    5    8:return          
	}

	public void logEvent(String s, String s1, Bundle bundle)
	{
		try
		{
			logEventMethod.invoke(logEventInstance, new Object[] {
				s, s1, bundle
			});
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Method logEventMethod>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Object logEventInstance>
	//    4    8:iconst_3        
	//    5    9:anewarray       Object[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:dup             
	//   11   17:iconst_1        
	//   12   18:aload_2         
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_2        
	//   16   22:aload_3         
	//   17   23:aastore         
	//   18   24:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   19   27:pop             
			return;
	//   20   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  21   29:astore_1        
		{
			return;
	//   22   30:return          
		}
	}

	private static final String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
	private static final String GET_INSTANCE_METHOD = "getInstance";
	private static final String LOG_METHOD = "logEventInternal";
	private final Object logEventInstance;
	private final Method logEventMethod;
}
