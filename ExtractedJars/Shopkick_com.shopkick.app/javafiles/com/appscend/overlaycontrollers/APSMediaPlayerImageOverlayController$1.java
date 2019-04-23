// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.view.View;
import com.appscend.media.APSMediaPlayer;
import com.appscend.media.events.APSMediaOverlay;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerImageOverlayController, DismissActionContainer

class APSMediaPlayerImageOverlayController$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(APSMediaPlayer.getInstance().openURL((String)overlay.parameters.get("clickThrough")))
	//*   0    0:invokestatic    #29  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//*   3    7:getfield        #33  <Field APSMediaOverlay APSMediaPlayerImageOverlayController.overlay>
	//*   4   10:getfield        #39  <Field HashMap APSMediaOverlay.parameters>
	//*   5   13:ldc1            #41  <String "clickThrough">
	//*   6   15:invokevirtual   #47  <Method Object HashMap.get(Object)>
	//*   7   18:checkcast       #49  <Class String>
	//*   8   21:invokevirtual   #53  <Method boolean APSMediaPlayer.openURL(String)>
	//*   9   24:ifeq            125
		{
			if(overlay.parameters.get("clickTracking") != null)
	//*  10   27:aload_0         
	//*  11   28:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//*  12   31:getfield        #33  <Field APSMediaOverlay APSMediaPlayerImageOverlayController.overlay>
	//*  13   34:getfield        #39  <Field HashMap APSMediaOverlay.parameters>
	//*  14   37:ldc1            #55  <String "clickTracking">
	//*  15   39:invokevirtual   #47  <Method Object HashMap.get(Object)>
	//*  16   42:ifnull          81
				APSMediaPlayer.getInstance().trackforEvent((ArrayList)overlay.parameters.get("clickTracking"), "icon clickTracking", com.appscend.media.APSMediaTrackingEvents.MediaEventType.CLICK, ((com.appscend.media.events.APSMediaEvent) (overlay)));
	//   17   45:invokestatic    #29  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   18   48:aload_0         
	//   19   49:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//   20   52:getfield        #33  <Field APSMediaOverlay APSMediaPlayerImageOverlayController.overlay>
	//   21   55:getfield        #39  <Field HashMap APSMediaOverlay.parameters>
	//   22   58:ldc1            #55  <String "clickTracking">
	//   23   60:invokevirtual   #47  <Method Object HashMap.get(Object)>
	//   24   63:checkcast       #57  <Class ArrayList>
	//   25   66:ldc1            #59  <String "icon clickTracking">
	//   26   68:getstatic       #65  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.CLICK>
	//   27   71:aload_0         
	//   28   72:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//   29   75:getfield        #33  <Field APSMediaOverlay APSMediaPlayerImageOverlayController.overlay>
	//   30   78:invokevirtual   #69  <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
			if(APSMediaPlayerImageOverlayController.access$000(APSMediaPlayerImageOverlayController.this) == com.appscend.media.on.APSHideOverlayOnWebviewDismiss)
	//*  31   81:aload_0         
	//*  32   82:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//*  33   85:invokestatic    #73  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerImageOverlayController.access$000(APSMediaPlayerImageOverlayController)>
	//*  34   88:getstatic       #79  <Field com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction.APSHideOverlayOnWebviewDismiss>
	//*  35   91:if_acmpne       112
			{
				DismissActionContainer.INSTANCE.setDismissAction(APSMediaPlayerImageOverlayController.access$000(APSMediaPlayerImageOverlayController.this), ((APSMediaPlayerOverlayController) (APSMediaPlayerImageOverlayController.this)));
	//   36   94:getstatic       #85  <Field DismissActionContainer DismissActionContainer.INSTANCE>
	//   37   97:aload_0         
	//   38   98:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//   39  101:invokestatic    #73  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerImageOverlayController.access$000(APSMediaPlayerImageOverlayController)>
	//   40  104:aload_0         
	//   41  105:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//   42  108:invokevirtual   #89  <Method void DismissActionContainer.setDismissAction(com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction, APSMediaPlayerOverlayController)>
				return;
	//   43  111:return          
			}
			DismissActionContainer.INSTANCE.setDismissAction(APSMediaPlayerImageOverlayController.access$000(APSMediaPlayerImageOverlayController.this));
	//   44  112:getstatic       #85  <Field DismissActionContainer DismissActionContainer.INSTANCE>
	//   45  115:aload_0         
	//   46  116:getfield        #17  <Field APSMediaPlayerImageOverlayController this$0>
	//   47  119:invokestatic    #73  <Method com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction APSMediaPlayerImageOverlayController.access$000(APSMediaPlayerImageOverlayController)>
	//   48  122:invokevirtual   #92  <Method void DismissActionContainer.setDismissAction(com.appscend.media.APSMediaBuilder$APSWebviewDismissedAction)>
		}
	//   49  125:return          
	}

	final APSMediaPlayerImageOverlayController this$0;

	APSMediaPlayerImageOverlayController$1()
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
