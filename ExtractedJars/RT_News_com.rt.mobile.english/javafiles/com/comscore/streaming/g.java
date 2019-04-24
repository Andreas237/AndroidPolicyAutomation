// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import android.media.MediaPlayer;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseMediaPlayer

class g
	implements android.media.MediaPlayer.OnCompletionListener
{

	g(StreamSenseMediaPlayer streamsensemediaplayer)
	{
		a = streamsensemediaplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field StreamSenseMediaPlayer a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public void onCompletion(MediaPlayer mediaplayer)
	{
		StreamSenseMediaPlayer.a(a, mediaplayer);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field StreamSenseMediaPlayer a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #23  <Method void StreamSenseMediaPlayer.a(StreamSenseMediaPlayer, MediaPlayer)>
		if(StreamSenseMediaPlayer.a(a) != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #12  <Field StreamSenseMediaPlayer a>
	//*   6   12:invokestatic    #26  <Method android.media.MediaPlayer$OnCompletionListener StreamSenseMediaPlayer.a(StreamSenseMediaPlayer)>
	//*   7   15:ifnull          31
			StreamSenseMediaPlayer.a(a).onCompletion(mediaplayer);
	//    8   18:aload_0         
	//    9   19:getfield        #12  <Field StreamSenseMediaPlayer a>
	//   10   22:invokestatic    #26  <Method android.media.MediaPlayer$OnCompletionListener StreamSenseMediaPlayer.a(StreamSenseMediaPlayer)>
	//   11   25:aload_1         
	//   12   26:invokeinterface #28  <Method void android.media.MediaPlayer$OnCompletionListener.onCompletion(MediaPlayer)>
	//   13   31:return          
	}

	final StreamSenseMediaPlayer a;
}
