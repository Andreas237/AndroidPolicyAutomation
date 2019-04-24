// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.StrictMode;
import java.util.concurrent.Callable;

public class zzaqf
{

	public static Object zzb(Callable callable)
	{
		android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.getThreadPolicy();
	//    0    0:invokestatic    #14  <Method android.os.StrictMode$ThreadPolicy StrictMode.getThreadPolicy()>
	//    1    3:astore_1        
		try
		{
			StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
	//    2    4:getstatic       #20  <Field android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy.LAX>
	//    3    7:invokestatic    #24  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
			callable = ((Callable) (callable.call()));
	//    4   10:aload_0         
	//    5   11:invokeinterface #30  <Method Object Callable.call()>
	//    6   16:astore_0        
		}
	//*   7   17:aload_1         
	//*   8   18:invokestatic    #24  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//*   9   21:aload_0         
	//*  10   22:areturn         
	//*  11   23:aload_1         
	//*  12   24:invokestatic    #24  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//*  13   27:aconst_null     
	//*  14   28:areturn         
	//*  15   29:astore_0        
	//*  16   30:aload_1         
	//*  17   31:invokestatic    #24  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
	//*  18   34:aload_0         
	//*  19   35:athrow          
		// Misplaced declaration of an exception variable
		catch(Callable callable)
		{
			StrictMode.setThreadPolicy(threadpolicy);
			return ((Object) (null));
		}
		StrictMode.setThreadPolicy(threadpolicy);
		return ((Object) (callable));
		callable;
		StrictMode.setThreadPolicy(threadpolicy);
		throw callable;
	//*  20   36:astore_0        
	//*  21   37:goto            23
	}
}
