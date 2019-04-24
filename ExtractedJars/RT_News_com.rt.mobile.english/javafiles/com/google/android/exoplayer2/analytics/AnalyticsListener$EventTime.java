// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Timeline;

// Referenced classes of package com.google.android.exoplayer2.analytics:
//			AnalyticsListener

public static final class AnalyticsListener$EventTime
{

	public final long currentPlaybackPositionMs;
	public final long eventPlaybackPositionMs;
	public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
	public final long realtimeMs;
	public final Timeline timeline;
	public final long totalBufferedDurationMs;
	public final int windowIndex;

	public AnalyticsListener$EventTime(long l, Timeline timeline1, int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l1, 
			long l2, long l3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		realtimeMs = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #26  <Field long realtimeMs>
		timeline = timeline1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #28  <Field Timeline timeline>
		windowIndex = i;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #30  <Field int windowIndex>
		mediaPeriodId = mediaperiodid;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #32  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
		eventPlaybackPositionMs = l1;
	//   14   26:aload_0         
	//   15   27:lload           6
	//   16   29:putfield        #34  <Field long eventPlaybackPositionMs>
		currentPlaybackPositionMs = l2;
	//   17   32:aload_0         
	//   18   33:lload           8
	//   19   35:putfield        #36  <Field long currentPlaybackPositionMs>
		totalBufferedDurationMs = l3;
	//   20   38:aload_0         
	//   21   39:lload           10
	//   22   41:putfield        #38  <Field long totalBufferedDurationMs>
	//   23   44:return          
	}
}
