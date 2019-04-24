// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming;


// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming:
//			SsMediaSource

class SsMediaSource$1
	implements Runnable
{

	public void run()
	{
		SsMediaSource.access$100(SsMediaSource.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field SsMediaSource this$0>
	//    2    4:invokestatic    #24  <Method void SsMediaSource.access$100(SsMediaSource)>
	//    3    7:return          
	}

	final SsMediaSource this$0;

	SsMediaSource$1()
	{
		this$0 = SsMediaSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SsMediaSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
