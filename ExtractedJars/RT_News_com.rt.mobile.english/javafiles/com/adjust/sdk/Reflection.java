// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.plugin.Plugin;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package com.adjust.sdk:
//			Constants

public class Reflection
{

	public Reflection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object createDefaultInstance(Class class1)
	{
		try
		{
			class1 = ((Class) (class1.newInstance()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method Object Class.newInstance()>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:areturn         
	//*   5    7:aconst_null     
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			return ((Object) (null));
		}
		return ((Object) (class1));
	//*   7    9:astore_0        
	//*   8   10:goto            7
	}

	public static Object createDefaultInstance(String s)
	{
		return createDefaultInstance(forName(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #24  <Method Class forName(String)>
	//    2    4:invokestatic    #26  <Method Object createDefaultInstance(Class)>
	//    3    7:areturn         
	}

	public static transient Object createInstance(String s, Class aclass[], Object aobj[])
	{
		try
		{
			s = ((String) (Class.forName(s).getConstructor(aclass).newInstance(aobj)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method Class Class.forName(String)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method Constructor Class.getConstructor(Class[])>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #38  <Method Object Constructor.newInstance(Object[])>
	//    6   12:astore_0        
		}
	//*   7   13:aload_0         
	//*   8   14:areturn         
	//*   9   15:aconst_null     
	//*  10   16:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return ((Object) (null));
		}
		return ((Object) (s));
	//*  11   17:astore_0        
	//*  12   18:goto            15
	}

	public static Class forName(String s)
	{
		try
		{
			s = ((String) (Class.forName(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method Class Class.forName(String)>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:areturn         
	//*   5    7:aconst_null     
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((Class) (s));
	//*   7    9:astore_0        
	//*   8   10:goto            7
	}

	private static Object getAdvertisingInfoObject(Context context)
		throws Exception
	{
		return invokeStaticMethod("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
			android/content/Context
		}, new Object[] {
			context
		});
	//    0    0:ldc1            #44  <String "com.google.android.gms.ads.identifier.AdvertisingIdClient">
	//    1    2:ldc1            #46  <String "getAdvertisingIdInfo">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #48  <Class Context>
	//    7   12:aastore         
	//    8   13:iconst_1        
	//    9   14:anewarray       Object[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:aload_0         
	//   13   20:aastore         
	//   14   21:invokestatic    #52  <Method Object invokeStaticMethod(String, String, Class[], Object[])>
	//   15   24:areturn         
	}

	public static String getAndroidId(Context context)
	{
		try
		{
			context = ((Context) ((String)invokeStaticMethod("com.adjust.sdk.plugin.AndroidIdUtil", "getAndroidId", new Class[] {
				android/content/Context
			}, new Object[] {
				context
			})));
	//    0    0:ldc1            #57  <String "com.adjust.sdk.plugin.AndroidIdUtil">
	//    1    2:ldc1            #58  <String "getAndroidId">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #48  <Class Context>
	//    7   12:aastore         
	//    8   13:iconst_1        
	//    9   14:anewarray       Object[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:aload_0         
	//   13   20:aastore         
	//   14   21:invokestatic    #52  <Method Object invokeStaticMethod(String, String, Class[], Object[])>
	//   15   24:checkcast       #60  <Class String>
	//   16   27:astore_0        
		}
	//*  17   28:aload_0         
	//*  18   29:areturn         
	//*  19   30:aconst_null     
	//*  20   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		return ((String) (context));
	//*  21   32:astore_0        
	//*  22   33:goto            30
	}

	public static String getMacAddress(Context context)
	{
		try
		{
			context = ((Context) ((String)invokeStaticMethod("com.adjust.sdk.plugin.MacAddressUtil", "getMacAddress", new Class[] {
				android/content/Context
			}, new Object[] {
				context
			})));
	//    0    0:ldc1            #63  <String "com.adjust.sdk.plugin.MacAddressUtil">
	//    1    2:ldc1            #64  <String "getMacAddress">
	//    2    4:iconst_1        
	//    3    5:anewarray       Class[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #48  <Class Context>
	//    7   12:aastore         
	//    8   13:iconst_1        
	//    9   14:anewarray       Object[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:aload_0         
	//   13   20:aastore         
	//   14   21:invokestatic    #52  <Method Object invokeStaticMethod(String, String, Class[], Object[])>
	//   15   24:checkcast       #60  <Class String>
	//   16   27:astore_0        
		}
	//*  17   28:aload_0         
	//*  18   29:areturn         
	//*  19   30:aconst_null     
	//*  20   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		return ((String) (context));
	//*  21   32:astore_0        
	//*  22   33:goto            30
	}

	public static String getPlayAdId(Context context)
	{
		try
		{
			context = ((Context) ((String)invokeInstanceMethod(getAdvertisingInfoObject(context), "getId", ((Class []) (null)), new Object[0])));
	//    0    0:aload_0         
	//    1    1:invokestatic    #67  <Method Object getAdvertisingInfoObject(Context)>
	//    2    4:ldc1            #69  <String "getId">
	//    3    6:aconst_null     
	//    4    7:iconst_0        
	//    5    8:anewarray       Object[]
	//    6   11:invokestatic    #73  <Method Object invokeInstanceMethod(Object, String, Class[], Object[])>
	//    7   14:checkcast       #60  <Class String>
	//    8   17:astore_0        
		}
	//*   9   18:aload_0         
	//*  10   19:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  11   20:astore_0        
		{
			return null;
	//   12   21:aconst_null     
	//   13   22:areturn         
		}
		return ((String) (context));
	}

	public static Map getPluginKeys(Context context)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #77  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #78  <Method void HashMap()>
	//    3    7:astore_1        
		Iterator iterator = getPlugins().iterator();
	//    4    8:invokestatic    #82  <Method List getPlugins()>
	//    5   11:invokeinterface #88  <Method Iterator List.iterator()>
	//    6   16:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   17:aload_2         
	//    8   18:invokeinterface #94  <Method boolean Iterator.hasNext()>
	//    9   23:ifeq            68
			java.util.Map.Entry entry = ((Plugin)iterator.next()).getParameter(context);
	//   10   26:aload_2         
	//   11   27:invokeinterface #97  <Method Object Iterator.next()>
	//   12   32:checkcast       #99  <Class Plugin>
	//   13   35:aload_0         
	//   14   36:invokeinterface #103 <Method java.util.Map$Entry Plugin.getParameter(Context)>
	//   15   41:astore_3        
			if(entry != null)
	//*  16   42:aload_3         
	//*  17   43:ifnull          17
				((Map) (hashmap)).put(entry.getKey(), entry.getValue());
	//   18   46:aload_1         
	//   19   47:aload_3         
	//   20   48:invokeinterface #108 <Method Object java.util.Map$Entry.getKey()>
	//   21   53:aload_3         
	//   22   54:invokeinterface #111 <Method Object java.util.Map$Entry.getValue()>
	//   23   59:invokeinterface #117 <Method Object Map.put(Object, Object)>
	//   24   64:pop             
		} while(true);
	//   25   65:goto            17
		if(((Map) (hashmap)).size() == 0)
	//*  26   68:aload_1         
	//*  27   69:invokeinterface #121 <Method int Map.size()>
	//*  28   74:ifne            79
			return null;
	//   29   77:aconst_null     
	//   30   78:areturn         
		else
			return ((Map) (hashmap));
	//   31   79:aload_1         
	//   32   80:areturn         
	}

	private static List getPlugins()
	{
		ArrayList arraylist = new ArrayList(Constants.PLUGINS.size());
	//    0    0:new             #125 <Class ArrayList>
	//    1    3:dup             
	//    2    4:getstatic       #131 <Field List Constants.PLUGINS>
	//    3    7:invokeinterface #132 <Method int List.size()>
	//    4   12:invokespecial   #135 <Method void ArrayList(int)>
	//    5   15:astore_0        
		Iterator iterator = Constants.PLUGINS.iterator();
	//    6   16:getstatic       #131 <Field List Constants.PLUGINS>
	//    7   19:invokeinterface #88  <Method Iterator List.iterator()>
	//    8   24:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   25:aload_1         
	//   10   26:invokeinterface #94  <Method boolean Iterator.hasNext()>
	//   11   31:ifeq            72
			Object obj = createDefaultInstance((String)iterator.next());
	//   12   34:aload_1         
	//   13   35:invokeinterface #97  <Method Object Iterator.next()>
	//   14   40:checkcast       #60  <Class String>
	//   15   43:invokestatic    #137 <Method Object createDefaultInstance(String)>
	//   16   46:astore_2        
			if(obj != null && (obj instanceof Plugin))
	//*  17   47:aload_2         
	//*  18   48:ifnull          25
	//*  19   51:aload_2         
	//*  20   52:instanceof      #99  <Class Plugin>
	//*  21   55:ifeq            25
				((List) (arraylist)).add(((Object) ((Plugin)obj)));
	//   22   58:aload_0         
	//   23   59:aload_2         
	//   24   60:checkcast       #99  <Class Plugin>
	//   25   63:invokeinterface #141 <Method boolean List.add(Object)>
	//   26   68:pop             
		} while(true);
	//   27   69:goto            25
		return ((List) (arraylist));
	//   28   72:aload_0         
	//   29   73:areturn         
	}

	public static transient Object invokeInstanceMethod(Object obj, String s, Class aclass[], Object aobj[])
		throws Exception
	{
		return invokeMethod(obj.getClass(), s, obj, aclass, aobj);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method Class Object.getClass()>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokestatic    #150 <Method Object invokeMethod(Class, String, Object, Class[], Object[])>
	//    7   11:areturn         
	}

	public static transient Object invokeMethod(Class class1, String s, Object obj, Class aclass[], Object aobj[])
		throws Exception
	{
		return class1.getMethod(s, aclass).invoke(obj, aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #154 <Method Method Class.getMethod(String, Class[])>
	//    4    6:aload_2         
	//    5    7:aload           4
	//    6    9:invokevirtual   #160 <Method Object Method.invoke(Object, Object[])>
	//    7   12:areturn         
	}

	public static transient Object invokeStaticMethod(String s, String s1, Class aclass[], Object aobj[])
		throws Exception
	{
		return invokeMethod(Class.forName(s), s1, ((Object) (null)), aclass, aobj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method Class Class.forName(String)>
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokestatic    #150 <Method Object invokeMethod(Class, String, Object, Class[], Object[])>
	//    7   11:areturn         
	}

	private static boolean isConnectionResultSuccess(Integer integer)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(integer == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		int i;
		int j;
		try
		{
			i = Class.forName("com.google.android.gms.common.ConnectionResult").getField("SUCCESS").getInt(((Object) (null)));
	//    6    8:ldc1            #164 <String "com.google.android.gms.common.ConnectionResult">
	//    7   10:invokestatic    #29  <Method Class Class.forName(String)>
	//    8   13:ldc1            #166 <String "SUCCESS">
	//    9   15:invokevirtual   #170 <Method Field Class.getField(String)>
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #176 <Method int Field.getInt(Object)>
	//   12   22:istore_1        
			j = integer.intValue();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #181 <Method int Integer.intValue()>
	//   15   27:istore_2        
		}
	//*  16   28:iload_1         
	//*  17   29:iload_2         
	//*  18   30:icmpne          35
	//*  19   33:iconst_1        
	//*  20   34:istore_3        
	//*  21   35:iload_3         
	//*  22   36:ireturn         
		// Misplaced declaration of an exception variable
		catch(Integer integer)
	//*  23   37:astore_0        
		{
			return false;
	//   24   38:iconst_0        
	//   25   39:ireturn         
		}
		if(i == j)
			flag = true;
		return flag;
	}

	public static Boolean isPlayTrackingEnabled(Context context)
	{
		boolean flag;
		try
		{
			flag = ((Boolean)invokeInstanceMethod(getAdvertisingInfoObject(context), "isLimitAdTrackingEnabled", ((Class []) (null)), new Object[0])).booleanValue();
	//    0    0:aload_0         
	//    1    1:invokestatic    #67  <Method Object getAdvertisingInfoObject(Context)>
	//    2    4:ldc1            #185 <String "isLimitAdTrackingEnabled">
	//    3    6:aconst_null     
	//    4    7:iconst_0        
	//    5    8:anewarray       Object[]
	//    6   11:invokestatic    #73  <Method Object invokeInstanceMethod(Object, String, Class[], Object[])>
	//    7   14:checkcast       #187 <Class Boolean>
	//    8   17:invokevirtual   #190 <Method boolean Boolean.booleanValue()>
	//    9   20:istore_1        
		}
	//*  10   21:iload_1         
	//*  11   22:iconst_1        
	//*  12   23:ixor            
	//*  13   24:invokestatic    #194 <Method Boolean Boolean.valueOf(boolean)>
	//*  14   27:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  15   28:astore_0        
		{
			return null;
	//   16   29:aconst_null     
	//   17   30:areturn         
		}
		return Boolean.valueOf(flag ^ true);
	}
}
