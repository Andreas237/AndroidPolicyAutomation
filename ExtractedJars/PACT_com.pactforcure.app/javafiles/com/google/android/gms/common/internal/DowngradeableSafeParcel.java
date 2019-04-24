// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.common.internal:
//			ReflectedParcelable

public abstract class DowngradeableSafeParcel extends zza
	implements ReflectedParcelable
{

	public DowngradeableSafeParcel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void zza()>
		zzaEl = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field boolean zzaEl>
	//    5    9:return          
	}

	protected static boolean zzdp(String s)
	{
		zzxn();
	//    0    0:invokestatic    #37  <Method ClassLoader zzxn()>
	//    1    3:pop             
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	protected static ClassLoader zzxn()
	{
		synchronized(zzaEi) { }
	//    0    0:getstatic       #23  <Field Object zzaEi>
	//    1    3:astore_0        
	//    2    4:aload_0         
	//    3    5:monitorenter    
	//    4    6:aload_0         
	//    5    7:monitorexit     
		return null;
	//    6    8:aconst_null     
	//    7    9:areturn         
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

	protected static Integer zzxo()
	{
		synchronized(zzaEi) { }
	//    0    0:getstatic       #23  <Field Object zzaEi>
	//    1    3:astore_0        
	//    2    4:aload_0         
	//    3    5:monitorenter    
	//    4    6:aload_0         
	//    5    7:monitorexit     
		return null;
	//    6    8:aconst_null     
	//    7    9:areturn         
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

	private static final Object zzaEi = new Object();
	private static ClassLoader zzaEj = null;
	private static Integer zzaEk = null;
	private boolean zzaEl;

	static 
	{
	//    0    0:new             #18  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object zzaEi>
	//    4   10:aconst_null     
	//    5   11:putstatic       #25  <Field ClassLoader zzaEj>
	//    6   14:aconst_null     
	//    7   15:putstatic       #27  <Field Integer zzaEk>
	//*   8   18:return          
	}
}
