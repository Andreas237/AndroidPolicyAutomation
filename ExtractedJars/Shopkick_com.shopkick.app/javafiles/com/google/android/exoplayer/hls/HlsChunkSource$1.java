// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;


// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsChunkSource

class HlsChunkSource$1
	implements Runnable
{

	public void run()
	{
		HlsChunkSource.access$400(HlsChunkSource.this).onMediaPlaylistLoadCompleted(val$rawResponse);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field HlsChunkSource this$0>
	//    2    4:invokestatic    #30  <Method HlsChunkSource$EventListener HlsChunkSource.access$400(HlsChunkSource)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field byte[] val$rawResponse>
	//    5   11:invokeinterface #36  <Method void HlsChunkSource$EventListener.onMediaPlaylistLoadCompleted(byte[])>
	//    6   16:return          
	}

	final HlsChunkSource this$0;
	final byte val$rawResponse[];

	HlsChunkSource$1()
	{
		this$0 = final_hlschunksource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field HlsChunkSource this$0>
		val$rawResponse = _5B_B.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field byte[] val$rawResponse>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
