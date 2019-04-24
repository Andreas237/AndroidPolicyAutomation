// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.flags.impl.util.StrictModeUtil;

// Referenced classes of package com.google.android.gms.flags.impl:
//			zze

public class SharedPreferencesFactory
{

	public SharedPreferencesFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static SharedPreferences getSharedPreferences(Context context)
		throws Exception
	{
		android/content/SharedPreferences;
	//    0    0:ldc1            #18  <Class SharedPreferences>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzacv == null)
	//*   2    3:getstatic       #20  <Field SharedPreferences zzacv>
	//*   3    6:ifnonnull       26
			zzacv = (SharedPreferences)StrictModeUtil.runWithLaxStrictMode(((java.util.concurrent.Callable) (new zze(context))));
	//    4    9:new             #22  <Class zze>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #25  <Method void zze(Context)>
	//    8   17:invokestatic    #31  <Method Object StrictModeUtil.runWithLaxStrictMode(java.util.concurrent.Callable)>
	//    9   20:checkcast       #18  <Class SharedPreferences>
	//   10   23:putstatic       #20  <Field SharedPreferences zzacv>
		context = ((Context) (zzacv));
	//   11   26:getstatic       #20  <Field SharedPreferences zzacv>
	//   12   29:astore_0        
		android/content/SharedPreferences;
	//   13   30:ldc1            #18  <Class SharedPreferences>
		JVM INSTR monitorexit ;
	//   14   32:monitorexit     
		return ((SharedPreferences) (context));
	//   15   33:aload_0         
	//   16   34:areturn         
		context;
	//   17   35:astore_0        
		android/content/SharedPreferences;
	//   18   36:ldc1            #18  <Class SharedPreferences>
		JVM INSTR monitorexit ;
	//   19   38:monitorexit     
		throw context;
	//   20   39:aload_0         
	//   21   40:athrow          
	}

	private static SharedPreferences zzacv;

	static 
	{
	//    0    0:return          
	}
}
