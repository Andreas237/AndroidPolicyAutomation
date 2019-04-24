// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ConcatenatingMediaSource, MediaSource

static final class ConcatenatingMediaSource$MediaSourceHolder
	implements Comparable
{

	public int compareTo(ConcatenatingMediaSource$MediaSourceHolder concatenatingmediasource$mediasourceholder)
	{
		return firstPeriodIndexInChild - concatenatingmediasource$mediasourceholder.firstPeriodIndexInChild;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int firstPeriodIndexInChild>
	//    2    4:aload_1         
	//    3    5:getfield        #51  <Field int firstPeriodIndexInChild>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((ConcatenatingMediaSource$MediaSourceHolder)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class ConcatenatingMediaSource$MediaSourceHolder>
	//    3    5:invokevirtual   #55  <Method int compareTo(ConcatenatingMediaSource$MediaSourceHolder)>
	//    4    8:ireturn         
	}

	public void reset(int i, int j, int k)
	{
		childIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field int childIndex>
		firstWindowIndexInChild = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #61  <Field int firstWindowIndexInChild>
		firstPeriodIndexInChild = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #51  <Field int firstPeriodIndexInChild>
		isPrepared = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #63  <Field boolean isPrepared>
		isRemoved = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #65  <Field boolean isRemoved>
		activeMediaPeriods.clear();
	//   15   25:aload_0         
	//   16   26:getfield        #43  <Field List activeMediaPeriods>
	//   17   29:invokeinterface #70  <Method void List.clear()>
	//   18   34:return          
	}

	public List activeMediaPeriods;
	public int childIndex;
	public int firstPeriodIndexInChild;
	public int firstWindowIndexInChild;
	public boolean isPrepared;
	public boolean isRemoved;
	public final MediaSource mediaSource;
	public ConcatenatingMediaSource.DeferredTimeline timeline;
	public final Object uid = new Object();

	public ConcatenatingMediaSource$MediaSourceHolder(MediaSource mediasource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mediaSource = mediasource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field MediaSource mediaSource>
		timeline = new ConcatenatingMediaSource.DeferredTimeline();
	//    5    9:aload_0         
	//    6   10:new             #35  <Class ConcatenatingMediaSource$DeferredTimeline>
	//    7   13:dup             
	//    8   14:invokespecial   #36  <Method void ConcatenatingMediaSource$DeferredTimeline()>
	//    9   17:putfield        #38  <Field ConcatenatingMediaSource$DeferredTimeline timeline>
		activeMediaPeriods = ((List) (new ArrayList()));
	//   10   20:aload_0         
	//   11   21:new             #40  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #41  <Method void ArrayList()>
	//   14   28:putfield        #43  <Field List activeMediaPeriods>
	//   15   31:aload_0         
	//   16   32:new             #5   <Class Object>
	//   17   35:dup             
	//   18   36:invokespecial   #31  <Method void Object()>
	//   19   39:putfield        #45  <Field Object uid>
	//   20   42:return          
	}
}
