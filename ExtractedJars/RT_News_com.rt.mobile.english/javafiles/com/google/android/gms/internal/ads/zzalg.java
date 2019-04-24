// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzald

final class zzalg
	implements android.content.DialogInterface.OnClickListener
{

	zzalg(zzald zzald1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzcsh = zzald1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzald zzcsh>
		zzzo = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String zzzo>
	//    8   14:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		zzcsh.zza(zzzo, dialoginterface, i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzald zzcsh>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field String zzzo>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #28  <Method void zzald.zza(String, DialogInterface, int)>
	//    7   13:return          
	}

	private final zzald zzcsh;
	private final String zzzo;
}
