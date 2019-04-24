// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AssetInfo;

// Referenced classes of package com.irobot.home:
//			BroadcastSetupActivity

class BroadcastSetupActivity$2
	implements com.irobot.home.fragments.bq.a
{

	public void a(AssetInfo assetinfo)
	{
		if(assetinfo != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
	//*   2    4:aload_0         
	//*   3    5:getfield        #17  <Field BroadcastSetupActivity a>
	//*   4    8:invokevirtual   #25  <Method void BroadcastSetupActivity.i()>
	//*   5   11:return          
			BroadcastSetupActivity.a(a, assetinfo);
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field BroadcastSetupActivity a>
	//    8   16:aload_1         
	//    9   17:invokestatic    #28  <Method AssetInfo BroadcastSetupActivity.a(BroadcastSetupActivity, AssetInfo)>
	//   10   20:pop             
		a.i();
	//*  11   21:goto            4
	}

	final BroadcastSetupActivity a;

	BroadcastSetupActivity$2(BroadcastSetupActivity broadcastsetupactivity)
	{
		a = broadcastsetupactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BroadcastSetupActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
