// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;

public class zzade
{

	public static boolean zzbg(Context context)
	{
		com/google/android/gms/internal/zzade;
	//    0    0:ldc1            #2   <Class zzade>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		Context context1;
		context1 = context.getApplicationContext();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #18  <Method Context Context.getApplicationContext()>
	//    4    7:astore_2        
		if(zzaIy == null || zzaIz == null || zzaIy != context1)
			break MISSING_BLOCK_LABEL_39;
	//    5    8:getstatic       #20  <Field Context zzaIy>
	//    6   11:ifnull          39
	//    7   14:getstatic       #22  <Field Boolean zzaIz>
	//    8   17:ifnull          39
	//    9   20:getstatic       #20  <Field Context zzaIy>
	//   10   23:aload_2         
	//   11   24:if_acmpne       39
		flag = zzaIz.booleanValue();
	//   12   27:getstatic       #22  <Field Boolean zzaIz>
	//   13   30:invokevirtual   #28  <Method boolean Boolean.booleanValue()>
	//   14   33:istore_1        
		com/google/android/gms/internal/zzade;
	//   15   34:ldc1            #2   <Class zzade>
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		return flag;
	//   17   37:iload_1         
	//   18   38:ireturn         
		zzaIz = null;
	//   19   39:aconst_null     
	//   20   40:putstatic       #22  <Field Boolean zzaIz>
		context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
	//   21   43:aload_0         
	//   22   44:invokevirtual   #32  <Method ClassLoader Context.getClassLoader()>
	//   23   47:ldc1            #34  <String "com.google.android.instantapps.supervisor.InstantAppsRuntime">
	//   24   49:invokevirtual   #40  <Method Class ClassLoader.loadClass(String)>
	//   25   52:pop             
		zzaIz = Boolean.valueOf(true);
	//   26   53:iconst_1        
	//   27   54:invokestatic    #44  <Method Boolean Boolean.valueOf(boolean)>
	//   28   57:putstatic       #22  <Field Boolean zzaIz>
		  goto _L1
	//*  29   60:goto            70
_L3:
		zzaIz = Boolean.valueOf(false);
	//   30   63:iconst_0        
	//   31   64:invokestatic    #44  <Method Boolean Boolean.valueOf(boolean)>
	//   32   67:putstatic       #22  <Field Boolean zzaIz>
_L1:
		zzaIy = context1;
	//   33   70:aload_2         
	//   34   71:putstatic       #20  <Field Context zzaIy>
		flag = zzaIz.booleanValue();
	//   35   74:getstatic       #22  <Field Boolean zzaIz>
	//   36   77:invokevirtual   #28  <Method boolean Boolean.booleanValue()>
	//   37   80:istore_1        
		com/google/android/gms/internal/zzade;
	//   38   81:ldc1            #2   <Class zzade>
		JVM INSTR monitorexit ;
	//   39   83:monitorexit     
		return flag;
	//   40   84:iload_1         
	//   41   85:ireturn         
		context;
	//   42   86:astore_0        
	//*  43   87:ldc1            #2   <Class zzade>
		throw context;
	//   44   89:monitorexit     
	//   45   90:aload_0         
	//   46   91:athrow          
		context;
	//   47   92:astore_0        
		if(true) goto _L3; else goto _L2
_L2:
	//*  48   93:goto            63
	}

	private static Context zzaIy;
	private static Boolean zzaIz;
}
