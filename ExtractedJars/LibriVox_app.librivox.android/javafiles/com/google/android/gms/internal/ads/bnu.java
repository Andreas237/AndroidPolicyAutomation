// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Trace;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnw

public final class bnu
{

	public static void a()
	{
		if(bnw.a >= 18)
	//*   0    0:getstatic       #11  <Field int bnw.a>
	//*   1    3:bipush          18
	//*   2    5:icmplt          11
			Trace.endSection();
	//    3    8:invokestatic    #16  <Method void Trace.endSection()>
	//    4   11:return          
	}

	public static void a(String s)
	{
		if(bnw.a >= 18)
	//*   0    0:getstatic       #11  <Field int bnw.a>
	//*   1    3:bipush          18
	//*   2    5:icmplt          12
			Trace.beginSection(s);
	//    3    8:aload_0         
	//    4    9:invokestatic    #21  <Method void Trace.beginSection(String)>
	//    5   12:return          
	}
}
