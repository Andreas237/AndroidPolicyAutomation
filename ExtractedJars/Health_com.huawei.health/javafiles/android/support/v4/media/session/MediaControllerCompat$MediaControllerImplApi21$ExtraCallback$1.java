// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompat

class MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$1
	implements Runnable
{

	public void run()
	{
		MediaControllerCompat.MediaControllerImplApi21.ExtraCallback.access$500(MediaControllerCompat.MediaControllerImplApi21.ExtraCallback.this).onSessionEvent(val$event, val$extras);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
	//    2    4:invokestatic    #40  <Method MediaControllerCompat$Callback MediaControllerCompat$MediaControllerImplApi21$ExtraCallback.access$500(MediaControllerCompat$MediaControllerImplApi21$ExtraCallback)>
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field String val$event>
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field Bundle val$extras>
	//    7   15:invokevirtual   #45  <Method void MediaControllerCompat$Callback.onSessionEvent(String, Bundle)>
	//    8   18:return          
	}

	final MediaControllerCompat.MediaControllerImplApi21.ExtraCallback this$1;
	final String val$event;
	final Bundle val$extras;

	MediaControllerCompat$MediaControllerImplApi21$ExtraCallback$1()
	{
		this$1 = final_extracallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field MediaControllerCompat$MediaControllerImplApi21$ExtraCallback this$1>
		val$event = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field String val$event>
		val$extras = Bundle.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field Bundle val$extras>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #34  <Method void Object()>
	//   11   19:return          
	}
}
