// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.content.*;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerControlsOverlayController

class APSMediaPlayerControlsOverlayController$6 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(APSMediaPlayerControlsOverlayController.access$400(APSMediaPlayerControlsOverlayController.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
	//*   2    4:invokestatic    #22  <Method boolean APSMediaPlayerControlsOverlayController.access$400(APSMediaPlayerControlsOverlayController)>
	//*   3    7:ifeq            18
		{
			setBarVisible();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
	//    6   14:invokevirtual   #25  <Method void APSMediaPlayerControlsOverlayController.setBarVisible()>
			return;
	//    7   17:return          
		} else
		{
			setBarInvisible();
	//    8   18:aload_0         
	//    9   19:getfield        #12  <Field APSMediaPlayerControlsOverlayController this$0>
	//   10   22:invokevirtual   #28  <Method void APSMediaPlayerControlsOverlayController.setBarInvisible()>
			return;
	//   11   25:return          
		}
	}

	final APSMediaPlayerControlsOverlayController this$0;

	APSMediaPlayerControlsOverlayController$6()
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
