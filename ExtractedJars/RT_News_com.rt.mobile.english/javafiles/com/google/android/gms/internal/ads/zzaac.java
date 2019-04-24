// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaab

final class zzaac
	implements android.view.View.OnClickListener
{

	zzaac(zzaab zzaab1)
	{
		zzbwl = zzaab1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzaab zzbwl>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onClick(View view)
	{
		zzbwl.zzm(true);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzaab zzbwl>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #24  <Method void zzaab.zzm(boolean)>
	//    4    8:return          
	}

	private final zzaab zzbwl;
}
