// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;


// Referenced classes of package com.google.android.gms.flags:
//			FlagRegistry, FlagValueProvider

public final class Singletons
{

	private Singletons()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class FlagRegistry>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void FlagRegistry()>
	//    6   12:putfield        #26  <Field FlagRegistry zzaci>
	//    7   15:aload_0         
	//    8   16:new             #28  <Class FlagValueProvider>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void FlagValueProvider()>
	//   11   23:putfield        #31  <Field FlagValueProvider zzacj>
	//   12   26:return          
	}

	public static FlagRegistry flagRegistry()
	{
		return zzdm().zzaci;
	//    0    0:invokestatic    #37  <Method Singletons zzdm()>
	//    1    3:getfield        #26  <Field FlagRegistry zzaci>
	//    2    6:areturn         
	}

	public static FlagValueProvider flagValueProvider()
	{
		return zzdm().zzacj;
	//    0    0:invokestatic    #37  <Method Singletons zzdm()>
	//    1    3:getfield        #31  <Field FlagValueProvider zzacj>
	//    2    6:areturn         
	}

	protected static void setInstance(Singletons singletons)
	{
		com/google/android/gms/flags/Singletons;
	//    0    0:ldc1            #2   <Class Singletons>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzach = singletons;
	//    2    3:aload_0         
	//    3    4:putstatic       #41  <Field Singletons zzach>
		com/google/android/gms/flags/Singletons;
	//    4    7:ldc1            #2   <Class Singletons>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return;
	//    6   10:return          
		singletons;
	//    7   11:astore_0        
		com/google/android/gms/flags/Singletons;
	//    8   12:ldc1            #2   <Class Singletons>
		JVM INSTR monitorexit ;
	//    9   14:monitorexit     
		throw singletons;
	//   10   15:aload_0         
	//   11   16:athrow          
	}

	private static Singletons zzdm()
	{
		com/google/android/gms/flags/Singletons;
	//    0    0:ldc1            #2   <Class Singletons>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Singletons singletons = zzach;
	//    2    3:getstatic       #41  <Field Singletons zzach>
	//    3    6:astore_0        
		com/google/android/gms/flags/Singletons;
	//    4    7:ldc1            #2   <Class Singletons>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return singletons;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
		com/google/android/gms/flags/Singletons;
	//    9   13:ldc1            #2   <Class Singletons>
		JVM INSTR monitorexit ;
	//   10   15:monitorexit     
		throw exception;
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	private static Singletons zzach;
	private final FlagRegistry zzaci = new FlagRegistry();
	private final FlagValueProvider zzacj = new FlagValueProvider();

	static 
	{
		setInstance(new Singletons());
	//    0    0:new             #2   <Class Singletons>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void Singletons()>
	//    3    7:invokestatic    #19  <Method void setInstance(Singletons)>
	//*   4   10:return          
	}
}
