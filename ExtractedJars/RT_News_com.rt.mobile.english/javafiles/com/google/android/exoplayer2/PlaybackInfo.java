// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;

// Referenced classes of package com.google.android.exoplayer2:
//			Timeline

final class PlaybackInfo
{

	public PlaybackInfo(Timeline timeline1, long l, TrackGroupArray trackgrouparray, TrackSelectorResult trackselectorresult)
	{
		this(timeline1, ((Object) (null)), new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(0), l, 0x1L, 1, false, trackgrouparray, trackselectorresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:new             #28  <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:invokespecial   #31  <Method void com.google.android.exoplayer2.source.MediaSource$MediaPeriodId(int)>
	//    7   11:lload_2         
	//    8   12:ldc2w           #32  <Long 0x1L>
	//    9   15:iconst_1        
	//   10   16:iconst_0        
	//   11   17:aload           4
	//   12   19:aload           5
	//   13   21:invokespecial   #36  <Method void PlaybackInfo(Timeline, Object, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, int, boolean, TrackGroupArray, TrackSelectorResult)>
	//   14   24:return          
	}

	public PlaybackInfo(Timeline timeline1, Object obj, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l, long l1, 
			int i, boolean flag, TrackGroupArray trackgrouparray, TrackSelectorResult trackselectorresult)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		timeline = timeline1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field Timeline timeline>
		manifest = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #44  <Field Object manifest>
		periodId = mediaperiodid;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #46  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId periodId>
		startPositionUs = l;
	//   11   19:aload_0         
	//   12   20:lload           4
	//   13   22:putfield        #48  <Field long startPositionUs>
		contentPositionUs = l1;
	//   14   25:aload_0         
	//   15   26:lload           6
	//   16   28:putfield        #50  <Field long contentPositionUs>
		positionUs = l;
	//   17   31:aload_0         
	//   18   32:lload           4
	//   19   34:putfield        #52  <Field long positionUs>
		bufferedPositionUs = l;
	//   20   37:aload_0         
	//   21   38:lload           4
	//   22   40:putfield        #54  <Field long bufferedPositionUs>
		playbackState = i;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #56  <Field int playbackState>
		isLoading = flag;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #58  <Field boolean isLoading>
		trackGroups = trackgrouparray;
	//   29   55:aload_0         
	//   30   56:aload           10
	//   31   58:putfield        #60  <Field TrackGroupArray trackGroups>
		trackSelectorResult = trackselectorresult;
	//   32   61:aload_0         
	//   33   62:aload           11
	//   34   64:putfield        #62  <Field TrackSelectorResult trackSelectorResult>
	//   35   67:return          
	}

	private static void copyMutablePositions(PlaybackInfo playbackinfo, PlaybackInfo playbackinfo1)
	{
		playbackinfo1.positionUs = playbackinfo.positionUs;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #52  <Field long positionUs>
	//    3    5:putfield        #52  <Field long positionUs>
		playbackinfo1.bufferedPositionUs = playbackinfo.bufferedPositionUs;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #54  <Field long bufferedPositionUs>
	//    7   13:putfield        #54  <Field long bufferedPositionUs>
	//    8   16:return          
	}

	public PlaybackInfo copyWithIsLoading(boolean flag)
	{
		PlaybackInfo playbackinfo = new PlaybackInfo(timeline, manifest, periodId, startPositionUs, contentPositionUs, playbackState, flag, trackGroups, trackSelectorResult);
	//    0    0:new             #2   <Class PlaybackInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field Timeline timeline>
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field Object manifest>
	//    6   12:aload_0         
	//    7   13:getfield        #46  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId periodId>
	//    8   16:aload_0         
	//    9   17:getfield        #48  <Field long startPositionUs>
	//   10   20:aload_0         
	//   11   21:getfield        #50  <Field long contentPositionUs>
	//   12   24:aload_0         
	//   13   25:getfield        #56  <Field int playbackState>
	//   14   28:iload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #60  <Field TrackGroupArray trackGroups>
	//   17   33:aload_0         
	//   18   34:getfield        #62  <Field TrackSelectorResult trackSelectorResult>
	//   19   37:invokespecial   #36  <Method void PlaybackInfo(Timeline, Object, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, int, boolean, TrackGroupArray, TrackSelectorResult)>
	//   20   40:astore_2        
		copyMutablePositions(this, playbackinfo);
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokestatic    #69  <Method void copyMutablePositions(PlaybackInfo, PlaybackInfo)>
		return playbackinfo;
	//   24   46:aload_2         
	//   25   47:areturn         
	}

