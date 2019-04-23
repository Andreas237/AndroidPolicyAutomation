// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, xg

final class xh
	implements Callable
{

	xh(xg xg, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = xg;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field xg a>
		b = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Context b>
	//    8   14:return          
	}

	public final Object call()
	{
		Context context = b;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context b>
	//    2    4:astore_1        
		e e = p.cO;
	//    3    5:getstatic       #28  <Field e p.cO>
	//    4    8:astore_2        
		if(!((Boolean)bwk.e().a(e)).booleanValue())
	//*   5    9:invokestatic    #34  <Method m bwk.e()>
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #39  <Method Object m.a(e)>
	//*   8   16:checkcast       #41  <Class Boolean>
	//*   9   19:invokevirtual   #45  <Method boolean Boolean.booleanValue()>
	//*  10   22:ifne            28
			return ((Object) (""));
	//   11   25:ldc1            #47  <String "">
	//   12   27:areturn         
		else
			return ((Object) (context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "")));
	//   13   28:aload_1         
	//   14   29:ldc1            #49  <String "mobileads_consent">
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #55  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   17   35:ldc1            #57  <String "consent_string">
	//   18   37:ldc1            #47  <String "">
	//   19   39:invokeinterface #63  <Method String SharedPreferences.getString(String, String)>
	//   20   44:areturn         
	}

	private final xg a;
	private final Context b;
}
