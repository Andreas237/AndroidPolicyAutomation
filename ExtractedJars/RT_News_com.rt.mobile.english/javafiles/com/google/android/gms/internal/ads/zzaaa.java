// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaal, zzzy

final class zzaaa
	implements android.content.DialogInterface.OnClickListener
{

	zzaaa(zzzy zzzy)
	{
		zzbvx = zzzy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzzy zzbvx>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		((zzaal) (zzbvx)).zzbw("Operation denied by user.");
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzzy zzbvx>
	//    2    4:ldc1            #20  <String "Operation denied by user.">
	//    3    6:invokevirtual   #26  <Method void zzaal.zzbw(String)>
	//    4    9:return          
	}

	private final zzzy zzbvx;
}
