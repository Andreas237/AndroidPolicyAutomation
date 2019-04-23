// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.appscend.media.APSMediaPlayer;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerClosableOverlayController

class APSMediaPlayerClosableOverlayController$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(APSMediaPlayerClosableOverlayController.access$500(APSMediaPlayerClosableOverlayController.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
	//*   2    4:invokestatic    #24  <Method java.util.ArrayList APSMediaPlayerClosableOverlayController.access$500(APSMediaPlayerClosableOverlayController)>
	//*   3    7:ifnull          35
			APSMediaPlayer.getInstance().trackforEvent(APSMediaPlayerClosableOverlayController.access$500(APSMediaPlayerClosableOverlayController.this), "non-linear closed by user", com.appscend.media.APSMediaTrackingEvents.MediaEventType.CLOSE, ((com.appscend.media.events.APSMediaEvent) (overlay)));
	//    4   10:invokestatic    #30  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    5   13:aload_0         
	//    6   14:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
	//    7   17:invokestatic    #24  <Method java.util.ArrayList APSMediaPlayerClosableOverlayController.access$500(APSMediaPlayerClosableOverlayController)>
	//    8   20:ldc1            #32  <String "non-linear closed by user">
	//    9   22:getstatic       #38  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.CLOSE>
	//   10   25:aload_0         
	//   11   26:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
	//   12   29:getfield        #42  <Field com.appscend.media.events.APSMediaOverlay APSMediaPlayerClosableOverlayController.overlay>
	//   13   32:invokevirtual   #46  <Method void APSMediaPlayer.trackforEvent(java.util.ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
		view = ((View) (new AlphaAnimation(1.0F, 0.0F)));
	//   14   35:new             #48  <Class AlphaAnimation>
	//   15   38:dup             
	//   16   39:fconst_1        
	//   17   40:fconst_0        
	//   18   41:invokespecial   #51  <Method void AlphaAnimation(float, float)>
	//   19   44:astore_1        
		((AlphaAnimation) (view)).setDuration(300L);
	//   20   45:aload_1         
	//   21   46:ldc2w           #52  <Long 300L>
	//   22   49:invokevirtual   #57  <Method void AlphaAnimation.setDuration(long)>
		((AlphaAnimation) (view)).setFillAfter(true);
	//   23   52:aload_1         
	//   24   53:iconst_1        
	//   25   54:invokevirtual   #61  <Method void AlphaAnimation.setFillAfter(boolean)>
		APSMediaPlayerClosableOverlayController.access$600(APSMediaPlayerClosableOverlayController.this).startAnimation(((android.view.animation.Animation) (view)));
	//   26   57:aload_0         
	//   27   58:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
	//   28   61:invokestatic    #65  <Method ViewGroup APSMediaPlayerClosableOverlayController.access$600(APSMediaPlayerClosableOverlayController)>
	//   29   64:aload_1         
	//   30   65:invokevirtual   #71  <Method void ViewGroup.startAnimation(android.view.animation.Animation)>
		APSMediaPlayerClosableOverlayController.access$302(APSMediaPlayerClosableOverlayController.this, 0.0F);
	//   31   68:aload_0         
	//   32   69:getfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
	//   33   72:fconst_0        
	//   34   73:invokestatic    #75  <Method float APSMediaPlayerClosableOverlayController.access$302(APSMediaPlayerClosableOverlayController, float)>
	//   35   76:pop             
		APSMediaPlayer.getInstance().resetDisplayedOverlays();
	//   36   77:invokestatic    #30  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   37   80:invokevirtual   #78  <Method void APSMediaPlayer.resetDisplayedOverlays()>
	//   38   83:return          
	}

	final APSMediaPlayerClosableOverlayController this$0;

	APSMediaPlayerClosableOverlayController$2()
	{
		this$0 = APSMediaPlayerClosableOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field APSMediaPlayerClosableOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
