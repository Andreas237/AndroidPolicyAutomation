// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//			ChunkSampleSource, Format

class ChunkSampleSource$1
	implements Runnable
{

	public void run()
	{
		ChunkSampleSource.access$100(ChunkSampleSource.this).onLoadStarted(ChunkSampleSource.access$000(ChunkSampleSource.this), val$length, val$type, val$trigger, val$format, usToMs(val$mediaStartTimeUs), usToMs(val$mediaEndTimeUs));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ChunkSampleSource this$0>
	//    2    4:invokestatic    #47  <Method ChunkSampleSource$EventListener ChunkSampleSource.access$100(ChunkSampleSource)>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field ChunkSampleSource this$0>
	//    5   11:invokestatic    #51  <Method int ChunkSampleSource.access$000(ChunkSampleSource)>
	//    6   14:aload_0         
	//    7   15:getfield        #28  <Field long val$length>
	//    8   18:aload_0         
	//    9   19:getfield        #30  <Field int val$type>
	//   10   22:aload_0         
	//   11   23:getfield        #32  <Field int val$trigger>
	//   12   26:aload_0         
	//   13   27:getfield        #34  <Field Format val$format>
	//   14   30:aload_0         
	//   15   31:getfield        #26  <Field ChunkSampleSource this$0>
	//   16   34:aload_0         
	//   17   35:getfield        #36  <Field long val$mediaStartTimeUs>
	//   18   38:invokevirtual   #55  <Method long ChunkSampleSource.usToMs(long)>
	//   19   41:aload_0         
	//   20   42:getfield        #26  <Field ChunkSampleSource this$0>
	//   21   45:aload_0         
	//   22   46:getfield        #38  <Field long val$mediaEndTimeUs>
	//   23   49:invokevirtual   #55  <Method long ChunkSampleSource.usToMs(long)>
	//   24   52:invokeinterface #61  <Method void ChunkSampleSource$EventListener.onLoadStarted(int, long, int, int, Format, long, long)>
	//   25   57:return          
	}

	final ChunkSampleSource this$0;
	final Format val$format;
	final long val$length;
	final long val$mediaEndTimeUs;
	final long val$mediaStartTimeUs;
	final int val$trigger;
	final int val$type;

	ChunkSampleSource$1()
	{
		this$0 = final_chunksamplesource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field ChunkSampleSource this$0>
		val$length = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #28  <Field long val$length>
		val$type = i;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #30  <Field int val$type>
		val$trigger = j;
	//    9   16:aload_0         
	//   10   17:iload           5
	//   11   19:putfield        #32  <Field int val$trigger>
		val$format = format1;
	//   12   22:aload_0         
	//   13   23:aload           6
	//   14   25:putfield        #34  <Field Format val$format>
		val$mediaStartTimeUs = l1;
	//   15   28:aload_0         
	//   16   29:lload           7
	//   17   31:putfield        #36  <Field long val$mediaStartTimeUs>
		val$mediaEndTimeUs = J.this;
	//   18   34:aload_0         
	//   19   35:lload           9
	//   20   37:putfield        #38  <Field long val$mediaEndTimeUs>
		super();
	//   21   40:aload_0         
	//   22   41:invokespecial   #41  <Method void Object()>
	//   23   44:return          
	}
}
