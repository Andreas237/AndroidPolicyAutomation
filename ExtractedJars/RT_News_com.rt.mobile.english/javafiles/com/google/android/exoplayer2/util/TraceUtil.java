// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.util;

import android.os.Trace;

// Referenced classes of package com.google.android.exoplayer2.util:
//			Util

public final class TraceUtil
{

	private TraceUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void beginSection(String s)
	{
		if(Util.SDK_INT >= 18)
	//*   0    0:getstatic       #17  <Field int Util.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          12
			beginSectionV18(s);
	//    3    8:aload_0         
	//    4    9:invokestatic    #20  <Method void beginSectionV18(String)>
	//    5   12:return          
	}

	private static void beginSectionV18(String s)
	{
		Trace.beginSection(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method void Trace.beginSection(String)>
	//    2    4:return          
	}

	public static void endSection()
	{
		if(Util.SDK_INT >= 18)
	//*   0    0:getstatic       #17  <Field int Util.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          11
			endSectionV18();
	//    3    8:invokestatic    #32  <Method void endSectionV18()>
	//    4   11:return          
	}

	private static void endSectionV18()
	{
		Trace.endSection();
	//    0    0:invokestatic    #34  <Method void Trace.endSection()>
	//    1    3:return          
	}
}
