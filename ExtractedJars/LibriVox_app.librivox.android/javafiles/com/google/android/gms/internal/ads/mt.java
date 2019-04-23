// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.k;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanu

final class mt
	implements Runnable
{

	mt(zzanu zzanu1, AdOverlayInfoParcel adoverlayinfoparcel)
	{
		b = zzanu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzanu b>
		a = adoverlayinfoparcel;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field AdOverlayInfoParcel a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		aw.c();
	//    0    0:invokestatic    #27  <Method k aw.c()>
	//    1    3:pop             
		k.a(((android.content.Context) (zzanu.b(b))), a, true);
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field zzanu b>
	//    4    8:invokestatic    #32  <Method android.app.Activity zzanu.b(zzanu)>
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field AdOverlayInfoParcel a>
	//    7   15:iconst_1        
	//    8   16:invokestatic    #37  <Method void k.a(android.content.Context, AdOverlayInfoParcel, boolean)>
	//    9   19:return          
	}

	private final AdOverlayInfoParcel a;
	private final zzanu b;
}
