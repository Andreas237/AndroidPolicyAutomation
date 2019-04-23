// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwj, bwa, bzc, bxn, 
//			bvr, zzwf

final class bwd extends bwj
{

	bwd(bwa bwa1, Context context, zzwf zzwf, String s)
	{
		d = bwa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field bwa d>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Context a>
		b = zzwf;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field zzwf b>
		c = s;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #22  <Field String c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #25  <Method void bwj()>
	//   14   25:return          
	}

	public final Object a()
	{
		bwa.a(a, "search");
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Context a>
	//    2    4:ldc1            #29  <String "search">
	//    3    6:invokestatic    #34  <Method void bwa.a(Context, String)>
		return ((Object) (new bzc()));
	//    4    9:new             #36  <Class bzc>
	//    5   12:dup             
	//    6   13:invokespecial   #37  <Method void bzc()>
	//    7   16:areturn         
	}

	public final Object a(bxn bxn1)
	{
		return ((Object) (bxn1.createSearchAdManager(com.google.android.gms.c.d.a(((Object) (a))), b, c, 0xda3360)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #18  <Field Context a>
	//    3    5:invokestatic    #43  <Method com.google.android.gms.c.a d.a(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field zzwf b>
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field String c>
	//    8   16:ldc1            #44  <Int 0xda3360>
	//    9   18:invokeinterface #50  <Method bxc bxn.createSearchAdManager(com.google.android.gms.c.a, zzwf, String, int)>
	//   10   23:areturn         
	}

	public final Object b()
	{
		return ((Object) (bwa.a(d).a(a, b, c, ((km) (null)), 3)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bwa d>
	//    2    4:invokestatic    #53  <Method bvr bwa.a(bwa)>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field Context a>
	//    5   11:aload_0         
	//    6   12:getfield        #20  <Field zzwf b>
	//    7   15:aload_0         
	//    8   16:getfield        #22  <Field String c>
	//    9   19:aconst_null     
	//   10   20:iconst_3        
	//   11   21:invokevirtual   #58  <Method bxc bvr.a(Context, zzwf, String, km, int)>
	//   12   24:areturn         
	}

	private final Context a;
	private final zzwf b;
	private final String c;
	private final bwa d;
}