	public PlaybackInfo copyWithPeriodIndex(int i)
	{
		PlaybackInfo playbackinfo = new PlaybackInfo(timeline, manifest, periodId.copyWithPeriodIndex(i), startPositionUs, contentPositionUs, playbackState, isLoading, trackGroups, trackSelectorResult);
	//    0    0:new             #2   <Class PlaybackInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field Timeline timeline>
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field Object manifest>
	//    6   12:aload_0         
	//    7   13:getfield        #46  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId periodId>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #74  <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.copyWithPeriodIndex(int)>
	//   10   20:aload_0         
	//   11   21:getfield        #48  <Field long startPositionUs>
	//   12   24:aload_0         
	//   13   25:getfield        #50  <Field long contentPositionUs>
	//   14   28:aload_0         
	//   15   29:getfield        #56  <Field int playbackState>
	//   16   32:aload_0         
	//   17   33:getfield        #58  <Field boolean isLoading>
	//   18   36:aload_0         
	//   19   37:getfield        #60  <Field TrackGroupArray trackGroups>
	//   20   40:aload_0         
	//   21   41:getfield        #62  <Field TrackSelectorResult trackSelectorResult>
	//   22   44:invokespecial   #36  <Method void PlaybackInfo(Timeline, Object, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, int, boolean, TrackGroupArray, TrackSelectorResult)>
	//   23   47:astore_2        
		copyMutablePositions(this, playbackinfo);
	//   24   48:aload_0         
	//   25   49:aload_2         
	//   26   50:invokestatic    #69  <Method void copyMutablePositions(PlaybackInfo, PlaybackInfo)>
		return playbackinfo;
	//   27   53:aload_2         
	//   28   54:areturn         
	}

	public PlaybackInfo copyWithPlaybackState(int i)
	{
		PlaybackInfo playbackinfo = new PlaybackInfo(timeline, manifest, periodId, startPositionUs, contentPositionUs, i, isLoading, trackGroups, trackSelectorResult);
	//    0    0:new             #2   <Class PlaybackInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field Timeline timeline>
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field Object manifest>
	//    6   12:aload_0         
	//    7   13:getfield        #46  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId periodId>
	//    8   16:aload_0         
	//    9   17:getfield        #48  <Field long startPositionUs>
	//   10   20:aload_0         
	//   11   21:getfield        #50  <Field long contentPositionUs>
	//   12   24:iload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #58  <Field boolean isLoading>
	//   15   29:aload_0         
	//   16   30:getfield        #60  <Field TrackGroupArray trackGroups>
	//   17   33:aload_0         
	//   18   34:getfield        #62  <Field TrackSelectorResult trackSelectorResult>
	//   19   37:invokespecial   #36  <Method void PlaybackInfo(Timeline, Object, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, int, boolean, TrackGroupArray, TrackSelectorResult)>
	//   20   40:astore_2        
		copyMutablePositions(this, playbackinfo);
	//   21   41:aload_0         
	//   22   42:aload_2         
	//   23   43:invokestatic    #69  <Method void copyMutablePositions(PlaybackInfo, PlaybackInfo)>
		return playbackinfo;
	//   24   46:aload_2         
	//   25   47:areturn         
	}

