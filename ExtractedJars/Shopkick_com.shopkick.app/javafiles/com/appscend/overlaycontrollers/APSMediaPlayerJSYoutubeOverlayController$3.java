// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.view.MotionEvent;
import android.view.View;
import com.appscend.media.APSMediaPlayer;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerJSYoutubeOverlayController

class APSMediaPlayerJSYoutubeOverlayController$3
	implements android.view.View.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		view.performClick();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #29  <Method boolean View.performClick()>
	//    2    4:pop             
		if(motionevent.getAction() == 1 && APSMediaPlayerJSYoutubeOverlayController.access$000(APSMediaPlayerJSYoutubeOverlayController.this))
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #35  <Method int MotionEvent.getAction()>
	//*   5    9:iconst_1        
	//*   6   10:icmpne          29
	//*   7   13:aload_0         
	//*   8   14:getfield        #17  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
	//*   9   17:invokestatic    #39  <Method boolean APSMediaPlayerJSYoutubeOverlayController.access$000(APSMediaPlayerJSYoutubeOverlayController)>
	//*  10   20:ifeq            29
			APSMediaPlayer.getInstance().playerTapped();
	//   11   23:invokestatic    #45  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   12   26:invokevirtual   #48  <Method void APSMediaPlayer.playerTapped()>
		return APSMediaPlayerJSYoutubeOverlayController.access$000(APSMediaPlayerJSYoutubeOverlayController.this);
	//   13   29:aload_0         
	//   14   30:getfield        #17  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
	//   15   33:invokestatic    #39  <Method boolean APSMediaPlayerJSYoutubeOverlayController.access$000(APSMediaPlayerJSYoutubeOverlayController)>
	//   16   36:ireturn         
	}

	final APSMediaPlayerJSYoutubeOverlayController this$0;

	APSMediaPlayerJSYoutubeOverlayController$3()
	{
		this$0 = APSMediaPlayerJSYoutubeOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
