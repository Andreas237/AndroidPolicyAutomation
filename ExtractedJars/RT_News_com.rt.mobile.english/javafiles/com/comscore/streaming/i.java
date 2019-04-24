// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import android.media.MediaPlayer;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseMediaPlayer

class i
	implements android.media.MediaPlayer.OnSeekCompleteListener
{

	i(StreamSenseMediaPlayer streamsensemediaplayer)
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

	public void onSeekComplete(MediaPlayer mediaplayer)
	{
		if(StreamSenseMediaPlayer.b(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field StreamSenseMediaPlayer a>
	//*   2    4:invokestatic    #24  <Method boolean StreamSenseMediaPlayer.b(StreamSenseMediaPlayer)>
	//*   3    7:ifeq            27
		{
			StreamSenseMediaPlayer.a(a, false);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field StreamSenseMediaPlayer a>
	//    6   14:iconst_0        
	//    7   15:invokestatic    #27  <Method boolean StreamSenseMediaPlayer.a(StreamSenseMediaPlayer, boolean)>
	//    8   18:pop             
			StreamSenseMediaPlayer.b(a, mediaplayer);
	//    9   19:aload_0         
	//   10   20:getfield        #12  <Field StreamSenseMediaPlayer a>
	//   11   23:aload_1         
	//   12   24:invokestatic    #30  <Method void StreamSenseMediaPlayer.b(StreamSenseMediaPlayer, MediaPlayer)>
		}
		if(StreamSenseMediaPlayer.g(a) != null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #12  <Field StreamSenseMediaPlayer a>
	//*  15   31:invokestatic    #34  <Method android.media.MediaPlayer$OnSeekCompleteListener StreamSenseMediaPlayer.g(StreamSenseMediaPlayer)>
	//*  16   34:ifnull          50
			StreamSenseMediaPlayer.g(a).onSeekComplete(mediaplayer);
	//   17   37:aload_0         
	//   18   38:getfield        #12  <Field StreamSenseMediaPlayer a>
	//   19   41:invokestatic    #34  <Method android.media.MediaPlayer$OnSeekCompleteListener StreamSenseMediaPlayer.g(StreamSenseMediaPlayer)>
	//   20   44:aload_1         
	//   21   45:invokeinterface #36  <Method void android.media.MediaPlayer$OnSeekCompleteListener.onSeekComplete(MediaPlayer)>
	//   22   50:return          
	}

	final StreamSenseMediaPlayer a;
}
