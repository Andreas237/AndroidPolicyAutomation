// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;


// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource

class AdsMediaSource$ComponentListener$2
	implements Runnable
{

	public void run()
	{
		if(!AdsMediaSource.ComponentListener.access$200(AdsMediaSource.ComponentListener.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
	//*   2    4:invokestatic    #28  <Method boolean AdsMediaSource$ComponentListener.access$200(AdsMediaSource$ComponentListener)>
	//*   3    7:ifne            25
			AdsMediaSource.access$500(this$0).onAdClicked();
	//    4   10:aload_0         
	//    5   11:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
	//    6   14:getfield        #32  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
	//    7   17:invokestatic    #36  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
	//    8   20:invokeinterface #39  <Method void AdsMediaSource$EventListener.onAdClicked()>
	//    9   25:return          
	}

	final AdsMediaSource.ComponentListener this$1;

	AdsMediaSource$ComponentListener$2()
	{
		this$1 = AdsMediaSource.ComponentListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AdsMediaSource$ComponentListener this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
	//    5    9:return          
	}
}
