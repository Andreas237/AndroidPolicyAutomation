// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.mediation.n;

public final class aid
{

	public aid(Context context, n n, Bundle bundle, f f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		a = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Context a>
		b = n;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field n b>
		c = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field Bundle c>
		d = f;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #26  <Field f d>
	//   14   25:return          
	}

	private final Context a;
	private final n b;
	private final Bundle c;
	private final f d;
}
