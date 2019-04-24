// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import android.media.MediaPlayer;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseMediaPlayer

class j
	implements android.media.MediaPlayer.OnPreparedListener
{

	j(StreamSenseMediaPlayer streamsensemediaplayer)
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

	public void onPrepared(MediaPlayer mediaplayer)
	{
		StreamSenseMediaPlayer.a(a, String.valueOf(a.getCurrentPosition()));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field StreamSenseMediaPlayer a>
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field StreamSenseMediaPlayer a>
	//    4    8:invokevirtual   #24  <Method int StreamSenseMediaPlayer.getCurrentPosition()>
	//    5   11:invokestatic    #30  <Method String String.valueOf(int)>
	//    6   14:invokestatic    #33  <Method String StreamSenseMediaPlayer.a(StreamSenseMediaPlayer, String)>
	//    7   17:pop             
		if(StreamSenseMediaPlayer.h(a) != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #12  <Field StreamSenseMediaPlayer a>
	//*  10   22:invokestatic    #37  <Method android.media.MediaPlayer$OnPreparedListener StreamSenseMediaPlayer.h(StreamSenseMediaPlayer)>
	//*  11   25:ifnull          41
			StreamSenseMediaPlayer.h(a).onPrepared(mediaplayer);
	//   12   28:aload_0         
	//   13   29:getfield        #12  <Field StreamSenseMediaPlayer a>
	//   14   32:invokestatic    #37  <Method android.media.MediaPlayer$OnPreparedListener StreamSenseMediaPlayer.h(StreamSenseMediaPlayer)>
	//   15   35:aload_1         
	//   16   36:invokeinterface #39  <Method void android.media.MediaPlayer$OnPreparedListener.onPrepared(MediaPlayer)>
	//   17   41:return          
	}

	final StreamSenseMediaPlayer a;
}
