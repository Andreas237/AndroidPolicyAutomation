// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.c.d;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwj, bwa, bzf, bxn, 
//			eg

final class bwh extends bwj
{

	bwh(bwa bwa1, FrameLayout framelayout, FrameLayout framelayout1, Context context)
	{
		d = bwa1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field bwa d>
		a = framelayout;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field FrameLayout a>
		b = framelayout1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #19  <Field FrameLayout b>
		c = context;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #21  <Field Context c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #24  <Method void bwj()>
	//   14   25:return          
	}

	protected final Object a()
	{
		bwa.a(c, "native_ad_view_delegate");
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Context c>
	//    2    4:ldc1            #28  <String "native_ad_view_delegate">
	//    3    6:invokestatic    #33  <Method void bwa.a(Context, String)>
		return ((Object) (new bzf()));
	//    4    9:new             #35  <Class bzf>
	//    5   12:dup             
	//    6   13:invokespecial   #36  <Method void bzf()>
	//    7   16:areturn         
	}

	public final Object a(bxn bxn1)
	{
		return ((Object) (bxn1.createNativeAdViewDelegate(com.google.android.gms.c.d.a(((Object) (a))), com.google.android.gms.c.d.a(((Object) (b))))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field FrameLayout a>
	//    3    5:invokestatic    #42  <Method com.google.android.gms.c.a d.a(Object)>
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field FrameLayout b>
	//    6   12:invokestatic    #42  <Method com.google.android.gms.c.a d.a(Object)>
	//    7   15:invokeinterface #48  <Method cj bxn.createNativeAdViewDelegate(com.google.android.gms.c.a, com.google.android.gms.c.a)>
	//    8   20:areturn         
	}

	public final Object b()
	{
		return ((Object) (com.google.android.gms.internal.ads.bwa.d(d).a(c, a, b)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field bwa d>
	//    2    4:invokestatic    #51  <Method eg com.google.android.gms.internal.ads.bwa.d(bwa)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Context c>
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field FrameLayout a>
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field FrameLayout b>
	//    9   19:invokevirtual   #56  <Method cj eg.a(Context, FrameLayout, FrameLayout)>
	//   10   22:areturn         
	}

	private final FrameLayout a;
	private final FrameLayout b;
	private final Context c;
	private final bwa d;
}
