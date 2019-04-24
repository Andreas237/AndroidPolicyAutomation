// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.analytics;

import android.net.NetworkInfo;
import android.view.Surface;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer2.analytics:
//			AnalyticsListener

public class AnalyticsCollector
	implements com.google.android.exoplayer2.Player.EventListener, MetadataOutput, AudioRendererEventListener, VideoRendererEventListener, MediaSourceEventListener, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener, DefaultDrmSessionEventListener
{
	public static class Factory
	{

		public AnalyticsCollector createAnalyticsCollector(Player player1, Clock clock1)
		{
			return new AnalyticsCollector(player1, clock1);
		//    0    0:new             #6   <Class AnalyticsCollector>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #18  <Method void AnalyticsCollector(Player, Clock)>
		//    5    9:areturn         
		}

		public Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private static final class MediaPeriodQueueTracker
	{

		private void updateLastReportedPlayingMediaPeriod()
		{
			if(!activeMediaPeriods.isEmpty())
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field ArrayList activeMediaPeriods>
		//*   2    4:invokevirtual   #48  <Method boolean ArrayList.isEmpty()>
		//*   3    7:ifne            25
				lastReportedPlayingMediaPeriod = (WindowAndMediaPeriodId)activeMediaPeriods.get(0);
		//    4   10:aload_0         
		//    5   11:aload_0         
		//    6   12:getfield        #28  <Field ArrayList activeMediaPeriods>
		//    7   15:iconst_0        
		//    8   16:invokevirtual   #52  <Method Object ArrayList.get(int)>
		//    9   19:checkcast       #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
		//   10   22:putfield        #56  <Field AnalyticsCollector$WindowAndMediaPeriodId lastReportedPlayingMediaPeriod>
		//   11   25:return          
		}

		private WindowAndMediaPeriodId updateMediaPeriodToNewTimeline(WindowAndMediaPeriodId windowandmediaperiodid, Timeline timeline1)
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
					return new WindowAndMediaPeriodId(timeline1.getPeriod(i, period).windowIndex, windowandmediaperiodid.mediaPeriodId.copyWithPeriodIndex(i));
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

		public WindowAndMediaPeriodId getLastReportedPlayingMediaPeriod()
		{
			return lastReportedPlayingMediaPeriod;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field AnalyticsCollector$WindowAndMediaPeriodId lastReportedPlayingMediaPeriod>
		//    2    4:areturn         
		}

		public WindowAndMediaPeriodId getLoadingMediaPeriod()
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
				return (WindowAndMediaPeriodId)activeMediaPeriods.get(activeMediaPeriods.size() - 1);
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

		public WindowAndMediaPeriodId getPlayingMediaPeriod()
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
				return (WindowAndMediaPeriodId)activeMediaPeriods.get(0);
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

		public WindowAndMediaPeriodId getReadingMediaPeriod()
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
			activeMediaPeriods.add(((Object) (new WindowAndMediaPeriodId(i, mediaperiodid))));
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
			mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (new WindowAndMediaPeriodId(i, mediaperiodid)));
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
			if(((WindowAndMediaPeriodId) (mediaperiodid)).equals(((Object) (readingMediaPeriod))))
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
					mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) ((WindowAndMediaPeriodId)activeMediaPeriods.get(0)));
		//   23   45:aload_0         
		//   24   46:getfield        #28  <Field ArrayList activeMediaPeriods>
		//   25   49:iconst_0        
		//   26   50:invokevirtual   #52  <Method Object ArrayList.get(int)>
		//   27   53:checkcast       #54  <Class AnalyticsCollector$WindowAndMediaPeriodId>
		//   28   56:astore_2        
				readingMediaPeriod = ((WindowAndMediaPeriodId) (mediaperiodid));
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
			readingMediaPeriod = new WindowAndMediaPeriodId(i, mediaperiodid);
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
				activeMediaPeriods.set(i, ((Object) (updateMediaPeriodToNewTimeline((WindowAndMediaPeriodId)activeMediaPeriods.get(i), timeline1))));
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
					WindowAndMediaPeriodId windowandmediaperiodid = (WindowAndMediaPeriodId)activeMediaPeriods.get(j);
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
		private WindowAndMediaPeriodId lastReportedPlayingMediaPeriod;
		private final com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
		private WindowAndMediaPeriodId readingMediaPeriod;
		private Timeline timeline;


