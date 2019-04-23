// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerImageOverlayController

class APSMediaPlayerImageOverlayController$2
	implements Runnable
{

	public void run()
	{
		if(APSMediaPlayerImageOverlayController.access$100(APSMediaPlayerImageOverlayController.this).getDrawable() instanceof AnimationDrawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//*   2    4:invokestatic    #26  <Method ImageView APSMediaPlayerImageOverlayController.access$100(APSMediaPlayerImageOverlayController)>
	//*   3    7:invokevirtual   #32  <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//*   4   10:instanceof      #34  <Class AnimationDrawable>
	//*   5   13:ifeq            32
			((AnimationDrawable)APSMediaPlayerImageOverlayController.access$100(APSMediaPlayerImageOverlayController.this).getDrawable()).start();
	//    6   16:aload_0         
	//    7   17:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//    8   20:invokestatic    #26  <Method ImageView APSMediaPlayerImageOverlayController.access$100(APSMediaPlayerImageOverlayController)>
	//    9   23:invokevirtual   #32  <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//   10   26:checkcast       #34  <Class AnimationDrawable>
	//   11   29:invokevirtual   #37  <Method void AnimationDrawable.start()>
	//   12   32:return          
	}

	final APSMediaPlayerImageOverlayController this$0;

	APSMediaPlayerImageOverlayController$2()
	{
		this$0 = APSMediaPlayerImageOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
