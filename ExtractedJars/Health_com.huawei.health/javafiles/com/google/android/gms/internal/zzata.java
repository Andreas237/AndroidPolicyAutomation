// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.zzac;

public class zzata
{

	public static Looper zzJl()
	{
		boolean flag;
		if(Looper.myLooper() != null)
	//*   0    0:invokestatic    #11  <Method Looper Looper.myLooper()>
	//*   1    3:ifnull          11
			flag = true;
	//    2    6:iconst_1        
	//    3    7:istore_0        
		else
	//*   4    8:goto            13
			flag = false;
	//    5   11:iconst_0        
	//    6   12:istore_0        
		zzac.zza(flag, "Can't create handler inside thread that has not called Looper.prepare()");
	//    7   13:iload_0         
	//    8   14:ldc1            #13  <String "Can't create handler inside thread that has not called Looper.prepare()">
	//    9   16:invokestatic    #19  <Method void zzac.zza(boolean, Object)>
		return Looper.myLooper();
	//   10   19:invokestatic    #11  <Method Looper Looper.myLooper()>
	//   11   22:areturn         
	}

	public static Looper zzc(Looper looper)
	{
		if(looper != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          6
			return looper;
	//    2    4:aload_0         
	//    3    5:areturn         
		else
			return zzJl();
	//    4    6:invokestatic    #25  <Method Looper zzJl()>
	//    5    9:areturn         
	}
}
