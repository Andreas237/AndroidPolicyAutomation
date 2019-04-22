// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.config;

import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.stable.zzg;
import com.google.android.gms.internal.stable.zzi;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.config:
//			zzg, zzd, zze, zzc, 
//			zzb, zzf, zza

public abstract class GservicesValue
{
	private static interface zza
	{

		public abstract Long getLong(String s, Long long1);

		public abstract String getString(String s, String s1);

		public abstract Boolean zza(String s, Boolean boolean1);

		public abstract Double zza(String s, Double double1);

		public abstract Float zza(String s, Float float1);

		public abstract Integer zza(String s, Integer integer);

		public abstract String zzb(String s, String s1);
	}

	private static final class zzb
		implements zza
	{

		static Collection zzci()
		{
			return zzna;
		//    0    0:getstatic       #21  <Field Collection zzna>
		//    1    3:areturn         
		}

		public final Long getLong(String s, Long long1)
		{
			return long1;
		//    0    0:aload_2         
		//    1    1:areturn         
		}

		public final String getString(String s, String s1)
		{
			return s1;
		//    0    0:aload_2         
		//    1    1:areturn         
		}

		public final Boolean zza(String s, Boolean boolean1)
		{
			return boolean1;
		//    0    0:aload_2         
		//    1    1:areturn         
		}

		public final Double zza(String s, Double double1)
		{
			return double1;
		//    0    0:aload_2         
		//    1    1:areturn         
		}

		public final Float zza(String s, Float float1)
		{
			return float1;
		//    0    0:aload_2         
		//    1    1:areturn         
		}

		public final Integer zza(String s, Integer integer)
		{
			return integer;
		//    0    0:aload_2         
		//    1    1:areturn         
		}

		public final String zzb(String s, String s1)
		{
			return s1;
		//    0    0:aload_2         
		//    1    1:areturn         
		}

		private static final Collection zzna = new HashSet();

		static 
		{
		//    0    0:new             #16  <Class HashSet>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void HashSet()>
		//    3    7:putstatic       #21  <Field Collection zzna>
		//*   4   10:return          
		}

		private zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:return          
		}

