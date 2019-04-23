// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwj, bwa, bzc, bxn, 
//			bvr, zzwf, km

final class bwb extends bwj
{

	bwb(bwa bwa1, Context context, zzwf zzwf, String s, km km)
	{
		e = bwa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field bwa e>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Context a>
		b = zzwf;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #22  <Field zzwf b>
		c = s;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #24  <Field String c>
		d = km;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #26  <Field km d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #29  <Method void bwj()>
	//   17   31:return          
	}

	public final Object a()
	{
		bwa.a(a, "banner");
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context a>
	//    2    4:ldc1            #33  <String "banner">
	//    3    6:invokestatic    #38  <Method void bwa.a(Context, String)>
		return ((Object) (new bzc()));
	//    4    9:new             #40  <Class bzc>
	//    5   12:dup             
	//    6   13:invokespecial   #41  <Method void bzc()>
	//    7   16:areturn         
	}

	public final Object a(bxn bxn1)
	{
		return ((Object) (bxn1.createBannerAdManager(com.google.android.gms.c.d.a(((Object) (a))), b, c, d, 0xda3360)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field Context a>
	//    3    5:invokestatic    #47  <Method com.google.android.gms.c.a d.a(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field zzwf b>
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field String c>
	//    8   16:aload_0         
	//    9   17:getfield        #26  <Field km d>
	//   10   20:ldc1            #48  <Int 0xda3360>
	//   11   22:invokeinterface #54  <Method bxc bxn.createBannerAdManager(com.google.android.gms.c.a, zzwf, String, km, int)>
	//   12   27:areturn         
	}

	public final Object b()
	{
		return ((Object) (bwa.a(e).a(a, b, c, d, 1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field bwa e>
	//    2    4:invokestatic    #57  <Method bvr bwa.a(bwa)>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field Context a>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field zzwf b>
	//    7   15:aload_0         
	//    8   16:getfield        #24  <Field String c>
	//    9   19:aload_0         
	//   10   20:getfield        #26  <Field km d>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #62  <Method bxc bvr.a(Context, zzwf, String, km, int)>
	//   13   27:areturn         
	}

	private final Context a;
	private final zzwf b;
	private final String c;
	private final km d;
	private final bwa e;
}
