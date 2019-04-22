// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Trace;

public final class TraceCompat
{

	public static void beginSection(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          12
			Trace.beginSection(s);
	//    3    8:aload_0         
	//    4    9:invokestatic    #16  <Method void Trace.beginSection(String)>
	//    5   12:return          
	}

	public static void endSection()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #12  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          11
			Trace.endSection();
	//    3    8:invokestatic    #21  <Method void Trace.endSection()>
	//    4   11:return          
	}
}
