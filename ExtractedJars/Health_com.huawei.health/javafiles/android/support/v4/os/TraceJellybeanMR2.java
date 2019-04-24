// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.os;

import android.os.Trace;

class TraceJellybeanMR2
{

	TraceJellybeanMR2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void beginSection(String s)
	{
		Trace.beginSection(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #18  <Method void Trace.beginSection(String)>
	//    2    4:return          
	}

	public static void endSection()
	{
		Trace.endSection();
	//    0    0:invokestatic    #21  <Method void Trace.endSection()>
	//    1    3:return          
	}
}
