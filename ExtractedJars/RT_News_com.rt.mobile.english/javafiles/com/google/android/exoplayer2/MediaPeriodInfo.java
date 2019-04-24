// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


final class MediaPeriodInfo
{

	MediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l, long l1, long l2, 
			long l3, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		id = mediaperiodid;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId id>
		startPositionUs = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #23  <Field long startPositionUs>
		endPositionUs = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #25  <Field long endPositionUs>
		contentPositionUs = l2;
	//   11   20:aload_0         
	//   12   21:lload           6
	//   13   23:putfield        #27  <Field long contentPositionUs>
		durationUs = l3;
	//   14   26:aload_0         
	//   15   27:lload           8
	//   16   29:putfield        #29  <Field long durationUs>
		isLastInTimelinePeriod = flag;
	//   17   32:aload_0         
	//   18   33:iload           10
	//   19   35:putfield        #31  <Field boolean isLastInTimelinePeriod>
		isFinal = flag1;
	//   20   38:aload_0         
	//   21   39:iload           11
	//   22   41:putfield        #33  <Field boolean isFinal>
	//   23   44:return          
	}

	public MediaPeriodInfo copyWithPeriodIndex(int i)
	{
		return new MediaPeriodInfo(id.copyWithPeriodIndex(i), startPositionUs, endPositionUs, contentPositionUs, durationUs, isLastInTimelinePeriod, isFinal);
	//    0    0:new             #2   <Class MediaPeriodInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId id>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #41  <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.copyWithPeriodIndex(int)>
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field long startPositionUs>
	//    8   16:aload_0         
	//    9   17:getfield        #25  <Field long endPositionUs>
	//   10   20:aload_0         
	//   11   21:getfield        #27  <Field long contentPositionUs>
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field long durationUs>
	//   14   28:aload_0         
	//   15   29:getfield        #31  <Field boolean isLastInTimelinePeriod>
	//   16   32:aload_0         
	//   17   33:getfield        #33  <Field boolean isFinal>
	//   18   36:invokespecial   #43  <Method void MediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, long, long, boolean, boolean)>
	//   19   39:areturn         
	}

	public MediaPeriodInfo copyWithStartPositionUs(long l)
	{
		return new MediaPeriodInfo(id, l, endPositionUs, contentPositionUs, durationUs, isLastInTimelinePeriod, isFinal);
	//    0    0:new             #2   <Class MediaPeriodInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId id>
	//    4    8:lload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field long endPositionUs>
	//    7   13:aload_0         
	//    8   14:getfield        #27  <Field long contentPositionUs>
	//    9   17:aload_0         
	//   10   18:getfield        #29  <Field long durationUs>
	//   11   21:aload_0         
	//   12   22:getfield        #31  <Field boolean isLastInTimelinePeriod>
	//   13   25:aload_0         
	//   14   26:getfield        #33  <Field boolean isFinal>
	//   15   29:invokespecial   #43  <Method void MediaPeriodInfo(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, long, long, boolean, boolean)>
	//   16   32:areturn         
	}

	public final long contentPositionUs;
	public final long durationUs;
	public final long endPositionUs;
	public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId id;
	public final boolean isFinal;
	public final boolean isLastInTimelinePeriod;
	public final long startPositionUs;
}
