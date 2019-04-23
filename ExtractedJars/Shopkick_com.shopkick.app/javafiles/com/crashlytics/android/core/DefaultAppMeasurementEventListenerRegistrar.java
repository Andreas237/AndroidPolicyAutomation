// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
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
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  22   36:astore_1        
		{
			Fabric.getLogger().d("CrashlyticsCore", "Could not get instance of com.google.android.gms.measurement.AppMeasurement", ((Throwable) (class1)));
	//   23   37:invokestatic    #89  <Method Logger Fabric.getLogger()>
	//   24   40:ldc1            #91  <String "CrashlyticsCore">
	//   25   42:ldc1            #93  <String "Could not get instance of com.google.android.gms.measurement.AppMeasurement">
	//   26   44:aload_1         
	//   27   45:invokeinterface #99  <Method void Logger.d(String, String, Throwable)>
			return ((Object) (null));
	//   28   50:aconst_null     
	//   29   51:areturn         
		}
		return ((Object) (class1));
	}

	static AppMeasurementEventListenerRegistrar instanceFrom(CrashlyticsCore crashlyticscore)
	{
		return ((AppMeasurementEventListenerRegistrar) (new DefaultAppMeasurementEventListenerRegistrar(crashlyticscore)));
	//    0    0:new             #2   <Class DefaultAppMeasurementEventListenerRegistrar>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #104 <Method void DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore)>
	//    4    8:areturn         
	}

	private boolean invoke(Class class1, Object obj, String s)
	{
		Class class2 = getClass("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "com.google.android.gms.measurement.AppMeasurement$OnEventListener">
	//    2    3:invokespecial   #113 <Method Class getClass(String)>
	//    3    6:astore          4
		if(class2 == null)
	//*   4    8:aload           4
	//*   5   10:ifnonnull       27
		{
			Fabric.getLogger().d("CrashlyticsCore", "Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
	//    6   13:invokestatic    #89  <Method Logger Fabric.getLogger()>
	//    7   16:ldc1            #91  <String "CrashlyticsCore">
	//    8   18:ldc1            #115 <String "Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener">
	//    9   20:invokeinterface #118 <Method void Logger.d(String, String)>
			return false;
	//   10   25:iconst_0        
	//   11   26:ireturn         
		}
		try
		{
			class1.getDeclaredMethod(s, new Class[] {
				class2
			}).invoke(obj, new Object[] {
				onEventListenerProxy(class2)
			});
	//   12   27:aload_1         
	//   13   28:aload_3         
	//   14   29:iconst_1        
	//   15   30:anewarray       Class[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:aload           4
	//   19   37:aastore         
	//   20   38:invokevirtual   #77  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   21   41:aload_2         
	//   22   42:iconst_1        
	//   23   43:anewarray       Object[]
	//   24   46:dup             
	//   25   47:iconst_0        
	//   26   48:aload_0         
	//   27   49:aload           4
	//   28   51:invokespecial   #121 <Method Object onEventListenerProxy(Class)>
	//   29   54:aastore         
	//   30   55:invokevirtual   #83  <Method Object Method.invoke(Object, Object[])>
	//   31   58:pop             
		}
	//*  32   59:iconst_1        
	//*  33   60:ireturn         
	//*  34   61:astore_1        
	//*  35   62:invokestatic    #89  <Method Logger Fabric.getLogger()>
	//*  36   65:astore_2        
	//*  37   66:new             #123 <Class StringBuilder>
	//*  38   69:dup             
	//*  39   70:invokespecial   #124 <Method void StringBuilder()>
	//*  40   73:astore          4
	//*  41   75:aload           4
	//*  42   77:ldc1            #126 <String "Cannot access method: ">
	//*  43   79:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  44   82:pop             
	//*  45   83:aload           4
	//*  46   85:aload_3         
	//*  47   86:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  48   89:pop             
	//*  49   90:aload_2         
	//*  50   91:ldc1            #91  <String "CrashlyticsCore">
	//*  51   93:aload           4
	//*  52   95:invokevirtual   #134 <Method String StringBuilder.toString()>
	//*  53   98:aload_1         
	//*  54   99:invokeinterface #137 <Method void Logger.w(String, String, Throwable)>
	//*  55  104:iconst_0        
	//*  56  105:ireturn         
	//*  57  106:astore_1        
	//*  58  107:invokestatic    #89  <Method Logger Fabric.getLogger()>
	//*  59  110:astore_2        
	//*  60  111:new             #123 <Class StringBuilder>
	//*  61  114:dup             
	//*  62  115:invokespecial   #124 <Method void StringBuilder()>
	//*  63  118:astore          4
	//*  64  120:aload           4
	//*  65  122:ldc1            #139 <String "Cannot invoke method: ">
	//*  66  124:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  67  127:pop             
	//*  68  128:aload           4
	//*  69  130:aload_3         
	//*  70  131:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  71  134:pop             
	//*  72  135:aload_2         
	//*  73  136:ldc1            #91  <String "CrashlyticsCore">
	//*  74  138:aload           4
	//*  75  140:invokevirtual   #134 <Method String StringBuilder.toString()>
	//*  76  143:aload_1         
	//*  77  144:invokeinterface #137 <Method void Logger.w(String, String, Throwable)>
	//*  78  149:iconst_0        
	//*  79  150:ireturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  80  151:astore_1        
		{
			obj = ((Object) (Fabric.getLogger()));
	//   81  152:invokestatic    #89  <Method Logger Fabric.getLogger()>
	//   82  155:astore_2        
			StringBuilder stringbuilder2 = new StringBuilder();
	//   83  156:new             #123 <Class StringBuilder>
	//   84  159:dup             
	//   85  160:invokespecial   #124 <Method void StringBuilder()>
	//   86  163:astore          4
			stringbuilder2.append("Expected method missing: ");
	//   87  165:aload           4
	//   88  167:ldc1            #141 <String "Expected method missing: ">
	//   89  169:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   90  172:pop             
			stringbuilder2.append(s);
	//   91  173:aload           4
	//   92  175:aload_3         
	//   93  176:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   94  179:pop             
			((Logger) (obj)).w("CrashlyticsCore", stringbuilder2.toString(), ((Throwable) (class1)));
	//   95  180:aload_2         
	//   96  181:ldc1            #91  <String "CrashlyticsCore">
	//   97  183:aload           4
	//   98  185:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   99  188:aload_1         
	//  100  189:invokeinterface #137 <Method void Logger.w(String, String, Throwable)>
			return false;
	//  101  194:iconst_0        
	//  102  195:ireturn         
		}
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			obj = ((Object) (Fabric.getLogger()));
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Cannot invoke method: ");
			stringbuilder1.append(s);
			((Logger) (obj)).w("CrashlyticsCore", stringbuilder1.toString(), ((Throwable) (class1)));
			return false;
		}
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			obj = ((Object) (Fabric.getLogger()));
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("Cannot access method: ");
			stringbuilder.append(s);
			((Logger) (obj)).w("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (class1)));
			return false;
		}
		return true;
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
				throws Throwable
			{
				if(aobj.length == 4)
			//*   0    0:aload_3         
			//*   1    1:arraylength     
			//*   2    2:iconst_4        
			//*   3    3:icmpne          54
				{
					obj = ((Object) ((String)aobj[0]));
			//    4    6:aload_3         
			//    5    7:iconst_0        
			//    6    8:aaload          
			//    7    9:checkcast       #27  <Class String>
			//    8   12:astore_1        
					method = ((Method) ((String)aobj[1]));
			//    9   13:aload_3         
			//   10   14:iconst_1        
			//   11   15:aaload          
			//   12   16:checkcast       #27  <Class String>
			//   13   19:astore_2        
					aobj = ((Object []) ((Bundle)aobj[2]));
			//   14   20:aload_3         
			//   15   21:iconst_2        
			//   16   22:aaload          
			//   17   23:checkcast       #29  <Class Bundle>
			//   18   26:astore_3        
					if(obj != null && !((String) (obj)).equals("crash"))
			//*  19   27:aload_1         
			//*  20   28:ifnull          52
			//*  21   31:aload_1         
			//*  22   32:ldc1            #31  <String "crash">
			//*  23   34:invokevirtual   #35  <Method boolean String.equals(Object)>
			//*  24   37:ifne            52
						DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(crashlyticsCore, ((String) (method)), ((Bundle) (aobj)));
			//   25   40:aload_0         
			//   26   41:getfield        #17  <Field DefaultAppMeasurementEventListenerRegistrar this$0>
			//   27   44:invokestatic    #39  <Method CrashlyticsCore DefaultAppMeasurementEventListenerRegistrar.access$000(DefaultAppMeasurementEventListenerRegistrar)>
			//   28   47:aload_2         
			//   29   48:aload_3         
			//   30   49:invokestatic    #43  <Method void DefaultAppMeasurementEventListenerRegistrar.access$100(CrashlyticsCore, String, Bundle)>
					return ((Object) (null));
			//   31   52:aconst_null     
			//   32   53:areturn         
				} else
				{
					throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
			//   33   54:new             #45  <Class RuntimeException>
			//   34   57:dup             
			//   35   58:ldc1            #47  <String "Unexpected AppMeasurement.OnEventListener signature">
			//   36   60:invokespecial   #50  <Method void RuntimeException(String)>
			//   37   63:athrow          
				}
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
	//    8   16:invokespecial   #145 <Method void DefaultAppMeasurementEventListenerRegistrar$1(DefaultAppMeasurementEventListenerRegistrar)>
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
	//   18   30:invokestatic    #151 <Method Object Proxy.newProxyInstance(ClassLoader, Class[], InvocationHandler)>
	//   19   33:areturn         
	}

	private static String serializeEvent(String s, Bundle bundle)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #157 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #158 <Method void JSONObject()>
	//    3    7:astore_2        
		JSONObject jsonobject1 = new JSONObject();
	//    4    8:new             #157 <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #158 <Method void JSONObject()>
	//    7   15:astore_3        
		String s1;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); jsonobject1.put(s1, bundle.get(s1)))
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #164 <Method Set Bundle.keySet()>
	//*  10   20:invokeinterface #170 <Method Iterator Set.iterator()>
	//*  11   25:astore          4
	//*  12   27:aload           4
	//*  13   29:invokeinterface #176 <Method boolean Iterator.hasNext()>
	//*  14   34:ifeq            65
			s1 = (String)iterator.next();
	//   15   37:aload           4
	//   16   39:invokeinterface #180 <Method Object Iterator.next()>
	//   17   44:checkcast       #182 <Class String>
	//   18   47:astore          5

	//   19   49:aload_3         
	//   20   50:aload           5
	//   21   52:aload_1         
	//   22   53:aload           5
	//   23   55:invokevirtual   #186 <Method Object Bundle.get(String)>
	//   24   58:invokevirtual   #190 <Method JSONObject JSONObject.put(String, Object)>
	//   25   61:pop             
	//*  26   62:goto            27
		jsonobject.put("name", ((Object) (s)));
	//   27   65:aload_2         
	//   28   66:ldc1            #24  <String "name">
	//   29   68:aload_0         
	//   30   69:invokevirtual   #190 <Method JSONObject JSONObject.put(String, Object)>
	//   31   72:pop             
		jsonobject.put("parameters", ((Object) (jsonobject1)));
	//   32   73:aload_2         
	//   33   74:ldc1            #27  <String "parameters">
	//   34   76:aload_3         
	//   35   77:invokevirtual   #190 <Method JSONObject JSONObject.put(String, Object)>
	//   36   80:pop             
		return jsonobject.toString();
	//   37   81:aload_2         
	//   38   82:invokevirtual   #191 <Method String JSONObject.toString()>
	//   39   85:areturn         
	}

	private static void writeEventToUserLog(CrashlyticsCore crashlyticscore, String s, Bundle bundle)
	{
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #123 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #124 <Method void StringBuilder()>
	//    3    7:astore_3        
			stringbuilder.append("$A$:");
	//    4    8:aload_3         
	//    5    9:ldc1            #194 <String "$A$:">
	//    6   11:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
			stringbuilder.append(serializeEvent(s, bundle));
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:invokestatic    #196 <Method String serializeEvent(String, Bundle)>
	//   12   21:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			crashlyticscore.log(stringbuilder.toString());
	//   14   25:aload_0         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #134 <Method String StringBuilder.toString()>
	//   17   30:invokevirtual   #200 <Method void CrashlyticsCore.log(String)>
			return;
	//   18   33:return          
		}
	//*  19   34:invokestatic    #89  <Method Logger Fabric.getLogger()>
	//*  20   37:astore_0        
	//*  21   38:new             #123 <Class StringBuilder>
	//*  22   41:dup             
	//*  23   42:invokespecial   #124 <Method void StringBuilder()>
	//*  24   45:astore_2        
	//*  25   46:aload_2         
	//*  26   47:ldc1            #202 <String "Unable to serialize Firebase Analytics event; ">
	//*  27   49:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  28   52:pop             
	//*  29   53:aload_2         
	//*  30   54:aload_1         
	//*  31   55:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//*  32   58:pop             
	//*  33   59:aload_0         
	//*  34   60:ldc1            #91  <String "CrashlyticsCore">
	//*  35   62:aload_2         
	//*  36   63:invokevirtual   #134 <Method String StringBuilder.toString()>
	//*  37   66:invokeinterface #204 <Method void Logger.w(String, String)>
	//*  38   71:return          
		// Misplaced declaration of an exception variable
		catch(CrashlyticsCore crashlyticscore)
		{
			crashlyticscore = ((CrashlyticsCore) (Fabric.getLogger()));
		}
		bundle = ((Bundle) (new StringBuilder()));
		((StringBuilder) (bundle)).append("Unable to serialize Firebase Analytics event; ");
		((StringBuilder) (bundle)).append(s);
		((Logger) (crashlyticscore)).w("CrashlyticsCore", ((StringBuilder) (bundle)).toString());
	//*  39   72:astore_0        
	//*  40   73:goto            34
	}

	public boolean register()
	{
		Class class1 = getClass("com.google.android.gms.measurement.AppMeasurement");
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "com.google.android.gms.measurement.AppMeasurement">
	//    2    3:invokespecial   #113 <Method Class getClass(String)>
	//    3    6:astore_1        
		if(class1 == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       25
		{
			Fabric.getLogger().w("CrashlyticsCore", "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
	//    6   11:invokestatic    #89  <Method Logger Fabric.getLogger()>
	//    7   14:ldc1            #91  <String "CrashlyticsCore">
	//    8   16:ldc1            #207 <String "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.">
	//    9   18:invokeinterface #204 <Method void Logger.w(String, String)>
			return false;
	//   10   23:iconst_0        
	//   11   24:ireturn         
		}
		Object obj = getInstance(class1);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokespecial   #209 <Method Object getInstance(Class)>
	//   15   30:astore_2        
		if(obj == null)
	//*  16   31:aload_2         
	//*  17   32:ifnonnull       49
		{
			Fabric.getLogger().w("CrashlyticsCore", "Could not create an instance of Firebase Analytics.");
	//   18   35:invokestatic    #89  <Method Logger Fabric.getLogger()>
	//   19   38:ldc1            #91  <String "CrashlyticsCore">
	//   20   40:ldc1            #211 <String "Could not create an instance of Firebase Analytics.">
	//   21   42:invokeinterface #204 <Method void Logger.w(String, String)>
			return false;
	//   22   47:iconst_0        
	//   23   48:ireturn         
		} else
		{
			return invoke(class1, obj, "registerOnMeasurementEventListener");
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:ldc1            #30  <String "registerOnMeasurementEventListener">
	//   28   54:invokespecial   #213 <Method boolean invoke(Class, Object, String)>
	//   29   57:ireturn         
		}
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
