// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.widget.SeekBar;
import com.appscend.media.APSMediaPlayer;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerControlsOverlayController

class APSMediaPlayerControlsOverlayController$4
	implements android.widget.SeekBar.OnSeekBarChangeListener
{

	public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
	{
	//    0    0:return          
	}

	public void onStartTrackingTouch(SeekBar seekbar)
	{
		APSMediaPlayerControlsOverlayController.access$202(APSMediaPlayerControlsOverlayController.this, true);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #29  <Method boolean APSMediaPlayerControlsOverlayController.access$202(APSMediaPlayerControlsOverlayController, boolean)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onStopTrackingTouch(SeekBar seekbar)
	{
		APSMediaPlayer.getInstance().seekTo(seekbar.getProgress());
	//    0    0:invokestatic    #36  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #42  <Method int SeekBar.getProgress()>
	//    3    7:invokevirtual   #46  <Method void APSMediaPlayer.seekTo(int)>
		APSMediaPlayerControlsOverlayController.access$202(APSMediaPlayerControlsOverlayController.this, false);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
	//    6   14:iconst_0        
	//    7   15:invokestatic    #29  <Method boolean APSMediaPlayerControlsOverlayController.access$202(APSMediaPlayerControlsOverlayController, boolean)>
	//    8   18:pop             
		APSMediaPlayerControlsOverlayController.access$302(APSMediaPlayerControlsOverlayController.this, System.currentTimeMillis());
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field APSMediaPlayerControlsOverlayController this$0>
	//   11   23:invokestatic    #52  <Method long System.currentTimeMillis()>
	//   12   26:invokestatic    #56  <Method long APSMediaPlayerControlsOverlayController.access$302(APSMediaPlayerControlsOverlayController, long)>
	//   13   29:pop2            
	//   14   30:return          
	}

	final APSMediaPlayerControlsOverlayController this$0;

	APSMediaPlayerControlsOverlayController$4()
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
