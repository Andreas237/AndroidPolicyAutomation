// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.config;

import android.content.Context;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.common.config:
//			zzd, zzc, zzb, zze, 
//			zza

public abstract class GservicesValue
{
	private static interface zza
	{

		public abstract Long getLong(String s, Long long1);

		public abstract String getString(String s, String s1);

		public abstract Boolean zza(String s, Boolean boolean1);

		public abstract Float zza(String s, Float float1);

		public abstract Integer zza(String s, Integer integer);
	}


	protected GservicesValue(String s, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		zzbr = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #42  <Field Object zzbr>
		mKey = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #44  <Field String mKey>
		zzbq = obj;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #46  <Field Object zzbq>
	//   11   19:return          
	}

	public static boolean isInitialized()
	{
		synchronized(sLock) { }
	//    0    0:getstatic       #34  <Field Object sLock>
	//    1    3:astore_0        
	//    2    4:aload_0         
	//    3    5:monitorenter    
	//    4    6:aload_0         
	//    5    7:monitorexit     
		return false;
	//    6    8:iconst_0        
	//    7    9:ireturn         
		exception;
	//    8   10:astore_1        
		obj;
	//    9   11:aload_0         
		JVM INSTR monitorexit ;
	//   10   12:monitorexit     
		throw exception;
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public static GservicesValue value(String s, Float float1)
	{
		return ((GservicesValue) (new zzd(s, float1)));
	//    0    0:new             #54  <Class zzd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #57  <Method void zzd(String, Float)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Integer integer)
	{
		return ((GservicesValue) (new zzc(s, integer)));
	//    0    0:new             #61  <Class zzc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #64  <Method void zzc(String, Integer)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Long long1)
	{
		return ((GservicesValue) (new zzb(s, long1)));
	//    0    0:new             #68  <Class zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #71  <Method void zzb(String, Long)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, String s1)
	{
		return ((GservicesValue) (new zze(s, s1)));
	//    0    0:new             #75  <Class zze>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #78  <Method void zze(String, String)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, boolean flag)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zza(s, Boolean.valueOf(flag))));
	//    0    0:new             #82  <Class zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #88  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokespecial   #91  <Method void zza(String, Boolean)>
	//    6   12:areturn         
	}

	private static boolean zzi()
	{
		synchronized(sLock) { }
	//    0    0:getstatic       #34  <Field Object sLock>
	//    1    3:astore_0        
	//    2    4:aload_0         
	//    3    5:monitorenter    
	//    4    6:aload_0         
	//    5    7:monitorexit     
		return false;
	//    6    8:iconst_0        
	//    7    9:ireturn         
		exception;
	//    8   10:astore_1        
		obj;
	//    9   11:aload_0         
		JVM INSTR monitorexit ;
	//   10   12:monitorexit     
		throw exception;
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final Object get()
	{
		Object obj;
		obj = zzbr;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object zzbr>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          11
			return obj;
	//    5    9:aload_3         
	//    6   10:areturn         
		obj = ((Object) (StrictMode.allowThreadDiskReads()));
	//    7   11:invokestatic    #103 <Method android.os.StrictMode$ThreadPolicy StrictMode.allowThreadDiskReads()>
	//    8   14:astore_3        
		synchronized(sLock) { }
	//    9   15:getstatic       #34  <Field Object sLock>
	//   10   18:astore          4
	//   11   20:aload           4
	//   12   22:monitorenter    
	//   13   23:aload           4
	//   14   25:monitorexit     
		synchronized(sLock)
	//*  15   26:getstatic       #34  <Field Object sLock>
	//*  16   29:astore          4
	//*  17   31:aload           4
	//*  18   33:monitorenter    
		{
			zzbp = null;
	//   19   34:aconst_null     
	//   20   35:putstatic       #105 <Field HashSet zzbp>
			zzbo = null;
	//   21   38:aconst_null     
	//   22   39:putstatic       #107 <Field Context zzbo>
		}
	//   23   42:aload           4
	//   24   44:monitorexit     
		obj1 = zzd(mKey);
	//   25   45:aload_0         
	//   26   46:aload_0         
	//   27   47:getfield        #44  <Field String mKey>
	//   28   50:invokevirtual   #111 <Method Object zzd(String)>
	//   29   53:astore          4
		StrictMode.setThreadPolicy(((android.os.StrictMode.ThreadPolicy) (obj)));
	//   30   55:aload_3         
	//   31   56:invokestatic    #115 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return obj1;
	//   32   59:aload           4
	//   33   61:areturn         
		obj1;
	//   34   62:astore          4
		  goto _L1
	//*  35   64:goto            101
_L3:
		long l = Binder.clearCallingIdentity();
	//   36   67:invokestatic    #121 <Method long Binder.clearCallingIdentity()>
	//   37   70:lstore_1        
		obj1 = zzd(mKey);
	//   38   71:aload_0         
	//   39   72:aload_0         
	//   40   73:getfield        #44  <Field String mKey>
	//   41   76:invokevirtual   #111 <Method Object zzd(String)>
	//   42   79:astore          4
		Binder.restoreCallingIdentity(l);
	//   43   81:lload_1         
	//   44   82:invokestatic    #125 <Method void Binder.restoreCallingIdentity(long)>
		StrictMode.setThreadPolicy(((android.os.StrictMode.ThreadPolicy) (obj)));
	//   45   85:aload_3         
	//   46   86:invokestatic    #115 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return obj1;
	//   47   89:aload           4
	//   48   91:areturn         
		obj1;
	//   49   92:astore          4
		Binder.restoreCallingIdentity(l);
	//   50   94:lload_1         
	//   51   95:invokestatic    #125 <Method void Binder.restoreCallingIdentity(long)>
		throw obj1;
	//   52   98:aload           4
	//   53  100:athrow          
_L1:
		StrictMode.setThreadPolicy(((android.os.StrictMode.ThreadPolicy) (obj)));
	//   54  101:aload_3         
	//   55  102:invokestatic    #115 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw obj1;
	//   56  105:aload           4
	//   57  107:athrow          
		exception;
	//   58  108:astore_3        
		obj1;
	//   59  109:aload           4
		JVM INSTR monitorexit ;
	//   60  111:monitorexit     
		throw exception;
	//   61  112:aload_3         
	//   62  113:athrow          
		exception1;
	//   63  114:astore_3        
		obj1;
	//   64  115:aload           4
		JVM INSTR monitorexit ;
	//   65  117:monitorexit     
		throw exception1;
	//   66  118:aload_3         
	//   67  119:athrow          
		SecurityException securityexception;
		securityexception;
	//   68  120:astore          4
		if(true) goto _L3; else goto _L2
	//   69  122:goto            67
_L2:
	}

	public final Object getBinderSafe()
	{
		return get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #130 <Method Object get()>
	//    2    4:areturn         
	}

	public void override(Object obj)
	{
		Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
	//    0    0:ldc1            #136 <String "GservicesValue">
	//    1    2:ldc1            #138 <String "GservicesValue.override(): test should probably call initForTests() first">
	//    2    4:invokestatic    #144 <Method int Log.w(String, String)>
	//    3    7:pop             
		zzbr = obj;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #42  <Field Object zzbr>
		synchronized(sLock)
	//*   7   13:getstatic       #34  <Field Object sLock>
	//*   8   16:astore_1        
	//*   9   17:aload_1         
	//*  10   18:monitorenter    
		{
			zzi();
	//   11   19:invokestatic    #146 <Method boolean zzi()>
	//   12   22:pop             
		}
	//   13   23:aload_1         
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		exception;
	//   16   26:astore_2        
		obj;
	//   17   27:aload_1         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		throw exception;
	//   19   29:aload_2         
	//   20   30:athrow          
	}

	public void resetOverride()
	{
		zzbr = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #42  <Field Object zzbr>
	//    3    5:return          
	}

	protected abstract Object zzd(String s);

	private static final Object sLock = new Object();
	private static zza zzbm = null;
	private static int zzbn = 0;
	private static Context zzbo;
	private static HashSet zzbp;
	protected final String mKey;
	protected final Object zzbq;
	private Object zzbr;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void Object()>
	//    3    7:putstatic       #34  <Field Object sLock>
	//    4   10:aconst_null     
	//    5   11:putstatic       #36  <Field GservicesValue$zza zzbm>
	//    6   14:iconst_0        
	//    7   15:putstatic       #38  <Field int zzbn>
	//*   8   18:return          
	}
}
