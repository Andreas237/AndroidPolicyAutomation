// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzox, zzpn

final class zzpo
	implements zzox
{

	zzpo(zzpn zzpn1, View view)
	{
		zzbkd = zzpn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzpn zzbkd>
		zzbkc = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field View zzbkc>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void zzc(MotionEvent motionevent)
	{
		zzbkd.onTouch(((View) (null)), motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzpn zzbkd>
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokevirtual   #28  <Method boolean zzpn.onTouch(View, MotionEvent)>
	//    5    9:pop             
	//    6   10:return          
	}

	public final void zzki()
	{
		zzbkd.onClick(zzbkc);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzpn zzbkd>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field View zzbkc>
	//    4    8:invokevirtual   #33  <Method void zzpn.onClick(View)>
	//    5   11:return          
	}

	private final View zzbkc;
	private final zzpn zzbkd;
}