	public PlaybackInfo copyWithTimeline(Timeline timeline1, Object obj)
	{
		timeline1 = ((Timeline) (new PlaybackInfo(timeline1, obj, periodId, startPositionUs, contentPositionUs, playbackState, isLoading, trackGroups, trackSelectorResult)));
	//    0    0:new             #2   <Class PlaybackInfo>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId periodId>
	//    6   10:aload_0         
	//    7   11:getfield        #48  <Field long startPositionUs>
	//    8   14:aload_0         
	//    9   15:getfield        #50  <Field long contentPositionUs>
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field int playbackState>
	//   12   22:aload_0         
	//   13   23:getfield        #58  <Field boolean isLoading>
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field TrackGroupArray trackGroups>
	//   16   30:aload_0         
	//   17   31:getfield        #62  <Field TrackSelectorResult trackSelectorResult>
	//   18   34:invokespecial   #36  <Method void PlaybackInfo(Timeline, Object, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, int, boolean, TrackGroupArray, TrackSelectorResult)>
	//   19   37:astore_1        
		copyMutablePositions(this, ((PlaybackInfo) (timeline1)));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokestatic    #69  <Method void copyMutablePositions(PlaybackInfo, PlaybackInfo)>
		return ((PlaybackInfo) (timeline1));
	//   23   43:aload_1         
	//   24   44:areturn         
	}

	public PlaybackInfo copyWithTrackInfo(TrackGroupArray trackgrouparray, TrackSelectorResult trackselectorresult)
	{
		trackgrouparray = ((TrackGroupArray) (new PlaybackInfo(timeline, manifest, periodId, startPositionUs, contentPositionUs, playbackState, isLoading, trackgrouparray, trackselectorresult)));
	//    0    0:new             #2   <Class PlaybackInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field Timeline timeline>
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field Object manifest>
	//    6   12:aload_0         
	//    7   13:getfield        #46  <Field com.google.android.exoplayer2.source.MediaSource$MediaPeriodId periodId>
	//    8   16:aload_0         
	//    9   17:getfield        #48  <Field long startPositionUs>
	//   10   20:aload_0         
	//   11   21:getfield        #50  <Field long contentPositionUs>
	//   12   24:aload_0         
	//   13   25:getfield        #56  <Field int playbackState>
	//   14   28:aload_0         
	//   15   29:getfield        #58  <Field boolean isLoading>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #36  <Method void PlaybackInfo(Timeline, Object, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, int, boolean, TrackGroupArray, TrackSelectorResult)>
	//   19   37:astore_1        
		copyMutablePositions(this, ((PlaybackInfo) (trackgrouparray)));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokestatic    #69  <Method void copyMutablePositions(PlaybackInfo, PlaybackInfo)>
		return ((PlaybackInfo) (trackgrouparray));
	//   23   43:aload_1         
	//   24   44:areturn         
	}

	public PlaybackInfo fromNewPosition(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, long l, long l1)
	{
		Timeline timeline1 = timeline;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Timeline timeline>
	//    2    4:astore          6
		Object obj = manifest;
	//    3    6:aload_0         
	//    4    7:getfield        #44  <Field Object manifest>
	//    5   10:astore          7
		if(!mediaperiodid.isAd())
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #85  <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*   8   16:ifeq            22
	//*   9   19:goto            27
			l1 = 0x1L;
	//   10   22:ldc2w           #32  <Long 0x1L>
	//   11   25:lstore          4
		return new PlaybackInfo(timeline1, obj, mediaperiodid, l, l1, playbackState, isLoading, trackGroups, trackSelectorResult);
	//   12   27:new             #2   <Class PlaybackInfo>
	//   13   30:dup             
	//   14   31:aload           6
	//   15   33:aload           7
	//   16   35:aload_1         
	//   17   36:lload_2         
	//   18   37:lload           4
	//   19   39:aload_0         
	//   20   40:getfield        #56  <Field int playbackState>
	//   21   43:aload_0         
	//   22   44:getfield        #58  <Field boolean isLoading>
	//   23   47:aload_0         
	//   24   48:getfield        #60  <Field TrackGroupArray trackGroups>
	//   25   51:aload_0         
	//   26   52:getfield        #62  <Field TrackSelectorResult trackSelectorResult>
	//   27   55:invokespecial   #36  <Method void PlaybackInfo(Timeline, Object, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, long, long, int, boolean, TrackGroupArray, TrackSelectorResult)>
	//   28   58:areturn         
	}

	public volatile long bufferedPositionUs;
	public final long contentPositionUs;
	public final boolean isLoading;
	public final Object manifest;
	public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId periodId;
	public final int playbackState;
	public volatile long positionUs;
	public final long startPositionUs;
	public final Timeline timeline;
	public final TrackGroupArray trackGroups;
	public final TrackSelectorResult trackSelectorResult;
}
