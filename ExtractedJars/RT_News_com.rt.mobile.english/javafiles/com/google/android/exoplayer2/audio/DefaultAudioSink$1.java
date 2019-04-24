// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.ConditionVariable;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			DefaultAudioSink

class DefaultAudioSink$1 extends Thread
{

	public void run()
	{
		val$toRelease.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AudioTrack val$toRelease>
	//    2    4:invokevirtual   #28  <Method void AudioTrack.flush()>
		val$toRelease.release();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field AudioTrack val$toRelease>
	//    5   11:invokevirtual   #31  <Method void AudioTrack.release()>
		DefaultAudioSink.access$300(DefaultAudioSink.this).open();
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field DefaultAudioSink this$0>
	//    8   18:invokestatic    #35  <Method ConditionVariable DefaultAudioSink.access$300(DefaultAudioSink)>
	//    9   21:invokevirtual   #40  <Method void ConditionVariable.open()>
		return;
	//   10   24:return          
		Exception exception;
		exception;
	//   11   25:astore_1        
		DefaultAudioSink.access$300(DefaultAudioSink.this).open();
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field DefaultAudioSink this$0>
	//   14   30:invokestatic    #35  <Method ConditionVariable DefaultAudioSink.access$300(DefaultAudioSink)>
	//   15   33:invokevirtual   #40  <Method void ConditionVariable.open()>
		throw exception;
	//   16   36:aload_1         
	//   17   37:athrow          
	}

	final DefaultAudioSink this$0;
	final AudioTrack val$toRelease;

	DefaultAudioSink$1()
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
