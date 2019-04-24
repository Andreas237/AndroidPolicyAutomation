// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;


// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource, AdPlaybackState

class AdsMediaSource$ComponentListener$1
	implements Runnable
{

	public void run()
	{
		if(AdsMediaSource.ComponentListener.access$200(AdsMediaSource.ComponentListener.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field AdsMediaSource$ComponentListener this$1>
	//*   2    4:invokestatic    #33  <Method boolean AdsMediaSource$ComponentListener.access$200(AdsMediaSource$ComponentListener)>
	//*   3    7:ifeq            11
		{
			return;
	//    4   10:return          
		} else
		{
			AdsMediaSource.access$300(this$0, val$adPlaybackState);
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AdsMediaSource$ComponentListener this$1>
	//    7   15:getfield        #37  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field AdPlaybackState val$adPlaybackState>
	//   10   22:invokestatic    #41  <Method void AdsMediaSource.access$300(AdsMediaSource, AdPlaybackState)>
			return;
	//   11   25:return          
		}
	}

	final AdsMediaSource.ComponentListener this$1;
	final AdPlaybackState val$adPlaybackState;

	AdsMediaSource$ComponentListener$1()
	{
		this$1 = final_componentlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AdsMediaSource$ComponentListener this$1>
		val$adPlaybackState = AdPlaybackState.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field AdPlaybackState val$adPlaybackState>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
