// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import com.appscend.media.events.APSMediaEvent;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$11
	implements Runnable
{

	public void run()
	{
		APSMediaEvent apsmediaevent = val$event;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field APSMediaEvent val$event>
	//    2    4:astore_1        
		apsmediaevent.preloadPoint = val$currentPlaybackTime;
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field int val$currentPlaybackTime>
	//    6   10:i2l             
	//    7   11:putfield        #36  <Field long APSMediaEvent.preloadPoint>
		apsmediaevent.preload();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #39  <Method void APSMediaEvent.preload()>
	//   10   18:return          
	}

	final APSMediaPlayer this$0;
	final int val$currentPlaybackTime;
	final APSMediaEvent val$event;

	APSMediaPlayer$11()
	{
		this$0 = final_apsmediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field APSMediaPlayer this$0>
		val$event = apsmediaevent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field APSMediaEvent val$event>
		val$currentPlaybackTime = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int val$currentPlaybackTime>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
