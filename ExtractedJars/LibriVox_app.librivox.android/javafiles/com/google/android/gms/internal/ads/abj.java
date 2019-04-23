// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abk, abl, abm, abi

public final class abj
{

	public static abi a(Executor executor)
	{
		return ((abi) (new abm(executor, ((abk) (null)))));
	//    0    0:new             #35  <Class abm>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #38  <Method void abm(Executor, abk)>
	//    5    9:areturn         
	}

	public static final Executor a;
	public static final Executor b;
	private static final abi c;
	private static final abi d;

	static 
	{
		a = ((Executor) (new abk()));
	//    0    0:new             #15  <Class abk>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void abk()>
	//    3    7:putstatic       #20  <Field Executor a>
		b = ((Executor) (new abl()));
	//    4   10:new             #22  <Class abl>
	//    5   13:dup             
	//    6   14:invokespecial   #23  <Method void abl()>
	//    7   17:putstatic       #25  <Field Executor b>
		c = a(a);
	//    8   20:getstatic       #20  <Field Executor a>
	//    9   23:invokestatic    #28  <Method abi a(Executor)>
	//   10   26:putstatic       #30  <Field abi c>
		d = a(b);
	//   11   29:getstatic       #25  <Field Executor b>
	//   12   32:invokestatic    #28  <Method abi a(Executor)>
	//   13   35:putstatic       #32  <Field abi d>
	//*  14   38:return          
	}
}
