// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;


// Referenced classes of package com.google.android.exoplayer.upstream:
//			DefaultBandwidthMeter

class DefaultBandwidthMeter$1
	implements Runnable
{

	public void run()
	{
		DefaultBandwidthMeter.access$000(DefaultBandwidthMeter.this).onBandwidthSample(val$elapsedMs, val$bytes, val$bitrate);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field DefaultBandwidthMeter this$0>
	//    2    4:invokestatic    #37  <Method BandwidthMeter$EventListener DefaultBandwidthMeter.access$000(DefaultBandwidthMeter)>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field int val$elapsedMs>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field long val$bytes>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field long val$bitrate>
	//    9   19:invokeinterface #42  <Method void BandwidthMeter$EventListener.onBandwidthSample(int, long, long)>
	//   10   24:return          
	}

	final DefaultBandwidthMeter this$0;
	final long val$bitrate;
	final long val$bytes;
	final int val$elapsedMs;

	DefaultBandwidthMeter$1()
	{
		this$0 = final_defaultbandwidthmeter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DefaultBandwidthMeter this$0>
		val$elapsedMs = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int val$elapsedMs>
		val$bytes = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #26  <Field long val$bytes>
		val$bitrate = J.this;
	//    9   15:aload_0         
	//   10   16:lload           5
	//   11   18:putfield        #28  <Field long val$bitrate>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
