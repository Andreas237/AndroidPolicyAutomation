// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.bannerstandard;


// Referenced classes of package com.startapp.android.publish.ads.banner.bannerstandard:
//			BannerStandard

class BannerStandard$4
	implements Runnable
{

	public void run()
	{
		initBanner();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BannerStandard this$0>
	//    2    4:invokevirtual   #25  <Method void BannerStandard.initBanner()>
	//    3    7:return          
	}

	final BannerStandard this$0;

	BannerStandard$4()
	{
		this$0 = BannerStandard.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BannerStandard this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
