// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.banner3d;


// Referenced classes of package com.startapp.android.publish.ads.banner.banner3d:
//			Banner3D

class Banner3D$4
	implements Runnable
{

	public void run()
	{
		loadBanners(adsItems, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Banner3D this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Banner3D this$0>
	//    4    8:getfield        #26  <Field java.util.List Banner3D.adsItems>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #30  <Method void Banner3D.loadBanners(java.util.List, boolean)>
	//    7   15:return          
	}

	final Banner3D this$0;

	Banner3D$4()
	{
		this$0 = Banner3D.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Banner3D this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
