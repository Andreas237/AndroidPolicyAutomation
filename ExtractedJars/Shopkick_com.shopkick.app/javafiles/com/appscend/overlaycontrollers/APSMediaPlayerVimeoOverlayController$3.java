// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.view.MotionEvent;
import android.view.View;
import com.appscend.licensing.LicenseInvalidException;
import com.appscend.licensing.RootedPhoneException;
import com.appscend.media.APSMediaPlayer;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerVimeoOverlayController

class APSMediaPlayerVimeoOverlayController$3
	implements android.view.View.OnTouchListener
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		view.performClick();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method boolean View.performClick()>
	//    2    4:pop             
		if(motionevent.getAction() != 1)
			break MISSING_BLOCK_LABEL_56;
	//    3    5:aload_2         
	//    4    6:invokevirtual   #39  <Method int MotionEvent.getAction()>
	//    5    9:iconst_1        
	//    6   10:icmpne          56
		if(APSMediaPlayer.getInstance().playbackState() == com.appscend.media.APSMediaPlayer.MPMoviePlaybackState.MPMoviePlaybackPlaying)
			break MISSING_BLOCK_LABEL_50;
	//    7   13:invokestatic    #45  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    8   16:invokevirtual   #49  <Method com.appscend.media.APSMediaPlayer$MPMoviePlaybackState APSMediaPlayer.playbackState()>
	//    9   19:getstatic       #55  <Field com.appscend.media.APSMediaPlayer$MPMoviePlaybackState com.appscend.media.APSMediaPlayer$MPMoviePlaybackState.MPMoviePlaybackPlaying>
	//   10   22:if_acmpeq       50
		APSMediaPlayer.getInstance().play();
	//   11   25:invokestatic    #45  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   12   28:invokevirtual   #58  <Method void APSMediaPlayer.play()>
		return true;
	//   13   31:iconst_1        
	//   14   32:ireturn         
	//*  15   33:astore_1        
	//*  16   34:goto            44
		view;
	//   17   37:astore_1        
		try
		{
			((RootedPhoneException) (view)).printStackTrace();
	//   18   38:aload_1         
	//   19   39:invokevirtual   #61  <Method void RootedPhoneException.printStackTrace()>
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  20   42:iconst_1        
	//*  21   43:ireturn         
		{
			((LicenseInvalidException) (view)).printStackTrace();
	//   22   44:aload_1         
	//   23   45:invokevirtual   #62  <Method void LicenseInvalidException.printStackTrace()>
			return true;
	//   24   48:iconst_1        
	//   25   49:ireturn         
		}
		return true;
		APSMediaPlayer.getInstance().playerTapped();
	//   26   50:invokestatic    #45  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   27   53:invokevirtual   #65  <Method void APSMediaPlayer.playerTapped()>
		return true;
	//   28   56:iconst_1        
	//   29   57:ireturn         
	}

	final APSMediaPlayerVimeoOverlayController this$0;

	APSMediaPlayerVimeoOverlayController$3()
	{
		this$0 = APSMediaPlayerVimeoOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field APSMediaPlayerVimeoOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
