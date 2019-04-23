// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.*;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerControlsOverlayController

class APSMediaPlayerControlsOverlayController$8 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		setBarVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
	//    2    4:invokevirtual   #21  <Method void APSMediaPlayerControlsOverlayController.setBarVisible()>
	//    3    7:return          
	}

	final APSMediaPlayerControlsOverlayController this$0;

	APSMediaPlayerControlsOverlayController$8()
	{
		this$0 = APSMediaPlayerControlsOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
