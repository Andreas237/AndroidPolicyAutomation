// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			DefaultAudioSink

class DefaultAudioSink$2 extends Thread
{

	public void run()
	{
		val$toRelease.release();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AudioTrack val$toRelease>
	//    2    4:invokevirtual   #28  <Method void AudioTrack.release()>
	//    3    7:return          
	}

	final DefaultAudioSink this$0;
	final AudioTrack val$toRelease;

	DefaultAudioSink$2()
	{
		this$0 = final_defaultaudiosink;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DefaultAudioSink this$0>
		val$toRelease = AudioTrack.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field AudioTrack val$toRelease>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void Thread()>
	//    8   14:return          
	}
}
