// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource, AdsLoader

class AdsMediaSource$AdPrepareErrorListener$1
	implements Runnable
{

	public void run()
	{
		AdsMediaSource.access$100(this$0).handlePrepareError(AdsMediaSource.AdPrepareErrorListener.access$800(AdsMediaSource.AdPrepareErrorListener.this), AdsMediaSource.AdPrepareErrorListener.access$900(AdsMediaSource.AdPrepareErrorListener.this), val$exception);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AdsMediaSource$AdPrepareErrorListener this$1>
	//    2    4:getfield        #33  <Field AdsMediaSource AdsMediaSource$AdPrepareErrorListener.this$0>
	//    3    7:invokestatic    #37  <Method AdsLoader AdsMediaSource.access$100(AdsMediaSource)>
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field AdsMediaSource$AdPrepareErrorListener this$1>
	//    6   14:invokestatic    #41  <Method int AdsMediaSource$AdPrepareErrorListener.access$800(AdsMediaSource$AdPrepareErrorListener)>
	//    7   17:aload_0         
	//    8   18:getfield        #22  <Field AdsMediaSource$AdPrepareErrorListener this$1>
	//    9   21:invokestatic    #44  <Method int AdsMediaSource$AdPrepareErrorListener.access$900(AdsMediaSource$AdPrepareErrorListener)>
	//   10   24:aload_0         
	//   11   25:getfield        #24  <Field IOException val$exception>
	//   12   28:invokeinterface #50  <Method void AdsLoader.handlePrepareError(int, int, IOException)>
	//   13   33:return          
	}

	final AdsMediaSource.AdPrepareErrorListener this$1;
	final IOException val$exception;

	AdsMediaSource$AdPrepareErrorListener$1()
	{
		this$1 = final_adprepareerrorlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AdsMediaSource$AdPrepareErrorListener this$1>
		val$exception = IOException.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field IOException val$exception>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
