// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aza

public final class ayx extends aza
{

	public ayx(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void aza()>
		a = Logger.getLogger(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #17  <Method Logger Logger.getLogger(String)>
	//    5    9:putfield        #19  <Field Logger a>
	//    6   12:return          
	}

	public final void a(String s)
	{
		a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", s);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Logger a>
	//    2    4:getstatic       #26  <Field Level Level.FINE>
	//    3    7:ldc1            #28  <String "com.googlecode.mp4parser.util.JuliLogger">
	//    4    9:ldc1            #30  <String "logDebug">
	//    5   11:aload_1         
	//    6   12:invokevirtual   #34  <Method void Logger.logp(Level, String, String, String)>
	//    7   15:return          
	}

	private Logger a;
}
