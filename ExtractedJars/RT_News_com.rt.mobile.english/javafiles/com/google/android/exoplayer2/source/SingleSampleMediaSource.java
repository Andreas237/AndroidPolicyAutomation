// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			BaseMediaSource, SinglePeriodTimeline, SingleSampleMediaPeriod, MediaPeriod, 
//			DefaultMediaSourceEventListener, MediaSourceEventListener

public final class SingleSampleMediaSource extends BaseMediaSource
{
	public static interface EventListener
	{

		public abstract void onLoadError(int i, IOException ioexception);
	}

	private static final class EventListenerWrapper extends DefaultMediaSourceEventListener
	{

		public void onLoadError(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag)
		{
			eventListener.onLoadError(eventSourceId, ioexception);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field SingleSampleMediaSource$EventListener eventListener>
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field int eventSourceId>
		//    4    8:aload           5
		//    5   10:invokeinterface #35  <Method void SingleSampleMediaSource$EventListener.onLoadError(int, IOException)>
		//    6   15:return          
		}

		private final EventListener eventListener;
		private final int eventSourceId;

		public EventListenerWrapper(EventListener eventlistener, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void DefaultMediaSourceEventListener()>
			eventListener = (EventListener)Assertions.checkNotNull(((Object) (eventlistener)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #22  <Method Object Assertions.checkNotNull(Object)>
		//    5    9:checkcast       #24  <Class SingleSampleMediaSource$EventListener>
		//    6   12:putfield        #26  <Field SingleSampleMediaSource$EventListener eventListener>
			eventSourceId = i;
		//    7   15:aload_0         
		//    8   16:iload_2         
		//    9   17:putfield        #28  <Field int eventSourceId>
		//   10   20:return          
		}
	}

	public static final class Factory
	{

		public SingleSampleMediaSource createMediaSource(Uri uri, Format format1, long l)
		{
			isCreateCalled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #39  <Field boolean isCreateCalled>
			return new SingleSampleMediaSource(uri, dataSourceFactory, format1, l, minLoadableRetryCount, treatLoadErrorsAsEndOfStream, tag);
		//    3    5:new             #6   <Class SingleSampleMediaSource>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #32  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
		//    8   14:aload_2         
		//    9   15:lload_3         
		//   10   16:aload_0         
		//   11   17:getfield        #34  <Field int minLoadableRetryCount>
		//   12   20:aload_0         
		//   13   21:getfield        #41  <Field boolean treatLoadErrorsAsEndOfStream>
		//   14   24:aload_0         
		//   15   25:getfield        #43  <Field Object tag>
		//   16   28:aconst_null     
		//   17   29:invokespecial   #46  <Method void SingleSampleMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, Format, long, int, boolean, Object, SingleSampleMediaSource$1)>
		//   18   32:areturn         
		}

		public SingleSampleMediaSource createMediaSource(Uri uri, Format format1, long l, Handler handler, MediaSourceEventListener mediasourceeventlistener)
		{
			uri = ((Uri) (createMediaSource(uri, format1, l)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:lload_3         
		//    4    4:invokevirtual   #50  <Method SingleSampleMediaSource createMediaSource(Uri, Format, long)>
		//    5    7:astore_1        
			if(handler != null && mediasourceeventlistener != null)
		//*   6    8:aload           5
		//*   7   10:ifnull          26
		//*   8   13:aload           6
		//*   9   15:ifnull          26
				((SingleSampleMediaSource) (uri)).addEventListener(handler, mediasourceeventlistener);
		//   10   18:aload_1         
		//   11   19:aload           5
		//   12   21:aload           6
		//   13   23:invokevirtual   #54  <Method void SingleSampleMediaSource.addEventListener(Handler, MediaSourceEventListener)>
			return ((SingleSampleMediaSource) (uri));
		//   14   26:aload_1         
		//   15   27:areturn         
		}

		public Factory setMinLoadableRetryCount(int i)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #62  <Method void Assertions.checkState(boolean)>
			minLoadableRetryCount = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #34  <Field int minLoadableRetryCount>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setTag(Object obj)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #62  <Method void Assertions.checkState(boolean)>
			tag = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #43  <Field Object tag>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setTreatLoadErrorsAsEndOfStream(boolean flag)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #62  <Method void Assertions.checkState(boolean)>
			treatLoadErrorsAsEndOfStream = flag;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #41  <Field boolean treatLoadErrorsAsEndOfStream>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
		private boolean isCreateCalled;
		private int minLoadableRetryCount;
		private Object tag;
		private boolean treatLoadErrorsAsEndOfStream;

		public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			dataSourceFactory = (com.google.android.exoplayer2.upstream.DataSource.Factory)Assertions.checkNotNull(((Object) (factory)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #28  <Method Object Assertions.checkNotNull(Object)>
		//    5    9:checkcast       #30  <Class com.google.android.exoplayer2.upstream.DataSource$Factory>
		//    6   12:putfield        #32  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
			minLoadableRetryCount = 3;
		//    7   15:aload_0         
		//    8   16:iconst_3        
		//    9   17:putfield        #34  <Field int minLoadableRetryCount>
		//   10   20:return          
		}
	}


	public SingleSampleMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format1, long l)
	{
		this(uri, factory, format1, l, 3);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:lload           4
	//    5    6:iconst_3        
	//    6    7:invokespecial   #37  <Method void SingleSampleMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, Format, long, int)>
	//    7   10:return          
	}

	public SingleSampleMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format1, long l, int i)
	{
		this(uri, factory, format1, l, i, false, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:lload           4
	//    5    6:iload           6
	//    6    8:iconst_0        
	//    7    9:aconst_null     
	//    8   10:invokespecial   #42  <Method void SingleSampleMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, Format, long, int, boolean, Object)>
	//    9   13:return          
	}

	public SingleSampleMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format1, long l, int i, Handler handler, 
			EventListener eventlistener, int j, boolean flag)
	{
		this(uri, factory, format1, l, i, flag, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:lload           4
	//    5    6:iload           6
	//    6    8:iload           10
	//    7   10:aconst_null     
	//    8   11:invokespecial   #42  <Method void SingleSampleMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, Format, long, int, boolean, Object)>
		if(handler != null && eventlistener != null)
	//*   9   14:aload           7
	//*  10   16:ifnull          42
	//*  11   19:aload           8
	//*  12   21:ifnull          42
		{
			addEventListener(handler, ((MediaSourceEventListener) (new EventListenerWrapper(eventlistener, j))));
	//   13   24:aload_0         
	//   14   25:aload           7
	//   15   27:new             #11  <Class SingleSampleMediaSource$EventListenerWrapper>
	//   16   30:dup             
	//   17   31:aload           8
	//   18   33:iload           9
	//   19   35:invokespecial   #46  <Method void SingleSampleMediaSource$EventListenerWrapper(SingleSampleMediaSource$EventListener, int)>
	//   20   38:invokevirtual   #50  <Method void addEventListener(Handler, MediaSourceEventListener)>
			return;
	//   21   41:return          
		} else
		{
			return;
	//   22   42:return          
		}
	}

	private SingleSampleMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format1, long l, int i, boolean flag, 
			Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void BaseMediaSource()>
		dataSourceFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #56  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
		format = format1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #58  <Field Format format>
		durationUs = l;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #60  <Field long durationUs>
		minLoadableRetryCount = i;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #62  <Field int minLoadableRetryCount>
		treatLoadErrorsAsEndOfStream = flag;
	//   14   26:aload_0         
	//   15   27:iload           7
	//   16   29:putfield        #64  <Field boolean treatLoadErrorsAsEndOfStream>
		dataSpec = new DataSpec(uri);
	//   17   32:aload_0         
	//   18   33:new             #66  <Class DataSpec>
	//   19   36:dup             
	//   20   37:aload_1         
	//   21   38:invokespecial   #69  <Method void DataSpec(Uri)>
	//   22   41:putfield        #71  <Field DataSpec dataSpec>
		timeline = ((Timeline) (new SinglePeriodTimeline(l, true, false, obj)));
	//   23   44:aload_0         
	//   24   45:new             #73  <Class SinglePeriodTimeline>
	//   25   48:dup             
	//   26   49:lload           4
	//   27   51:iconst_1        
	//   28   52:iconst_0        
	//   29   53:aload           8
	//   30   55:invokespecial   #76  <Method void SinglePeriodTimeline(long, boolean, boolean, Object)>
	//   31   58:putfield        #78  <Field Timeline timeline>
	//   32   61:return          
	}

	SingleSampleMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Format format1, long l, int i, boolean flag, 
			Object obj, _cls1 _pcls1)
	{
		this(uri, factory, format1, l, i, flag, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:lload           4
	//    5    6:iload           6
	//    6    8:iload           7
	//    7   10:aload           8
	//    8   12:invokespecial   #42  <Method void SingleSampleMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, Format, long, int, boolean, Object)>
	//    9   15:return          
	}

	public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		boolean flag;
		if(mediaperiodid.periodIndex == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #87  <Field int MediaSource$MediaPeriodId.periodIndex>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		Assertions.checkArgument(flag);
	//    8   14:iload_3         
	//    9   15:invokestatic    #93  <Method void Assertions.checkArgument(boolean)>
		return ((MediaPeriod) (new SingleSampleMediaPeriod(dataSpec, dataSourceFactory, format, durationUs, minLoadableRetryCount, createEventDispatcher(mediaperiodid), treatLoadErrorsAsEndOfStream)));
	//   10   18:new             #95  <Class SingleSampleMediaPeriod>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #71  <Field DataSpec dataSpec>
	//   14   26:aload_0         
	//   15   27:getfield        #56  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
	//   16   30:aload_0         
	//   17   31:getfield        #58  <Field Format format>
	//   18   34:aload_0         
	//   19   35:getfield        #60  <Field long durationUs>
	//   20   38:aload_0         
	//   21   39:getfield        #62  <Field int minLoadableRetryCount>
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #99  <Method MediaSourceEventListener$EventDispatcher createEventDispatcher(MediaSource$MediaPeriodId)>
	//   25   47:aload_0         
	//   26   48:getfield        #64  <Field boolean treatLoadErrorsAsEndOfStream>
	//   27   51:invokespecial   #102 <Method void SingleSampleMediaPeriod(DataSpec, com.google.android.exoplayer2.upstream.DataSource$Factory, Format, long, int, MediaSourceEventListener$EventDispatcher, boolean)>
	//   28   54:areturn         
	}

	public void maybeThrowSourceInfoRefreshError()
		throws IOException
	{
	//    0    0:return          
	}

	public void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		refreshSourceInfo(timeline, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #78  <Field Timeline timeline>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #112 <Method void refreshSourceInfo(Timeline, Object)>
	//    5    9:return          
	}

	public void releasePeriod(MediaPeriod mediaperiod)
	{
		((SingleSampleMediaPeriod)mediaperiod).release();
	//    0    0:aload_1         
	//    1    1:checkcast       #95  <Class SingleSampleMediaPeriod>
	//    2    4:invokevirtual   #117 <Method void SingleSampleMediaPeriod.release()>
	//    3    7:return          
	}

	public void releaseSourceInternal()
	{
	//    0    0:return          
	}

	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
	private final DataSpec dataSpec;
	private final long durationUs;
	private final Format format;
	private final int minLoadableRetryCount;
	private final Timeline timeline;
	private final boolean treatLoadErrorsAsEndOfStream;
}
