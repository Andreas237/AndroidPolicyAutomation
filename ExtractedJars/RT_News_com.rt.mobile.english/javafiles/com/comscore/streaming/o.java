// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import android.media.MediaPlayer;

// Referenced classes of package com.comscore.streaming:
//			StreamSenseVideoView

class o
	implements android.media.MediaPlayer.OnCompletionListener
{

	o(StreamSenseVideoView streamsensevideoview)
	{
		a = streamsensevideoview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field StreamSenseVideoView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public void onCompletion(MediaPlayer mediaplayer)
	{
		StreamSenseVideoView.a(a, mediaplayer);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field StreamSenseVideoView a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #23  <Method void StreamSenseVideoView.a(StreamSenseVideoView, MediaPlayer)>
		if(StreamSenseVideoView.j(a) != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #12  <Field StreamSenseVideoView a>
	//*   6   12:invokestatic    #27  <Method android.media.MediaPlayer$OnCompletionListener StreamSenseVideoView.j(StreamSenseVideoView)>
	//*   7   15:ifnull          31
			StreamSenseVideoView.j(a).onCompletion(mediaplayer);
	//    8   18:aload_0         
	//    9   19:getfield        #12  <Field StreamSenseVideoView a>
	//   10   22:invokestatic    #27  <Method android.media.MediaPlayer$OnCompletionListener StreamSenseVideoView.j(StreamSenseVideoView)>
	//   11   25:aload_1         
	//   12   26:invokeinterface #29  <Method void android.media.MediaPlayer$OnCompletionListener.onCompletion(MediaPlayer)>
	//   13   31:return          
	}

	final StreamSenseVideoView a;
}
