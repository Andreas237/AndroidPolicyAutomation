// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.os.*;

// Referenced classes of package android.support.v4.media.session:
//			MediaSessionCompat

private class MediaSessionCompat$Callback$CallbackHandler extends Handler
{

	public void handleMessage(Message message)
	{
		if(message.what == 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #30  <Field int Message.what>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          15
			MediaSessionCompat.Callback.access$000(MediaSessionCompat.Callback.this);
	//    4    8:aload_0         
	//    5    9:getfield        #19  <Field MediaSessionCompat$Callback this$0>
	//    6   12:invokestatic    #34  <Method void MediaSessionCompat$Callback.access$000(MediaSessionCompat$Callback)>
	//    7   15:return          
	}

	private static final int MSG_MEDIA_PLAY_PAUSE_KEY_DOUBLE_TAP_TIMEOUT = 1;
	final MediaSessionCompat.Callback this$0;

	MediaSessionCompat$Callback$CallbackHandler(Looper looper)
	{
		this$0 = MediaSessionCompat.Callback.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MediaSessionCompat$Callback this$0>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #22  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
