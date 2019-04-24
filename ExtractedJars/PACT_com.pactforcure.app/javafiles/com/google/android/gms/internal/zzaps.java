// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.StrictMode;
import java.util.concurrent.Callable;

public class zzaps
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
		// Misplaced declaration of an exception variable
		catch(Callable callable)
	//*  11   23:astore_0        
		{
			StrictMode.setThreadPolicy(threadpolicy);
	//   12   24:aload_1         
	//   13   25:invokestatic    #24  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
			return ((Object) (null));
	//   14   28:aconst_null     
	//   15   29:areturn         
		}
		StrictMode.setThreadPolicy(threadpolicy);
		return ((Object) (callable));
		callable;
	//   16   30:astore_0        
		StrictMode.setThreadPolicy(threadpolicy);
	//   17   31:aload_1         
	//   18   32:invokestatic    #24  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw callable;
	//   19   35:aload_0         
	//   20   36:athrow          
	}
}
