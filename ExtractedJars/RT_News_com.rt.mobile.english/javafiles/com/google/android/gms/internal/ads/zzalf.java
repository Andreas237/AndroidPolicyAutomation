// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzald

final class zzalf
	implements android.content.DialogInterface.OnClickListener
{

	zzalf(zzald zzald1, int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzcsh = zzald1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzald zzcsh>
		zzcsi = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int zzcsi>
		zzcsj = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int zzcsj>
		zzcsk = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #25  <Field int zzcsk>
	//   14   25:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		zzcsh.zza(zzcsi, zzcsj, zzcsk, dialoginterface, i);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzald zzcsh>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int zzcsi>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field int zzcsj>
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field int zzcsk>
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokevirtual   #34  <Method void zzald.zza(int, int, int, DialogInterface, int)>
	//   11   21:return          
	}

	private final zzald zzcsh;
	private final int zzcsi;
	private final int zzcsj;
	private final int zzcsk;
}
