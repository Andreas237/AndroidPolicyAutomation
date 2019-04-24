// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ForwardingTimeline, ConcatenatingMediaSource

private static final class ConcatenatingMediaSource$DeferredTimeline extends ForwardingTimeline
{

	public ConcatenatingMediaSource$DeferredTimeline cloneWithNewTimeline(Timeline timeline)
	{
		Object obj;
		if(replacedId == null && timeline.getPeriodCount() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Object replacedId>
	//*   2    4:ifnonnull       30
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #52  <Method int Timeline.getPeriodCount()>
	//*   5   11:ifle            30
			obj = timeline.getPeriod(0, period, true).uid;
	//    6   14:aload_1         
	//    7   15:iconst_0        
	//    8   16:getstatic       #28  <Field com.google.android.exoplayer2.Timeline$Period period>
	//    9   19:iconst_1        
	//   10   20:invokevirtual   #56  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period, boolean)>
	//   11   23:getfield        #59  <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
	//   12   26:astore_2        
		else
	//*  13   27:goto            35
			obj = replacedId;
	//   14   30:aload_0         
	//   15   31:getfield        #44  <Field Object replacedId>
	//   16   34:astore_2        
		return new ConcatenatingMediaSource$DeferredTimeline(timeline, obj);
	//   17   35:new             #2   <Class ConcatenatingMediaSource$DeferredTimeline>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:aload_2         
	//   21   41:invokespecial   #39  <Method void ConcatenatingMediaSource$DeferredTimeline(Timeline, Object)>
	//   22   44:areturn         
	}

	public int getIndexOfPeriod(Object obj)
	{
		Timeline timeline = this.timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Timeline timeline>
	//    2    4:astore_3        
		Object obj1 = obj;
	//    3    5:aload_1         
	//    4    6:astore_2        
		if(DUMMY_ID.equals(obj))
	//*   5    7:getstatic       #23  <Field Object DUMMY_ID>
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #69  <Method boolean Object.equals(Object)>
	//*   8   14:ifeq            22
			obj1 = replacedId;
	//    9   17:aload_0         
	//   10   18:getfield        #44  <Field Object replacedId>
	//   11   21:astore_2        
		return timeline.getIndexOfPeriod(obj1);
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #71  <Method int Timeline.getIndexOfPeriod(Object)>
	//   15   27:ireturn         
	}

	public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period1, boolean flag)
	{
		timeline.getPeriod(i, period1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Timeline timeline>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #56  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period, boolean)>
	//    6   10:pop             
		if(Util.areEqual(period1.uid, replacedId))
	//*   7   11:aload_2         
	//*   8   12:getfield        #59  <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
	//*   9   15:aload_0         
	//*  10   16:getfield        #44  <Field Object replacedId>
	//*  11   19:invokestatic    #77  <Method boolean Util.areEqual(Object, Object)>
	//*  12   22:ifeq            32
			period1.uid = DUMMY_ID;
	//   13   25:aload_2         
	//   14   26:getstatic       #23  <Field Object DUMMY_ID>
	//   15   29:putfield        #59  <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
		return period1;
	//   16   32:aload_2         
	//   17   33:areturn         
	}

	public Timeline getTimeline()
	{
		return timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Timeline timeline>
	//    2    4:areturn         
	}

	private static final Object DUMMY_ID = new Object();
	private static final ConcatenatingMediaSource.DummyTimeline dummyTimeline = new ConcatenatingMediaSource.DummyTimeline(((ConcatenatingMediaSource._cls1) (null)));
	private static final com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
	private final Object replacedId;

	static 
	{
	//    0    0:new             #18  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object DUMMY_ID>
	//    4   10:new             #25  <Class com.google.android.exoplayer2.Timeline$Period>
	//    5   13:dup             
	//    6   14:invokespecial   #26  <Method void com.google.android.exoplayer2.Timeline$Period()>
	//    7   17:putstatic       #28  <Field com.google.android.exoplayer2.Timeline$Period period>
	//    8   20:new             #30  <Class ConcatenatingMediaSource$DummyTimeline>
	//    9   23:dup             
	//   10   24:aconst_null     
	//   11   25:invokespecial   #33  <Method void ConcatenatingMediaSource$DummyTimeline(ConcatenatingMediaSource$1)>
	//   12   28:putstatic       #35  <Field ConcatenatingMediaSource$DummyTimeline dummyTimeline>
	//*  13   31:return          
	}

	public ConcatenatingMediaSource$DeferredTimeline()
	{
		this(((Timeline) (dummyTimeline)), ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #35  <Field ConcatenatingMediaSource$DummyTimeline dummyTimeline>
	//    2    4:aconst_null     
	//    3    5:invokespecial   #39  <Method void ConcatenatingMediaSource$DeferredTimeline(Timeline, Object)>
	//    4    8:return          
	}

	private ConcatenatingMediaSource$DeferredTimeline(Timeline timeline, Object obj)
	{
		super(timeline);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #42  <Method void ForwardingTimeline(Timeline)>
		replacedId = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #44  <Field Object replacedId>
	//    6   10:return          
	}
}
