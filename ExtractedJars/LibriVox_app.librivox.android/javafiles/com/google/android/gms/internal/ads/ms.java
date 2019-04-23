// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.mediation.e;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aag, zzanu

final class ms
	implements m
{

	ms(zzanu zzanu1)
	{
		a = zzanu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzanu a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void d()
	{
		aag.b("AdMobCustomTabsAdapter overlay is paused.");
	//    0    0:ldc1            #19  <String "AdMobCustomTabsAdapter overlay is paused.">
	//    1    2:invokestatic    #25  <Method void aag.b(String)>
	//    2    5:return          
	}

	public final void f()
	{
		aag.b("AdMobCustomTabsAdapter overlay is resumed.");
	//    0    0:ldc1            #28  <String "AdMobCustomTabsAdapter overlay is resumed.">
	//    1    2:invokestatic    #25  <Method void aag.b(String)>
	//    2    5:return          
	}

	public final void g()
	{
		aag.b("Opening AdMobCustomTabsAdapter overlay.");
	//    0    0:ldc1            #31  <String "Opening AdMobCustomTabsAdapter overlay.">
	//    1    2:invokestatic    #25  <Method void aag.b(String)>
		zzanu.a(a).b(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (a)));
	//    2    5:aload_0         
	//    3    6:getfield        #12  <Field zzanu a>
	//    4    9:invokestatic    #36  <Method e zzanu.a(zzanu)>
	//    5   12:aload_0         
	//    6   13:getfield        #12  <Field zzanu a>
	//    7   16:invokeinterface #41  <Method void e.b(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    8   21:return          
	}

	public final void p_()
	{
		aag.b("AdMobCustomTabsAdapter overlay is closed.");
	//    0    0:ldc1            #44  <String "AdMobCustomTabsAdapter overlay is closed.">
	//    1    2:invokestatic    #25  <Method void aag.b(String)>
		zzanu.a(a).c(((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) (a)));
	//    2    5:aload_0         
	//    3    6:getfield        #12  <Field zzanu a>
	//    4    9:invokestatic    #36  <Method e zzanu.a(zzanu)>
	//    5   12:aload_0         
	//    6   13:getfield        #12  <Field zzanu a>
	//    7   16:invokeinterface #47  <Method void e.c(com.google.android.gms.ads.mediation.MediationInterstitialAdapter)>
	//    8   21:return          
	}

	private final zzanu a;
}
