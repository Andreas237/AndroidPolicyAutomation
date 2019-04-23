// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import com.appscend.media.events.APSMediaEvent;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$6
	implements Runnable
{

	public void run()
	{
		val$event.preloadPoint = currentPlaybackTime();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field APSMediaEvent val$event>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field APSMediaPlayer this$0>
	//    4    8:invokevirtual   #29  <Method int APSMediaPlayer.currentPlaybackTime()>
	//    5   11:i2l             
	//    6   12:putfield        #35  <Field long APSMediaEvent.preloadPoint>
		val$event.registerEventStateListener(((com.appscend.media.events.APSMediaEventStateListener) (APSMediaPlayer.this)));
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field APSMediaEvent val$event>
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field APSMediaPlayer this$0>
	//   11   23:invokevirtual   #39  <Method void APSMediaEvent.registerEventStateListener(com.appscend.media.events.APSMediaEventStateListener)>
		val$event.registerTimeoutListener(((com.appscend.media.events.APSMediaEventTimeoutListener) (APSMediaPlayer.this)));
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field APSMediaEvent val$event>
	//   14   30:aload_0         
	//   15   31:getfield        #19  <Field APSMediaPlayer this$0>
	//   16   34:invokevirtual   #43  <Method void APSMediaEvent.registerTimeoutListener(com.appscend.media.events.APSMediaEventTimeoutListener)>
		val$event.preload();
	//   17   37:aload_0         
	//   18   38:getfield        #21  <Field APSMediaEvent val$event>
	//   19   41:invokevirtual   #46  <Method void APSMediaEvent.preload()>
	//   20   44:return          
	}

	final APSMediaPlayer this$0;
	final APSMediaEvent val$event;

	APSMediaPlayer$6()
	{
		this$0 = final_apsmediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field APSMediaPlayer this$0>
		val$event = APSMediaEvent.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field APSMediaEvent val$event>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
