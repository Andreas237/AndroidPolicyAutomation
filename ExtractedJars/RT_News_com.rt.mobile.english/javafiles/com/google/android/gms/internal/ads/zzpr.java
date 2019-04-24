// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzox, zzpp

final class zzpr
	implements zzox
{

	zzpr(zzpp zzpp1, View view)
	{
		zzbkj = zzpp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzpp zzbkj>
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
		zzbkj.onTouch(((View) (null)), motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzpp zzbkj>
	//    2    4:aconst_null     
	//    3    5:aload_1         
	//    4    6:invokevirtual   #28  <Method boolean zzpp.onTouch(View, MotionEvent)>
	//    5    9:pop             
	//    6   10:return          
	}

	public final void zzki()
	{
		if(zzpp.zza(zzbkj, zzpp.zzbjs))
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field zzpp zzbkj>
	//*   2    4:getstatic       #33  <Field String[] zzpp.zzbjs>
	//*   3    7:invokestatic    #37  <Method boolean zzpp.zza(zzpp, String[])>
	//*   4   10:ifeq            24
			zzbkj.onClick(zzbkc);
	//    5   13:aload_0         
	//    6   14:getfield        #14  <Field zzpp zzbkj>
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field View zzbkc>
	//    9   21:invokevirtual   #41  <Method void zzpp.onClick(View)>
	//   10   24:return          
	}

	private final View zzbkc;
	private final zzpp zzbkj;
}
