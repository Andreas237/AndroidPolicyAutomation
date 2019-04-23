// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal.ads:
//			yc

final class yf
	implements android.content.DialogInterface.OnClickListener
{

	yf(yc yc1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		a = yc1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field yc a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String b>
	//    8   14:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		a.a(b, dialoginterface, i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field yc a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field String b>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #27  <Method void yc.a(String, DialogInterface, int)>
	//    7   13:return          
	}

	private final yc a;
	private final String b;
}
