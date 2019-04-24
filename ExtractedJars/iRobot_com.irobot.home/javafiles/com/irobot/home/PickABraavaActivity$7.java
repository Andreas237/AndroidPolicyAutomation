// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.AssetId;
import com.irobot.core.AssetUpdateAvailabilityEvent;

// Referenced classes of package com.irobot.home:
//			PickABraavaActivity

class PickABraavaActivity$7
	implements android.content.kListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		PickABraavaActivity.a(b, a.assetId().getId());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PickABraavaActivity b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AssetUpdateAvailabilityEvent a>
	//    4    8:invokevirtual   #33  <Method AssetId AssetUpdateAvailabilityEvent.assetId()>
	//    5   11:invokevirtual   #39  <Method String AssetId.getId()>
	//    6   14:invokestatic    #42  <Method void PickABraavaActivity.a(PickABraavaActivity, String)>
	//    7   17:return          
	}

	final AssetUpdateAvailabilityEvent a;
	final PickABraavaActivity b;

	PickABraavaActivity$7(PickABraavaActivity pickabraavaactivity, AssetUpdateAvailabilityEvent assetupdateavailabilityevent)
	{
		b = pickabraavaactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field PickABraavaActivity b>
		a = assetupdateavailabilityevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field AssetUpdateAvailabilityEvent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
