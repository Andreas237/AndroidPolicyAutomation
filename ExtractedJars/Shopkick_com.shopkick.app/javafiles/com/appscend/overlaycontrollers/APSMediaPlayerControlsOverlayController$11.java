// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.view.animation.Animation;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerControlsOverlayController

class APSMediaPlayerControlsOverlayController$11
	implements android.view.animation.Animation.AnimationListener
{

	public void onAnimationEnd(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationRepeat(Animation animation)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animation animation)
	{
		APSMediaPlayerControlsOverlayController.access$500(APSMediaPlayerControlsOverlayController.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #28  <Method void APSMediaPlayerControlsOverlayController.access$500(APSMediaPlayerControlsOverlayController, boolean)>
	//    4    8:return          
	}

	final APSMediaPlayerControlsOverlayController this$0;

	APSMediaPlayerControlsOverlayController$11()
	{
		this$0 = APSMediaPlayerControlsOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
