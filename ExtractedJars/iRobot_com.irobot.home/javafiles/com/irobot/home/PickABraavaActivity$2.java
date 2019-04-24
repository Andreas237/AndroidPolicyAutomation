// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.AssetId;
import com.irobot.core.AssetInfo;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity

class PickABraavaActivity$2
	implements android.content.kListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		b.b(a.getName());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PickABraavaActivity b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field AssetInfo a>
	//    4    8:invokevirtual   #32  <Method String AssetInfo.getName()>
	//    5   11:invokevirtual   #35  <Method void PickABraavaActivity.b(String)>
		PickABraavaActivity.b(b, a.getAssetId().getId());
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field PickABraavaActivity b>
	//    8   18:aload_0         
	//    9   19:getfield        #20  <Field AssetInfo a>
	//   10   22:invokevirtual   #39  <Method AssetId AssetInfo.getAssetId()>
	//   11   25:invokevirtual   #44  <Method String AssetId.getId()>
	//   12   28:invokestatic    #47  <Method void PickABraavaActivity.b(PickABraavaActivity, String)>
	//   13   31:return          
	}

	final AssetInfo a;
	final PickABraavaActivity b;

	PickABraavaActivity$2(PickABraavaActivity pickabraavaactivity, AssetInfo assetinfo)
	{
		b = pickabraavaactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PickABraavaActivity b>
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
