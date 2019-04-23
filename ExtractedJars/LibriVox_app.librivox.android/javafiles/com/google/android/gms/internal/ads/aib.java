// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public final class aib
{

	public aib(Context context, String s, Bundle bundle, Bundle bundle1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #19  <Field String a>
		b = bundle;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #21  <Field Bundle b>
		c = bundle1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #23  <Field Bundle c>
		d = context;
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:putfield        #25  <Field Context d>
	//   14   25:return          
	}

	private final String a;
	private final Bundle b;
	private final Bundle c;
	private final Context d;
}
