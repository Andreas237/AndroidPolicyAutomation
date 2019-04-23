// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aag, p, bwk, m

public final class wx extends aag
{

	public static void a(String s)
	{
		if(a())
	//*   0    0:invokestatic    #10  <Method boolean a()>
	//*   1    3:ifeq            13
			Log.v("Ads", s);
	//    2    6:ldc1            #12  <String "Ads">
	//    3    8:aload_0         
	//    4    9:invokestatic    #18  <Method int Log.v(String, String)>
	//    5   12:pop             
	//    6   13:return          
	}

	public static boolean a()
	{
		if(a(2))
	//*   0    0:iconst_2        
	//*   1    1:invokestatic    #22  <Method boolean a(int)>
	//*   2    4:ifeq            29
		{
			e e = p.aU;
	//    3    7:getstatic       #28  <Field e p.aU>
	//    4   10:astore_0        
			if(((Boolean)bwk.e().a(e)).booleanValue())
	//*   5   11:invokestatic    #34  <Method m bwk.e()>
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #39  <Method Object m.a(e)>
	//*   8   18:checkcast       #41  <Class Boolean>
	//*   9   21:invokevirtual   #44  <Method boolean Boolean.booleanValue()>
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
