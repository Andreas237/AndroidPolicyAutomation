// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.ExoPlayer;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource, AdsLoader

class AdsMediaSource$1
	implements Runnable
{

	public void run()
	{
		AdsMediaSource.access$100(AdsMediaSource.this).attachPlayer(val$player, ((stener) (val$componentListener)), AdsMediaSource.access$000(AdsMediaSource.this));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AdsMediaSource this$0>
	//    2    4:invokestatic    #34  <Method AdsLoader AdsMediaSource.access$100(AdsMediaSource)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field ExoPlayer val$player>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field AdsMediaSource$ComponentListener val$componentListener>
	//    7   15:aload_0         
	//    8   16:getfield        #21  <Field AdsMediaSource this$0>
	//    9   19:invokestatic    #38  <Method android.view.ViewGroup AdsMediaSource.access$000(AdsMediaSource)>
	//   10   22:invokeinterface #44  <Method void AdsLoader.attachPlayer(ExoPlayer, AdsLoader$EventListener, android.view.ViewGroup)>
	//   11   27:return          
	}

	final AdsMediaSource this$0;
	final mponentListener val$componentListener;
	final ExoPlayer val$player;

	AdsMediaSource$1()
	{
		this$0 = final_adsmediasource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AdsMediaSource this$0>
		val$player = exoplayer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ExoPlayer val$player>
		val$componentListener = mponentListener.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field AdsMediaSource$ComponentListener val$componentListener>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
