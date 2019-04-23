// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash;

import com.google.android.exoplayer.TimeRange;

// Referenced classes of package com.google.android.exoplayer.dash:
//			DashChunkSource

class DashChunkSource$1
	implements Runnable
{

	public void run()
	{
		DashChunkSource.access$400(DashChunkSource.this).onAvailableRangeChanged(DashChunkSource.access$300(DashChunkSource.this), val$seekRange);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DashChunkSource this$0>
	//    2    4:invokestatic    #30  <Method DashChunkSource$EventListener DashChunkSource.access$400(DashChunkSource)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field DashChunkSource this$0>
	//    5   11:invokestatic    #34  <Method int DashChunkSource.access$300(DashChunkSource)>
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field TimeRange val$seekRange>
	//    8   18:invokeinterface #40  <Method void DashChunkSource$EventListener.onAvailableRangeChanged(int, TimeRange)>
	//    9   23:return          
	}

	final DashChunkSource this$0;
	final TimeRange val$seekRange;

	DashChunkSource$1()
	{
		this$0 = final_dashchunksource;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DashChunkSource this$0>
		val$seekRange = TimeRange.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field TimeRange val$seekRange>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
