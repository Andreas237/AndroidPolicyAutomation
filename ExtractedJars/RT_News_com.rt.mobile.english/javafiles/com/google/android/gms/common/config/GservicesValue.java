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
	//    1    1:invokespecial   #44  <Method void Object()>
		zzmz = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #50  <Field Object zzmz>
		mKey = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #52  <Field String mKey>
		mDefaultValue = obj;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #54  <Field Object mDefaultValue>
	//   11   19:return          
	}

	public static void forceInit(Context context)
	{
		forceInit(context, new HashSet());
	//    0    0:aload_0         
	//    1    1:new             #62  <Class HashSet>
	//    2    4:dup             
	//    3    5:invokespecial   #63  <Method void HashSet()>
	//    4    8:invokestatic    #66  <Method void forceInit(Context, HashSet)>
	//    5   11:return          
	}

	public static void forceInit(Context context, HashSet hashset)
	{
		zza(context, ((zza) (new zzd(context.getContentResolver()))), hashset);
	//    0    0:aload_0         
	//    1    1:new             #16  <Class GservicesValue$zzd>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #75  <Method ContentResolver Context.getContentResolver()>
	//    5    9:invokespecial   #78  <Method void GservicesValue$zzd(ContentResolver)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #81  <Method void zza(Context, GservicesValue$zza, HashSet)>
	//    8   16:return          
	}

	public static SharedPreferences getDirectBootCache(Context context)
	{
		return context.getApplicationContext().createDeviceProtectedStorageContext().getSharedPreferences("gservices-direboot-cache", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method Context Context.getApplicationContext()>
	//    2    4:invokevirtual   #94  <Method Context Context.createDeviceProtectedStorageContext()>
	//    3    7:ldc1            #96  <String "gservices-direboot-cache">
	//    4    9:iconst_0        
	//    5   10:invokevirtual   #100 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   13:areturn         
	}

	public static int getSharedUserId()
	{
		return zzmv;
	//    0    0:getstatic       #104 <Field int zzmv>
	//    1    3:ireturn         
	}

	public static void init(Context context)
	{
		HashSet hashset;
		if(zzd(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #108 <Method boolean zzd(Context)>
	//*   2    4:ifeq            18
			hashset = new HashSet();
	//    3    7:new             #62  <Class HashSet>
	//    4   10:dup             
	//    5   11:invokespecial   #63  <Method void HashSet()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            20
			hashset = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
		init(context, hashset);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #110 <Method void init(Context, HashSet)>
	//   13   25:return          
	}

	public static void init(Context context, HashSet hashset)
	{
		Object obj = sLock;
	//    0    0:getstatic       #46  <Field Object sLock>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		int i;
		if(zzmu == null)
	//*   4    6:getstatic       #114 <Field GservicesValue$zza zzmu>
	//*   5    9:ifnonnull       28
			zza(context, ((zza) (new zzd(context.getContentResolver()))), hashset);
	//    6   12:aload_0         
	//    7   13:new             #16  <Class GservicesValue$zzd>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokevirtual   #75  <Method ContentResolver Context.getContentResolver()>
	//   11   21:invokespecial   #78  <Method void GservicesValue$zzd(ContentResolver)>
	//   12   24:aload_1         
	//   13   25:invokestatic    #81  <Method void zza(Context, GservicesValue$zza, HashSet)>
		i = zzmv;
	//   14   28:getstatic       #104 <Field int zzmv>
	//   15   31:istore_2        
		if(i != 0)
			break MISSING_BLOCK_LABEL_66;
	//   16   32:iload_2         
	//   17   33:ifne            66
		try
		{
			zzmv = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).uid;
	//   18   36:aload_0         
	//   19   37:invokevirtual   #118 <Method PackageManager Context.getPackageManager()>
	//   20   40:ldc1            #120 <String "com.google.android.gms">
	//   21   42:iconst_0        
	//   22   43:invokevirtual   #126 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   23   46:getfield        #131 <Field int ApplicationInfo.uid>
	//   24   49:putstatic       #104 <Field int zzmv>
			break MISSING_BLOCK_LABEL_66;
	//   25   52:goto            66
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   26   55:astore_0        
		Log.e("GservicesValue", ((android.content.pm.PackageManager.NameNotFoundException) (context)).toString());
	//   27   56:ldc1            #133 <String "GservicesValue">
	//   28   58:aload_0         
	//   29   59:invokevirtual   #137 <Method String android.content.pm.PackageManager$NameNotFoundException.toString()>
	//   30   62:invokestatic    #143 <Method int Log.e(String, String)>
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
	//    4    6:invokespecial   #147 <Method void GservicesValue$zzb(zza)>
	//    5    9:new             #62  <Class HashSet>
	//    6   12:dup             
	//    7   13:invokespecial   #63  <Method void HashSet()>
	//    8   16:invokestatic    #81  <Method void zza(Context, GservicesValue$zza, HashSet)>
	//    9   19:return          
	}

	public static void initForTests(Context context, HashSet hashset)
	{
		zza(context, ((zza) (new zzb(((com.google.android.gms.common.config.zza) (null))))), hashset);
	//    0    0:aload_0         
	//    1    1:new             #10  <Class GservicesValue$zzb>
	//    2    4:dup             
	//    3    5:aconst_null     
	//    4    6:invokespecial   #147 <Method void GservicesValue$zzb(zza)>
	//    5    9:aload_1         
	//    6   10:invokestatic    #81  <Method void zza(Context, GservicesValue$zza, HashSet)>
	//    7   13:return          
	}

	public static void initForTests(String s, Object obj)
	{
		HashMap hashmap = new HashMap(1);
	//    0    0:new             #149 <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #152 <Method void HashMap(int)>
	//    4    8:astore_2        
		((Map) (hashmap)).put(((Object) (s)), obj);
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokeinterface #158 <Method Object Map.put(Object, Object)>
	//    9   17:pop             
		initForTests(((Map) (hashmap)));
	//   10   18:aload_2         
	//   11   19:invokestatic    #161 <Method void initForTests(Map)>
	//   12   22:return          
	}

	public static void initForTests(Map map)
	{
		synchronized(sLock)
	//*   0    0:getstatic       #46  <Field Object sLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			zzmu = ((zza) (new zzc(map)));
	//    4    6:new             #13  <Class GservicesValue$zzc>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #163 <Method void GservicesValue$zzc(Map)>
	//    8   14:putstatic       #114 <Field GservicesValue$zza zzmu>
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
	//    0    0:getstatic       #46  <Field Object sLock>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		Exception exception;
		if(zzmu != null)
	//*   4    6:getstatic       #114 <Field GservicesValue$zza zzmu>
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
	//    0    0:new             #170 <Class com.google.android.gms.common.config.zzg>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #173 <Method void com.google.android.gms.common.config.zzg(String, String)>
	//    5    9:areturn         
	}

	public static void resetAllOverrides()
	{
		Object obj = sLock;
	//    0    0:getstatic       #46  <Field Object sLock>
	//    1    3:astore_0        
		obj;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		if(!zzcg())
			break MISSING_BLOCK_LABEL_53;
	//    4    6:invokestatic    #178 <Method boolean zzcg()>
	//    5    9:ifeq            53
		for(Iterator iterator = zzb.zzci().iterator(); iterator.hasNext(); ((GservicesValue)iterator.next()).resetOverride());
	//    6   12:invokestatic    #182 <Method Collection GservicesValue$zzb.zzci()>
	//    7   15:invokeinterface #188 <Method Iterator Collection.iterator()>
	//    8   20:astore_1        
	//    9   21:aload_1         
	//   10   22:invokeinterface #193 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            45
	//   12   30:aload_1         
	//   13   31:invokeinterface #197 <Method Object Iterator.next()>
	//   14   36:checkcast       #2   <Class GservicesValue>
	//   15   39:invokevirtual   #200 <Method void resetOverride()>
	//*  16   42:goto            21
		zzb.zzci().clear();
	//   17   45:invokestatic    #182 <Method Collection GservicesValue$zzb.zzci()>
	//   18   48:invokeinterface #203 <Method void Collection.clear()>
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
	//    0    0:new             #206 <Class zzd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #209 <Method void zzd(String, Double)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Float float1)
	{
		return ((GservicesValue) (new zze(s, float1)));
	//    0    0:new             #213 <Class zze>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #216 <Method void zze(String, Float)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Integer integer)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zzc(s, integer)));
	//    0    0:new             #220 <Class zzc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #223 <Method void zzc(String, Integer)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Long long1)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zzb(s, long1)));
	//    0    0:new             #227 <Class zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #230 <Method void zzb(String, Long)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, String s1)
	{
		return ((GservicesValue) (new zzf(s, s1)));
	//    0    0:new             #233 <Class zzf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #234 <Method void zzf(String, String)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, boolean flag)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zza(s, Boolean.valueOf(flag))));
	//    0    0:new             #237 <Class zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #243 <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokespecial   #246 <Method void zza(String, Boolean)>
	//    6   12:areturn         
	}

	private static void zza(Context context, zza zza1, HashSet hashset)
	{
		Object obj = sLock;
	//    0    0:getstatic       #46  <Field Object sLock>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		zzmu = zza1;
	//    4    6:aload_1         
	//    5    7:putstatic       #114 <Field GservicesValue$zza zzmu>
		zzmy = null;
	//    6   10:aconst_null     
	//    7   11:putstatic       #249 <Field HashSet zzmy>
		zzmw = null;
	//    8   14:aconst_null     
	//    9   15:putstatic       #251 <Field Context zzmw>
		if(context == null)
			break MISSING_BLOCK_LABEL_43;
	//   10   18:aload_0         
	//   11   19:ifnull          43
		if(zzd(context))
	//*  12   22:aload_0         
	//*  13   23:invokestatic    #108 <Method boolean zzd(Context)>
	//*  14   26:ifeq            43
		{
			zzmy = hashset;
	//   15   29:aload_2         
	//   16   30:putstatic       #249 <Field HashSet zzmy>
			zzmw = context.getApplicationContext().createDeviceProtectedStorageContext();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #91  <Method Context Context.getApplicationContext()>
	//   19   37:invokevirtual   #94  <Method Context Context.createDeviceProtectedStorageContext()>
	//   20   40:putstatic       #251 <Field Context zzmw>
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
	//    0    0:getstatic       #46  <Field Object sLock>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		Exception exception;
		if(!(zzmu instanceof zzb) && !(zzmu instanceof zzc))
	//*   4    6:getstatic       #114 <Field GservicesValue$zza zzmu>
	//*   5    9:instanceof      #10  <Class GservicesValue$zzb>
	//*   6   12:ifne            41
	//*   7   15:getstatic       #114 <Field GservicesValue$zza zzmu>
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
	//    0    0:getstatic       #114 <Field GservicesValue$zza zzmu>
	//    1    3:areturn         
	}

	private static boolean zzd(Context context)
	{
		if(!PlatformVersion.isAtLeastN())
	//*   0    0:invokestatic    #259 <Method boolean PlatformVersion.isAtLeastN()>
	//*   1    3:ifne            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		context = ((Context) ((UserManager)context.getSystemService(android/os/UserManager)));
	//    4    8:aload_0         
	//    5    9:ldc2            #261 <Class UserManager>
	//    6   12:invokevirtual   #265 <Method Object Context.getSystemService(Class)>
	//    7   15:checkcast       #261 <Class UserManager>
	//    8   18:astore_0        
		if(((UserManager) (context)).isUserUnlocked())
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #268 <Method boolean UserManager.isUserUnlocked()>
	//*  11   23:ifeq            28
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		return !((UserManager) (context)).isUserRunning(Process.myUserHandle());
	//   14   28:aload_0         
	//   15   29:invokestatic    #274 <Method android.os.UserHandle Process.myUserHandle()>
	//   16   32:invokevirtual   #278 <Method boolean UserManager.isUserRunning(android.os.UserHandle)>
	//   17   35:ifne            40
	//   18   38:iconst_1        
	//   19   39:ireturn         
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	public final Object get()
	{
		Object obj;
		if(zzmz != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field Object zzmz>
	//*   2    4:ifnull          12
			return zzmz;
	//    3    7:aload_0         
	//    4    8:getfield        #50  <Field Object zzmz>
	//    5   11:areturn         
		obj = ((Object) (StrictMode.allowThreadDiskReads()));
	//    6   12:invokestatic    #287 <Method android.os.StrictMode$ThreadPolicy StrictMode.allowThreadDiskReads()>
	//    7   15:astore          4
		Object obj2 = sLock;
	//    8   17:getstatic       #46  <Field Object sLock>
	//    9   20:astore          7
		obj2;
	//   10   22:aload           7
		JVM INSTR monitorenter ;
	//   11   24:monitorenter    
		boolean flag;
		long l;
		Exception exception1;
		HashSet hashset;
		SecurityException securityexception;
		Context context;
		if(zzmw != null && zzd(zzmw))
	//*  12   25:getstatic       #251 <Field Context zzmw>
	//*  13   28:ifnull          314
	//*  14   31:getstatic       #251 <Field Context zzmw>
	//*  15   34:invokestatic    #108 <Method boolean zzd(Context)>
	//*  16   37:ifeq            314
			flag = true;
	//   17   40:iconst_1        
	//   18   41:istore_1        
		else
	//*  19   42:goto            45
	//*  20   45:getstatic       #249 <Field HashSet zzmy>
	//*  21   48:astore          5
	//*  22   50:getstatic       #251 <Field Context zzmw>
	//*  23   53:astore          6
	//*  24   55:aload           7
	//*  25   57:monitorexit     
	//*  26   58:iload_1         
	//*  27   59:ifeq            208
	//*  28   62:ldc1            #133 <String "GservicesValue">
	//*  29   64:iconst_3        
	//*  30   65:invokestatic    #291 <Method boolean Log.isLoggable(String, int)>
	//*  31   68:ifeq            121
	//*  32   71:aload_0         
	//*  33   72:getfield        #52  <Field String mKey>
	//*  34   75:invokestatic    #296 <Method String String.valueOf(Object)>
	//*  35   78:astore          4
	//*  36   80:aload           4
	//*  37   82:invokevirtual   #299 <Method int String.length()>
	//*  38   85:ifeq            101
	//*  39   88:ldc2            #301 <String "Gservice value accessed during directboot: ">
	//*  40   91:aload           4
	//*  41   93:invokevirtual   #305 <Method String String.concat(String)>
	//*  42   96:astore          4
	//*  43   98:goto            113
	//*  44  101:new             #293 <Class String>
	//*  45  104:dup             
	//*  46  105:ldc2            #301 <String "Gservice value accessed during directboot: ">
	//*  47  108:invokespecial   #308 <Method void String(String)>
	//*  48  111:astore          4
	//*  49  113:ldc1            #133 <String "GservicesValue">
	//*  50  115:aload           4
	//*  51  117:invokestatic    #311 <Method int Log.d(String, String)>
	//*  52  120:pop             
	//*  53  121:aload           5
	//*  54  123:ifnull          193
	//*  55  126:aload           5
	//*  56  128:aload_0         
	//*  57  129:getfield        #52  <Field String mKey>
	//*  58  132:invokevirtual   #315 <Method boolean HashSet.contains(Object)>
	//*  59  135:ifne            193
	//*  60  138:aload_0         
	//*  61  139:getfield        #52  <Field String mKey>
	//*  62  142:invokestatic    #296 <Method String String.valueOf(Object)>
	//*  63  145:astore          4
	//*  64  147:aload           4
	//*  65  149:invokevirtual   #299 <Method int String.length()>
	//*  66  152:ifeq            168
	//*  67  155:ldc2            #317 <String "Gservices key not whitelisted for directboot access: ">
	//*  68  158:aload           4
	//*  69  160:invokevirtual   #305 <Method String String.concat(String)>
	//*  70  163:astore          4
	//*  71  165:goto            180
	//*  72  168:new             #293 <Class String>
	//*  73  171:dup             
	//*  74  172:ldc2            #317 <String "Gservices key not whitelisted for directboot access: ">
	//*  75  175:invokespecial   #308 <Method void String(String)>
	//*  76  178:astore          4
	//*  77  180:ldc1            #133 <String "GservicesValue">
	//*  78  182:aload           4
	//*  79  184:invokestatic    #143 <Method int Log.e(String, String)>
	//*  80  187:pop             
	//*  81  188:aload_0         
	//*  82  189:getfield        #54  <Field Object mDefaultValue>
	//*  83  192:areturn         
	//*  84  193:aload_0         
	//*  85  194:aload           6
	//*  86  196:aload_0         
	//*  87  197:getfield        #52  <Field String mKey>
	//*  88  200:aload_0         
	//*  89  201:getfield        #54  <Field Object mDefaultValue>
	//*  90  204:invokevirtual   #321 <Method Object retrieveFromDirectBootCache(Context, String, Object)>
	//*  91  207:areturn         
	//*  92  208:getstatic       #46  <Field Object sLock>
	//*  93  211:astore          5
	//*  94  213:aload           5
	//*  95  215:monitorenter    
	//*  96  216:aconst_null     
	//*  97  217:putstatic       #249 <Field HashSet zzmy>
	//*  98  220:aconst_null     
	//*  99  221:putstatic       #251 <Field Context zzmw>
	//* 100  224:aload           5
	//* 101  226:monitorexit     
	//* 102  227:aload_0         
	//* 103  228:aload_0         
	//* 104  229:getfield        #52  <Field String mKey>
	//* 105  232:invokevirtual   #325 <Method Object retrieve(String)>
	//* 106  235:astore          5
	//* 107  237:aload           4
	//* 108  239:invokestatic    #329 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//* 109  242:aload           5
	//* 110  244:areturn         
	//* 111  245:astore          5
	//* 112  247:goto            285
	//* 113  250:invokestatic    #335 <Method long Binder.clearCallingIdentity()>
	//* 114  253:lstore_2        
	//* 115  254:aload_0         
	//* 116  255:aload_0         
	//* 117  256:getfield        #52  <Field String mKey>
	//* 118  259:invokevirtual   #325 <Method Object retrieve(String)>
	//* 119  262:astore          5
	//* 120  264:lload_2         
	//* 121  265:invokestatic    #339 <Method void Binder.restoreCallingIdentity(long)>
	//* 122  268:aload           4
	//* 123  270:invokestatic    #329 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//* 124  273:aload           5
	//* 125  275:areturn         
	//* 126  276:astore          5
	//* 127  278:lload_2         
	//* 128  279:invokestatic    #339 <Method void Binder.restoreCallingIdentity(long)>
	//* 129  282:aload           5
	//* 130  284:athrow          
	//* 131  285:aload           4
	//* 132  287:invokestatic    #329 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//* 133  290:aload           5
	//* 134  292:athrow          
	//* 135  293:astore          4
	//* 136  295:aload           5
	//* 137  297:monitorexit     
	//* 138  298:aload           4
	//* 139  300:athrow          
	//* 140  301:astore          4
	//* 141  303:aload           7
	//* 142  305:monitorexit     
	//* 143  306:aload           4
	//* 144  308:athrow          
	//* 145  309:astore          5
	//* 146  311:goto            250
			flag = false;
	//  147  314:iconst_0        
	//  148  315:istore_1        
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
	//* 149  316:goto            45
	}

	public final Object getBinderSafe()
	{
		return get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #343 <Method Object get()>
	//    2    4:areturn         
	}

	public String getKey()
	{
		return mKey;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String mKey>
	//    2    4:areturn         
	}

	public void override(Object obj)
	{
		if(!(zzmu instanceof zzb))
	//*   0    0:getstatic       #114 <Field GservicesValue$zza zzmu>
	//*   1    3:instanceof      #10  <Class GservicesValue$zzb>
	//*   2    6:ifne            18
			Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
	//    3    9:ldc1            #133 <String "GservicesValue">
	//    4   11:ldc2            #348 <String "GservicesValue.override(): test should probably call initForTests() first">
	//    5   14:invokestatic    #351 <Method int Log.w(String, String)>
	//    6   17:pop             
		zzmz = obj;
	//    7   18:aload_0         
	//    8   19:aload_1         
	//    9   20:putfield        #50  <Field Object zzmz>
		synchronized(sLock)
	//*  10   23:getstatic       #46  <Field Object sLock>
	//*  11   26:astore_1        
	//*  12   27:aload_1         
	//*  13   28:monitorenter    
		{
			if(zzcg())
	//*  14   29:invokestatic    #178 <Method boolean zzcg()>
	//*  15   32:ifeq            45
				zzb.zzci().add(((Object) (this)));
	//   16   35:invokestatic    #182 <Method Collection GservicesValue$zzb.zzci()>
	//   17   38:aload_0         
	//   18   39:invokeinterface #354 <Method boolean Collection.add(Object)>
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
	//    2    2:putfield        #50  <Field Object zzmz>
	//    3    5:return          
	}

	protected abstract Object retrieve(String s);

	protected Object retrieveFromDirectBootCache(Context context, String s, Object obj)
	{
		throw new UnsupportedOperationException("The Gservices classes used does not support direct-boot");
	//    0    0:new             #357 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #359 <String "The Gservices classes used does not support direct-boot">
	//    3    7:invokespecial   #360 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	private static final Object sLock = new Object();
	private static zza zzmu;
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
	//    2    4:invokespecial   #44  <Method void Object()>
	//    3    7:putstatic       #46  <Field Object sLock>
	//*   4   10:return          
	}
}
