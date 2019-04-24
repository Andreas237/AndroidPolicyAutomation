// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source:
//			BaseMediaSource, MediaSource, MediaSourceEventListener

public abstract class CompositeMediaSource extends BaseMediaSource
{
	private final class ForwardingEventListener
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

		public ForwardingEventListener(Object obj)
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

	private static final class MediaSourceAndListener
	{

		public final MediaSourceEventListener eventListener;
		public final MediaSource.SourceInfoRefreshListener listener;
		public final MediaSource mediaSource;

		public MediaSourceAndListener(MediaSource mediasource, MediaSource.SourceInfoRefreshListener sourceinforefreshlistener, MediaSourceEventListener mediasourceeventlistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			mediaSource = mediasource;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field MediaSource mediaSource>
			listener = sourceinforefreshlistener;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field MediaSource$SourceInfoRefreshListener listener>
			eventListener = mediasourceeventlistener;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field MediaSourceEventListener eventListener>
		//   11   19:return          
		}
	}


	protected CompositeMediaSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BaseMediaSource()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void HashMap()>
	//    6   12:putfield        #29  <Field HashMap childSources>
	//    7   15:return          
	}

	protected MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Object obj, MediaSource.MediaPeriodId mediaperiodid)
	{
		return mediaperiodid;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	protected long getMediaTimeForChildMediaTime(Object obj, long l)
	{
		return l;
	//    0    0:lload_2         
	//    1    1:lreturn         
	}

	protected int getWindowIndexForChildWindowIndex(Object obj, int i)
	{
		return i;
	//    0    0:iload_2         
	//    1    1:ireturn         
	}

	public void maybeThrowSourceInfoRefreshError()
		throws IOException
	{
		for(Iterator iterator = childSources.values().iterator(); iterator.hasNext(); ((MediaSourceAndListener)iterator.next()).mediaSource.maybeThrowSourceInfoRefreshError());
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field HashMap childSources>
	//    2    4:invokevirtual   #51  <Method Collection HashMap.values()>
	//    3    7:invokeinterface #57  <Method Iterator Collection.iterator()>
	//    4   12:astore_1        
	//    5   13:aload_1         
	//    6   14:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//    7   19:ifeq            42
	//    8   22:aload_1         
	//    9   23:invokeinterface #67  <Method Object Iterator.next()>
	//   10   28:checkcast       #12  <Class CompositeMediaSource$MediaSourceAndListener>
	//   11   31:getfield        #71  <Field MediaSource CompositeMediaSource$MediaSourceAndListener.mediaSource>
	//   12   34:invokeinterface #75  <Method void MediaSource.maybeThrowSourceInfoRefreshError()>
	//*  13   39:goto            13
	//   14   42:return          
	}

	protected abstract void onChildSourceInfoRefreshed(Object obj, MediaSource mediasource, Timeline timeline, Object obj1);

	protected final void prepareChildSource(final Object id, MediaSource mediasource)
	{
		Assertions.checkArgument(childSources.containsKey(id) ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field HashMap childSources>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method boolean HashMap.containsKey(Object)>
	//    4    8:iconst_1        
	//    5    9:ixor            
	//    6   10:invokestatic    #90  <Method void Assertions.checkArgument(boolean)>
		MediaSource.SourceInfoRefreshListener sourceinforefreshlistener = new MediaSource.SourceInfoRefreshListener() {

			public void onSourceInfoRefreshed(MediaSource mediasource1, Timeline timeline, Object obj)
			{
				onChildSourceInfoRefreshed(id, mediasource1, timeline, obj);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field CompositeMediaSource this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field Object val$id>
			//    4    8:aload_1         
			//    5    9:aload_2         
			//    6   10:aload_3         
			//    7   11:invokevirtual   #32  <Method void CompositeMediaSource.onChildSourceInfoRefreshed(Object, MediaSource, Timeline, Object)>
			//    8   14:return          
			}

			final CompositeMediaSource this$0;
			final Object val$id;

			
			{
				this$0 = CompositeMediaSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CompositeMediaSource this$0>
				id = obj;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Object val$id>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    7   13:new             #7   <Class CompositeMediaSource$1>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #93  <Method void CompositeMediaSource$1(CompositeMediaSource, Object)>
	//   12   22:astore_3        
		ForwardingEventListener forwardingeventlistener = new ForwardingEventListener(id);
	//   13   23:new             #9   <Class CompositeMediaSource$ForwardingEventListener>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #94  <Method void CompositeMediaSource$ForwardingEventListener(CompositeMediaSource, Object)>
	//   18   32:astore          4
		childSources.put(id, ((Object) (new MediaSourceAndListener(mediasource, sourceinforefreshlistener, ((MediaSourceEventListener) (forwardingeventlistener))))));
	//   19   34:aload_0         
	//   20   35:getfield        #29  <Field HashMap childSources>
	//   21   38:aload_1         
	//   22   39:new             #12  <Class CompositeMediaSource$MediaSourceAndListener>
	//   23   42:dup             
	//   24   43:aload_2         
	//   25   44:aload_3         
	//   26   45:aload           4
	//   27   47:invokespecial   #97  <Method void CompositeMediaSource$MediaSourceAndListener(MediaSource, MediaSource$SourceInfoRefreshListener, MediaSourceEventListener)>
	//   28   50:invokevirtual   #101 <Method Object HashMap.put(Object, Object)>
	//   29   53:pop             
		mediasource.addEventListener(eventHandler, ((MediaSourceEventListener) (forwardingeventlistener)));
	//   30   54:aload_2         
	//   31   55:aload_0         
	//   32   56:getfield        #103 <Field Handler eventHandler>
	//   33   59:aload           4
	//   34   61:invokeinterface #107 <Method void MediaSource.addEventListener(Handler, MediaSourceEventListener)>
		mediasource.prepareSource(player, false, sourceinforefreshlistener);
	//   35   66:aload_2         
	//   36   67:aload_0         
	//   37   68:getfield        #109 <Field ExoPlayer player>
	//   38   71:iconst_0        
	//   39   72:aload_3         
	//   40   73:invokeinterface #113 <Method void MediaSource.prepareSource(ExoPlayer, boolean, MediaSource$SourceInfoRefreshListener)>
	//   41   78:return          
	}

	public void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		player = exoplayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field ExoPlayer player>
		eventHandler = new Handler();
	//    3    5:aload_0         
	//    4    6:new             #118 <Class Handler>
	//    5    9:dup             
	//    6   10:invokespecial   #119 <Method void Handler()>
	//    7   13:putfield        #103 <Field Handler eventHandler>
	//    8   16:return          
	}

	protected final void releaseChildSource(Object obj)
	{
		obj = ((Object) ((MediaSourceAndListener)childSources.remove(obj)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field HashMap childSources>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #125 <Method Object HashMap.remove(Object)>
	//    4    8:checkcast       #12  <Class CompositeMediaSource$MediaSourceAndListener>
	//    5   11:astore_1        
		((MediaSourceAndListener) (obj)).mediaSource.releaseSource(((MediaSourceAndListener) (obj)).listener);
	//    6   12:aload_1         
	//    7   13:getfield        #71  <Field MediaSource CompositeMediaSource$MediaSourceAndListener.mediaSource>
	//    8   16:aload_1         
	//    9   17:getfield        #129 <Field MediaSource$SourceInfoRefreshListener CompositeMediaSource$MediaSourceAndListener.listener>
	//   10   20:invokeinterface #133 <Method void MediaSource.releaseSource(MediaSource$SourceInfoRefreshListener)>
		((MediaSourceAndListener) (obj)).mediaSource.removeEventListener(((MediaSourceAndListener) (obj)).eventListener);
	//   11   25:aload_1         
	//   12   26:getfield        #71  <Field MediaSource CompositeMediaSource$MediaSourceAndListener.mediaSource>
	//   13   29:aload_1         
	//   14   30:getfield        #137 <Field MediaSourceEventListener CompositeMediaSource$MediaSourceAndListener.eventListener>
	//   15   33:invokeinterface #141 <Method void MediaSource.removeEventListener(MediaSourceEventListener)>
	//   16   38:return          
	}

	public void releaseSourceInternal()
	{
		MediaSourceAndListener mediasourceandlistener;
		for(Iterator iterator = childSources.values().iterator(); iterator.hasNext(); mediasourceandlistener.mediaSource.removeEventListener(mediasourceandlistener.eventListener))
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field HashMap childSources>
	//*   2    4:invokevirtual   #51  <Method Collection HashMap.values()>
	//*   3    7:invokeinterface #57  <Method Iterator Collection.iterator()>
	//*   4   12:astore_1        
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #63  <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            61
		{
			mediasourceandlistener = (MediaSourceAndListener)iterator.next();
	//    8   22:aload_1         
	//    9   23:invokeinterface #67  <Method Object Iterator.next()>
	//   10   28:checkcast       #12  <Class CompositeMediaSource$MediaSourceAndListener>
	//   11   31:astore_2        
			mediasourceandlistener.mediaSource.releaseSource(mediasourceandlistener.listener);
	//   12   32:aload_2         
	//   13   33:getfield        #71  <Field MediaSource CompositeMediaSource$MediaSourceAndListener.mediaSource>
	//   14   36:aload_2         
	//   15   37:getfield        #129 <Field MediaSource$SourceInfoRefreshListener CompositeMediaSource$MediaSourceAndListener.listener>
	//   16   40:invokeinterface #133 <Method void MediaSource.releaseSource(MediaSource$SourceInfoRefreshListener)>
		}

	//   17   45:aload_2         
	//   18   46:getfield        #71  <Field MediaSource CompositeMediaSource$MediaSourceAndListener.mediaSource>
	//   19   49:aload_2         
	//   20   50:getfield        #137 <Field MediaSourceEventListener CompositeMediaSource$MediaSourceAndListener.eventListener>
	//   21   53:invokeinterface #141 <Method void MediaSource.removeEventListener(MediaSourceEventListener)>
	//*  22   58:goto            13
		childSources.clear();
	//   23   61:aload_0         
	//   24   62:getfield        #29  <Field HashMap childSources>
	//   25   65:invokevirtual   #146 <Method void HashMap.clear()>
		player = null;
	//   26   68:aload_0         
	//   27   69:aconst_null     
	//   28   70:putfield        #109 <Field ExoPlayer player>
	//   29   73:return          
	}

	private final HashMap childSources = new HashMap();
	private Handler eventHandler;
	private ExoPlayer player;
}
