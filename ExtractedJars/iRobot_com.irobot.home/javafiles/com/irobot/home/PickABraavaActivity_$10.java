// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.core.DiscoveredAsset;
import com.irobot.core.DiscoveryType;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity_

class PickABraavaActivity_$10
	implements Runnable
{

	public void run()
	{
		PickABraavaActivity_.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PickABraavaActivity_ c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field DiscoveryType a>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field DiscoveredAsset b>
	//    6   12:invokestatic    #31  <Method void PickABraavaActivity_.a(PickABraavaActivity_, DiscoveryType, DiscoveredAsset)>
	//    7   15:return          
	}

	final DiscoveryType a;
	final DiscoveredAsset b;
	final PickABraavaActivity_ c;

	PickABraavaActivity_$10(PickABraavaActivity_ pickabraavaactivity_, DiscoveryType discoverytype, DiscoveredAsset discoveredasset)
	{
		c = pickabraavaactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field PickABraavaActivity_ c>
		a = discoverytype;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field DiscoveryType a>
		b = discoveredasset;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field DiscoveredAsset b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
