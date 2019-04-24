// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public final class zzatf
{

	public zzatf(Context context, byte abyte0[], Bundle bundle, Bundle bundle1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzdgk = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #19  <Field byte[] zzdgk>
		zzdgl = bundle;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #21  <Field Bundle zzdgl>
		zzdgm = bundle1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #23  <Field Bundle zzdgm>
		zzrt = context;
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:putfield        #25  <Field Context zzrt>
	//   14   25:return          
	}

	private final byte zzdgk[];
	private final Bundle zzdgl;
	private final Bundle zzdgm;
	private final Context zzrt;
}
