// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import com.appscend.media.events.APSMediaEvent;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

class APSMediaPlayer$17
	implements Runnable
{

	public void run()
	{
		val$event.trigger();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field APSMediaEvent val$event>
	//    2    4:invokevirtual   #31  <Method void APSMediaEvent.trigger()>
	//    3    7:return          
	}

	final APSMediaPlayer this$0;
	final APSMediaEvent val$event;

	APSMediaPlayer$17()
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
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
