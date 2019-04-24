// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.AssetInfo;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity_

class PickABraavaActivity_$4
	implements Runnable
{

	public void run()
	{
		PickABraavaActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PickABraavaActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field AssetInfo a>
	//    4    8:invokestatic    #27  <Method void PickABraavaActivity_.a(PickABraavaActivity_, AssetInfo)>
	//    5   11:return          
	}

	final AssetInfo a;
	final PickABraavaActivity_ b;

	PickABraavaActivity_$4(PickABraavaActivity_ pickabraavaactivity_, AssetInfo assetinfo)
	{
		b = pickabraavaactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PickABraavaActivity_ b>
		a = assetinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field AssetInfo a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
