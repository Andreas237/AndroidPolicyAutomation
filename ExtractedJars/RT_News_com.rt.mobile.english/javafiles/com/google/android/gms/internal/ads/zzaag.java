// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaal, zzaae

final class zzaag
	implements android.content.DialogInterface.OnClickListener
{

	zzaag(zzaae zzaae)
	{
		zzbwq = zzaae;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzaae zzbwq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		((zzaal) (zzbwq)).zzbw("User canceled the download.");
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzaae zzbwq>
	//    2    4:ldc1            #20  <String "User canceled the download.">
	//    3    6:invokevirtual   #26  <Method void zzaal.zzbw(String)>
	//    4    9:return          
	}

	private final zzaae zzbwq;
}
