// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;


// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource, AdsLoader

class AdsMediaSource$2
	implements Runnable
{

	public void run()
	{
		AdsMediaSource.access$100(AdsMediaSource.this).detachPlayer();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AdsMediaSource this$0>
	//    2    4:invokestatic    #25  <Method AdsLoader AdsMediaSource.access$100(AdsMediaSource)>
	//    3    7:invokeinterface #30  <Method void AdsLoader.detachPlayer()>
	//    4   12:return          
	}

	final AdsMediaSource this$0;

	AdsMediaSource$2()
	{
		this$0 = AdsMediaSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AdsMediaSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
