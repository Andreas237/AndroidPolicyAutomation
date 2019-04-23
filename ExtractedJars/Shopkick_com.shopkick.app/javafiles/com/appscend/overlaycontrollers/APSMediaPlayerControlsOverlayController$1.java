// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.os.Bundle;
import android.view.View;
import com.appscend.licensing.LicenseInvalidException;
import com.appscend.licensing.RootedPhoneException;
import com.appscend.media.APSMediaPlayer;
import java.util.ArrayList;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerControlsOverlayController

class APSMediaPlayerControlsOverlayController$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		if(APSMediaPlayer.getInstance().isPlaying())
	//*   0    0:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//*   1    3:invokevirtual   #37  <Method boolean APSMediaPlayer.isPlaying()>
	//*   2    6:ifeq            54
		{
			APSMediaPlayerControlsOverlayController.access$000(APSMediaPlayerControlsOverlayController.this);
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
	//    5   13:invokestatic    #40  <Method void APSMediaPlayerControlsOverlayController.access$000(APSMediaPlayerControlsOverlayController)>
			APSMediaPlayer.getInstance().emitEvent(new ArrayList(), "user-pause", com.appscend.media.APSMediaTrackingEvents.MediaEventType.USER_PAUSE, new Bundle(), ((com.appscend.media.events.APSMediaEvent) (APSMediaPlayer.getInstance()._currentUnit)));
	//    6   16:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    7   19:new             #42  <Class ArrayList>
	//    8   22:dup             
	//    9   23:invokespecial   #43  <Method void ArrayList()>
	//   10   26:ldc1            #45  <String "user-pause">
	//   11   28:getstatic       #51  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.USER_PAUSE>
	//   12   31:new             #53  <Class Bundle>
	//   13   34:dup             
	//   14   35:invokespecial   #54  <Method void Bundle()>
	//   15   38:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   16   41:getfield        #58  <Field com.appscend.media.events.APSMediaUnit APSMediaPlayer._currentUnit>
	//   17   44:invokevirtual   #62  <Method void APSMediaPlayer.emitEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, Bundle, com.appscend.media.events.APSMediaEvent)>
			APSMediaPlayer.getInstance().pause();
	//   18   47:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   19   50:invokevirtual   #65  <Method void APSMediaPlayer.pause()>
			return;
	//   20   53:return          
		}
		APSMediaPlayerControlsOverlayController.access$100(APSMediaPlayerControlsOverlayController.this);
	//   21   54:aload_0         
	//   22   55:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
	//   23   58:invokestatic    #68  <Method void APSMediaPlayerControlsOverlayController.access$100(APSMediaPlayerControlsOverlayController)>
		try
		{
			APSMediaPlayer.getInstance().play();
	//   24   61:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   25   64:invokevirtual   #71  <Method void APSMediaPlayer.play()>
			APSMediaPlayer.getInstance().emitEvent(new ArrayList(), "user-unpause", com.appscend.media.APSMediaTrackingEvents.MediaEventType.USER_UNPAUSE, new Bundle(), ((com.appscend.media.events.APSMediaEvent) (APSMediaPlayer.getInstance()._currentUnit)));
	//   26   67:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   27   70:new             #42  <Class ArrayList>
	//   28   73:dup             
	//   29   74:invokespecial   #43  <Method void ArrayList()>
	//   30   77:ldc1            #73  <String "user-unpause">
	//   31   79:getstatic       #76  <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.USER_UNPAUSE>
	//   32   82:new             #53  <Class Bundle>
	//   33   85:dup             
	//   34   86:invokespecial   #54  <Method void Bundle()>
	//   35   89:invokestatic    #33  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   36   92:getfield        #58  <Field com.appscend.media.events.APSMediaUnit APSMediaPlayer._currentUnit>
	//   37   95:invokevirtual   #62  <Method void APSMediaPlayer.emitEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, Bundle, com.appscend.media.events.APSMediaEvent)>
			return;
	//   38   98:return          
		}
	//*  39   99:astore_1        
	//*  40  100:goto            104
		// Misplaced declaration of an exception variable
		catch(View view) { }
	//   41  103:astore_1        
		// Misplaced declaration of an exception variable
		catch(View view) { }
		((Exception) (view)).printStackTrace();
	//   42  104:aload_1         
	//   43  105:invokevirtual   #81  <Method void Exception.printStackTrace()>
	//   44  108:return          
	}

	final APSMediaPlayerControlsOverlayController this$0;

	APSMediaPlayerControlsOverlayController$1()
	{
		this$0 = APSMediaPlayerControlsOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
