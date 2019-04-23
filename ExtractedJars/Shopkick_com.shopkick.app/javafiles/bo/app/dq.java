// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.os.Handler;
import android.os.Looper;

public class dq
{

	public static Handler a()
	{
		return new Handler(Looper.getMainLooper());
	//    0    0:new             #8   <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #14  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #18  <Method void Handler(Looper)>
	//    4   10:areturn         
	}
}
