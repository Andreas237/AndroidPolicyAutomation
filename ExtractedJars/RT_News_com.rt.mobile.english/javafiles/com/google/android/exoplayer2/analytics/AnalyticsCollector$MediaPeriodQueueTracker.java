// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer2.analytics:
//			AnalyticsCollector

private static final class AnalyticsCollector$MediaPeriodQueueTracker
{

	private void updateLastReportedPlayingMediaPeriod()
	{
		if(!activeMediaPeriods.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ArrayList activeMediaPeriods>
	//*   2    4:invokevirtual   #48  <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            25
			lastReportedPlayingMediaPeriod = (AnalyticsCollector.WindowAndMediaPeriodId)activeMediaPeriods.get(0);
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #28  <Field ArrayList activeMediaPeriods>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #52  <Method Object ArrayList.get(int)>
	//    9   19:checkcast       #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//   10   22:putfield        #56  <Field AnalyticsCollector$WindowAndMediaPeriodId lastReportedPlayingMediaPeriod>
	//   11   25:return          
	}

	private AnalyticsCollector.WindowAndMediaPeriodId updateMediaPeriodToNewTimeline(AnalyticsCollector.WindowAndMediaPeriodId windowandmediaperiodid, Timeline timeline1)
	{
		if(!timeline1.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #59  <Method boolean Timeline.isEmpty()>
	//*   2    4:ifne            81
		{
			if(timeline.isEmpty())
	//*   3    7:aload_0         
	//*   4    8:getfield        #40  <Field Timeline timeline>
	//*   5   11:invokevirtual   #59  <Method boolean Timeline.isEmpty()>
	//*   6   14:ifeq            19
				return windowandmediaperiodid;
	//    7   17:aload_1         
	//    8   18:areturn         
			int i = timeline1.getIndexOfPeriod(timeline.getPeriod(windowandmediaperiodid.mediaPeriodId.periodIndex, period, true).uid);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field Timeline timeline>
	//   12   24:aload_1         
	//   13   25:getfield        #63  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId AnalyticsCollector$WindowAndMediaPeriodId.mediaPeriodId>
	//   14   28:getfield        #69  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   15   31:aload_0         
	//   16   32:getfield        #33  <Field com.google.android.exoplayer2.Timeline$Period period>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #73  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period, boolean)>
	//   19   39:getfield        #77  <Field Object com.google.android.exoplayer2.Timeline$Period.uid>
	//   20   42:invokevirtual   #81  <Method int Timeline.getIndexOfPeriod(Object)>
	//   21   45:istore_3        
			if(i == -1)
	//*  22   46:iload_3         
	//*  23   47:iconst_m1       
	//*  24   48:icmpne          53
				return windowandmediaperiodid;
	//   25   51:aload_1         
	//   26   52:areturn         
			else
				return new AnalyticsCollector.WindowAndMediaPeriodId(timeline1.getPeriod(i, period).windowIndex, windowandmediaperiodid.mediaPeriodId.copyWithPeriodIndex(i));
	//   27   53:new             #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//   28   56:dup             
	//   29   57:aload_2         
	//   30   58:iload_3         
	//   31   59:aload_0         
	//   32   60:getfield        #33  <Field com.google.android.exoplayer2.Timeline$Period period>
	//   33   63:invokevirtual   #84  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period)>
	//   34   66:getfield        #87  <Field int com.google.android.exoplayer2.Timeline$Period.windowIndex>
	//   35   69:aload_1         
	//   36   70:getfield        #63  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId AnalyticsCollector$WindowAndMediaPeriodId.mediaPeriodId>
	//   37   73:iload_3         
	//   38   74:invokevirtual   #91  <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.copyWithPeriodIndex(int)>
	//   39   77:invokespecial   #94  <Method void AnalyticsCollector$WindowAndMediaPeriodId(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//   40   80:areturn         
		} else
		{
			return windowandmediaperiodid;
	//   41   81:aload_1         
	//   42   82:areturn         
		}
	}

	public AnalyticsCollector.WindowAndMediaPeriodId getLastReportedPlayingMediaPeriod()
	{
		return lastReportedPlayingMediaPeriod;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AnalyticsCollector$WindowAndMediaPeriodId lastReportedPlayingMediaPeriod>
	//    2    4:areturn         
	}

	public AnalyticsCollector.WindowAndMediaPeriodId getLoadingMediaPeriod()
	{
		if(activeMediaPeriods.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ArrayList activeMediaPeriods>
	//*   2    4:invokevirtual   #48  <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifeq            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		else
			return (AnalyticsCollector.WindowAndMediaPeriodId)activeMediaPeriods.get(activeMediaPeriods.size() - 1);
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field ArrayList activeMediaPeriods>
	//    8   16:aload_0         
	//    9   17:getfield        #28  <Field ArrayList activeMediaPeriods>
	//   10   20:invokevirtual   #103 <Method int ArrayList.size()>
	//   11   23:iconst_1        
	//   12   24:isub            
	//   13   25:invokevirtual   #52  <Method Object ArrayList.get(int)>
	//   14   28:checkcast       #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//   15   31:areturn         
	}

	public AnalyticsCollector.WindowAndMediaPeriodId getPlayingMediaPeriod()
	{
		if(!activeMediaPeriods.isEmpty() && !timeline.isEmpty() && !isSeeking)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ArrayList activeMediaPeriods>
	//*   2    4:invokevirtual   #48  <Method boolean ArrayList.isEmpty()>
	//*   3    7:ifne            42
	//*   4   10:aload_0         
	//*   5   11:getfield        #40  <Field Timeline timeline>
	//*   6   14:invokevirtual   #59  <Method boolean Timeline.isEmpty()>
	//*   7   17:ifne            42
	//*   8   20:aload_0         
	//*   9   21:getfield        #106 <Field boolean isSeeking>
	//*  10   24:ifeq            30
	//*  11   27:goto            42
			return (AnalyticsCollector.WindowAndMediaPeriodId)activeMediaPeriods.get(0);
	//   12   30:aload_0         
	//   13   31:getfield        #28  <Field ArrayList activeMediaPeriods>
	//   14   34:iconst_0        
	//   15   35:invokevirtual   #52  <Method Object ArrayList.get(int)>
	//   16   38:checkcast       #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//   17   41:areturn         
		else
			return null;
	//   18   42:aconst_null     
	//   19   43:areturn         
	}

	public AnalyticsCollector.WindowAndMediaPeriodId getReadingMediaPeriod()
	{
		return readingMediaPeriod;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field AnalyticsCollector$WindowAndMediaPeriodId readingMediaPeriod>
	//    2    4:areturn         
	}

	public boolean isSeeking()
	{
		return isSeeking;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field boolean isSeeking>
	//    2    4:ireturn         
	}

	public void onMediaPeriodCreated(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		activeMediaPeriods.add(((Object) (new AnalyticsCollector.WindowAndMediaPeriodId(i, mediaperiodid))));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList activeMediaPeriods>
	//    2    4:new             #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #94  <Method void AnalyticsCollector$WindowAndMediaPeriodId(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    7   13:invokevirtual   #114 <Method boolean ArrayList.add(Object)>
	//    8   16:pop             
		if(activeMediaPeriods.size() == 1 && !timeline.isEmpty())
	//*   9   17:aload_0         
	//*  10   18:getfield        #28  <Field ArrayList activeMediaPeriods>
	//*  11   21:invokevirtual   #103 <Method int ArrayList.size()>
	//*  12   24:iconst_1        
	//*  13   25:icmpne          42
	//*  14   28:aload_0         
	//*  15   29:getfield        #40  <Field Timeline timeline>
	//*  16   32:invokevirtual   #59  <Method boolean Timeline.isEmpty()>
	//*  17   35:ifne            42
			updateLastReportedPlayingMediaPeriod();
	//   18   38:aload_0         
	//   19   39:invokespecial   #116 <Method void updateLastReportedPlayingMediaPeriod()>
	//   20   42:return          
	}

	public void onMediaPeriodReleased(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (new AnalyticsCollector.WindowAndMediaPeriodId(i, mediaperiodid)));
	//    0    0:new             #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #94  <Method void AnalyticsCollector$WindowAndMediaPeriodId(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    5    9:astore_2        
		activeMediaPeriods.remove(((Object) (mediaperiodid)));
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field ArrayList activeMediaPeriods>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #120 <Method boolean ArrayList.remove(Object)>
	//   10   18:pop             
		if(((AnalyticsCollector.WindowAndMediaPeriodId) (mediaperiodid)).equals(((Object) (readingMediaPeriod))))
	//*  11   19:aload_2         
	//*  12   20:aload_0         
	//*  13   21:getfield        #109 <Field AnalyticsCollector$WindowAndMediaPeriodId readingMediaPeriod>
	//*  14   24:invokevirtual   #123 <Method boolean AnalyticsCollector$WindowAndMediaPeriodId.equals(Object)>
	//*  15   27:ifeq            62
		{
			if(activeMediaPeriods.isEmpty())
	//*  16   30:aload_0         
	//*  17   31:getfield        #28  <Field ArrayList activeMediaPeriods>
	//*  18   34:invokevirtual   #48  <Method boolean ArrayList.isEmpty()>
	//*  19   37:ifeq            45
				mediaperiodid = null;
	//   20   40:aconst_null     
	//   21   41:astore_2        
			else
	//*  22   42:goto            57
				mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) ((AnalyticsCollector.WindowAndMediaPeriodId)activeMediaPeriods.get(0)));
	//   23   45:aload_0         
	//   24   46:getfield        #28  <Field ArrayList activeMediaPeriods>
	//   25   49:iconst_0        
	//   26   50:invokevirtual   #52  <Method Object ArrayList.get(int)>
	//   27   53:checkcast       #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//   28   56:astore_2        
			readingMediaPeriod = ((AnalyticsCollector.WindowAndMediaPeriodId) (mediaperiodid));
	//   29   57:aload_0         
	//   30   58:aload_2         
	//   31   59:putfield        #109 <Field AnalyticsCollector$WindowAndMediaPeriodId readingMediaPeriod>
		}
	//   32   62:return          
	}

