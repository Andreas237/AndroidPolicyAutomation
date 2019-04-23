// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwj, bwa, bze, bxn, 
//			byx

final class bwg extends bwj
{

	bwg(bwa bwa1, Context context)
	{
		b = bwa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bwa b>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field Context a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #17  <Method void bwj()>
	//    8   14:return          
	}

	protected final Object a()
	{
		bwa.a(a, "mobile_ads_settings");
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context a>
	//    2    4:ldc1            #21  <String "mobile_ads_settings">
	//    3    6:invokestatic    #26  <Method void bwa.a(Context, String)>
		return ((Object) (new bze()));
	//    4    9:new             #28  <Class bze>
	//    5   12:dup             
	//    6   13:invokespecial   #29  <Method void bze()>
	//    7   16:areturn         
	}

	public final Object a(bxn bxn1)
	{
		return ((Object) (bxn1.getMobileAdsSettingsManagerWithClientJarVersion(d.a(((Object) (a))), 0xda3360)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field Context a>
	//    3    5:invokestatic    #35  <Method com.google.android.gms.c.a d.a(Object)>
	//    4    8:ldc1            #36  <Int 0xda3360>
	//    5   10:invokeinterface #42  <Method bxu bxn.getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.c.a, int)>
	//    6   15:areturn         
	}

	public final Object b()
	{
		return ((Object) (bwa.c(b).b(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field bwa b>
	//    2    4:invokestatic    #46  <Method byx bwa.c(bwa)>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field Context a>
	//    5   11:invokevirtual   #51  <Method bxu byx.b(Context)>
	//    6   14:areturn         
	}

	private final Context a;
	private final bwa b;
}
