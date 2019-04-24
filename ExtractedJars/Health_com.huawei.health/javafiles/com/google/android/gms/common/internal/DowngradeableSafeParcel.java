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
		zzaFJ = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #31  <Field boolean zzaFJ>
	//    5    9:return          
	}

	protected static boolean zzdl(String s)
	{
		zzxU();
	//    0    0:invokestatic    #37  <Method ClassLoader zzxU()>
	//    1    3:pop             
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	protected static ClassLoader zzxU()
	{
		Object obj = zzaFG;
	//    0    0:getstatic       #23  <Field Object zzaFG>
	//    1    3:astore_0        
		obj;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
	//*   4    6:aload_0         
		return null;
	//    5    7:monitorexit     
	//    6    8:aconst_null     
	//    7    9:areturn         
	}

	protected static Integer zzxV()
	{
		Object obj = zzaFG;
	//    0    0:getstatic       #23  <Field Object zzaFG>
	//    1    3:astore_0        
		obj;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
	//*   4    6:aload_0         
		return null;
	//    5    7:monitorexit     
	//    6    8:aconst_null     
	//    7    9:areturn         
	}

	private static final Object zzaFG = new Object();
	private static ClassLoader zzaFH = null;
	private static Integer zzaFI = null;
	private boolean zzaFJ;

	static 
	{
	//    0    0:new             #18  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object zzaFG>
	//    4   10:aconst_null     
	//    5   11:putstatic       #25  <Field ClassLoader zzaFH>
	//    6   14:aconst_null     
	//    7   15:putstatic       #27  <Field Integer zzaFI>
	//*   8   18:return          
	}
}