/*
		static ArrayList access$000(MediaPeriodQueueTracker mediaperiodqueuetracker)
		{
			return mediaperiodqueuetracker.activeMediaPeriods;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field ArrayList activeMediaPeriods>
		//    2    4:areturn         
		}

*/

		public MediaPeriodQueueTracker()
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

	private static final class WindowAndMediaPeriodId
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          58
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #28  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #28  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((WindowAndMediaPeriodId)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class AnalyticsCollector$WindowAndMediaPeriodId>
		//   16   28:astore_1        
				return windowIndex == ((WindowAndMediaPeriodId) (obj)).windowIndex && mediaPeriodId.equals(((Object) (((WindowAndMediaPeriodId) (obj)).mediaPeriodId)));
		//   17   29:aload_0         
		//   18   30:getfield        #18  <Field int windowIndex>
		//   19   33:aload_1         
		//   20   34:getfield        #18  <Field int windowIndex>
		//   21   37:icmpne          56
		//   22   40:aload_0         
		//   23   41:getfield        #20  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
		//   24   44:aload_1         
		//   25   45:getfield        #20  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
		//   26   48:invokevirtual   #32  <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.equals(Object)>
		//   27   51:ifeq            56
		//   28   54:iconst_1        
		//   29   55:ireturn         
		//   30   56:iconst_0        
		//   31   57:ireturn         
			} else
			{
				return false;
		//   32   58:iconst_0        
		//   33   59:ireturn         
			}
		}

		public int hashCode()
		{
			return 31 * windowIndex + mediaPeriodId.hashCode();
		//    0    0:bipush          31
		//    1    2:aload_0         
		//    2    3:getfield        #18  <Field int windowIndex>
		//    3    6:imul            
		//    4    7:aload_0         
		//    5    8:getfield        #20  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
		//    6   11:invokevirtual   #37  <Method int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.hashCode()>
		//    7   14:iadd            
		//    8   15:ireturn         
		}

		public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
		public final int windowIndex;

		public WindowAndMediaPeriodId(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			windowIndex = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int windowIndex>
			mediaPeriodId = mediaperiodid;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId mediaPeriodId>
		//    8   14:return          
		}
	}


	protected AnalyticsCollector(Player player1, Clock clock1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		player = player1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field Player player>
		clock = (Clock)Assertions.checkNotNull(((Object) (clock1)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #53  <Method Object Assertions.checkNotNull(Object)>
	//    8   14:checkcast       #55  <Class Clock>
	//    9   17:putfield        #57  <Field Clock clock>
	//   10   20:aload_0         
	//   11   21:new             #59  <Class CopyOnWriteArraySet>
	//   12   24:dup             
	//   13   25:invokespecial   #60  <Method void CopyOnWriteArraySet()>
	//   14   28:putfield        #62  <Field CopyOnWriteArraySet listeners>
	//   15   31:aload_0         
	//   16   32:new             #23  <Class AnalyticsCollector$MediaPeriodQueueTracker>
	//   17   35:dup             
	//   18   36:invokespecial   #63  <Method void AnalyticsCollector$MediaPeriodQueueTracker()>
	//   19   39:putfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//   20   42:aload_0         
	//   21   43:new             #67  <Class com.google.android.exoplayer2.Timeline$Window>
	//   22   46:dup             
	//   23   47:invokespecial   #68  <Method void com.google.android.exoplayer2.Timeline$Window()>
	//   24   50:putfield        #70  <Field com.google.android.exoplayer2.Timeline$Window window>
	//   25   53:return          
	}

	private AnalyticsListener.EventTime generateEventTime(WindowAndMediaPeriodId windowandmediaperiodid)
	{
		if(windowandmediaperiodid == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       34
		{
			int i = ((Player)Assertions.checkNotNull(((Object) (player)))).getCurrentWindowIndex();
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field Player player>
	//    4    8:invokestatic    #53  <Method Object Assertions.checkNotNull(Object)>
	//    5   11:checkcast       #76  <Class Player>
	//    6   14:invokeinterface #80  <Method int Player.getCurrentWindowIndex()>
	//    7   19:istore_2        
			return generateEventTime(i, mediaPeriodQueueTracker.tryResolveWindowIndex(i));
	//    8   20:aload_0         
	//    9   21:iload_2         
	//   10   22:aload_0         
	//   11   23:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//   12   26:iload_2         
	//   13   27:invokevirtual   #84  <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId AnalyticsCollector$MediaPeriodQueueTracker.tryResolveWindowIndex(int)>
	//   14   30:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//   15   33:areturn         
		} else
		{
			return generateEventTime(windowandmediaperiodid.windowIndex, windowandmediaperiodid.mediaPeriodId);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:getfield        #91  <Field int AnalyticsCollector$WindowAndMediaPeriodId.windowIndex>
	//   19   39:aload_1         
	//   20   40:getfield        #95  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId AnalyticsCollector$WindowAndMediaPeriodId.mediaPeriodId>
	//   21   43:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//   22   46:areturn         
		}
	}

	private AnalyticsListener.EventTime generateLastReportedPlayingMediaPeriodEventTime()
	{
		return generateEventTime(mediaPeriodQueueTracker.getLastReportedPlayingMediaPeriod());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    3    5:invokevirtual   #101 <Method AnalyticsCollector$WindowAndMediaPeriodId AnalyticsCollector$MediaPeriodQueueTracker.getLastReportedPlayingMediaPeriod()>
	//    4    8:invokespecial   #103 <Method AnalyticsListener$EventTime generateEventTime(AnalyticsCollector$WindowAndMediaPeriodId)>
	//    5   11:areturn         
	}

	private AnalyticsListener.EventTime generateLoadingMediaPeriodEventTime()
	{
		return generateEventTime(mediaPeriodQueueTracker.getLoadingMediaPeriod());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    3    5:invokevirtual   #107 <Method AnalyticsCollector$WindowAndMediaPeriodId AnalyticsCollector$MediaPeriodQueueTracker.getLoadingMediaPeriod()>
	//    4    8:invokespecial   #103 <Method AnalyticsListener$EventTime generateEventTime(AnalyticsCollector$WindowAndMediaPeriodId)>
	//    5   11:areturn         
	}

	private AnalyticsListener.EventTime generatePlayingMediaPeriodEventTime()
	{
		return generateEventTime(mediaPeriodQueueTracker.getPlayingMediaPeriod());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    3    5:invokevirtual   #111 <Method AnalyticsCollector$WindowAndMediaPeriodId AnalyticsCollector$MediaPeriodQueueTracker.getPlayingMediaPeriod()>
	//    4    8:invokespecial   #103 <Method AnalyticsListener$EventTime generateEventTime(AnalyticsCollector$WindowAndMediaPeriodId)>
	//    5   11:areturn         
	}

	private AnalyticsListener.EventTime generateReadingMediaPeriodEventTime()
	{
		return generateEventTime(mediaPeriodQueueTracker.getReadingMediaPeriod());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    3    5:invokevirtual   #115 <Method AnalyticsCollector$WindowAndMediaPeriodId AnalyticsCollector$MediaPeriodQueueTracker.getReadingMediaPeriod()>
	//    4    8:invokespecial   #103 <Method AnalyticsListener$EventTime generateEventTime(AnalyticsCollector$WindowAndMediaPeriodId)>
	//    5   11:areturn         
	}

	public void addListener(AnalyticsListener analyticslistener)
	{
		listeners.add(((Object) (analyticslistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #121 <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	protected AnalyticsListener.EventTime generateEventTime(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		Assertions.checkNotNull(((Object) (player)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Player player>
	//    2    4:invokestatic    #53  <Method Object Assertions.checkNotNull(Object)>
	//    3    7:pop             
		long l2 = clock.elapsedRealtime();
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field Clock clock>
	//    6   12:invokeinterface #125 <Method long Clock.elapsedRealtime()>
	//    7   17:lstore          8
		Timeline timeline = player.getCurrentTimeline();
	//    8   19:aload_0         
	//    9   20:getfield        #47  <Field Player player>
	//   10   23:invokeinterface #129 <Method Timeline Player.getCurrentTimeline()>
	//   11   28:astore          12
		int j = player.getCurrentWindowIndex();
	//   12   30:aload_0         
	//   13   31:getfield        #47  <Field Player player>
	//   14   34:invokeinterface #80  <Method int Player.getCurrentWindowIndex()>
	//   15   39:istore_3        
		long l1 = 0L;
	//   16   40:lconst_0        
	//   17   41:lstore          6
		long l;
		if(i == j)
	//*  18   43:iload_1         
	//*  19   44:iload_3         
	//*  20   45:icmpne          127
		{
			if(mediaperiodid != null && mediaperiodid.isAd())
	//*  21   48:aload_2         
	//*  22   49:ifnull          113
	//*  23   52:aload_2         
	//*  24   53:invokevirtual   #135 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*  25   56:ifeq            113
			{
				l = l1;
	//   26   59:lload           6
	//   27   61:lstore          4
				if(player.getCurrentAdGroupIndex() == mediaperiodid.adGroupIndex)
	//*  28   63:aload_0         
	//*  29   64:getfield        #47  <Field Player player>
	//*  30   67:invokeinterface #138 <Method int Player.getCurrentAdGroupIndex()>
	//*  31   72:aload_2         
	//*  32   73:getfield        #141 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//*  33   76:icmpne          176
				{
					l = l1;
	//   34   79:lload           6
	//   35   81:lstore          4
					if(player.getCurrentAdIndexInAdGroup() == mediaperiodid.adIndexInAdGroup)
	//*  36   83:aload_0         
	//*  37   84:getfield        #47  <Field Player player>
	//*  38   87:invokeinterface #144 <Method int Player.getCurrentAdIndexInAdGroup()>
	//*  39   92:aload_2         
	//*  40   93:getfield        #147 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//*  41   96:icmpne          176
						l = player.getCurrentPosition();
	//   42   99:aload_0         
	//   43  100:getfield        #47  <Field Player player>
	//   44  103:invokeinterface #150 <Method long Player.getCurrentPosition()>
	//   45  108:lstore          4
				}
			} else
	//*  46  110:goto            176
			{
				l = player.getContentPosition();
	//   47  113:aload_0         
	//   48  114:getfield        #47  <Field Player player>
	//   49  117:invokeinterface #153 <Method long Player.getContentPosition()>
	//   50  122:lstore          4
			}
		} else
	//*  51  124:goto            176
		{
			l = l1;
	//   52  127:lload           6
	//   53  129:lstore          4
			if(i < timeline.getWindowCount())
	//*  54  131:iload_1         
	//*  55  132:aload           12
	//*  56  134:invokevirtual   #158 <Method int Timeline.getWindowCount()>
	//*  57  137:icmpge          176
				if(mediaperiodid != null && mediaperiodid.isAd())
	//*  58  140:aload_2         
	//*  59  141:ifnull          158
	//*  60  144:aload_2         
	//*  61  145:invokevirtual   #135 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*  62  148:ifeq            158
					l = l1;
	//   63  151:lload           6
	//   64  153:lstore          4
				else
	//*  65  155:goto            176
					l = timeline.getWindow(i, window).getDefaultPositionMs();
	//   66  158:aload           12
	//   67  160:iload_1         
	//   68  161:aload_0         
	//   69  162:getfield        #70  <Field com.google.android.exoplayer2.Timeline$Window window>
	//   70  165:invokevirtual   #162 <Method com.google.android.exoplayer2.Timeline$Window Timeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window)>
	//   71  168:invokevirtual   #165 <Method long com.google.android.exoplayer2.Timeline$Window.getDefaultPositionMs()>
	//   72  171:lstore          4
		}
	//*  73  173:goto            124
		l1 = player.getBufferedPosition();
	//   74  176:aload_0         
	//   75  177:getfield        #47  <Field Player player>
	//   76  180:invokeinterface #168 <Method long Player.getBufferedPosition()>
	//   77  185:lstore          6
		long l3 = player.getContentPosition();
	//   78  187:aload_0         
	//   79  188:getfield        #47  <Field Player player>
	//   80  191:invokeinterface #153 <Method long Player.getContentPosition()>
	//   81  196:lstore          10
		return new AnalyticsListener.EventTime(l2, timeline, i, mediaperiodid, l, player.getCurrentPosition(), l1 - l3);
	//   82  198:new             #170 <Class AnalyticsListener$EventTime>
	//   83  201:dup             
	//   84  202:lload           8
	//   85  204:aload           12
	//   86  206:iload_1         
	//   87  207:aload_2         
	//   88  208:lload           4
	//   89  210:aload_0         
	//   90  211:getfield        #47  <Field Player player>
	//   91  214:invokeinterface #150 <Method long Player.getCurrentPosition()>
	//   92  219:lload           6
	//   93  221:lload           10
	//   94  223:lsub            
	//   95  224:invokespecial   #173 <Method void AnalyticsListener$EventTime(long, Timeline, int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, long)>
	//   96  227:areturn         
	}

	protected Set getListeners()
	{
		return Collections.unmodifiableSet(((Set) (listeners)));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    2    4:invokestatic    #181 <Method Set Collections.unmodifiableSet(Set)>
	//    3    7:areturn         
	}

	public final void notifyNetworkTypeChanged(NetworkInfo networkinfo)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onNetworkTypeChanged(eventtime, networkinfo));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:aload_1         
	//   15   33:invokeinterface #206 <Method void AnalyticsListener.onNetworkTypeChanged(AnalyticsListener$EventTime, NetworkInfo)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void notifySeekStarted()
	{
		if(!mediaPeriodQueueTracker.isSeeking())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//*   2    4:invokevirtual   #210 <Method boolean AnalyticsCollector$MediaPeriodQueueTracker.isSeeking()>
	//*   3    7:ifne            57
		{
			AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    4   10:aload_0         
	//    5   11:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    6   14:astore_1        
			mediaPeriodQueueTracker.onSeekStarted();
	//    7   15:aload_0         
	//    8   16:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    9   19:invokevirtual   #213 <Method void AnalyticsCollector$MediaPeriodQueueTracker.onSeekStarted()>
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onSeekStarted(eventtime));
	//   10   22:aload_0         
	//   11   23:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//   12   26:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   13   29:astore_2        
	//   14   30:aload_2         
	//   15   31:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            57
	//   17   39:aload_2         
	//   18   40:invokeinterface #200 <Method Object Iterator.next()>
	//   19   45:checkcast       #202 <Class AnalyticsListener>
	//   20   48:aload_1         
	//   21   49:invokeinterface #216 <Method void AnalyticsListener.onSeekStarted(AnalyticsListener$EventTime)>
		}
	//*  22   54:goto            30
	//   23   57:return          
	}

	public final void notifyViewportSizeChanged(int i, int j)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_3        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onViewportSizeChange(eventtime, i, j));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore          4
	//    7   14:aload           4
	//    8   16:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            45
	//   10   24:aload           4
	//   11   26:invokeinterface #200 <Method Object Iterator.next()>
	//   12   31:checkcast       #202 <Class AnalyticsListener>
	//   13   34:aload_3         
	//   14   35:iload_1         
	//   15   36:iload_2         
	//   16   37:invokeinterface #222 <Method void AnalyticsListener.onViewportSizeChange(AnalyticsListener$EventTime, int, int)>
	//*  17   42:goto            14
	//   18   45:return          
	}

	public final void onAudioDecoderInitialized(String s, long l, long l1)
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore          6
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDecoderInitialized(eventtime, 1, s, l1));
	//    3    6:aload_0         
	//    4    7:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5   10:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   13:astore          7
	//    7   15:aload           7
	//    8   17:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   22:ifeq            49
	//   10   25:aload           7
	//   11   27:invokeinterface #200 <Method Object Iterator.next()>
	//   12   32:checkcast       #202 <Class AnalyticsListener>
	//   13   35:aload           6
	//   14   37:iconst_1        
	//   15   38:aload_1         
	//   16   39:lload           4
	//   17   41:invokeinterface #230 <Method void AnalyticsListener.onDecoderInitialized(AnalyticsListener$EventTime, int, String, long)>
	//*  18   46:goto            15
	//   19   49:return          
	}

	public final void onAudioDisabled(DecoderCounters decodercounters)
	{
		AnalyticsListener.EventTime eventtime = generateLastReportedPlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #234 <Method AnalyticsListener$EventTime generateLastReportedPlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDecoderDisabled(eventtime, 1, decodercounters));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            42
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iconst_1        
	//   15   33:aload_1         
	//   16   34:invokeinterface #238 <Method void AnalyticsListener.onDecoderDisabled(AnalyticsListener$EventTime, int, DecoderCounters)>
	//*  17   39:goto            13
	//   18   42:return          
	}

	public final void onAudioEnabled(DecoderCounters decodercounters)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDecoderEnabled(eventtime, 1, decodercounters));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            42
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iconst_1        
	//   15   33:aload_1         
	//   16   34:invokeinterface #242 <Method void AnalyticsListener.onDecoderEnabled(AnalyticsListener$EventTime, int, DecoderCounters)>
	//*  17   39:goto            13
	//   18   42:return          
	}

	public final void onAudioInputFormatChanged(Format format)
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDecoderInputFormatChanged(eventtime, 1, format));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            42
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iconst_1        
	//   15   33:aload_1         
	//   16   34:invokeinterface #248 <Method void AnalyticsListener.onDecoderInputFormatChanged(AnalyticsListener$EventTime, int, Format)>
	//*  17   39:goto            13
	//   18   42:return          
	}

	public final void onAudioSessionId(int i)
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onAudioSessionId(eventtime, i));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iload_1         
	//   15   33:invokeinterface #253 <Method void AnalyticsListener.onAudioSessionId(AnalyticsListener$EventTime, int)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void onAudioSinkUnderrun(int i, long l, long l1)
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore          6
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onAudioUnderrun(eventtime, i, l, l1));
	//    3    6:aload_0         
	//    4    7:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5   10:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   13:astore          7
	//    7   15:aload           7
	//    8   17:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   22:ifeq            49
	//   10   25:aload           7
	//   11   27:invokeinterface #200 <Method Object Iterator.next()>
	//   12   32:checkcast       #202 <Class AnalyticsListener>
	//   13   35:aload           6
	//   14   37:iload_1         
	//   15   38:lload_2         
	//   16   39:lload           4
	//   17   41:invokeinterface #259 <Method void AnalyticsListener.onAudioUnderrun(AnalyticsListener$EventTime, int, long, long)>
	//*  18   46:goto            15
	//   19   49:return          
	}

	public final void onBandwidthSample(int i, long l, long l1)
	{
		AnalyticsListener.EventTime eventtime = generateLoadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #262 <Method AnalyticsListener$EventTime generateLoadingMediaPeriodEventTime()>
	//    2    4:astore          6
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onBandwidthEstimate(eventtime, i, l, l1));
	//    3    6:aload_0         
	//    4    7:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5   10:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   13:astore          7
	//    7   15:aload           7
	//    8   17:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   22:ifeq            49
	//   10   25:aload           7
	//   11   27:invokeinterface #200 <Method Object Iterator.next()>
	//   12   32:checkcast       #202 <Class AnalyticsListener>
	//   13   35:aload           6
	//   14   37:iload_1         
	//   15   38:lload_2         
	//   16   39:lload           4
	//   17   41:invokeinterface #265 <Method void AnalyticsListener.onBandwidthEstimate(AnalyticsListener$EventTime, int, long, long)>
	//*  18   46:goto            15
	//   19   49:return          
	}

	public final void onDownstreamFormatChanged(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (generateEventTime(i, mediaperiodid)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    4    6:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDownstreamFormatChanged(((AnalyticsListener.EventTime) (mediaperiodid)), medialoaddata));
	//    5    7:aload_0         
	//    6    8:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    7   11:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    8   14:astore          4
	//    9   16:aload           4
	//   10   18:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            46
	//   12   26:aload           4
	//   13   28:invokeinterface #200 <Method Object Iterator.next()>
	//   14   33:checkcast       #202 <Class AnalyticsListener>
	//   15   36:aload_2         
	//   16   37:aload_3         
	//   17   38:invokeinterface #270 <Method void AnalyticsListener.onDownstreamFormatChanged(AnalyticsListener$EventTime, com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData)>
	//*  18   43:goto            16
	//   19   46:return          
	}

	public final void onDrmKeysLoaded()
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore_1        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDrmKeysLoaded(eventtime));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            40
	//   10   22:aload_2         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_1         
	//   14   32:invokeinterface #273 <Method void AnalyticsListener.onDrmKeysLoaded(AnalyticsListener$EventTime)>
	//*  15   37:goto            13
	//   16   40:return          
	}

	public final void onDrmKeysRemoved()
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore_1        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDrmKeysRemoved(eventtime));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            40
	//   10   22:aload_2         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_1         
	//   14   32:invokeinterface #276 <Method void AnalyticsListener.onDrmKeysRemoved(AnalyticsListener$EventTime)>
	//*  15   37:goto            13
	//   16   40:return          
	}

	public final void onDrmKeysRestored()
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore_1        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDrmKeysRestored(eventtime));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            40
	//   10   22:aload_2         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_1         
	//   14   32:invokeinterface #279 <Method void AnalyticsListener.onDrmKeysRestored(AnalyticsListener$EventTime)>
	//*  15   37:goto            13
	//   16   40:return          
	}

	public final void onDrmSessionManagerError(Exception exception)
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDrmSessionManagerError(eventtime, exception));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:aload_1         
	//   15   33:invokeinterface #284 <Method void AnalyticsListener.onDrmSessionManagerError(AnalyticsListener$EventTime, Exception)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void onDroppedFrames(int i, long l)
	{
		AnalyticsListener.EventTime eventtime = generateLastReportedPlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #234 <Method AnalyticsListener$EventTime generateLastReportedPlayingMediaPeriodEventTime()>
	//    2    4:astore          4
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDroppedVideoFrames(eventtime, i, l));
	//    3    6:aload_0         
	//    4    7:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5   10:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   13:astore          5
	//    7   15:aload           5
	//    8   17:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   22:ifeq            47
	//   10   25:aload           5
	//   11   27:invokeinterface #200 <Method Object Iterator.next()>
	//   12   32:checkcast       #202 <Class AnalyticsListener>
	//   13   35:aload           4
	//   14   37:iload_1         
	//   15   38:lload_2         
	//   16   39:invokeinterface #290 <Method void AnalyticsListener.onDroppedVideoFrames(AnalyticsListener$EventTime, int, long)>
	//*  17   44:goto            15
	//   18   47:return          
	}

	public final void onLoadCanceled(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (generateEventTime(i, mediaperiodid)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    4    6:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onLoadCanceled(((AnalyticsListener.EventTime) (mediaperiodid)), loadeventinfo, medialoaddata));
	//    5    7:aload_0         
	//    6    8:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    7   11:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    8   14:astore          5
	//    9   16:aload           5
	//   10   18:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            48
	//   12   26:aload           5
	//   13   28:invokeinterface #200 <Method Object Iterator.next()>
	//   14   33:checkcast       #202 <Class AnalyticsListener>
	//   15   36:aload_2         
	//   16   37:aload_3         
	//   17   38:aload           4
	//   18   40:invokeinterface #295 <Method void AnalyticsListener.onLoadCanceled(AnalyticsListener$EventTime, com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo, com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData)>
	//*  19   45:goto            16
	//   20   48:return          
	}

	public final void onLoadCompleted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (generateEventTime(i, mediaperiodid)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    4    6:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onLoadCompleted(((AnalyticsListener.EventTime) (mediaperiodid)), loadeventinfo, medialoaddata));
	//    5    7:aload_0         
	//    6    8:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    7   11:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    8   14:astore          5
	//    9   16:aload           5
	//   10   18:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            48
	//   12   26:aload           5
	//   13   28:invokeinterface #200 <Method Object Iterator.next()>
	//   14   33:checkcast       #202 <Class AnalyticsListener>
	//   15   36:aload_2         
	//   16   37:aload_3         
	//   17   38:aload           4
	//   18   40:invokeinterface #298 <Method void AnalyticsListener.onLoadCompleted(AnalyticsListener$EventTime, com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo, com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData)>
	//*  19   45:goto            16
	//   20   48:return          
	}

	public final void onLoadError(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag)
	{
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (generateEventTime(i, mediaperiodid)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    4    6:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onLoadError(((AnalyticsListener.EventTime) (mediaperiodid)), loadeventinfo, medialoaddata, ioexception, flag));
	//    5    7:aload_0         
	//    6    8:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    7   11:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    8   14:astore          7
	//    9   16:aload           7
	//   10   18:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            52
	//   12   26:aload           7
	//   13   28:invokeinterface #200 <Method Object Iterator.next()>
	//   14   33:checkcast       #202 <Class AnalyticsListener>
	//   15   36:aload_2         
	//   16   37:aload_3         
	//   17   38:aload           4
	//   18   40:aload           5
	//   19   42:iload           6
	//   20   44:invokeinterface #303 <Method void AnalyticsListener.onLoadError(AnalyticsListener$EventTime, com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo, com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData, IOException, boolean)>
	//*  21   49:goto            16
	//   22   52:return          
	}

	public final void onLoadStarted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo loadeventinfo, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (generateEventTime(i, mediaperiodid)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    4    6:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onLoadStarted(((AnalyticsListener.EventTime) (mediaperiodid)), loadeventinfo, medialoaddata));
	//    5    7:aload_0         
	//    6    8:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    7   11:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    8   14:astore          5
	//    9   16:aload           5
	//   10   18:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            48
	//   12   26:aload           5
	//   13   28:invokeinterface #200 <Method Object Iterator.next()>
	//   14   33:checkcast       #202 <Class AnalyticsListener>
	//   15   36:aload_2         
	//   16   37:aload_3         
	//   17   38:aload           4
	//   18   40:invokeinterface #306 <Method void AnalyticsListener.onLoadStarted(AnalyticsListener$EventTime, com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo, com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData)>
	//*  19   45:goto            16
	//   20   48:return          
	}

	public final void onLoadingChanged(boolean flag)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onLoadingChanged(eventtime, flag));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iload_1         
	//   15   33:invokeinterface #311 <Method void AnalyticsListener.onLoadingChanged(AnalyticsListener$EventTime, boolean)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void onMediaPeriodCreated(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		mediaPeriodQueueTracker.onMediaPeriodCreated(i, mediaperiodid);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #315 <Method void AnalyticsCollector$MediaPeriodQueueTracker.onMediaPeriodCreated(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (generateEventTime(i, mediaperiodid)));
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    9   15:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onMediaPeriodCreated(((AnalyticsListener.EventTime) (mediaperiodid))));
	//   10   16:aload_0         
	//   11   17:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//   12   20:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   13   23:astore_3        
	//   14   24:aload_3         
	//   15   25:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   16   30:ifeq            51
	//   17   33:aload_3         
	//   18   34:invokeinterface #200 <Method Object Iterator.next()>
	//   19   39:checkcast       #202 <Class AnalyticsListener>
	//   20   42:aload_2         
	//   21   43:invokeinterface #317 <Method void AnalyticsListener.onMediaPeriodCreated(AnalyticsListener$EventTime)>
	//*  22   48:goto            24
	//   23   51:return          
	}

	public final void onMediaPeriodReleased(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		mediaPeriodQueueTracker.onMediaPeriodReleased(i, mediaperiodid);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #320 <Method void AnalyticsCollector$MediaPeriodQueueTracker.onMediaPeriodReleased(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (generateEventTime(i, mediaperiodid)));
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    9   15:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onMediaPeriodReleased(((AnalyticsListener.EventTime) (mediaperiodid))));
	//   10   16:aload_0         
	//   11   17:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//   12   20:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   13   23:astore_3        
	//   14   24:aload_3         
	//   15   25:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   16   30:ifeq            51
	//   17   33:aload_3         
	//   18   34:invokeinterface #200 <Method Object Iterator.next()>
	//   19   39:checkcast       #202 <Class AnalyticsListener>
	//   20   42:aload_2         
	//   21   43:invokeinterface #322 <Method void AnalyticsListener.onMediaPeriodReleased(AnalyticsListener$EventTime)>
	//*  22   48:goto            24
	//   23   51:return          
	}

	public final void onMetadata(Metadata metadata)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onMetadata(eventtime, metadata));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:aload_1         
	//   15   33:invokeinterface #327 <Method void AnalyticsListener.onMetadata(AnalyticsListener$EventTime, Metadata)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void onPlaybackParametersChanged(PlaybackParameters playbackparameters)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onPlaybackParametersChanged(eventtime, playbackparameters));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:aload_1         
	//   15   33:invokeinterface #332 <Method void AnalyticsListener.onPlaybackParametersChanged(AnalyticsListener$EventTime, PlaybackParameters)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void onPlayerError(ExoPlaybackException exoplaybackexception)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onPlayerError(eventtime, exoplaybackexception));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:aload_1         
	//   15   33:invokeinterface #337 <Method void AnalyticsListener.onPlayerError(AnalyticsListener$EventTime, ExoPlaybackException)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void onPlayerStateChanged(boolean flag, int i)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_3        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onPlayerStateChanged(eventtime, flag, i));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore          4
	//    7   14:aload           4
	//    8   16:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            45
	//   10   24:aload           4
	//   11   26:invokeinterface #200 <Method Object Iterator.next()>
	//   12   31:checkcast       #202 <Class AnalyticsListener>
	//   13   34:aload_3         
	//   14   35:iload_1         
	//   15   36:iload_2         
	//   16   37:invokeinterface #342 <Method void AnalyticsListener.onPlayerStateChanged(AnalyticsListener$EventTime, boolean, int)>
	//*  17   42:goto            14
	//   18   45:return          
	}

	public final void onPositionDiscontinuity(int i)
	{
		mediaPeriodQueueTracker.onPositionDiscontinuity(i);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #345 <Method void AnalyticsCollector$MediaPeriodQueueTracker.onPositionDiscontinuity(int)>
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    4    8:aload_0         
	//    5    9:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    6   12:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onPositionDiscontinuity(eventtime, i));
	//    7   13:aload_0         
	//    8   14:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    9   17:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   10   20:astore_3        
	//   11   21:aload_3         
	//   12   22:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            49
	//   14   30:aload_3         
	//   15   31:invokeinterface #200 <Method Object Iterator.next()>
	//   16   36:checkcast       #202 <Class AnalyticsListener>
	//   17   39:aload_2         
	//   18   40:iload_1         
	//   19   41:invokeinterface #347 <Method void AnalyticsListener.onPositionDiscontinuity(AnalyticsListener$EventTime, int)>
	//*  20   46:goto            21
	//   21   49:return          
	}

	public final void onReadingStarted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		mediaPeriodQueueTracker.onReadingStarted(i, mediaperiodid);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #350 <Method void AnalyticsCollector$MediaPeriodQueueTracker.onReadingStarted(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (generateEventTime(i, mediaperiodid)));
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    9   15:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onReadingStarted(((AnalyticsListener.EventTime) (mediaperiodid))));
	//   10   16:aload_0         
	//   11   17:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//   12   20:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   13   23:astore_3        
	//   14   24:aload_3         
	//   15   25:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   16   30:ifeq            51
	//   17   33:aload_3         
	//   18   34:invokeinterface #200 <Method Object Iterator.next()>
	//   19   39:checkcast       #202 <Class AnalyticsListener>
	//   20   42:aload_2         
	//   21   43:invokeinterface #352 <Method void AnalyticsListener.onReadingStarted(AnalyticsListener$EventTime)>
	//*  22   48:goto            24
	//   23   51:return          
	}

	public final void onRenderedFirstFrame(Surface surface)
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onRenderedFirstFrame(eventtime, surface));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:aload_1         
	//   15   33:invokeinterface #357 <Method void AnalyticsListener.onRenderedFirstFrame(AnalyticsListener$EventTime, Surface)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void onRepeatModeChanged(int i)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onRepeatModeChanged(eventtime, i));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iload_1         
	//   15   33:invokeinterface #360 <Method void AnalyticsListener.onRepeatModeChanged(AnalyticsListener$EventTime, int)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void onSeekProcessed()
	{
		if(mediaPeriodQueueTracker.isSeeking())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//*   2    4:invokevirtual   #210 <Method boolean AnalyticsCollector$MediaPeriodQueueTracker.isSeeking()>
	//*   3    7:ifeq            57
		{
			mediaPeriodQueueTracker.onSeekProcessed();
	//    4   10:aload_0         
	//    5   11:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    6   14:invokevirtual   #363 <Method void AnalyticsCollector$MediaPeriodQueueTracker.onSeekProcessed()>
			AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    7   17:aload_0         
	//    8   18:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    9   21:astore_1        
			for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onSeekProcessed(eventtime));
	//   10   22:aload_0         
	//   11   23:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//   12   26:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   13   29:astore_2        
	//   14   30:aload_2         
	//   15   31:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            57
	//   17   39:aload_2         
	//   18   40:invokeinterface #200 <Method Object Iterator.next()>
	//   19   45:checkcast       #202 <Class AnalyticsListener>
	//   20   48:aload_1         
	//   21   49:invokeinterface #365 <Method void AnalyticsListener.onSeekProcessed(AnalyticsListener$EventTime)>
		}
	//*  22   54:goto            30
	//   23   57:return          
	}

	public final void onShuffleModeEnabledChanged(boolean flag)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onShuffleModeChanged(eventtime, flag));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            41
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iload_1         
	//   15   33:invokeinterface #369 <Method void AnalyticsListener.onShuffleModeChanged(AnalyticsListener$EventTime, boolean)>
	//*  16   38:goto            13
	//   17   41:return          
	}

	public final void onTimelineChanged(Timeline timeline, Object obj, int i)
	{
		mediaPeriodQueueTracker.onTimelineChanged(timeline);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #374 <Method void AnalyticsCollector$MediaPeriodQueueTracker.onTimelineChanged(Timeline)>
		timeline = ((Timeline) (generatePlayingMediaPeriodEventTime()));
	//    4    8:aload_0         
	//    5    9:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    6   12:astore_1        
		for(obj = ((Object) (listeners.iterator())); ((Iterator) (obj)).hasNext(); ((AnalyticsListener)((Iterator) (obj)).next()).onTimelineChanged(((AnalyticsListener.EventTime) (timeline)), i));
	//    7   13:aload_0         
	//    8   14:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    9   17:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   10   20:astore_2        
	//   11   21:aload_2         
	//   12   22:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   13   27:ifeq            49
	//   14   30:aload_2         
	//   15   31:invokeinterface #200 <Method Object Iterator.next()>
	//   16   36:checkcast       #202 <Class AnalyticsListener>
	//   17   39:aload_1         
	//   18   40:iload_3         
	//   19   41:invokeinterface #376 <Method void AnalyticsListener.onTimelineChanged(AnalyticsListener$EventTime, int)>
	//*  20   46:goto            21
	//   21   49:return          
	}

	public final void onTracksChanged(TrackGroupArray trackgrouparray, TrackSelectionArray trackselectionarray)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_3        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onTracksChanged(eventtime, trackgrouparray, trackselectionarray));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore          4
	//    7   14:aload           4
	//    8   16:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            45
	//   10   24:aload           4
	//   11   26:invokeinterface #200 <Method Object Iterator.next()>
	//   12   31:checkcast       #202 <Class AnalyticsListener>
	//   13   34:aload_3         
	//   14   35:aload_1         
	//   15   36:aload_2         
	//   16   37:invokeinterface #381 <Method void AnalyticsListener.onTracksChanged(AnalyticsListener$EventTime, TrackGroupArray, TrackSelectionArray)>
	//*  17   42:goto            14
	//   18   45:return          
	}

	public final void onUpstreamDiscarded(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (generateEventTime(i, mediaperiodid)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #87  <Method AnalyticsListener$EventTime generateEventTime(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    4    6:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onUpstreamDiscarded(((AnalyticsListener.EventTime) (mediaperiodid)), medialoaddata));
	//    5    7:aload_0         
	//    6    8:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    7   11:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    8   14:astore          4
	//    9   16:aload           4
	//   10   18:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            46
	//   12   26:aload           4
	//   13   28:invokeinterface #200 <Method Object Iterator.next()>
	//   14   33:checkcast       #202 <Class AnalyticsListener>
	//   15   36:aload_2         
	//   16   37:aload_3         
	//   17   38:invokeinterface #384 <Method void AnalyticsListener.onUpstreamDiscarded(AnalyticsListener$EventTime, com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData)>
	//*  18   43:goto            16
	//   19   46:return          
	}

	public final void onVideoDecoderInitialized(String s, long l, long l1)
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore          6
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDecoderInitialized(eventtime, 2, s, l1));
	//    3    6:aload_0         
	//    4    7:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5   10:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   13:astore          7
	//    7   15:aload           7
	//    8   17:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   22:ifeq            49
	//   10   25:aload           7
	//   11   27:invokeinterface #200 <Method Object Iterator.next()>
	//   12   32:checkcast       #202 <Class AnalyticsListener>
	//   13   35:aload           6
	//   14   37:iconst_2        
	//   15   38:aload_1         
	//   16   39:lload           4
	//   17   41:invokeinterface #230 <Method void AnalyticsListener.onDecoderInitialized(AnalyticsListener$EventTime, int, String, long)>
	//*  18   46:goto            15
	//   19   49:return          
	}

	public final void onVideoDisabled(DecoderCounters decodercounters)
	{
		AnalyticsListener.EventTime eventtime = generateLastReportedPlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #234 <Method AnalyticsListener$EventTime generateLastReportedPlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDecoderDisabled(eventtime, 2, decodercounters));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            42
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iconst_2        
	//   15   33:aload_1         
	//   16   34:invokeinterface #238 <Method void AnalyticsListener.onDecoderDisabled(AnalyticsListener$EventTime, int, DecoderCounters)>
	//*  17   39:goto            13
	//   18   42:return          
	}

	public final void onVideoEnabled(DecoderCounters decodercounters)
	{
		AnalyticsListener.EventTime eventtime = generatePlayingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method AnalyticsListener$EventTime generatePlayingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDecoderEnabled(eventtime, 2, decodercounters));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            42
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iconst_2        
	//   15   33:aload_1         
	//   16   34:invokeinterface #242 <Method void AnalyticsListener.onDecoderEnabled(AnalyticsListener$EventTime, int, DecoderCounters)>
	//*  17   39:goto            13
	//   18   42:return          
	}

	public final void onVideoInputFormatChanged(Format format)
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore_2        
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onDecoderInputFormatChanged(eventtime, 2, format));
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5    9:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   12:astore_3        
	//    7   13:aload_3         
	//    8   14:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            42
	//   10   22:aload_3         
	//   11   23:invokeinterface #200 <Method Object Iterator.next()>
	//   12   28:checkcast       #202 <Class AnalyticsListener>
	//   13   31:aload_2         
	//   14   32:iconst_2        
	//   15   33:aload_1         
	//   16   34:invokeinterface #248 <Method void AnalyticsListener.onDecoderInputFormatChanged(AnalyticsListener$EventTime, int, Format)>
	//*  17   39:goto            13
	//   18   42:return          
	}

	public final void onVideoSizeChanged(int i, int j, int k, float f)
	{
		AnalyticsListener.EventTime eventtime = generateReadingMediaPeriodEventTime();
	//    0    0:aload_0         
	//    1    1:invokespecial   #226 <Method AnalyticsListener$EventTime generateReadingMediaPeriodEventTime()>
	//    2    4:astore          5
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AnalyticsListener)iterator.next()).onVideoSizeChanged(eventtime, i, j, k, f));
	//    3    6:aload_0         
	//    4    7:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    5   10:invokevirtual   #191 <Method Iterator CopyOnWriteArraySet.iterator()>
	//    6   13:astore          6
	//    7   15:aload           6
	//    8   17:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    9   22:ifeq            50
	//   10   25:aload           6
	//   11   27:invokeinterface #200 <Method Object Iterator.next()>
	//   12   32:checkcast       #202 <Class AnalyticsListener>
	//   13   35:aload           5
	//   14   37:iload_1         
	//   15   38:iload_2         
	//   16   39:iload_3         
	//   17   40:fload           4
	//   18   42:invokeinterface #393 <Method void AnalyticsListener.onVideoSizeChanged(AnalyticsListener$EventTime, int, int, int, float)>
	//*  19   47:goto            15
	//   20   50:return          
	}

	public void removeListener(AnalyticsListener analyticslistener)
	{
		listeners.remove(((Object) (analyticslistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #397 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void resetForNewMediaSource()
	{
		WindowAndMediaPeriodId windowandmediaperiodid;
		for(Iterator iterator = ((List) (new ArrayList(((java.util.Collection) (mediaPeriodQueueTracker.activeMediaPeriods))))).iterator(); iterator.hasNext(); onMediaPeriodReleased(windowandmediaperiodid.windowIndex, windowandmediaperiodid.mediaPeriodId))
	//*   0    0:new             #400 <Class ArrayList>
	//*   1    3:dup             
	//*   2    4:aload_0         
	//*   3    5:getfield        #65  <Field AnalyticsCollector$MediaPeriodQueueTracker mediaPeriodQueueTracker>
	//*   4    8:invokestatic    #404 <Method ArrayList AnalyticsCollector$MediaPeriodQueueTracker.access$000(AnalyticsCollector$MediaPeriodQueueTracker)>
	//*   5   11:invokespecial   #407 <Method void ArrayList(java.util.Collection)>
	//*   6   14:invokeinterface #410 <Method Iterator List.iterator()>
	//*   7   19:astore_1        
	//*   8   20:aload_1         
	//*   9   21:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            54
			windowandmediaperiodid = (WindowAndMediaPeriodId)iterator.next();
	//   11   29:aload_1         
	//   12   30:invokeinterface #200 <Method Object Iterator.next()>
	//   13   35:checkcast       #26  <Class AnalyticsCollector$WindowAndMediaPeriodId>
	//   14   38:astore_2        

	//   15   39:aload_0         
	//   16   40:aload_2         
	//   17   41:getfield        #91  <Field int AnalyticsCollector$WindowAndMediaPeriodId.windowIndex>
	//   18   44:aload_2         
	//   19   45:getfield        #95  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId AnalyticsCollector$WindowAndMediaPeriodId.mediaPeriodId>
	//   20   48:invokevirtual   #411 <Method void onMediaPeriodReleased(int, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//*  21   51:goto            20
	//   22   54:return          
	}

	public void setPlayer(Player player1)
	{
		boolean flag;
		if(player == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field Player player>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		Assertions.checkState(flag);
	//    8   14:iload_2         
	//    9   15:invokestatic    #416 <Method void Assertions.checkState(boolean)>
		player = (Player)Assertions.checkNotNull(((Object) (player1)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokestatic    #53  <Method Object Assertions.checkNotNull(Object)>
	//   13   23:checkcast       #76  <Class Player>
	//   14   26:putfield        #47  <Field Player player>
	//   15   29:return          
	}

	private final Clock clock;
	private final CopyOnWriteArraySet listeners = new CopyOnWriteArraySet();
	private final MediaPeriodQueueTracker mediaPeriodQueueTracker = new MediaPeriodQueueTracker();
	private Player player;
	private final com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();
}
