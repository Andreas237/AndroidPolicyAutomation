// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.chunk;


// Referenced classes of package com.google.android.exoplayer.chunk:
//			ChunkSampleSource

class ChunkSampleSource$3
	implements Runnable
{

	public void run()
	{
		ChunkSampleSource.access$100(ChunkSampleSource.this).onLoadCanceled(ChunkSampleSource.access$000(ChunkSampleSource.this), val$bytesLoaded);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ChunkSampleSource this$0>
	//    2    4:invokestatic    #30  <Method ChunkSampleSource$EventListener ChunkSampleSource.access$100(ChunkSampleSource)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field ChunkSampleSource this$0>
	//    5   11:invokestatic    #34  <Method int ChunkSampleSource.access$000(ChunkSampleSource)>
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field long val$bytesLoaded>
	//    8   18:invokeinterface #40  <Method void ChunkSampleSource$EventListener.onLoadCanceled(int, long)>
	//    9   23:return          
	}

	final ChunkSampleSource this$0;
	final long val$bytesLoaded;

	ChunkSampleSource$3()
	{
		this$0 = final_chunksamplesource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ChunkSampleSource this$0>
		val$bytesLoaded = J.this;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #21  <Field long val$bytesLoaded>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
