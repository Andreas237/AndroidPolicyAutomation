// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwj, bwa, byy, bxn, 
//			bvq, km

final class bwf extends bwj
{

	bwf(bwa bwa1, Context context, String s, km km)
	{
		d = bwa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field bwa d>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Context a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field String b>
		c = km;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #22  <Field km c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #25  <Method void bwj()>
	//   14   25:return          
	}

	protected final Object a()
	{
		bwa.a(a, "native_ad");
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context a>
	//    2    4:ldc1            #29  <String "native_ad">
	//    3    6:invokestatic    #34  <Method void bwa.a(Context, String)>
		return ((Object) (new byy()));
	//    4    9:new             #36  <Class byy>
	//    5   12:dup             
	//    6   13:invokespecial   #37  <Method void byy()>
	//    7   16:areturn         
	}

	public final Object a(bxn bxn1)
	{
		return ((Object) (bxn1.createAdLoaderBuilder(com.google.android.gms.c.d.a(((Object) (a))), b, c, 0xda3360)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Context a>
	//    3    5:invokestatic    #43  <Method com.google.android.gms.c.a d.a(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field String b>
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field km c>
	//    8   16:ldc1            #44  <Int 0xda3360>
	//    9   18:invokeinterface #50  <Method bwx bxn.createAdLoaderBuilder(com.google.android.gms.c.a, String, km, int)>
	//   10   23:areturn         
	}

	public final Object b()
	{
		return ((Object) (bwa.b(d).a(a, b, c)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bwa d>
	//    2    4:invokestatic    #53  <Method bvq bwa.b(bwa)>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field Context a>
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field String b>
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field km c>
	//    9   19:invokevirtual   #58  <Method bwx bvq.a(Context, String, km)>
	//   10   22:areturn         
	}

	private final Context a;
	private final String b;
	private final km c;
	private final bwa d;
}
