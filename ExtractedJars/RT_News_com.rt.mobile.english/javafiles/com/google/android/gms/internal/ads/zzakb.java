// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzane, zznk, zzkb, zzni

public final class zzakb extends zzane
{

	public static void v(String s)
	{
		if(zzqp())
	//*   0    0:invokestatic    #11  <Method boolean zzqp()>
	//*   1    3:ifeq            13
			Log.v("Ads", s);
	//    2    6:ldc1            #13  <String "Ads">
	//    3    8:aload_0         
	//    4    9:invokestatic    #18  <Method int Log.v(String, String)>
	//    5   12:pop             
	//    6   13:return          
	}

	public static boolean zzqp()
	{
		if(isLoggable(2))
	//*   0    0:iconst_2        
	//*   1    1:invokestatic    #23  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            29
		{
			zzna zzna = zznk.zzazr;
	//    3    7:getstatic       #29  <Field zzna zznk.zzazr>
	//    4   10:astore_0        
			if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   5   11:invokestatic    #35  <Method zzni zzkb.zzik()>
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #41  <Method Object zzni.zzd(zzna)>
	//*   8   18:checkcast       #43  <Class Boolean>
	//*   9   21:invokevirtual   #46  <Method boolean Boolean.booleanValue()>
	//*  10   24:ifeq            29
				return true;
	//   11   27:iconst_1        
	//   12   28:ireturn         
		}
		return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}
}