		zzb(com.google.android.gms.common.config.zza zza1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void GservicesValue$zzb()>
		//    2    4:return          
		}
	}

	private static final class zzc
		implements zza
	{

		private final Object zza(String s, Object obj)
		{
			if(values.containsKey(((Object) (s))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field Map values>
		//*   2    4:aload_1         
		//*   3    5:invokeinterface #31  <Method boolean Map.containsKey(Object)>
		//*   4   10:ifeq            24
				return values.get(((Object) (s)));
		//    5   13:aload_0         
		//    6   14:getfield        #20  <Field Map values>
		//    7   17:aload_1         
		//    8   18:invokeinterface #35  <Method Object Map.get(Object)>
		//    9   23:areturn         
			else
				return obj;
		//   10   24:aload_2         
		//   11   25:areturn         
		}

		public final Long getLong(String s, Long long1)
		{
			return (Long)zza(s, ((Object) (long1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
		//    4    6:checkcast       #42  <Class Long>
		//    5    9:areturn         
		}

		public final String getString(String s, String s1)
		{
			return (String)zza(s, ((Object) (s1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
		//    4    6:checkcast       #46  <Class String>
		//    5    9:areturn         
		}

		public final Boolean zza(String s, Boolean boolean1)
		{
			return (Boolean)zza(s, ((Object) (boolean1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
		//    4    6:checkcast       #49  <Class Boolean>
		//    5    9:areturn         
		}

		public final Double zza(String s, Double double1)
		{
			return (Double)zza(s, ((Object) (double1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
		//    4    6:checkcast       #52  <Class Double>
		//    5    9:areturn         
		}

		public final Float zza(String s, Float float1)
		{
			return (Float)zza(s, ((Object) (float1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
		//    4    6:checkcast       #55  <Class Float>
		//    5    9:areturn         
		}

		public final Integer zza(String s, Integer integer)
		{
			return (Integer)zza(s, ((Object) (integer)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
		//    4    6:checkcast       #58  <Class Integer>
		//    5    9:areturn         
		}

		public final String zzb(String s, String s1)
		{
			return (String)zza(s, ((Object) (s1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #40  <Method Object zza(String, Object)>
		//    4    6:checkcast       #46  <Class String>
		//    5    9:areturn         
		}

		private final Map values;

		public zzc(Map map)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			values = map;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Map values>
		//    5    9:return          
		}
	}

	private static final class zzd
		implements zza
	{

		public final Long getLong(String s, Long long1)
		{
			return Long.valueOf(zzi.getLong(mContentResolver, s, long1.longValue()));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #27  <Method long Long.longValue()>
		//    5    9:invokestatic    #32  <Method long zzi.getLong(ContentResolver, String, long)>
		//    6   12:invokestatic    #36  <Method Long Long.valueOf(long)>
		//    7   15:areturn         
		}

		public final String getString(String s, String s1)
		{
			return zzi.zza(mContentResolver, s, s1);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #42  <Method String zzi.zza(ContentResolver, String, String)>
		//    5    9:areturn         
		}

		public final Boolean zza(String s, Boolean boolean1)
		{
			return Boolean.valueOf(zzi.zza(mContentResolver, s, boolean1.booleanValue()));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #49  <Method boolean Boolean.booleanValue()>
		//    5    9:invokestatic    #52  <Method boolean zzi.zza(ContentResolver, String, boolean)>
		//    6   12:invokestatic    #55  <Method Boolean Boolean.valueOf(boolean)>
		//    7   15:areturn         
		}

		public final Double zza(String s, Double double1)
		{
			s = zzi.zza(mContentResolver, s, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokestatic    #42  <Method String zzi.zza(ContentResolver, String, String)>
		//    5    9:astore_1        
			if(s != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          24
			{
				double d;
				try
				{
					d = Double.parseDouble(s);
		//    8   14:aload_1         
		//    9   15:invokestatic    #64  <Method double Double.parseDouble(String)>
		//   10   18:dstore_3        
				}
		//*  11   19:dload_3         
		//*  12   20:invokestatic    #67  <Method Double Double.valueOf(double)>
		//*  13   23:areturn         
		//*  14   24:aload_2         
		//*  15   25:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
		//*  16   26:astore_1        
				{
					return double1;
		//   17   27:aload_2         
		//   18   28:areturn         
				}
				return Double.valueOf(d);
			} else
			{
				return double1;
			}
		}

		public final Float zza(String s, Float float1)
		{
			s = zzi.zza(mContentResolver, s, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokestatic    #42  <Method String zzi.zza(ContentResolver, String, String)>
		//    5    9:astore_1        
			if(s != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          24
			{
				float f;
				try
				{
					f = Float.parseFloat(s);
		//    8   14:aload_1         
		//    9   15:invokestatic    #74  <Method float Float.parseFloat(String)>
		//   10   18:fstore_3        
				}
		//*  11   19:fload_3         
		//*  12   20:invokestatic    #77  <Method Float Float.valueOf(float)>
		//*  13   23:areturn         
		//*  14   24:aload_2         
		//*  15   25:areturn         
				// Misplaced declaration of an exception variable
				catch(String s)
		//*  16   26:astore_1        
				{
					return float1;
		//   17   27:aload_2         
		//   18   28:areturn         
				}
				return Float.valueOf(f);
			} else
			{
				return float1;
			}
		}

		public final Integer zza(String s, Integer integer)
		{
			return Integer.valueOf(zzi.getInt(mContentResolver, s, integer.intValue()));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #84  <Method int Integer.intValue()>
		//    5    9:invokestatic    #88  <Method int zzi.getInt(ContentResolver, String, int)>
		//    6   12:invokestatic    #91  <Method Integer Integer.valueOf(int)>
		//    7   15:areturn         
		}

		public final String zzb(String s, String s1)
		{
			return zzg.zza(mContentResolver, s, s1);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ContentResolver mContentResolver>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #95  <Method String zzg.zza(ContentResolver, String, String)>
		//    5    9:areturn         
		}

		private final ContentResolver mContentResolver;

		public zzd(ContentResolver contentresolver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mContentResolver = contentresolver;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ContentResolver mContentResolver>
		//    5    9:return          
		}
	}


	protected GservicesValue(String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		zzmz = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #55  <Field Object zzmz>
		mKey = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #57  <Field String mKey>
		mDefaultValue = obj;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #59  <Field Object mDefaultValue>
	//   11   19:return          
	}

	public static void forceInit(Context context)
	{
		forceInit(context, new HashSet());
	//    0    0:aload_0         
	//    1    1:new             #67  <Class HashSet>
	//    2    4:dup             
	//    3    5:invokespecial   #68  <Method void HashSet()>
	//    4    8:invokestatic    #71  <Method void forceInit(Context, HashSet)>
	//    5   11:return          
	}

	public static void forceInit(Context context, HashSet hashset)
	{
		zza(context, ((zza) (new zzd(context.getContentResolver()))), hashset);
	//    0    0:aload_0         
	//    1    1:new             #16  <Class GservicesValue$zzd>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #80  <Method ContentResolver Context.getContentResolver()>
	//    5    9:invokespecial   #83  <Method void GservicesValue$zzd(ContentResolver)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #86  <Method void zza(Context, GservicesValue$zza, HashSet)>
	//    8   16:return          
	}

	public static SharedPreferences getDirectBootCache(Context context)
	{
		return context.getApplicationContext().createDeviceProtectedStorageContext().getSharedPreferences("gservices-direboot-cache", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #99  <Method Context Context.createDeviceProtectedStorageContext()>
	//    3    7:ldc1            #101 <String "gservices-direboot-cache">
	//    4    9:iconst_0        
	//    5   10:invokevirtual   #105 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   13:areturn         
	}

	public static int getSharedUserId()
	{
		return zzmv;
	//    0    0:getstatic       #47  <Field int zzmv>
	//    1    3:ireturn         
	}

	public static void init(Context context)
	{
		HashSet hashset;
		if(zzd(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #111 <Method boolean zzd(Context)>
	//*   2    4:ifeq            18
			hashset = new HashSet();
	//    3    7:new             #67  <Class HashSet>
	//    4   10:dup             
	//    5   11:invokespecial   #68  <Method void HashSet()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            20
			hashset = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
		init(context, hashset);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #113 <Method void init(Context, HashSet)>
	//   13   25:return          
	}

	public static void init(Context context, HashSet hashset)
	{
		Object obj = sLock;
	//    0    0:getstatic       #43  <Field Object sLock>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		int i;
		if(zzmu == null)
	//*   4    6:getstatic       #45  <Field GservicesValue$zza zzmu>
	//*   5    9:ifnonnull       28
			zza(context, ((zza) (new zzd(context.getContentResolver()))), hashset);
	//    6   12:aload_0         
	//    7   13:new             #16  <Class GservicesValue$zzd>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #80  <Method ContentResolver Context.getContentResolver()>
	//   11   21:invokespecial   #83  <Method void GservicesValue$zzd(ContentResolver)>
	//   12   24:aload_1         
	//   13   25:invokestatic    #86  <Method void zza(Context, GservicesValue$zza, HashSet)>
		i = zzmv;
	//   14   28:getstatic       #47  <Field int zzmv>
	//   15   31:istore_2        
		if(i != 0)
			break MISSING_BLOCK_LABEL_66;
	//   16   32:iload_2         
	//   17   33:ifne            66
		try
		{
			zzmv = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
	//   18   36:aload_0         
	//   19   37:invokevirtual   #119 <Method PackageManager Context.getPackageManager()>
	//   20   40:ldc1            #121 <String "com.google.android.gms">
	//   21   42:iconst_0        
	//   22   43:invokevirtual   #127 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   23   46:getfield        #132 <Field int ApplicationInfo.uid>
	//   24   49:putstatic       #47  <Field int zzmv>
			break MISSING_BLOCK_LABEL_66;
	//   25   52:goto            66
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   26   55:astore_0        
		Log.e("GservicesValue", ((android.content.pm.PackageManager.NameNotFoundException) (context)).toString());
	//   27   56:ldc1            #134 <String "GservicesValue">
	//   28   58:aload_0         
	//   29   59:invokevirtual   #138 <Method String android.content.pm.PackageManager$NameNotFoundException.toString()>
	//   30   62:invokestatic    #144 <Method int Log.e(String, String)>
	//   31   65:pop             
		obj;
	//   32   66:aload_3         
		JVM INSTR monitorexit ;
	//   33   67:monitorexit     
		return;
	//   34   68:return          
		context;
	//   35   69:astore_0        
		obj;
	//   36   70:aload_3         
		JVM INSTR monitorexit ;
	//   37   71:monitorexit     
		throw context;
	//   38   72:aload_0         
	//   39   73:athrow          
	}

	public static void initForTests()
	{
		zza(((Context) (null)), ((zza) (new zzb(((com.google.android.gms.common.config.zza) (null))))), new HashSet());
	//    0    0:aconst_null     
	//    1    1:new             #10  <Class GservicesValue$zzb>
	//    2    4:dup             
	//    3    5:aconst_null     
	//    4    6:invokespecial   #148 <Method void GservicesValue$zzb(zza)>
	//    5    9:new             #67  <Class HashSet>
	//    6   12:dup             
	//    7   13:invokespecial   #68  <Method void HashSet()>
	//    8   16:invokestatic    #86  <Method void zza(Context, GservicesValue$zza, HashSet)>
	//    9   19:return          
	}

	public static void initForTests(Context context, HashSet hashset)
	{
		zza(context, ((zza) (new zzb(((com.google.android.gms.common.config.zza) (null))))), hashset);
	//    0    0:aload_0         
	//    1    1:new             #10  <Class GservicesValue$zzb>
	//    2    4:dup             
	//    3    5:aconst_null     
	//    4    6:invokespecial   #148 <Method void GservicesValue$zzb(zza)>
	//    5    9:aload_1         
	//    6   10:invokestatic    #86  <Method void zza(Context, GservicesValue$zza, HashSet)>
	//    7   13:return          
	}

	public static void initForTests(String s, Object obj)
	{
		HashMap hashmap = new HashMap(1);
	//    0    0:new             #150 <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #153 <Method void HashMap(int)>
	//    4    8:astore_2        
		((Map) (hashmap)).put(((Object) (s)), obj);
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #159 <Method Object Map.put(Object, Object)>
	//    9   17:pop             
		initForTests(((Map) (hashmap)));
	//   10   18:aload_2         
	//   11   19:invokestatic    #162 <Method void initForTests(Map)>
	//   12   22:return          
	}

	public static void initForTests(Map map)
	{
		synchronized(sLock)
	//*   0    0:getstatic       #43  <Field Object sLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			zzmu = ((zza) (new zzc(map)));
	//    4    6:new             #13  <Class GservicesValue$zzc>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #164 <Method void GservicesValue$zzc(Map)>
	//    8   14:putstatic       #45  <Field GservicesValue$zza zzmu>
		}
	//    9   17:aload_1         
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		map;
	//   12   20:astore_0        
		obj;
	//   13   21:aload_1         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		throw map;
	//   15   23:aload_0         
	//   16   24:athrow          
	}

	public static boolean isInitialized()
	{
		Object obj = sLock;
	//    0    0:getstatic       #43  <Field Object sLock>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		Exception exception;
		if(zzmu != null)
	//*   4    6:getstatic       #45  <Field GservicesValue$zza zzmu>
	//*   5    9:ifnull          26
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_0        
		else
	//*   8   14:goto            17
	//*   9   17:aload_1         
	//*  10   18:monitorexit     
	//*  11   19:iload_0         
	//*  12   20:ireturn         
	//*  13   21:astore_2        
	//*  14   22:aload_1         
	//*  15   23:monitorexit     
	//*  16   24:aload_2         
	//*  17   25:athrow          
			flag = false;
	//   18   26:iconst_0        
	//   19   27:istore_0        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  20   28:goto            17
	}

	public static GservicesValue partnerSetting(String s, String s1)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zzg(s, s1)));
	//    0    0:new             #171 <Class com.google.android.gms.common.config.zzg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #174 <Method void com.google.android.gms.common.config.zzg(String, String)>
	//    5    9:areturn         
	}

	public static void resetAllOverrides()
	{
		Object obj = sLock;
	//    0    0:getstatic       #43  <Field Object sLock>
	//    1    3:astore_0        
		obj;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(!zzcg())
			break MISSING_BLOCK_LABEL_53;
	//    4    6:invokestatic    #179 <Method boolean zzcg()>
	//    5    9:ifeq            53
		for(Iterator iterator = zzb.zzci().iterator(); iterator.hasNext(); ((GservicesValue)iterator.next()).resetOverride());
	//    6   12:invokestatic    #183 <Method Collection GservicesValue$zzb.zzci()>
	//    7   15:invokeinterface #189 <Method Iterator Collection.iterator()>
	//    8   20:astore_1        
	//    9   21:aload_1         
	//   10   22:invokeinterface #194 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            45
	//   12   30:aload_1         
	//   13   31:invokeinterface #198 <Method Object Iterator.next()>
	//   14   36:checkcast       #2   <Class GservicesValue>
	//   15   39:invokevirtual   #201 <Method void resetOverride()>
	//*  16   42:goto            21
		zzb.zzci().clear();
	//   17   45:invokestatic    #183 <Method Collection GservicesValue$zzb.zzci()>
	//   18   48:invokeinterface #204 <Method void Collection.clear()>
		obj;
	//   19   53:aload_0         
		JVM INSTR monitorexit ;
	//   20   54:monitorexit     
		return;
	//   21   55:return          
		Exception exception;
		exception;
	//   22   56:astore_1        
		obj;
	//   23   57:aload_0         
		JVM INSTR monitorexit ;
	//   24   58:monitorexit     
		throw exception;
	//   25   59:aload_1         
	//   26   60:athrow          
	}

	public static GservicesValue value(String s, Double double1)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zzd(s, double1)));
	//    0    0:new             #207 <Class zzd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #210 <Method void zzd(String, Double)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Float float1)
	{
		return ((GservicesValue) (new zze(s, float1)));
	//    0    0:new             #214 <Class zze>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #217 <Method void zze(String, Float)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Integer integer)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zzc(s, integer)));
	//    0    0:new             #221 <Class zzc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #224 <Method void zzc(String, Integer)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Long long1)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zzb(s, long1)));
	//    0    0:new             #228 <Class zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #231 <Method void zzb(String, Long)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, String s1)
	{
		return ((GservicesValue) (new zzf(s, s1)));
	//    0    0:new             #234 <Class zzf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #235 <Method void zzf(String, String)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, boolean flag)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zza(s, Boolean.valueOf(flag))));
	//    0    0:new             #238 <Class zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #244 <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokespecial   #247 <Method void zza(String, Boolean)>
	//    6   12:areturn         
	}

	private static void zza(Context context, zza zza1, HashSet hashset)
	{
		Object obj = sLock;
	//    0    0:getstatic       #43  <Field Object sLock>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		zzmu = zza1;
	//    4    6:aload_1         
	//    5    7:putstatic       #45  <Field GservicesValue$zza zzmu>
		zzmy = null;
	//    6   10:aconst_null     
	//    7   11:putstatic       #250 <Field HashSet zzmy>
		zzmw = null;
	//    8   14:aconst_null     
	//    9   15:putstatic       #252 <Field Context zzmw>
		if(context == null)
			break MISSING_BLOCK_LABEL_43;
	//   10   18:aload_0         
	//   11   19:ifnull          43
		if(zzd(context))
	//*  12   22:aload_0         
	//*  13   23:invokestatic    #111 <Method boolean zzd(Context)>
	//*  14   26:ifeq            43
		{
			zzmy = hashset;
	//   15   29:aload_2         
	//   16   30:putstatic       #250 <Field HashSet zzmy>
			zzmw = context.getApplicationContext().createDeviceProtectedStorageContext();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #96  <Method Context Context.getApplicationContext()>
	//   19   37:invokevirtual   #99  <Method Context Context.createDeviceProtectedStorageContext()>
	//   20   40:putstatic       #252 <Field Context zzmw>
		}
		obj;
	//   21   43:aload_3         
		JVM INSTR monitorexit ;
	//   22   44:monitorexit     
		return;
	//   23   45:return          
		context;
	//   24   46:astore_0        
		obj;
	//   25   47:aload_3         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		throw context;
	//   27   49:aload_0         
	//   28   50:athrow          
	}

	private static boolean zzcg()
	{
		Object obj = sLock;
	//    0    0:getstatic       #43  <Field Object sLock>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		Exception exception;
		if(!(zzmu instanceof zzb) && !(zzmu instanceof zzc))
	//*   4    6:getstatic       #45  <Field GservicesValue$zza zzmu>
	//*   5    9:instanceof      #10  <Class GservicesValue$zzb>
	//*   6   12:ifne            41
	//*   7   15:getstatic       #45  <Field GservicesValue$zza zzmu>
	//*   8   18:instanceof      #13  <Class GservicesValue$zzc>
	//*   9   21:ifeq            36
	//*  10   24:goto            41
	//*  11   27:aload_1         
	//*  12   28:monitorexit     
	//*  13   29:iload_0         
	//*  14   30:ireturn         
	//*  15   31:astore_2        
	//*  16   32:aload_1         
	//*  17   33:monitorexit     
	//*  18   34:aload_2         
	//*  19   35:athrow          
			flag = false;
	//   20   36:iconst_0        
	//   21   37:istore_0        
		else
	//*  22   38:goto            27
			flag = true;
	//   23   41:iconst_1        
	//   24   42:istore_0        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  25   43:goto            27
	}

	static zza zzch()
	{
		return zzmu;
	//    0    0:getstatic       #45  <Field GservicesValue$zza zzmu>
	//    1    3:areturn         
	}

	private static boolean zzd(Context context)
	{
		if(!PlatformVersion.isAtLeastN())
	//*   0    0:invokestatic    #260 <Method boolean PlatformVersion.isAtLeastN()>
	//*   1    3:ifne            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		context = ((Context) ((UserManager)context.getSystemService(android/os/UserManager)));
	//    4    8:aload_0         
	//    5    9:ldc2            #262 <Class UserManager>
	//    6   12:invokevirtual   #266 <Method Object Context.getSystemService(Class)>
	//    7   15:checkcast       #262 <Class UserManager>
	//    8   18:astore_0        
		if(((UserManager) (context)).isUserUnlocked())
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #269 <Method boolean UserManager.isUserUnlocked()>
	//*  11   23:ifeq            28
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		return !((UserManager) (context)).isUserRunning(Process.myUserHandle());
	//   14   28:aload_0         
	//   15   29:invokestatic    #275 <Method android.os.UserHandle Process.myUserHandle()>
	//   16   32:invokevirtual   #279 <Method boolean UserManager.isUserRunning(android.os.UserHandle)>
	//   17   35:ifne            40
	//   18   38:iconst_1        
	//   19   39:ireturn         
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	public final Object get()
	{
		Object obj;
		obj = zzmz;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Object zzmz>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          14
			return obj;
	//    5   11:aload           4
	//    6   13:areturn         
		obj = ((Object) (StrictMode.allowThreadDiskReads()));
	//    7   14:invokestatic    #288 <Method android.os.StrictMode$ThreadPolicy StrictMode.allowThreadDiskReads()>
	//    8   17:astore          4
		Object obj2 = sLock;
	//    9   19:getstatic       #43  <Field Object sLock>
	//   10   22:astore          7
		obj2;
	//   11   24:aload           7
		JVM INSTR monitorenter ;
	//   12   26:monitorenter    
		boolean flag;
		long l;
		Exception exception1;
		HashSet hashset;
		SecurityException securityexception;
		Context context;
		if(zzmw != null && zzd(zzmw))
	//*  13   27:getstatic       #252 <Field Context zzmw>
	//*  14   30:ifnull          316
	//*  15   33:getstatic       #252 <Field Context zzmw>
	//*  16   36:invokestatic    #111 <Method boolean zzd(Context)>
	//*  17   39:ifeq            316
			flag = true;
	//   18   42:iconst_1        
	//   19   43:istore_1        
		else
	//*  20   44:goto            47
	//*  21   47:getstatic       #250 <Field HashSet zzmy>
	//*  22   50:astore          5
	//*  23   52:getstatic       #252 <Field Context zzmw>
	//*  24   55:astore          6
	//*  25   57:aload           7
	//*  26   59:monitorexit     
	//*  27   60:iload_1         
	//*  28   61:ifeq            210
	//*  29   64:ldc1            #134 <String "GservicesValue">
	//*  30   66:iconst_3        
	//*  31   67:invokestatic    #292 <Method boolean Log.isLoggable(String, int)>
	//*  32   70:ifeq            123
	//*  33   73:aload_0         
	//*  34   74:getfield        #57  <Field String mKey>
	//*  35   77:invokestatic    #297 <Method String String.valueOf(Object)>
	//*  36   80:astore          4
	//*  37   82:aload           4
	//*  38   84:invokevirtual   #300 <Method int String.length()>
	//*  39   87:ifeq            103
	//*  40   90:ldc2            #302 <String "Gservice value accessed during directboot: ">
	//*  41   93:aload           4
	//*  42   95:invokevirtual   #306 <Method String String.concat(String)>
	//*  43   98:astore          4
	//*  44  100:goto            115
	//*  45  103:new             #294 <Class String>
	//*  46  106:dup             
	//*  47  107:ldc2            #302 <String "Gservice value accessed during directboot: ">
	//*  48  110:invokespecial   #309 <Method void String(String)>
	//*  49  113:astore          4
	//*  50  115:ldc1            #134 <String "GservicesValue">
	//*  51  117:aload           4
	//*  52  119:invokestatic    #312 <Method int Log.d(String, String)>
	//*  53  122:pop             
	//*  54  123:aload           5
	//*  55  125:ifnull          195
	//*  56  128:aload           5
	//*  57  130:aload_0         
	//*  58  131:getfield        #57  <Field String mKey>
	//*  59  134:invokevirtual   #316 <Method boolean HashSet.contains(Object)>
	//*  60  137:ifne            195
	//*  61  140:aload_0         
	//*  62  141:getfield        #57  <Field String mKey>
	//*  63  144:invokestatic    #297 <Method String String.valueOf(Object)>
	//*  64  147:astore          4
	//*  65  149:aload           4
	//*  66  151:invokevirtual   #300 <Method int String.length()>
	//*  67  154:ifeq            170
	//*  68  157:ldc2            #318 <String "Gservices key not whitelisted for directboot access: ">
	//*  69  160:aload           4
	//*  70  162:invokevirtual   #306 <Method String String.concat(String)>
	//*  71  165:astore          4
	//*  72  167:goto            182
	//*  73  170:new             #294 <Class String>
	//*  74  173:dup             
	//*  75  174:ldc2            #318 <String "Gservices key not whitelisted for directboot access: ">
	//*  76  177:invokespecial   #309 <Method void String(String)>
	//*  77  180:astore          4
	//*  78  182:ldc1            #134 <String "GservicesValue">
	//*  79  184:aload           4
	//*  80  186:invokestatic    #144 <Method int Log.e(String, String)>
	//*  81  189:pop             
	//*  82  190:aload_0         
	//*  83  191:getfield        #59  <Field Object mDefaultValue>
	//*  84  194:areturn         
	//*  85  195:aload_0         
	//*  86  196:aload           6
	//*  87  198:aload_0         
	//*  88  199:getfield        #57  <Field String mKey>
	//*  89  202:aload_0         
	//*  90  203:getfield        #59  <Field Object mDefaultValue>
	//*  91  206:invokevirtual   #322 <Method Object retrieveFromDirectBootCache(Context, String, Object)>
	//*  92  209:areturn         
	//*  93  210:getstatic       #43  <Field Object sLock>
	//*  94  213:astore          5
	//*  95  215:aload           5
	//*  96  217:monitorenter    
	//*  97  218:aconst_null     
	//*  98  219:putstatic       #250 <Field HashSet zzmy>
	//*  99  222:aconst_null     
	//* 100  223:putstatic       #252 <Field Context zzmw>
	//* 101  226:aload           5
	//* 102  228:monitorexit     
	//* 103  229:aload_0         
	//* 104  230:aload_0         
	//* 105  231:getfield        #57  <Field String mKey>
	//* 106  234:invokevirtual   #326 <Method Object retrieve(String)>
	//* 107  237:astore          5
	//* 108  239:aload           4
	//* 109  241:invokestatic    #330 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//* 110  244:aload           5
	//* 111  246:areturn         
	//* 112  247:astore          5
	//* 113  249:goto            287
	//* 114  252:invokestatic    #336 <Method long Binder.clearCallingIdentity()>
	//* 115  255:lstore_2        
	//* 116  256:aload_0         
	//* 117  257:aload_0         
	//* 118  258:getfield        #57  <Field String mKey>
	//* 119  261:invokevirtual   #326 <Method Object retrieve(String)>
	//* 120  264:astore          5
	//* 121  266:lload_2         
	//* 122  267:invokestatic    #340 <Method void Binder.restoreCallingIdentity(long)>
	//* 123  270:aload           4
	//* 124  272:invokestatic    #330 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//* 125  275:aload           5
	//* 126  277:areturn         
	//* 127  278:astore          5
	//* 128  280:lload_2         
	//* 129  281:invokestatic    #340 <Method void Binder.restoreCallingIdentity(long)>
	//* 130  284:aload           5
	//* 131  286:athrow          
	//* 132  287:aload           4
	//* 133  289:invokestatic    #330 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//* 134  292:aload           5
	//* 135  294:athrow          
	//* 136  295:astore          4
	//* 137  297:aload           5
	//* 138  299:monitorexit     
	//* 139  300:aload           4
	//* 140  302:athrow          
	//* 141  303:astore          4
	//* 142  305:aload           7
	//* 143  307:monitorexit     
	//* 144  308:aload           4
	//* 145  310:athrow          
	//* 146  311:astore          5
	//* 147  313:goto            252
			flag = false;
	//  148  316:iconst_0        
	//  149  317:istore_1        
		hashset = zzmy;
		context = zzmw;
		obj2;
		JVM INSTR monitorexit ;
		if(flag)
		{
			if(Log.isLoggable("GservicesValue", 3))
			{
				obj = ((Object) (String.valueOf(((Object) (mKey)))));
				if(((String) (obj)).length() != 0)
					obj = ((Object) ("Gservice value accessed during directboot: ".concat(((String) (obj)))));
				else
					obj = ((Object) (new String("Gservice value accessed during directboot: ")));
				Log.d("GservicesValue", ((String) (obj)));
			}
			if(hashset != null && !hashset.contains(((Object) (mKey))))
			{
				obj = ((Object) (String.valueOf(((Object) (mKey)))));
				if(((String) (obj)).length() != 0)
					obj = ((Object) ("Gservices key not whitelisted for directboot access: ".concat(((String) (obj)))));
				else
					obj = ((Object) (new String("Gservices key not whitelisted for directboot access: ")));
				Log.e("GservicesValue", ((String) (obj)));
				return mDefaultValue;
			} else
			{
				return retrieveFromDirectBootCache(context, mKey, mDefaultValue);
			}
		}
		synchronized(sLock)
		{
			zzmy = null;
			zzmw = null;
		}
		obj1 = retrieve(mKey);
		StrictMode.setThreadPolicy(((android.os.StrictMode.ThreadPolicy) (obj)));
		return obj1;
		obj1;
		  goto _L1
_L3:
		l = Binder.clearCallingIdentity();
		obj1 = retrieve(mKey);
		Binder.restoreCallingIdentity(l);
		StrictMode.setThreadPolicy(((android.os.StrictMode.ThreadPolicy) (obj)));
		return obj1;
		obj1;
		Binder.restoreCallingIdentity(l);
		throw obj1;
_L1:
		StrictMode.setThreadPolicy(((android.os.StrictMode.ThreadPolicy) (obj)));
		throw obj1;
		exception;
		obj1;
		JVM INSTR monitorexit ;
		throw exception;
		exception1;
		obj2;
		JVM INSTR monitorexit ;
		throw exception1;
		securityexception;
		if(true) goto _L3; else goto _L2
_L2:
	//* 150  318:goto            47
	}

	public final Object getBinderSafe()
	{
		return get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #344 <Method Object get()>
	//    2    4:areturn         
	}

	public String getKey()
	{
		return mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String mKey>
	//    2    4:areturn         
	}

	public void override(Object obj)
	{
		if(!(zzmu instanceof zzb))
	//*   0    0:getstatic       #45  <Field GservicesValue$zza zzmu>
	//*   1    3:instanceof      #10  <Class GservicesValue$zzb>
	//*   2    6:ifne            18
			Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
	//    3    9:ldc1            #134 <String "GservicesValue">
	//    4   11:ldc2            #349 <String "GservicesValue.override(): test should probably call initForTests() first">
	//    5   14:invokestatic    #352 <Method int Log.w(String, String)>
	//    6   17:pop             
		zzmz = obj;
	//    7   18:aload_0         
	//    8   19:aload_1         
	//    9   20:putfield        #55  <Field Object zzmz>
		synchronized(sLock)
	//*  10   23:getstatic       #43  <Field Object sLock>
	//*  11   26:astore_1        
	//*  12   27:aload_1         
	//*  13   28:monitorenter    
		{
			if(zzcg())
	//*  14   29:invokestatic    #179 <Method boolean zzcg()>
	//*  15   32:ifeq            45
				zzb.zzci().add(((Object) (this)));
	//   16   35:invokestatic    #183 <Method Collection GservicesValue$zzb.zzci()>
	//   17   38:aload_0         
	//   18   39:invokeinterface #355 <Method boolean Collection.add(Object)>
	//   19   44:pop             
		}
	//   20   45:aload_1         
	//   21   46:monitorexit     
		return;
	//   22   47:return          
		exception;
	//   23   48:astore_2        
		obj;
	//   24   49:aload_1         
		JVM INSTR monitorexit ;
	//   25   50:monitorexit     
		throw exception;
	//   26   51:aload_2         
	//   27   52:athrow          
	}

	public void resetOverride()
	{
		zzmz = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #55  <Field Object zzmz>
	//    3    5:return          
	}

	protected abstract Object retrieve(String s);

	protected Object retrieveFromDirectBootCache(Context context, String s, Object obj)
	{
		throw new UnsupportedOperationException("The Gservices classes used does not support direct-boot");
	//    0    0:new             #358 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #360 <String "The Gservices classes used does not support direct-boot">
	//    3    7:invokespecial   #361 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	private static final Object sLock = new Object();
	private static zza zzmu = null;
	private static int zzmv = 0;
	private static Context zzmw;
	private static String zzmx = "com.google.android.providers.gsf.permission.READ_GSERVICES";
	private static HashSet zzmy;
	protected final Object mDefaultValue;
	protected final String mKey;
	private Object zzmz;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void Object()>
	//    3    7:putstatic       #43  <Field Object sLock>
	//    4   10:aconst_null     
	//    5   11:putstatic       #45  <Field GservicesValue$zza zzmu>
	//    6   14:iconst_0        
	//    7   15:putstatic       #47  <Field int zzmv>
	//    8   18:ldc1            #49  <String "com.google.android.providers.gsf.permission.READ_GSERVICES">
	//    9   20:putstatic       #51  <Field String zzmx>
	//*  10   23:return          
	}
}
