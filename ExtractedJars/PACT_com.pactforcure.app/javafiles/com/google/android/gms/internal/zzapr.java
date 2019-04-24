// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzapo, zzapp

public final class zzapr
{

	private zzapr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class zzapo>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void zzapo()>
	//    6   12:putfield        #26  <Field zzapo zzaWK>
	//    7   15:aload_0         
	//    8   16:new             #28  <Class zzapp>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void zzapp()>
	//   11   23:putfield        #31  <Field zzapp zzaWL>
	//   12   26:return          
	}

	private static zzapr zzCP()
	{
		com/google/android/gms/internal/zzapr;
	//    0    0:ldc1            #2   <Class zzapr>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzapr zzapr1 = zzaWJ;
	//    2    3:getstatic       #35  <Field zzapr zzaWJ>
	//    3    6:astore_0        
		com/google/android/gms/internal/zzapr;
	//    4    7:ldc1            #2   <Class zzapr>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return zzapr1;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
		com/google/android/gms/internal/zzapr;
	//    9   13:ldc1            #2   <Class zzapr>
		JVM INSTR monitorexit ;
	//   10   15:monitorexit     
		throw exception;
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static zzapo zzCQ()
	{
		return zzCP().zzaWK;
	//    0    0:invokestatic    #39  <Method zzapr zzCP()>
	//    1    3:getfield        #26  <Field zzapo zzaWK>
	//    2    6:areturn         
	}

	public static zzapp zzCR()
	{
		return zzCP().zzaWL;
	//    0    0:invokestatic    #39  <Method zzapr zzCP()>
	//    1    3:getfield        #31  <Field zzapp zzaWL>
	//    2    6:areturn         
	}

	protected static void zza(zzapr zzapr1)
	{
		com/google/android/gms/internal/zzapr;
	//    0    0:ldc1            #2   <Class zzapr>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		zzaWJ = zzapr1;
	//    2    3:aload_0         
	//    3    4:putstatic       #35  <Field zzapr zzaWJ>
		com/google/android/gms/internal/zzapr;
	//    4    7:ldc1            #2   <Class zzapr>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return;
	//    6   10:return          
		zzapr1;
	//    7   11:astore_0        
		com/google/android/gms/internal/zzapr;
	//    8   12:ldc1            #2   <Class zzapr>
		JVM INSTR monitorexit ;
	//    9   14:monitorexit     
		throw zzapr1;
	//   10   15:aload_0         
	//   11   16:athrow          
	}

	private static zzapr zzaWJ;
	private final zzapo zzaWK = new zzapo();
	private final zzapp zzaWL = new zzapp();

	static 
	{
		zza(new zzapr());
	//    0    0:new             #2   <Class zzapr>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void zzapr()>
	//    3    7:invokestatic    #19  <Method void zza(zzapr)>
	//*   4   10:return          
	}
}
