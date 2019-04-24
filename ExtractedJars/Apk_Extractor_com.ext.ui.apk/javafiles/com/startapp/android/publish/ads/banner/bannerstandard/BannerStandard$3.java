// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.bannerstandard;

import com.startapp.common.a.c;

// Referenced classes of package com.startapp.android.publish.ads.banner.bannerstandard:
//			BannerStandard

class BannerStandard$3
	implements android.view.OnGlobalLayoutListener
{

	public void onGlobalLayout()
	{
		c.a(getViewTreeObserver(), ((android.view.OnGlobalLayoutListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BannerStandard this$0>
	//    2    4:invokevirtual   #25  <Method android.view.ViewTreeObserver BannerStandard.getViewTreeObserver()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #31  <Method void c.a(android.view.ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		BannerStandard.access$100(BannerStandard.this, adPreferences);
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field BannerStandard this$0>
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field BannerStandard this$0>
	//    9   19:getfield        #35  <Field com.startapp.android.publish.common.model.AdPreferences BannerStandard.adPreferences>
	//   10   22:invokestatic    #39  <Method void BannerStandard.access$100(BannerStandard, com.startapp.android.publish.common.model.AdPreferences)>
		initBanner();
	//   11   25:aload_0         
	//   12   26:getfield        #17  <Field BannerStandard this$0>
	//   13   29:invokevirtual   #42  <Method void BannerStandard.initBanner()>
	//   14   32:return          
	}

	final BannerStandard this$0;

	BannerStandard$3()
	{
		this$0 = BannerStandard.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BannerStandard this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
