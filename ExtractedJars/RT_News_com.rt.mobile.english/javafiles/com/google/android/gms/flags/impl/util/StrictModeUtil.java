// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl.util;

import android.os.StrictMode;
import java.util.concurrent.Callable;

public class StrictModeUtil
{

	public StrictModeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object runWithLaxStrictMode(Callable callable)
		throws Exception
	{
		android.os.StrictMode.ThreadPolicy threadpolicy = StrictMode.getThreadPolicy();
	//    0    0:invokestatic    #19  <Method android.os.StrictMode$ThreadPolicy StrictMode.getThreadPolicy()>
	//    1    3:astore_1        
		StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
	//    2    4:getstatic       #25  <Field android.os.StrictMode$ThreadPolicy android.os.StrictMode$ThreadPolicy.LAX>
	//    3    7:invokestatic    #29  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		callable = ((Callable) (callable.call()));
	//    4   10:aload_0         
	//    5   11:invokeinterface #35  <Method Object Callable.call()>
	//    6   16:astore_0        
		StrictMode.setThreadPolicy(threadpolicy);
	//    7   17:aload_1         
	//    8   18:invokestatic    #29  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		return ((Object) (callable));
	//    9   21:aload_0         
	//   10   22:areturn         
		callable;
	//   11   23:astore_0        
		StrictMode.setThreadPolicy(threadpolicy);
	//   12   24:aload_1         
	//   13   25:invokestatic    #29  <Method void StrictMode.setThreadPolicy(android.os.StrictMode$ThreadPolicy)>
		throw callable;
	//   14   28:aload_0         
	//   15   29:athrow          
	}
}
