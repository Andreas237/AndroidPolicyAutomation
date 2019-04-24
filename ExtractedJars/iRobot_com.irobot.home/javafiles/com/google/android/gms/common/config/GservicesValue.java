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
		zzbq = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #38  <Field Object zzbq>
		mKey = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #40  <Field String mKey>
		zzbp = obj;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #42  <Field Object zzbp>
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
	//    0    0:new             #50  <Class zzd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #53  <Method void zzd(String, Float)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Integer integer)
	{
		return ((GservicesValue) (new zzc(s, integer)));
	//    0    0:new             #57  <Class zzc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #60  <Method void zzc(String, Integer)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, Long long1)
	{
		return ((GservicesValue) (new zzb(s, long1)));
	//    0    0:new             #64  <Class zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #67  <Method void zzb(String, Long)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, String s1)
	{
		return ((GservicesValue) (new zze(s, s1)));
	//    0    0:new             #71  <Class zze>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #74  <Method void zze(String, String)>
	//    5    9:areturn         
	}

	public static GservicesValue value(String s, boolean flag)
	{
		return ((GservicesValue) (new com.google.android.gms.common.config.zza(s, Boolean.valueOf(flag))));
	//    0    0:new             #78  <Class zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokestatic    #84  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokespecial   #87  <Method void zza(String, Boolean)>
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
		android.os.StrictMode.ThreadPolicy threadpolicy;
		if(zzbq != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Object zzbq>
	//*   2    4:ifnull          12
			return zzbq;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field Object zzbq>
	//    5   11:areturn         
		threadpolicy = StrictMode.allowThreadDiskReads();
	//    6   12:invokestatic    #99  <Method android.os.StrictMode$ThreadPolicy StrictMode.allowThreadDiskReads()>
	//    7   15:astore_3        
		synchronized(sLock) { }
	//    8   16:getstatic       #34  <Field Object sLock>
	//    9   19:astore          4
	//   10   21:aload           4
	//   11   23:monitorenter    
	//   12   24:aload           4
	//   13   26:monitorexit     
		synchronized(sLock)
	//*  14   27:getstatic       #34  <Field Object sLock>
	//*  15   30:astore          4
	//*  16   32:aload           4
	//*  17   34:monitorenter    
		{
			zzbo = null;
	//   18   35:aconst_null     
	//   19   36:putstatic       #101 <Field HashSet zzbo>
			zzbn = null;
	//   20   39:aconst_null     
	//   21   40:putstatic       #103 <Field Context zzbn>
		}
	//   22   43:aload           4
	//   23   45:monitorexit     
		obj = zzd(mKey);
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #40  <Field String mKey>
	//   27   51:invokevirtual   #107 <Method Object zzd(String)>
	//   28   54:astore          4
		StrictMode.setThreadPolicy(threadpolicy);
	//   29   56:aload_3         
	//   30   57:invokestatic    #111 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return obj;
	//   31   60:aload           4
	//   32   62:areturn         
		obj;
	//   33   63:astore          4
		  goto _L1
	//*  34   65:goto            102
_L3:
		long l = Binder.clearCallingIdentity();
	//   35   68:invokestatic    #117 <Method long Binder.clearCallingIdentity()>
	//   36   71:lstore_1        
		obj = zzd(mKey);
	//   37   72:aload_0         
	//   38   73:aload_0         
	//   39   74:getfield        #40  <Field String mKey>
	//   40   77:invokevirtual   #107 <Method Object zzd(String)>
	//   41   80:astore          4
		Binder.restoreCallingIdentity(l);
	//   42   82:lload_1         
	//   43   83:invokestatic    #121 <Method void Binder.restoreCallingIdentity(long)>
		StrictMode.setThreadPolicy(threadpolicy);
	//   44   86:aload_3         
	//   45   87:invokestatic    #111 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return obj;
	//   46   90:aload           4
	//   47   92:areturn         
		obj;
	//   48   93:astore          4
		Binder.restoreCallingIdentity(l);
	//   49   95:lload_1         
	//   50   96:invokestatic    #121 <Method void Binder.restoreCallingIdentity(long)>
		throw obj;
	//   51   99:aload           4
	//   52  101:athrow          
_L1:
		StrictMode.setThreadPolicy(threadpolicy);
	//   53  102:aload_3         
	//   54  103:invokestatic    #111 <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw obj;
	//   55  106:aload           4
	//   56  108:athrow          
		exception;
	//   57  109:astore_3        
		obj;
	//   58  110:aload           4
		JVM INSTR monitorexit ;
	//   59  112:monitorexit     
		throw exception;
	//   60  113:aload_3         
	//   61  114:athrow          
		exception1;
	//   62  115:astore_3        
		obj;
	//   63  116:aload           4
		JVM INSTR monitorexit ;
	//   64  118:monitorexit     
		throw exception1;
	//   65  119:aload_3         
	//   66  120:athrow          
		SecurityException securityexception;
		securityexception;
	//   67  121:astore          4
		if(true) goto _L3; else goto _L2
	//   68  123:goto            68
_L2:
	}

	public final Object getBinderSafe()
	{
		return get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method Object get()>
	//    2    4:areturn         
	}

	public void override(Object obj)
	{
		Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
	//    0    0:ldc1            #132 <String "GservicesValue">
	//    1    2:ldc1            #134 <String "GservicesValue.override(): test should probably call initForTests() first">
	//    2    4:invokestatic    #140 <Method int Log.w(String, String)>
	//    3    7:pop             
		zzbq = obj;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #38  <Field Object zzbq>
		synchronized(sLock)
	//*   7   13:getstatic       #34  <Field Object sLock>
	//*   8   16:astore_1        
	//*   9   17:aload_1         
	//*  10   18:monitorenter    
		{
			zzi();
	//   11   19:invokestatic    #142 <Method boolean zzi()>
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
		zzbq = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #38  <Field Object zzbq>
	//    3    5:return          
	}

	protected abstract Object zzd(String s);

	private static final Object sLock = new Object();
	private static zza zzbl;
	private static int zzbm;
	private static Context zzbn;
	private static HashSet zzbo;
	protected final String mKey;
	protected final Object zzbp;
	private Object zzbq;

	static 
	{
	//    0    0:new             #5   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void Object()>
	//    3    7:putstatic       #34  <Field Object sLock>
	//*   4   10:return          
	}
}
