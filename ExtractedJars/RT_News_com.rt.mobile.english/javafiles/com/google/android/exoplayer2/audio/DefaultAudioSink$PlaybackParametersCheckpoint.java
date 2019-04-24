// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackParameters;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			DefaultAudioSink

private static final class DefaultAudioSink$PlaybackParametersCheckpoint
{

	private final long mediaTimeUs;
	private final PlaybackParameters playbackParameters;
	private final long positionUs;


/*
	static PlaybackParameters access$200(DefaultAudioSink$PlaybackParametersCheckpoint defaultaudiosink$playbackparameterscheckpoint)
	{
		return defaultaudiosink$playbackparameterscheckpoint.playbackParameters;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field PlaybackParameters playbackParameters>
	//    2    4:areturn         
	}

*/


/*
	static long access$400(DefaultAudioSink$PlaybackParametersCheckpoint defaultaudiosink$playbackparameterscheckpoint)
	{
		return defaultaudiosink$playbackparameterscheckpoint.positionUs;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long positionUs>
	//    2    4:lreturn         
	}

*/


/*
	static long access$500(DefaultAudioSink$PlaybackParametersCheckpoint defaultaudiosink$playbackparameterscheckpoint)
	{
		return defaultaudiosink$playbackparameterscheckpoint.mediaTimeUs;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field long mediaTimeUs>
	//    2    4:lreturn         
	}

*/

	private DefaultAudioSink$PlaybackParametersCheckpoint(PlaybackParameters playbackparameters, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		playbackParameters = playbackparameters;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field PlaybackParameters playbackParameters>
		mediaTimeUs = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #21  <Field long mediaTimeUs>
		positionUs = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #23  <Field long positionUs>
	//   11   20:return          
	}

	DefaultAudioSink$PlaybackParametersCheckpoint(PlaybackParameters playbackparameters, long l, long l1, DefaultAudioSink._cls1 _pcls1)
	{
		this(playbackparameters, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #27  <Method void DefaultAudioSink$PlaybackParametersCheckpoint(PlaybackParameters, long, long)>
	//    5    8:return          
	}
}
