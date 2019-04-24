// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import b.a.a.a.c;
import b.a.a.a.l;
import java.lang.reflect.*;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//			AppMeasurementEventListenerRegistrar, CrashlyticsCore

class DefaultAppMeasurementEventListenerRegistrar
	implements AppMeasurementEventListenerRegistrar
{

	private DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore crashlyticscore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		crashlyticsCore = crashlyticscore;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field CrashlyticsCore crashlyticsCore>
	//    5    9:return          
	}

	private Class getClass(String s)
	{
		try
		{
			s = ((String) (crashlyticsCore.getContext().getClassLoader().loadClass(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #57  <Method Context CrashlyticsCore.getContext()>
	//    3    7:invokevirtual   #63  <Method ClassLoader Context.getClassLoader()>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #68  <Method Class ClassLoader.loadClass(String)>
	//    6   14:astore_1        
		}
	//*   7   15:aload_1         
	//*   8   16:areturn         
	//*   9   17:aconst_null     
	//*  10   18:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((Class) (s));
	//*  11   19:astore_1        
	//*  12   20:goto            17
	}

	private Object getInstance(Class class1)
	{
		try
		{
			class1 = ((Class) (class1.getDeclaredMethod("getInstance", new Class[] {
				android/content/Context
			}).invoke(((Object) (class1)), new Object[] {
				crashlyticsCore.getContext()
			})));
	//    0    0:aload_1         
	//    1    1:ldc1            #21  <String "getInstance">
	//    2    3:iconst_1        
	//    3    4:anewarray       Class[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:ldc1            #59  <Class Context>
	//    7   11:aastore         
	//    8   12:invokevirtual   #77  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    9   15:aload_1         
	//   10   16:iconst_1        
	//   11   17:anewarray       Object[]
	//   12   20:dup             
	//   13   21:iconst_0        
	//   14   22:aload_0         
	//   15   23:getfield        #39  <Field CrashlyticsCore crashlyticsCore>
	//   16   26:invokevirtual   #57  <Method Context CrashlyticsCore.getContext()>
	//   17   29:aastore         
	//   18   30:invokevirtual   #83  <Method Object Method.invoke(Object, Object[])>
	//   19   33:astore_1        
		}
	//*  20   34:aload_1         
	//*  21   35:areturn         
	//*  22   36:aconst_null     
	//*  23   37:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			return ((Object) (null));
		}
		return ((Object) (class1));
	//*  24   38:astore_1        
	//*  25   39:goto            36
	}

	static AppMeasurementEventListenerRegistrar instanceFrom(CrashlyticsCore crashlyticscore)
	{
		return ((AppMeasurementEventListenerRegistrar) (new DefaultAppMeasurementEventListenerRegistrar(crashlyticscore)));
	//    0    0:new             #2   <Class DefaultAppMeasurementEventListenerRegistrar>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #88  <Method void DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore)>
	//    4    8:areturn         
	}

	private boolean invoke(Class class1, Object obj, String s)
	{
		Class class2 = getClass("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "com.google.android.gms.measurement.AppMeasurement$OnEventListener">
	//    2    3:invokespecial   #97  <Method Class getClass(String)>
	//    3    6:astore          4
		class1.getDeclaredMethod(s, new Class[] {
			class2
		}).invoke(obj, new Object[] {
			onEventListenerProxy(class2)
		});
	//    4    8:aload_1         
	//    5    9:aload_3         
	//    6   10:iconst_1        
	//    7   11:anewarray       Class[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload           4
	//   11   18:aastore         
	//   12   19:invokevirtual   #77  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   13   22:aload_2         
	//   14   23:iconst_1        
	//   15   24:anewarray       Object[]
	//   16   27:dup             
	//   17   28:iconst_0        
	//   18   29:aload_0         
	//   19   30:aload           4
	//   20   32:invokespecial   #100 <Method Object onEventListenerProxy(Class)>
	//   21   35:aastore         
	//   22   36:invokevirtual   #83  <Method Object Method.invoke(Object, Object[])>
	//   23   39:pop             
		return true;
	//   24   40:iconst_1        
	//   25   41:ireturn         
		Object obj1;
		obj1;
	//   26   42:astore          4
		l l1;
		l1 = c.g();
	//   27   44:invokestatic    #106 <Method l c.g()>
	//   28   47:astore          5
		class1 = ((Class) (new StringBuilder()));
	//   29   49:new             #108 <Class StringBuilder>
	//   30   52:dup             
	//   31   53:invokespecial   #109 <Method void StringBuilder()>
	//   32   56:astore_1        
		obj = "Cannot access method: ";
	//   33   57:ldc1            #111 <String "Cannot access method: ">
	//   34   59:astore_2        
_L2:
		((StringBuilder) (class1)).append(((String) (obj)));
	//   35   60:aload_1         
	//   36   61:aload_2         
	//   37   62:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   38   65:pop             
		((StringBuilder) (class1)).append(s);
	//   39   66:aload_1         
	//   40   67:aload_3         
	//   41   68:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   42   71:pop             
		l1.d("CrashlyticsCore", ((StringBuilder) (class1)).toString(), ((Throwable) (obj1)));
	//   43   72:aload           5
	//   44   74:ldc1            #117 <String "CrashlyticsCore">
	//   45   76:aload_1         
	//   46   77:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   47   80:aload           4
	//   48   82:invokeinterface #127 <Method void l.d(String, String, Throwable)>
		return false;
	//   49   87:iconst_0        
	//   50   88:ireturn         
		obj1;
	//   51   89:astore          4
		l1 = c.g();
	//   52   91:invokestatic    #106 <Method l c.g()>
	//   53   94:astore          5
		class1 = ((Class) (new StringBuilder()));
	//   54   96:new             #108 <Class StringBuilder>
	//   55   99:dup             
	//   56  100:invokespecial   #109 <Method void StringBuilder()>
	//   57  103:astore_1        
		obj = "Cannot invoke method: ";
	//   58  104:ldc1            #129 <String "Cannot invoke method: ">
	//   59  106:astore_2        
		continue; /* Loop/switch isn't completed */
	//   60  107:goto            60
		obj1;
	//   61  110:astore          4
		l1 = c.g();
	//   62  112:invokestatic    #106 <Method l c.g()>
	//   63  115:astore          5
		class1 = ((Class) (new StringBuilder()));
	//   64  117:new             #108 <Class StringBuilder>
	//   65  120:dup             
	//   66  121:invokespecial   #109 <Method void StringBuilder()>
	//   67  124:astore_1        
		obj = "Expected method missing: ";
	//   68  125:ldc1            #131 <String "Expected method missing: ">
	//   69  127:astore_2        
		if(true) goto _L2; else goto _L1
	//   70  128:goto            60
_L1:
	}

	private Object onEventListenerProxy(Class class1)
	{
		ClassLoader classloader = crashlyticsCore.getContext().getClassLoader();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field CrashlyticsCore crashlyticsCore>
	//    2    4:invokevirtual   #57  <Method Context CrashlyticsCore.getContext()>
	//    3    7:invokevirtual   #63  <Method ClassLoader Context.getClassLoader()>
	//    4   10:astore_2        
		InvocationHandler invocationhandler = new InvocationHandler() {

			public Object invoke(Object obj, Method method, Object aobj[])
			{
				if(aobj.length != 4)
			//*   0    0:aload_3         
			//*   1    1:arraylength     
			//*   2    2:iconst_4        
			//*   3    3:icmpeq          16
					throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
			//    4    6:new             #25  <Class RuntimeException>
			//    5    9:dup             
			//    6   10:ldc1            #27  <String "Unexpected AppMeasurement.OnEventListener signature">
			//    7   12:invokespecial   #30  <Method void RuntimeException(String)>
			//    8   15:athrow          
				obj = ((Object) ((String)aobj[0]));
			//    9   16:aload_3         
			//   10   17:iconst_0        
			//   11   18:aaload          
			//   12   19:checkcast       #32  <Class String>
			//   13   22:astore_1        
				method = ((Method) ((String)aobj[1]));
			//   14   23:aload_3         
			//   15   24:iconst_1        
			//   16   25:aaload          
			//   17   26:checkcast       #32  <Class String>
			//   18   29:astore_2        
				aobj = ((Object []) ((Bundle)aobj[2]));
			//   19   30:aload_3         
			//   20   31:iconst_2        
			//   21   32:aaload          
			//   22   33:checkcast       #34  <Class Bundle>
			//   23   36:astore_3        
				if(obj != null && !((String) (obj)).equals("crash"))
			//*  24   37:aload_1         
			//*  25   38:ifnull          62
			//*  26   41:aload_1         
			//*  27   42:ldc1            #36  <String "crash">
			//*  28   44:invokevirtual   #40  <Method boolean String.equals(Object)>
			//*  29   47:ifne            62
					DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(crashlyticsCore, ((String) (method)), ((Bundle) (aobj)));
			//   30   50:aload_0         
			//   31   51:getfield        #17  <Field DefaultAppMeasurementEventListenerRegistrar this$0>
			//   32   54:invokestatic    #44  <Method CrashlyticsCore DefaultAppMeasurementEventListenerRegistrar.access$000(DefaultAppMeasurementEventListenerRegistrar)>
			//   33   57:aload_2         
			//   34   58:aload_3         
			//   35   59:invokestatic    #48  <Method void DefaultAppMeasurementEventListenerRegistrar.access$100(CrashlyticsCore, String, Bundle)>
				return ((Object) (null));
			//   36   62:aconst_null     
			//   37   63:areturn         
			}

			final DefaultAppMeasurementEventListenerRegistrar this$0;

			
			{
				this$0 = DefaultAppMeasurementEventListenerRegistrar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DefaultAppMeasurementEventListenerRegistrar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    5   11:new             #8   <Class DefaultAppMeasurementEventListenerRegistrar$1>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #135 <Method void DefaultAppMeasurementEventListenerRegistrar$1(DefaultAppMeasurementEventListenerRegistrar)>
	//    9   19:astore_3        
		return Proxy.newProxyInstance(classloader, new Class[] {
			class1
		}, invocationhandler);
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:anewarray       Class[]
	//   13   25:dup             
	//   14   26:iconst_0        
	//   15   27:aload_1         
	//   16   28:aastore         
	//   17   29:aload_3         
	//   18   30:invokestatic    #141 <Method Object Proxy.newProxyInstance(ClassLoader, Class[], InvocationHandler)>
	//   19   33:areturn         
	}

	private static String serializeEvent(String s, Bundle bundle)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #145 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void JSONObject()>
	//    3    7:astore_2        
		JSONObject jsonobject1 = new JSONObject();
	//    4    8:new             #145 <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #146 <Method void JSONObject()>
	//    7   15:astore_3        
		String s1;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); jsonobject1.put(s1, bundle.get(s1)))
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #152 <Method Set Bundle.keySet()>
	//*  10   20:invokeinterface #158 <Method Iterator Set.iterator()>
	//*  11   25:astore          4
	//*  12   27:aload           4
	//*  13   29:invokeinterface #164 <Method boolean Iterator.hasNext()>
	//*  14   34:ifeq            65
			s1 = (String)iterator.next();
	//   15   37:aload           4
	//   16   39:invokeinterface #168 <Method Object Iterator.next()>
	//   17   44:checkcast       #170 <Class String>
	//   18   47:astore          5

	//   19   49:aload_3         
	//   20   50:aload           5
	//   21   52:aload_1         
	//   22   53:aload           5
	//   23   55:invokevirtual   #174 <Method Object Bundle.get(String)>
	//   24   58:invokevirtual   #178 <Method JSONObject JSONObject.put(String, Object)>
	//   25   61:pop             
	//*  26   62:goto            27
		jsonobject.put("name", ((Object) (s)));
	//   27   65:aload_2         
	//   28   66:ldc1            #24  <String "name">
	//   29   68:aload_0         
	//   30   69:invokevirtual   #178 <Method JSONObject JSONObject.put(String, Object)>
	//   31   72:pop             
		jsonobject.put("parameters", ((Object) (jsonobject1)));
	//   32   73:aload_2         
	//   33   74:ldc1            #27  <String "parameters">
	//   34   76:aload_3         
	//   35   77:invokevirtual   #178 <Method JSONObject JSONObject.put(String, Object)>
	//   36   80:pop             
		return jsonobject.toString();
	//   37   81:aload_2         
	//   38   82:invokevirtual   #179 <Method String JSONObject.toString()>
	//   39   85:areturn         
	}

	private static void writeEventToUserLog(CrashlyticsCore crashlyticscore, String s, Bundle bundle)
	{
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #108 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #109 <Method void StringBuilder()>
	//    3    7:astore_3        
			stringbuilder.append("$A$:");
	//    4    8:aload_3         
	//    5    9:ldc1            #183 <String "$A$:">
	//    6   11:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
			stringbuilder.append(serializeEvent(s, bundle));
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:invokestatic    #185 <Method String serializeEvent(String, Bundle)>
	//   12   21:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			crashlyticscore.log(stringbuilder.toString());
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   17   30:invokevirtual   #189 <Method void CrashlyticsCore.log(String)>
			return;
	//   18   33:return          
		}
	//*  19   34:invokestatic    #106 <Method l c.g()>
	//*  20   37:astore_0        
	//*  21   38:new             #108 <Class StringBuilder>
	//*  22   41:dup             
	//*  23   42:invokespecial   #109 <Method void StringBuilder()>
	//*  24   45:astore_2        
	//*  25   46:aload_2         
	//*  26   47:ldc1            #191 <String "Unable to serialize Firebase Analytics event; ">
	//*  27   49:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//*  28   52:pop             
	//*  29   53:aload_2         
	//*  30   54:aload_1         
	//*  31   55:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//*  32   58:pop             
	//*  33   59:aload_0         
	//*  34   60:ldc1            #117 <String "CrashlyticsCore">
	//*  35   62:aload_2         
	//*  36   63:invokevirtual   #121 <Method String StringBuilder.toString()>
	//*  37   66:invokeinterface #194 <Method void l.d(String, String)>
	//*  38   71:return          
		// Misplaced declaration of an exception variable
		catch(CrashlyticsCore crashlyticscore)
		{
			crashlyticscore = ((CrashlyticsCore) (c.g()));
		}
		bundle = ((Bundle) (new StringBuilder()));
		((StringBuilder) (bundle)).append("Unable to serialize Firebase Analytics event; ");
		((StringBuilder) (bundle)).append(s);
		((l) (crashlyticscore)).d("CrashlyticsCore", ((StringBuilder) (bundle)).toString());
	//*  39   72:astore_0        
	//*  40   73:goto            34
	}

	public boolean register()
	{
		Object obj = ((Object) (getClass("com.google.android.gms.measurement.AppMeasurement")));
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "com.google.android.gms.measurement.AppMeasurement">
	//    2    3:invokespecial   #97  <Method Class getClass(String)>
	//    3    6:astore_1        
		Object obj1;
		if(obj == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       29
		{
			obj = ((Object) (c.g()));
	//    6   11:invokestatic    #106 <Method l c.g()>
	//    7   14:astore_1        
			obj1 = "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.";
	//    8   15:ldc1            #197 <String "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.">
	//    9   17:astore_2        
		} else
	//*  10   18:aload_1         
	//*  11   19:ldc1            #117 <String "CrashlyticsCore">
	//*  12   21:aload_2         
	//*  13   22:invokeinterface #194 <Method void l.d(String, String)>
	//*  14   27:iconst_0        
	//*  15   28:ireturn         
		{
			obj1 = getInstance(((Class) (obj)));
	//   16   29:aload_0         
	//   17   30:aload_1         
	//   18   31:invokespecial   #199 <Method Object getInstance(Class)>
	//   19   34:astore_2        
			if(obj1 == null)
	//*  20   35:aload_2         
	//*  21   36:ifnonnull       49
			{
				obj = ((Object) (c.g()));
	//   22   39:invokestatic    #106 <Method l c.g()>
	//   23   42:astore_1        
				obj1 = "Could not create an instance of Firebase Analytics.";
	//   24   43:ldc1            #201 <String "Could not create an instance of Firebase Analytics.">
	//   25   45:astore_2        
			} else
	//*  26   46:goto            18
			{
				return invoke(((Class) (obj)), obj1, "registerOnMeasurementEventListener");
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:aload_2         
	//   30   52:ldc1            #30  <String "registerOnMeasurementEventListener">
	//   31   54:invokespecial   #203 <Method boolean invoke(Class, Object, String)>
	//   32   57:ireturn         
			}
		}
		((l) (obj)).d("CrashlyticsCore", ((String) (obj1)));
		return false;
	}

	private static final String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
	private static final String ANALYTIC_CLASS_ON_EVENT_LISTENER = "com.google.android.gms.measurement.AppMeasurement$OnEventListener";
	private static final String CRASH_ORIGIN = "crash";
	private static final String GET_INSTANCE_METHOD = "getInstance";
	private static final String NAME = "name";
	private static final String PARAMETERS = "parameters";
	private static final String REGISTER_METHOD = "registerOnMeasurementEventListener";
	private final CrashlyticsCore crashlyticsCore;


/*
	static CrashlyticsCore access$000(DefaultAppMeasurementEventListenerRegistrar defaultappmeasurementeventlistenerregistrar)
	{
		return defaultappmeasurementeventlistenerregistrar.crashlyticsCore;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field CrashlyticsCore crashlyticsCore>
	//    2    4:areturn         
	}

*/


/*
	static void access$100(CrashlyticsCore crashlyticscore, String s, Bundle bundle)
	{
		writeEventToUserLog(crashlyticscore, s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #47  <Method void writeEventToUserLog(CrashlyticsCore, String, Bundle)>
		return;
	//    4    6:return          
	}

*/
}
