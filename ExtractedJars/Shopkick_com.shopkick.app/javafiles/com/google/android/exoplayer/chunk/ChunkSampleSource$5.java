// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//			ChunkSampleSource

class ChunkSampleSource$5
	implements Runnable
{

	public void run()
	{
		ChunkSampleSource.access$100(ChunkSampleSource.this).onUpstreamDiscarded(ChunkSampleSource.access$000(ChunkSampleSource.this), usToMs(val$mediaStartTimeUs), usToMs(val$mediaEndTimeUs));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ChunkSampleSource this$0>
	//    2    4:invokestatic    #33  <Method ChunkSampleSource$EventListener ChunkSampleSource.access$100(ChunkSampleSource)>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field ChunkSampleSource this$0>
	//    5   11:invokestatic    #37  <Method int ChunkSampleSource.access$000(ChunkSampleSource)>
	//    6   14:aload_0         
	//    7   15:getfield        #20  <Field ChunkSampleSource this$0>
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field long val$mediaStartTimeUs>
	//   10   22:invokevirtual   #41  <Method long ChunkSampleSource.usToMs(long)>
	//   11   25:aload_0         
	//   12   26:getfield        #20  <Field ChunkSampleSource this$0>
	//   13   29:aload_0         
	//   14   30:getfield        #24  <Field long val$mediaEndTimeUs>
	//   15   33:invokevirtual   #41  <Method long ChunkSampleSource.usToMs(long)>
	//   16   36:invokeinterface #47  <Method void ChunkSampleSource$EventListener.onUpstreamDiscarded(int, long, long)>
	//   17   41:return          
	}

	final ChunkSampleSource this$0;
	final long val$mediaEndTimeUs;
	final long val$mediaStartTimeUs;

	ChunkSampleSource$5()
	{
		this$0 = final_chunksamplesource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ChunkSampleSource this$0>
		val$mediaStartTimeUs = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #22  <Field long val$mediaStartTimeUs>
		val$mediaEndTimeUs = J.this;
	//    6   10:aload_0         
	//    7   11:lload           4
	//    8   13:putfield        #24  <Field long val$mediaEndTimeUs>
		super();
	//    9   16:aload_0         
	//   10   17:invokespecial   #27  <Method void Object()>
	//   11   20:return          
	}
}
