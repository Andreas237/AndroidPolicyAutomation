// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwk, zzbbi, zv, bwf, 
//			bwj, bwx, bwh, cj, 
//			bwc, aag, nn, bvr, 
//			bvq, byx, eg, ue, 
//			vd, nm, eh, km

public class bwa
{

	public bwa(bvr bvr, bvq bvq, byx byx, eg eg, ue ue, vd vd, nm nm, 
			eh eh)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = bvr;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field bvr a>
		b = bvq;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #30  <Field bvq b>
		c = byx;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field byx c>
		d = eg;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field eg d>
		e = ue;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #36  <Field ue e>
		f = vd;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #38  <Field vd f>
		g = nm;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #40  <Field nm g>
		h = eh;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #42  <Field eh h>
	//   26   49:return          
	}

	static bvr a(bwa bwa1)
	{
		return bwa1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field bvr a>
	//    2    4:areturn         
	}

	static void a(Context context, String s)
	{
		b(context, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #47  <Method void b(Context, String)>
	//    3    5:return          
	}

	static bvq b(bwa bwa1)
	{
		return bwa1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field bvq b>
	//    2    4:areturn         
	}

	private static void b(Context context, String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #50  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void Bundle()>
	//    3    7:astore_2        
		bundle.putString("action", "no_ads_fallback");
	//    4    8:aload_2         
	//    5    9:ldc1            #53  <String "action">
	//    6   11:ldc1            #55  <String "no_ads_fallback">
	//    7   13:invokevirtual   #59  <Method void Bundle.putString(String, String)>
		bundle.putString("flow", s);
	//    8   16:aload_2         
	//    9   17:ldc1            #61  <String "flow">
	//   10   19:aload_1         
	//   11   20:invokevirtual   #59  <Method void Bundle.putString(String, String)>
		bwk.a().a(context, bwk.g().a, "gmob-apps", bundle, true);
	//   12   23:invokestatic    #66  <Method zv bwk.a()>
	//   13   26:aload_0         
	//   14   27:invokestatic    #69  <Method zzbbi bwk.g()>
	//   15   30:getfield        #74  <Field String zzbbi.a>
	//   16   33:ldc1            #76  <String "gmob-apps">
	//   17   35:aload_2         
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #81  <Method void zv.a(Context, String, String, Bundle, boolean)>
	//   20   40:return          
	}

	static byx c(bwa bwa1)
	{
		return bwa1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field byx c>
	//    2    4:areturn         
	}

	static eg d(bwa bwa1)
	{
		return bwa1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field eg d>
	//    2    4:areturn         
	}

	static ue e(bwa bwa1)
	{
		return bwa1.e;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ue e>
	//    2    4:areturn         
	}

	static nm f(bwa bwa1)
	{
		return bwa1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field nm g>
	//    2    4:areturn         
	}

	public final bwx a(Context context, String s, km km)
	{
		return (bwx)((bwj) (new bwf(this, context, s, km))).a(context, false);
	//    0    0:new             #88  <Class bwf>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #91  <Method void bwf(bwa, Context, String, km)>
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #96  <Method Object bwj.a(Context, boolean)>
	//   10   16:checkcast       #98  <Class bwx>
	//   11   19:areturn         
	}

	public final cj a(Context context, FrameLayout framelayout, FrameLayout framelayout1)
	{
		return (cj)((bwj) (new bwh(this, framelayout, framelayout1, context))).a(context, false);
	//    0    0:new             #101 <Class bwh>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:invokespecial   #104 <Method void bwh(bwa, FrameLayout, FrameLayout, Context)>
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #96  <Method Object bwj.a(Context, boolean)>
	//   10   16:checkcast       #106 <Class cj>
	//   11   19:areturn         
	}

	public final nn a(Activity activity)
	{
		bwc bwc1 = new bwc(this, activity);
	//    0    0:new             #109 <Class bwc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #112 <Method void bwc(bwa, Activity)>
	//    5    9:astore          4
		Intent intent = activity.getIntent();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #118 <Method Intent Activity.getIntent()>
	//    8   15:astore          5
		boolean flag1 = intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar");
	//    9   17:aload           5
	//   10   19:ldc1            #120 <String "com.google.android.gms.ads.internal.overlay.useClientJar">
	//   11   21:invokevirtual   #126 <Method boolean Intent.hasExtra(String)>
	//   12   24:istore_3        
		boolean flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
		if(!flag1)
	//*  15   27:iload_3         
	//*  16   28:ifne            39
			aag.c("useClientJar flag not found in activity intent extras.");
	//   17   31:ldc1            #128 <String "useClientJar flag not found in activity intent extras.">
	//   18   33:invokestatic    #133 <Method void aag.c(String)>
		else
	//*  19   36:goto            48
			flag = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
	//   20   39:aload           5
	//   21   41:ldc1            #120 <String "com.google.android.gms.ads.internal.overlay.useClientJar">
	//   22   43:iconst_0        
	//   23   44:invokevirtual   #137 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   24   47:istore_2        
		return (nn)((bwj) (bwc1)).a(((Context) (activity)), flag);
	//   25   48:aload           4
	//   26   50:aload_1         
	//   27   51:iload_2         
	//   28   52:invokevirtual   #96  <Method Object bwj.a(Context, boolean)>
	//   29   55:checkcast       #139 <Class nn>
	//   30   58:areturn         
	}

	private final bvr a;
	private final bvq b;
	private final byx c;
	private final eg d;
	private final ue e;
	private final vd f;
	private final nm g;
	private final eh h;
}
