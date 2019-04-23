// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aqb

final class aqa extends aqb
{

	aqa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void aqb()>
	//    2    4:return          
	}

	public final void a(Throwable throwable)
	{
		throwable.printStackTrace();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #16  <Method void Throwable.printStackTrace()>
	//    2    4:return          
	}

	public final void a(Throwable throwable, PrintWriter printwriter)
	{
		throwable.printStackTrace(printwriter);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method void Throwable.printStackTrace(PrintWriter)>
	//    3    5:return          
	}
}
