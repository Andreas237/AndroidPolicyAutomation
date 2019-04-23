// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;


// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsSampleSource

class HlsSampleSource$3
	implements Runnable
{

	public void run()
	{
		HlsSampleSource.access$100(HlsSampleSource.this).onLoadCanceled(HlsSampleSource.access$000(HlsSampleSource.this), val$bytesLoaded);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field HlsSampleSource this$0>
	//    2    4:invokestatic    #30  <Method HlsSampleSource$EventListener HlsSampleSource.access$100(HlsSampleSource)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field HlsSampleSource this$0>
	//    5   11:invokestatic    #34  <Method int HlsSampleSource.access$000(HlsSampleSource)>
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field long val$bytesLoaded>
	//    8   18:invokeinterface #40  <Method void HlsSampleSource$EventListener.onLoadCanceled(int, long)>
	//    9   23:return          
	}

	final HlsSampleSource this$0;
	final long val$bytesLoaded;

	HlsSampleSource$3()
	{
		this$0 = final_hlssamplesource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field HlsSampleSource this$0>
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