	public void onPositionDiscontinuity(int i)
	{
		updateLastReportedPlayingMediaPeriod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #116 <Method void updateLastReportedPlayingMediaPeriod()>
	//    2    4:return          
	}

	public void onReadingStarted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		readingMediaPeriod = new AnalyticsCollector.WindowAndMediaPeriodId(i, mediaperiodid);
	//    0    0:aload_0         
	//    1    1:new             #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #94  <Method void AnalyticsCollector$WindowAndMediaPeriodId(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    6   10:putfield        #109 <Field AnalyticsCollector$WindowAndMediaPeriodId readingMediaPeriod>
	//    7   13:return          
	}

	public void onSeekProcessed()
	{
		isSeeking = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #106 <Field boolean isSeeking>
		updateLastReportedPlayingMediaPeriod();
	//    3    5:aload_0         
	//    4    6:invokespecial   #116 <Method void updateLastReportedPlayingMediaPeriod()>
	//    5    9:return          
	}

	public void onSeekStarted()
	{
		isSeeking = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #106 <Field boolean isSeeking>
	//    3    5:return          
	}

	public void onTimelineChanged(Timeline timeline1)
	{
		for(int i = 0; i < activeMediaPeriods.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #28  <Field ArrayList activeMediaPeriods>
	//*   5    7:invokevirtual   #103 <Method int ArrayList.size()>
	//*   6   10:icmpge          45
			activeMediaPeriods.set(i, ((Object) (updateMediaPeriodToNewTimeline((AnalyticsCollector.WindowAndMediaPeriodId)activeMediaPeriods.get(i), timeline1))));
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field ArrayList activeMediaPeriods>
	//    9   17:iload_2         
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #28  <Field ArrayList activeMediaPeriods>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #52  <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//   16   30:aload_1         
	//   17   31:invokespecial   #132 <Method AnalyticsCollector$WindowAndMediaPeriodId updateMediaPeriodToNewTimeline(AnalyticsCollector$WindowAndMediaPeriodId, Timeline)>
	//   18   34:invokevirtual   #136 <Method Object ArrayList.set(int, Object)>
	//   19   37:pop             

	//   20   38:iload_2         
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore_2        
	//*  24   42:goto            2
		if(readingMediaPeriod != null)
	//*  25   45:aload_0         
	//*  26   46:getfield        #109 <Field AnalyticsCollector$WindowAndMediaPeriodId readingMediaPeriod>
	//*  27   49:ifnull          65
			readingMediaPeriod = updateMediaPeriodToNewTimeline(readingMediaPeriod, timeline1);
	//   28   52:aload_0         
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #109 <Field AnalyticsCollector$WindowAndMediaPeriodId readingMediaPeriod>
	//   32   58:aload_1         
	//   33   59:invokespecial   #132 <Method AnalyticsCollector$WindowAndMediaPeriodId updateMediaPeriodToNewTimeline(AnalyticsCollector$WindowAndMediaPeriodId, Timeline)>
	//   34   62:putfield        #109 <Field AnalyticsCollector$WindowAndMediaPeriodId readingMediaPeriod>
		timeline = timeline1;
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:putfield        #40  <Field Timeline timeline>
		updateLastReportedPlayingMediaPeriod();
	//   38   70:aload_0         
	//   39   71:invokespecial   #116 <Method void updateLastReportedPlayingMediaPeriod()>
	//   40   74:return          
	}

	public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId tryResolveWindowIndex(int i)
	{
		Timeline timeline1 = timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Timeline timeline>
	//    2    4:astore          6
		com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid = null;
	//    3    6:aconst_null     
	//    4    7:astore          5
		if(timeline1 != null)
	//*   5    9:aload           6
	//*   6   11:ifnull          120
		{
			int k = timeline.getPeriodCount();
	//    7   14:aload_0         
	//    8   15:getfield        #40  <Field Timeline timeline>
	//    9   18:invokevirtual   #140 <Method int Timeline.getPeriodCount()>
	//   10   21:istore_3        
			int j = 0;
	//   11   22:iconst_0        
	//   12   23:istore_2        
			com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid1;
			for(mediaperiodid = null; j < activeMediaPeriods.size(); mediaperiodid = mediaperiodid1)
	//*  13   24:aconst_null     
	//*  14   25:astore          5
	//*  15   27:iload_2         
	//*  16   28:aload_0         
	//*  17   29:getfield        #28  <Field ArrayList activeMediaPeriods>
	//*  18   32:invokevirtual   #103 <Method int ArrayList.size()>
	//*  19   35:icmpge          120
			{
				AnalyticsCollector.WindowAndMediaPeriodId windowandmediaperiodid = (AnalyticsCollector.WindowAndMediaPeriodId)activeMediaPeriods.get(j);
	//   20   38:aload_0         
	//   21   39:getfield        #28  <Field ArrayList activeMediaPeriods>
	//   22   42:iload_2         
	//   23   43:invokevirtual   #52  <Method Object ArrayList.get(int)>
	//   24   46:checkcast       #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//   25   49:astore          7
				int l = windowandmediaperiodid.mediaPeriodId.periodIndex;
	//   26   51:aload           7
	//   27   53:getfield        #63  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId AnalyticsCollector$WindowAndMediaPeriodId.mediaPeriodId>
	//   28   56:getfield        #69  <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
	//   29   59:istore          4
				mediaperiodid1 = mediaperiodid;
	//   30   61:aload           5
	//   31   63:astore          6
				if(l < k)
	//*  32   65:iload           4
	//*  33   67:iload_3         
	//*  34   68:icmpge          109
				{
					mediaperiodid1 = mediaperiodid;
	//   35   71:aload           5
	//   36   73:astore          6
					if(timeline.getPeriod(l, period).windowIndex == i)
	//*  37   75:aload_0         
	//*  38   76:getfield        #40  <Field Timeline timeline>
	//*  39   79:iload           4
	//*  40   81:aload_0         
	//*  41   82:getfield        #33  <Field com.google.android.exoplayer2.Timeline$Period period>
	//*  42   85:invokevirtual   #84  <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period)>
	//*  43   88:getfield        #87  <Field int com.google.android.exoplayer2.Timeline$Period.windowIndex>
	//*  44   91:iload_1         
	//*  45   92:icmpne          109
					{
						if(mediaperiodid != null)
	//*  46   95:aload           5
	//*  47   97:ifnull          102
							return null;
	//   48  100:aconst_null     
	//   49  101:areturn         
						mediaperiodid1 = windowandmediaperiodid.mediaPeriodId;
	//   50  102:aload           7
	//   51  104:getfield        #63  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId AnalyticsCollector$WindowAndMediaPeriodId.mediaPeriodId>
	//   52  107:astore          6
					}
				}
				j++;
	//   53  109:iload_2         
	//   54  110:iconst_1        
	//   55  111:iadd            
	//   56  112:istore_2        
			}

	//   57  113:aload           6
	//   58  115:astore          5
		}
	//*  59  117:goto            27
		return mediaperiodid;
	//   60  120:aload           5
	//   61  122:areturn         
	}

	private final ArrayList activeMediaPeriods = new ArrayList();
	private boolean isSeeking;
	private AnalyticsCollector.WindowAndMediaPeriodId lastReportedPlayingMediaPeriod;
	private final com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
	private AnalyticsCollector.WindowAndMediaPeriodId readingMediaPeriod;
	private Timeline timeline;


/*
	static ArrayList access$000(AnalyticsCollector$MediaPeriodQueueTracker analyticscollector$mediaperiodqueuetracker)
	{
		return analyticscollector$mediaperiodqueuetracker.activeMediaPeriods;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList activeMediaPeriods>
	//    2    4:areturn         
	}

*/

	public AnalyticsCollector$MediaPeriodQueueTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #25  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void ArrayList()>
	//    6   12:putfield        #28  <Field ArrayList activeMediaPeriods>
	//    7   15:aload_0         
	//    8   16:new             #30  <Class com.google.android.exoplayer2.Timeline$Period>
	//    9   19:dup             
	//   10   20:invokespecial   #31  <Method void com.google.android.exoplayer2.Timeline$Period()>
	//   11   23:putfield        #33  <Field com.google.android.exoplayer2.Timeline$Period period>
		timeline = Timeline.EMPTY;
	//   12   26:aload_0         
	//   13   27:getstatic       #38  <Field Timeline Timeline.EMPTY>
	//   14   30:putfield        #40  <Field Timeline timeline>
	//   15   33:return          
	}
}
