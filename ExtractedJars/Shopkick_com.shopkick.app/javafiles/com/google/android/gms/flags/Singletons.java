// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;


// Referenced classes of package com.google.android.gms.flags:
//			FlagRegistry, zzb

public final class Singletons
{

	private Singletons()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class FlagRegistry>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void FlagRegistry()>
	//    6   12:putfield        #25  <Field FlagRegistry zzm>
	//    7   15:aload_0         
	//    8   16:new             #27  <Class zzb>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void zzb()>
	//   11   23:putfield        #30  <Field zzb zzn>
	//   12   26:return          
	}

	public static FlagRegistry flagRegistry()
	{
		return zzc().zzm;
	//    0    0:invokestatic    #36  <Method Singletons zzc()>
	//    1    3:getfield        #25  <Field FlagRegistry zzm>
	//    2    6:areturn         
	}

	private static Singletons zzc()
	{
		com/google/android/gms/flags/Singletons;
	//    0    0:ldc1            #2   <Class Singletons>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Singletons singletons = zzl;
	//    2    3:getstatic       #18  <Field Singletons zzl>
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

	public static zzb zzd()
	{
		return zzc().zzn;
	//    0    0:invokestatic    #36  <Method Singletons zzc()>
	//    1    3:getfield        #30  <Field zzb zzn>
	//    2    6:areturn         
	}

	private static Singletons zzl;
	private final FlagRegistry zzm = new FlagRegistry();
	private final zzb zzn = new zzb();

	static 
	{
		Singletons singletons = new Singletons();
	//    0    0:new             #2   <Class Singletons>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void Singletons()>
	//    3    7:astore_0        
		com/google/android/gms/flags/Singletons;
	//    4    8:ldc1            #2   <Class Singletons>
		JVM INSTR monitorenter ;
	//    5   10:monitorenter    
		zzl = singletons;
	//    6   11:aload_0         
	//    7   12:putstatic       #18  <Field Singletons zzl>
		com/google/android/gms/flags/Singletons;
	//    8   15:ldc1            #2   <Class Singletons>
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		return;
	//   10   18:return          
		Exception exception;
		exception;
	//   11   19:astore_0        
		com/google/android/gms/flags/Singletons;
	//   12   20:ldc1            #2   <Class Singletons>
		JVM INSTR monitorexit ;
	//   13   22:monitorexit     
		throw exception;
	//   14   23:aload_0         
	//   15   24:athrow          
	}
}
