// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//			ReflectedParcelable

public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public DowngradeableSafeParcel()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void AbstractSafeParcelable()>
		zzde = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field boolean zzde>
	//    5    9:return          
	}

	protected static boolean canUnparcelSafely(String s)
	{
		zzp();
	//    0    0:invokestatic    #34  <Method ClassLoader zzp()>
	//    1    3:pop             
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	protected static Integer getUnparcelClientVersion()
	{
		synchronized(zzdb) { }
	//    0    0:getstatic       #24  <Field Object zzdb>
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

	private static ClassLoader zzp()
	{
		synchronized(zzdb) { }
	//    0    0:getstatic       #24  <Field Object zzdb>
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

	protected abstract boolean prepareForClientVersion(int i);

	public void setShouldDowngrade(boolean flag)
	{
		zzde = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field boolean zzde>
	//    3    5:return          
	}

	protected boolean shouldDowngrade()
	{
		return zzde;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean zzde>
	//    2    4:ireturn         
	}

	private static final Object zzdb = new Object();
	private static ClassLoader zzdc;
	private static Integer zzdd;
	private boolean zzde;

	static 
	{
	//    0    0:new             #19  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void Object()>
	//    3    7:putstatic       #24  <Field Object zzdb>
	//*   4   10:return          
	}
}
