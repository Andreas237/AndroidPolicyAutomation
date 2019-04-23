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
		if(zzhu == null || zzhv == null || zzhu != context1)
			break MISSING_BLOCK_LABEL_39;
	//    5    8:getstatic       #26  <Field Context zzhu>
	//    6   11:ifnull          39
	//    7   14:getstatic       #28  <Field Boolean zzhv>
	//    8   17:ifnull          39
	//    9   20:getstatic       #26  <Field Context zzhu>
	//   10   23:aload_2         
	//   11   24:if_acmpne       39
		flag = zzhv.booleanValue();
	//   12   27:getstatic       #28  <Field Boolean zzhv>
	//   13   30:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
	//   14   33:istore_1        
		com/google/android/gms/common/wrappers/InstantApps;
	//   15   34:ldc1            #2   <Class InstantApps>
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		return flag;
	//   17   37:iload_1         
	//   18   38:ireturn         
		zzhv = null;
	//   19   39:aconst_null     
	//   20   40:putstatic       #28  <Field Boolean zzhv>
		if(!PlatformVersion.isAtLeastO()) goto _L2; else goto _L1
	//   21   43:invokestatic    #39  <Method boolean PlatformVersion.isAtLeastO()>
	//   22   46:ifeq            65
_L1:
		zzhv = Boolean.valueOf(context1.getPackageManager().isInstantApp());
	//   23   49:aload_2         
	//   24   50:invokevirtual   #43  <Method PackageManager Context.getPackageManager()>
	//   25   53:invokevirtual   #47  <Method boolean PackageManager.isInstantApp()>
	//   26   56:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   27   59:putstatic       #28  <Field Boolean zzhv>
		  goto _L3
	//*  28   62:goto            92
_L2:
		context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
	//   29   65:aload_0         
	//   30   66:invokevirtual   #55  <Method ClassLoader Context.getClassLoader()>
	//   31   69:ldc1            #57  <String "com.google.android.instantapps.supervisor.InstantAppsRuntime">
	//   32   71:invokevirtual   #63  <Method Class ClassLoader.loadClass(String)>
	//   33   74:pop             
		zzhv = Boolean.valueOf(true);
	//   34   75:iconst_1        
	//   35   76:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   36   79:putstatic       #28  <Field Boolean zzhv>
		  goto _L3
	//*  37   82:goto            92
_L5:
		zzhv = Boolean.valueOf(false);
	//   38   85:iconst_0        
	//   39   86:invokestatic    #51  <Method Boolean Boolean.valueOf(boolean)>
	//   40   89:putstatic       #28  <Field Boolean zzhv>
_L3:
		zzhu = context1;
	//   41   92:aload_2         
	//   42   93:putstatic       #26  <Field Context zzhu>
		flag = zzhv.booleanValue();
	//   43   96:getstatic       #28  <Field Boolean zzhv>
	//   44   99:invokevirtual   #34  <Method boolean Boolean.booleanValue()>
	//   45  102:istore_1        
		com/google/android/gms/common/wrappers/InstantApps;
	//   46  103:ldc1            #2   <Class InstantApps>
		JVM INSTR monitorexit ;
	//   47  105:monitorexit     
		return flag;
	//   48  106:iload_1         
	//   49  107:ireturn         
		context;
	//   50  108:astore_0        
	//*  51  109:ldc1            #2   <Class InstantApps>
		throw context;
	//   52  111:monitorexit     
	//   53  112:aload_0         
	//   54  113:athrow          
		context;
	//   55  114:astore_0        
		if(true) goto _L5; else goto _L4
_L4:
	//*  56  115:goto            85
	}

	private static Context zzhu;
	private static Boolean zzhv;
}
