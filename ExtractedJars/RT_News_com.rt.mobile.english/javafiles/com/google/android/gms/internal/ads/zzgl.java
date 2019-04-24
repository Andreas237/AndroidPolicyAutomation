// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgk

final class zzgl
	implements Runnable
{

	zzgl(zzgk zzgk1, View view)
	{
		zzaik = zzgk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzgk zzaik>
		zzaij = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field View zzaij>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzaik.zzk(zzaij);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzgk zzaik>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field View zzaij>
	//    4    8:invokevirtual   #27  <Method void zzgk.zzk(View)>
	//    5   11:return          
	}

	private final View zzaij;
	private final zzgk zzaik;
}
