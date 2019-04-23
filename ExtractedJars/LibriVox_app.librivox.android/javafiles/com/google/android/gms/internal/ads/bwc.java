// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwj, bwa, bxn, nm

final class bwc extends bwj
{

	bwc(bwa bwa1, Activity activity)
	{
		b = bwa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bwa b>
		a = activity;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field Activity a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #17  <Method void bwj()>
	//    8   14:return          
	}

	protected final Object a()
	{
		bwa.a(((android.content.Context) (a)), "ad_overlay");
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Activity a>
	//    2    4:ldc1            #21  <String "ad_overlay">
	//    3    6:invokestatic    #26  <Method void bwa.a(android.content.Context, String)>
		return ((Object) (null));
	//    4    9:aconst_null     
	//    5   10:areturn         
	}

	public final Object a(bxn bxn1)
	{
		return ((Object) (bxn1.createAdOverlay(d.a(((Object) (a))))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field Activity a>
	//    3    5:invokestatic    #32  <Method com.google.android.gms.c.a d.a(Object)>
	//    4    8:invokeinterface #38  <Method nn bxn.createAdOverlay(com.google.android.gms.c.a)>
	//    5   13:areturn         
	}

	public final Object b()
	{
		return ((Object) (bwa.f(b).a(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bwa b>
	//    2    4:invokestatic    #42  <Method nm bwa.f(bwa)>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field Activity a>
	//    5   11:invokevirtual   #47  <Method nn nm.a(Activity)>
	//    6   14:areturn         
	}

	private final Activity a;
	private final bwa b;
}
