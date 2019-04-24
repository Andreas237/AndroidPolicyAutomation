// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			MediaSourceEventListener, CompositeMediaSource

private final class CompositeMediaSource$ForwardingEventListener
	implements MediaSourceEventListener
{

	private boolean maybeUpdateEventDispatcher(int i, MediaSource.MediaPeriodId mediaperiodid)
	{
		if(mediaperiodid != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          25
		{
			MediaSource.MediaPeriodId mediaperiodid1 = getMediaPeriodIdForChildMediaPeriodId(id, mediaperiodid);
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field CompositeMediaSource this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field Object id>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #42  <Method MediaSource$MediaPeriodId CompositeMediaSource.getMediaPeriodIdForChildMediaPeriodId(Object, MediaSource$MediaPeriodId)>
	//    8   16:astore_3        
			mediaperiodid = mediaperiodid1;
	//    9   17:aload_3         
	//   10   18:astore_2        
			if(mediaperiodid1 == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       27
				return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
		} else
		{
			mediaperiodid = null;
	//   15   25:aconst_null     
	//   16   26:astore_2        
		}
		i = getWindowIndexForChildWindowIndex(id, i);
	//   17   27:aload_0         
	//   18   28:getfield        #21  <Field CompositeMediaSource this$0>
	//   19   31:aload_0         
	//   20   32:getfield        #32  <Field Object id>
	//   21   35:iload_1         
	//   22   36:invokevirtual   #46  <Method int CompositeMediaSource.getWindowIndexForChildWindowIndex(Object, int)>
	//   23   39:istore_1        
		if(eventDispatcher.windowIndex != i || !Util.areEqual(((Object) (eventDispatcher.mediaPeriodId)), ((Object) (mediaperiodid))))
	//*  24   40:aload_0         
	//*  25   41:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//*  26   44:getfield        #52  <Field int MediaSourceEventListener$EventDispatcher.windowIndex>
	//*  27   47:iload_1         
	//*  28   48:icmpne          65
	//*  29   51:aload_0         
	//*  30   52:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//*  31   55:getfield        #56  <Field MediaSource$MediaPeriodId MediaSourceEventListener$EventDispatcher.mediaPeriodId>
	//*  32   58:aload_2         
	//*  33   59:invokestatic    #62  <Method boolean Util.areEqual(Object, Object)>
	//*  34   62:ifne            79
			eventDispatcher = createEventDispatcher(i, mediaperiodid, 0L);
	//   35   65:aload_0         
	//   36   66:aload_0         
	//   37   67:getfield        #21  <Field CompositeMediaSource this$0>
	//   38   70:iload_1         
	//   39   71:aload_2         
	//   40   72:lconst_0        
	//   41   73:invokevirtual   #65  <Method MediaSourceEventListener$EventDispatcher CompositeMediaSource.createEventDispatcher(int, MediaSource$MediaPeriodId, long)>
	//   42   76:putfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
		return true;
	//   43   79:iconst_1        
	//   44   80:ireturn         
	}

	private MediaSourceEventListener.MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		long l = getMediaTimeForChildMediaTime(id, medialoaddata.mediaStartTimeMs);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field CompositeMediaSource this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field Object id>
	//    4    8:aload_1         
	//    5    9:getfield        #73  <Field long MediaSourceEventListener$MediaLoadData.mediaStartTimeMs>
	//    6   12:invokevirtual   #77  <Method long CompositeMediaSource.getMediaTimeForChildMediaTime(Object, long)>
	//    7   15:lstore_2        
		long l1 = getMediaTimeForChildMediaTime(id, medialoaddata.mediaEndTimeMs);
	//    8   16:aload_0         
	//    9   17:getfield        #21  <Field CompositeMediaSource this$0>
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field Object id>
	//   12   24:aload_1         
	//   13   25:getfield        #80  <Field long MediaSourceEventListener$MediaLoadData.mediaEndTimeMs>
	//   14   28:invokevirtual   #77  <Method long CompositeMediaSource.getMediaTimeForChildMediaTime(Object, long)>
	//   15   31:lstore          4
		if(l == medialoaddata.mediaStartTimeMs && l1 == medialoaddata.mediaEndTimeMs)
	//*  16   33:lload_2         
	//*  17   34:aload_1         
	//*  18   35:getfield        #73  <Field long MediaSourceEventListener$MediaLoadData.mediaStartTimeMs>
	//*  19   38:lcmp            
	//*  20   39:ifne            54
	//*  21   42:lload           4
	//*  22   44:aload_1         
	//*  23   45:getfield        #80  <Field long MediaSourceEventListener$MediaLoadData.mediaEndTimeMs>
	//*  24   48:lcmp            
	//*  25   49:ifne            54
			return medialoaddata;
	//   26   52:aload_1         
	//   27   53:areturn         
		else
			return new MediaSourceEventListener.MediaLoadData(medialoaddata.dataType, medialoaddata.trackType, medialoaddata.trackFormat, medialoaddata.trackSelectionReason, medialoaddata.trackSelectionData, l, l1);
	//   28   54:new             #69  <Class MediaSourceEventListener$MediaLoadData>
	//   29   57:dup             
	//   30   58:aload_1         
	//   31   59:getfield        #83  <Field int MediaSourceEventListener$MediaLoadData.dataType>
	//   32   62:aload_1         
	//   33   63:getfield        #86  <Field int MediaSourceEventListener$MediaLoadData.trackType>
	//   34   66:aload_1         
	//   35   67:getfield        #90  <Field com.google.android.exoplayer2.Format MediaSourceEventListener$MediaLoadData.trackFormat>
	//   36   70:aload_1         
	//   37   71:getfield        #93  <Field int MediaSourceEventListener$MediaLoadData.trackSelectionReason>
	//   38   74:aload_1         
	//   39   75:getfield        #96  <Field Object MediaSourceEventListener$MediaLoadData.trackSelectionData>
	//   40   78:lload_2         
	//   41   79:lload           4
	//   42   81:invokespecial   #99  <Method void MediaSourceEventListener$MediaLoadData(int, int, com.google.android.exoplayer2.Format, int, Object, long, long)>
	//   43   84:areturn         
	}

	public void onDownstreamFormatChanged(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		if(maybeUpdateEventDispatcher(i, mediaperiodid))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #103 <Method boolean maybeUpdateEventDispatcher(int, MediaSource$MediaPeriodId)>
	//*   4    6:ifeq            21
			eventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(medialoaddata));
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:invokespecial   #105 <Method MediaSourceEventListener$MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener$MediaLoadData)>
	//   10   18:invokevirtual   #109 <Method void MediaSourceEventListener$EventDispatcher.downstreamFormatChanged(MediaSourceEventListener$MediaLoadData)>
	//   11   21:return          
	}

	public void onLoadCanceled(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		if(maybeUpdateEventDispatcher(i, mediaperiodid))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #103 <Method boolean maybeUpdateEventDispatcher(int, MediaSource$MediaPeriodId)>
	//*   4    6:ifeq            23
			eventDispatcher.loadCanceled(loadeventinfo, maybeUpdateMediaLoadData(medialoaddata));
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:invokespecial   #105 <Method MediaSourceEventListener$MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener$MediaLoadData)>
	//   11   20:invokevirtual   #115 <Method void MediaSourceEventListener$EventDispatcher.loadCanceled(MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   12   23:return          
	}

	public void onLoadCompleted(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		if(maybeUpdateEventDispatcher(i, mediaperiodid))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #103 <Method boolean maybeUpdateEventDispatcher(int, MediaSource$MediaPeriodId)>
	//*   4    6:ifeq            23
			eventDispatcher.loadCompleted(loadeventinfo, maybeUpdateMediaLoadData(medialoaddata));
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:invokespecial   #105 <Method MediaSourceEventListener$MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener$MediaLoadData)>
	//   11   20:invokevirtual   #119 <Method void MediaSourceEventListener$EventDispatcher.loadCompleted(MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   12   23:return          
	}

	public void onLoadError(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag)
	{
		if(maybeUpdateEventDispatcher(i, mediaperiodid))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #103 <Method boolean maybeUpdateEventDispatcher(int, MediaSource$MediaPeriodId)>
	//*   4    6:ifeq            27
			eventDispatcher.loadError(loadeventinfo, maybeUpdateMediaLoadData(medialoaddata), ioexception, flag);
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:invokespecial   #105 <Method MediaSourceEventListener$MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener$MediaLoadData)>
	//   11   20:aload           5
	//   12   22:iload           6
	//   13   24:invokevirtual   #125 <Method void MediaSourceEventListener$EventDispatcher.loadError(MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData, IOException, boolean)>
	//   14   27:return          
	}

	public void onLoadStarted(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		if(maybeUpdateEventDispatcher(i, mediaperiodid))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #103 <Method boolean maybeUpdateEventDispatcher(int, MediaSource$MediaPeriodId)>
	//*   4    6:ifeq            23
			eventDispatcher.loadStarted(loadeventinfo, maybeUpdateMediaLoadData(medialoaddata));
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:invokespecial   #105 <Method MediaSourceEventListener$MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener$MediaLoadData)>
	//   11   20:invokevirtual   #129 <Method void MediaSourceEventListener$EventDispatcher.loadStarted(MediaSourceEventListener$LoadEventInfo, MediaSourceEventListener$MediaLoadData)>
	//   12   23:return          
	}

	public void onMediaPeriodCreated(int i, MediaSource.MediaPeriodId mediaperiodid)
	{
		if(maybeUpdateEventDispatcher(i, mediaperiodid))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #103 <Method boolean maybeUpdateEventDispatcher(int, MediaSource$MediaPeriodId)>
	//*   4    6:ifeq            16
			eventDispatcher.mediaPeriodCreated();
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    7   13:invokevirtual   #134 <Method void MediaSourceEventListener$EventDispatcher.mediaPeriodCreated()>
	//    8   16:return          
	}

	public void onMediaPeriodReleased(int i, MediaSource.MediaPeriodId mediaperiodid)
	{
		if(maybeUpdateEventDispatcher(i, mediaperiodid))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #103 <Method boolean maybeUpdateEventDispatcher(int, MediaSource$MediaPeriodId)>
	//*   4    6:ifeq            16
			eventDispatcher.mediaPeriodReleased();
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    7   13:invokevirtual   #138 <Method void MediaSourceEventListener$EventDispatcher.mediaPeriodReleased()>
	//    8   16:return          
	}

	public void onReadingStarted(int i, MediaSource.MediaPeriodId mediaperiodid)
	{
		if(maybeUpdateEventDispatcher(i, mediaperiodid))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #103 <Method boolean maybeUpdateEventDispatcher(int, MediaSource$MediaPeriodId)>
	//*   4    6:ifeq            16
			eventDispatcher.readingStarted();
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    7   13:invokevirtual   #142 <Method void MediaSourceEventListener$EventDispatcher.readingStarted()>
	//    8   16:return          
	}

	public void onUpstreamDiscarded(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.MediaLoadData medialoaddata)
	{
		if(maybeUpdateEventDispatcher(i, mediaperiodid))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #103 <Method boolean maybeUpdateEventDispatcher(int, MediaSource$MediaPeriodId)>
	//*   4    6:ifeq            21
			eventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(medialoaddata));
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:invokespecial   #105 <Method MediaSourceEventListener$MediaLoadData maybeUpdateMediaLoadData(MediaSourceEventListener$MediaLoadData)>
	//   10   18:invokevirtual   #146 <Method void MediaSourceEventListener$EventDispatcher.upstreamDiscarded(MediaSourceEventListener$MediaLoadData)>
	//   11   21:return          
	}

	private MediaSourceEventListener.EventDispatcher eventDispatcher;
	private final Object id;
	final CompositeMediaSource this$0;

	public CompositeMediaSource$ForwardingEventListener(Object obj)
	{
		this$0 = CompositeMediaSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field CompositeMediaSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		eventDispatcher = createEventDispatcher(((MediaSource.MediaPeriodId) (null)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #28  <Method MediaSourceEventListener$EventDispatcher CompositeMediaSource.createEventDispatcher(MediaSource$MediaPeriodId)>
	//    9   15:putfield        #30  <Field MediaSourceEventListener$EventDispatcher eventDispatcher>
		id = obj;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #32  <Field Object id>
	//   13   23:return          
	}
}
