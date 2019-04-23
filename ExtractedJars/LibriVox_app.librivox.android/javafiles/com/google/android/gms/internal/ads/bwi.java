// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwj, bwa, bzg, bxn, 
//			ue, km

final class bwi extends bwj
{

	bwi(bwa bwa1, Context context, km km)
	{
		c = bwa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bwa c>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Context a>
		b = km;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #18  <Field km b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #21  <Method void bwj()>
	//   11   19:return          
	}

	protected final Object a()
	{
		bwa.a(a, "rewarded_video");
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Context a>
	//    2    4:ldc1            #25  <String "rewarded_video">
	//    3    6:invokestatic    #30  <Method void bwa.a(Context, String)>
		return ((Object) (new bzg()));
	//    4    9:new             #32  <Class bzg>
	//    5   12:dup             
	//    6   13:invokespecial   #33  <Method void bzg()>
	//    7   16:areturn         
	}

	public final Object a(bxn bxn1)
	{
		return ((Object) (bxn1.createRewardedVideoAd(d.a(((Object) (a))), b, 0xda3360)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field Context a>
	//    3    5:invokestatic    #39  <Method com.google.android.gms.c.a d.a(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field km b>
	//    6   12:ldc1            #40  <Int 0xda3360>
	//    7   14:invokeinterface #46  <Method tu bxn.createRewardedVideoAd(com.google.android.gms.c.a, km, int)>
	//    8   19:areturn         
	}

	public final Object b()
	{
		return ((Object) (bwa.e(c).a(a, b)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field bwa c>
	//    2    4:invokestatic    #50  <Method ue bwa.e(bwa)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field Context a>
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field km b>
	//    7   15:invokevirtual   #55  <Method tu ue.a(Context, km)>
	//    8   18:areturn         
	}

	private final Context a;
	private final km b;
	private final bwa c;
}
