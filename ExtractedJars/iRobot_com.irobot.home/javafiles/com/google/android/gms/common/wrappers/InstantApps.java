// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.wrappers;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.PlatformVersion;

public class InstantApps
{

	public InstantApps()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static boolean isInstantApp(Context context)
	{
		com/google/android/gms/common/wrappers/InstantApps;
	//    0    0:ldc1            #2   <Class InstantApps>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		Context context1;
		context1 = context.getApplicationContext();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #24  <Method Context Context.getApplicationContext()>
	//    4    7:astore_2        
		if(zzht == null || zzhu == null || zzht != context1)
			break MISSING_BLOCK_LABEL_39;
	//    5    8:getstatic       #26  <Field Context zzht>
	//    6   11:ifnull          39
	//    7   14:getstatic       #28  <Field Boolean zzhu>
	//    8   17:ifnull          39
	//    9   20:getstatic       #26  <Field Context zzht>
	//   10   23:aload_2         
	//   11   24:if_acmpne       39
		flag = zzhu.booleanValue();
	//   12   27:getstatic       #28  <Field Boolean zzhu>
	//   13   30:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
	//   14   33:istore_1        
		com/google/android/gms/common/wrappers/InstantApps;
	//   15   34:ldc1            #2   <Class InstantApps>
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		return flag;
	//   17   37:iload_1         
	//   18   38:ireturn         
		zzhu = null;
	//   19   39:aconst_null     
	//   20   40:putstatic       #28  <Field Boolean zzhu>
		if(!PlatformVersion.isAtLeastO()) goto _L2; else goto _L1
	//   21   43:invokestatic    #39  <Method boolean PlatformVersion.isAtLeastO()>
	//   22   46:ifeq            67
_L1:
		context = ((Context) (Boolean.valueOf(context1.getPackageManager().isInstantApp())));
	//   23   49:aload_2         
	//   24   50:invokevirtual   #43  <Method PackageManager Context.getPackageManager()>
	//   25   53:invokevirtual   #47  <Method boolean PackageManager.isInstantApp()>
	//   26   56:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   27   59:astore_0        
_L4:
		zzhu = ((Boolean) (context));
	//   28   60:aload_0         
	//   29   61:putstatic       #28  <Field Boolean zzhu>
		  goto _L3
	//*  30   64:goto            95
_L2:
		context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
	//   31   67:aload_0         
	//   32   68:invokevirtual   #55  <Method ClassLoader Context.getClassLoader()>
	//   33   71:ldc1            #57  <String "com.google.android.instantapps.supervisor.InstantAppsRuntime">
	//   34   73:invokevirtual   #63  <Method Class ClassLoader.loadClass(String)>
	//   35   76:pop             
		zzhu = Boolean.valueOf(true);
	//   36   77:iconst_1        
	//   37   78:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   38   81:putstatic       #28  <Field Boolean zzhu>
		  goto _L3
	//*  39   84:goto            95
_L5:
		context = ((Context) (Boolean.valueOf(false)));
	//   40   87:iconst_0        
	//   41   88:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   42   91:astore_0        
		  goto _L4
	//*  43   92:goto            60
_L3:
		zzht = context1;
	//   44   95:aload_2         
	//   45   96:putstatic       #26  <Field Context zzht>
		flag = zzhu.booleanValue();
	//   46   99:getstatic       #28  <Field Boolean zzhu>
	//   47  102:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
	//   48  105:istore_1        
		com/google/android/gms/common/wrappers/InstantApps;
	//   49  106:ldc1            #2   <Class InstantApps>
		JVM INSTR monitorexit ;
	//   50  108:monitorexit     
		return flag;
	//   51  109:iload_1         
	//   52  110:ireturn         
		context;
	//   53  111:astore_0        
	//*  54  112:ldc1            #2   <Class InstantApps>
		throw context;
	//   55  114:monitorexit     
	//   56  115:aload_0         
	//   57  116:athrow          
		context;
	//   58  117:astore_0        
		  goto _L5
	//*  59  118:goto            87
	}

	private static Context zzht;
	private static Boolean zzhu;
}
