// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzaqb, zzaqc

public final class zzaqe
{

	private zzaqe()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class zzaqb>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void zzaqb()>
	//    6   12:putfield        #26  <Field zzaqb zzaXm>
	//    7   15:aload_0         
	//    8   16:new             #28  <Class zzaqc>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void zzaqc()>
	//   11   23:putfield        #31  <Field zzaqc zzaXn>
	//   12   26:return          
	}

	private static zzaqe zzDD()
	{
		com/google/android/gms/internal/zzaqe;
	//    0    0:ldc1            #2   <Class zzaqe>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzaqe zzaqe1 = zzaXl;
	//    2    3:getstatic       #35  <Field zzaqe zzaXl>
	//    3    6:astore_0        
		com/google/android/gms/internal/zzaqe;
	//    4    7:ldc1            #2   <Class zzaqe>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return zzaqe1;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class zzaqe>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static zzaqb zzDE()
	{
		return zzDD().zzaXm;
	//    0    0:invokestatic    #39  <Method zzaqe zzDD()>
	//    1    3:getfield        #26  <Field zzaqb zzaXm>
	//    2    6:areturn         
	}

	public static zzaqc zzDF()
	{
		return zzDD().zzaXn;
	//    0    0:invokestatic    #39  <Method zzaqe zzDD()>
	//    1    3:getfield        #31  <Field zzaqc zzaXn>
	//    2    6:areturn         
	}

	protected static void zza(zzaqe zzaqe1)
	{
		com/google/android/gms/internal/zzaqe;
	//    0    0:ldc1            #2   <Class zzaqe>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzaXl = zzaqe1;
	//    2    3:aload_0         
	//    3    4:putstatic       #35  <Field zzaqe zzaXl>
		com/google/android/gms/internal/zzaqe;
	//    4    7:ldc1            #2   <Class zzaqe>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return;
	//    6   10:return          
		zzaqe1;
	//    7   11:astore_0        
	//*   8   12:ldc1            #2   <Class zzaqe>
		throw zzaqe1;
	//    9   14:monitorexit     
	//   10   15:aload_0         
	//   11   16:athrow          
	}

	private static zzaqe zzaXl;
	private final zzaqb zzaXm = new zzaqb();
	private final zzaqc zzaXn = new zzaqc();

	static 
	{
		zza(new zzaqe());
	//    0    0:new             #2   <Class zzaqe>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void zzaqe()>
	//    3    7:invokestatic    #19  <Method void zza(zzaqe)>
	//*   4   10:return          
	}
}
