// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.Format;

// Referenced classes of package com.google.android.exoplayer.hls:
//			HlsSampleSource

class HlsSampleSource$5
	implements Runnable
{

	public void run()
	{
		HlsSampleSource.access$100(HlsSampleSource.this).onDownstreamFormatChanged(HlsSampleSource.access$000(HlsSampleSource.this), val$format, val$trigger, usToMs(val$positionUs));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field HlsSampleSource this$0>
	//    2    4:invokestatic    #38  <Method HlsSampleSource$EventListener HlsSampleSource.access$100(HlsSampleSource)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field HlsSampleSource this$0>
	//    5   11:invokestatic    #42  <Method int HlsSampleSource.access$000(HlsSampleSource)>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field Format val$format>
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field int val$trigger>
	//   10   22:aload_0         
	//   11   23:getfield        #23  <Field HlsSampleSource this$0>
	//   12   26:aload_0         
	//   13   27:getfield        #29  <Field long val$positionUs>
	//   14   30:invokevirtual   #46  <Method long HlsSampleSource.usToMs(long)>
	//   15   33:invokeinterface #52  <Method void HlsSampleSource$EventListener.onDownstreamFormatChanged(int, Format, int, long)>
	//   16   38:return          
	}

	final HlsSampleSource this$0;
	final Format val$format;
	final long val$positionUs;
	final int val$trigger;

	HlsSampleSource$5()
	{
		this$0 = final_hlssamplesource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field HlsSampleSource this$0>
		val$format = format1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field Format val$format>
		val$trigger = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field int val$trigger>
		val$positionUs = J.this;
	//    9   15:aload_0         
	//   10   16:lload           4
	//   11   18:putfield        #29  <Field long val$positionUs>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
