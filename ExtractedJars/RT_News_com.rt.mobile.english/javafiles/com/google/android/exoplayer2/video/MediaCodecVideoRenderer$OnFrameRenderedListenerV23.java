// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import android.media.MediaCodec;
import android.os.Handler;

// Referenced classes of package com.google.android.exoplayer2.video:
//			MediaCodecVideoRenderer

private final class MediaCodecVideoRenderer$OnFrameRenderedListenerV23
	implements android.media.MediaCodec.OnFrameRenderedListener
{

	public void onFrameRendered(MediaCodec mediacodec, long l, long l1)
	{
		if(this != tunnelingOnFrameRenderedListener)
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #18  <Field MediaCodecVideoRenderer this$0>
	//*   3    5:getfield        #41  <Field MediaCodecVideoRenderer$OnFrameRenderedListenerV23 MediaCodecVideoRenderer.tunnelingOnFrameRenderedListener>
	//*   4    8:if_acmpeq       12
		{
			return;
	//    5   11:return          
		} else
		{
			maybeNotifyRenderedFirstFrame();
	//    6   12:aload_0         
	//    7   13:getfield        #18  <Field MediaCodecVideoRenderer this$0>
	//    8   16:invokevirtual   #44  <Method void MediaCodecVideoRenderer.maybeNotifyRenderedFirstFrame()>
			return;
	//    9   19:return          
		}
	}

	final MediaCodecVideoRenderer this$0;

	private MediaCodecVideoRenderer$OnFrameRenderedListenerV23(MediaCodec mediacodec)
	{
		this$0 = MediaCodecVideoRenderer.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field MediaCodecVideoRenderer this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		mediacodec.setOnFrameRenderedListener(((android.media.MediaCodec.OnFrameRenderedListener) (this)), new Handler());
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:new             #23  <Class Handler>
	//    8   14:dup             
	//    9   15:invokespecial   #24  <Method void Handler()>
	//   10   18:invokevirtual   #30  <Method void MediaCodec.setOnFrameRenderedListener(android.media.MediaCodec$OnFrameRenderedListener, Handler)>
	//   11   21:return          
	}

	MediaCodecVideoRenderer$OnFrameRenderedListenerV23(MediaCodec mediacodec, MediaCodecVideoRenderer._cls1 _pcls1)
	{
		this(mediacodec);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #34  <Method void MediaCodecVideoRenderer$OnFrameRenderedListenerV23(MediaCodecVideoRenderer, MediaCodec)>
	//    4    6:return          
	}
}
