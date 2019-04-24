// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.banner3d;


// Referenced classes of package com.startapp.android.publish.ads.banner.banner3d:
//			Banner3D

class Banner3D$2
	implements Runnable
{

	public void run()
	{
		if(defaultLoad)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field Banner3D this$0>
	//*   2    4:getfield        #25  <Field boolean Banner3D.defaultLoad>
	//*   3    7:ifeq            31
		{
			Banner3D.access$300(Banner3D.this, adPreferences);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field Banner3D this$0>
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field Banner3D this$0>
	//    8   18:getfield        #29  <Field com.startapp.android.publish.common.model.AdPreferences Banner3D.adPreferences>
	//    9   21:invokestatic    #33  <Method void Banner3D.access$300(Banner3D, com.startapp.android.publish.common.model.AdPreferences)>
			Banner3D.access$400(Banner3D.this);
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field Banner3D this$0>
	//   12   28:invokestatic    #36  <Method void Banner3D.access$400(Banner3D)>
		}
	//   13   31:return          
	}

	final Banner3D this$0;

	Banner3D$2()
	{
		this$0 = Banner3D.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Banner3D this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
