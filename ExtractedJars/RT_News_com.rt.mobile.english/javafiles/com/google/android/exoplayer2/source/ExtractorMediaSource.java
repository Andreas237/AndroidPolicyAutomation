// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source:
//			BaseMediaSource, SinglePeriodTimeline, ExtractorMediaPeriod, MediaPeriod, 
//			DefaultMediaSourceEventListener, MediaSourceEventListener, MediaSource

public final class ExtractorMediaSource extends BaseMediaSource
	implements ExtractorMediaPeriod.Listener
{
	public static interface EventListener
	{

		public abstract void onLoadError(IOException ioexception);
	}

	private static final class EventListenerWrapper extends DefaultMediaSourceEventListener
	{

		public void onLoadError(int i, MediaSource.MediaPeriodId mediaperiodid, MediaSourceEventListener.LoadEventInfo loadeventinfo, MediaSourceEventListener.MediaLoadData medialoaddata, IOException ioexception, boolean flag)
		{
			eventListener.onLoadError(ioexception);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field ExtractorMediaSource$EventListener eventListener>
		//    2    4:aload           5
		//    3    6:invokeinterface #31  <Method void ExtractorMediaSource$EventListener.onLoadError(IOException)>
		//    4   11:return          
		}

		private final EventListener eventListener;

		public EventListenerWrapper(EventListener eventlistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void DefaultMediaSourceEventListener()>
			eventListener = (EventListener)Assertions.checkNotNull(((Object) (eventlistener)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #20  <Method Object Assertions.checkNotNull(Object)>
		//    5    9:checkcast       #22  <Class ExtractorMediaSource$EventListener>
		//    6   12:putfield        #24  <Field ExtractorMediaSource$EventListener eventListener>
		//    7   15:return          
		}
	}

	public static final class Factory
		implements com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
	{

		public ExtractorMediaSource createMediaSource(Uri uri1)
		{
			isCreateCalled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #40  <Field boolean isCreateCalled>
			if(extractorsFactory == null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #42  <Field ExtractorsFactory extractorsFactory>
		//*   5    9:ifnonnull       23
				extractorsFactory = ((ExtractorsFactory) (new DefaultExtractorsFactory()));
		//    6   12:aload_0         
		//    7   13:new             #44  <Class DefaultExtractorsFactory>
		//    8   16:dup             
		//    9   17:invokespecial   #45  <Method void DefaultExtractorsFactory()>
		//   10   20:putfield        #42  <Field ExtractorsFactory extractorsFactory>
			return new ExtractorMediaSource(uri1, dataSourceFactory, extractorsFactory, minLoadableRetryCount, customCacheKey, continueLoadingCheckIntervalBytes, tag);
		//   11   23:new             #8   <Class ExtractorMediaSource>
		//   12   26:dup             
		//   13   27:aload_1         
		//   14   28:aload_0         
		//   15   29:getfield        #30  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
		//   16   32:aload_0         
		//   17   33:getfield        #42  <Field ExtractorsFactory extractorsFactory>
		//   18   36:aload_0         
		//   19   37:getfield        #32  <Field int minLoadableRetryCount>
		//   20   40:aload_0         
		//   21   41:getfield        #47  <Field String customCacheKey>
		//   22   44:aload_0         
		//   23   45:getfield        #35  <Field int continueLoadingCheckIntervalBytes>
		//   24   48:aload_0         
		//   25   49:getfield        #49  <Field Object tag>
		//   26   52:aconst_null     
		//   27   53:invokespecial   #52  <Method void ExtractorMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, ExtractorsFactory, int, String, int, Object, ExtractorMediaSource$1)>
		//   28   56:areturn         
		}

		public ExtractorMediaSource createMediaSource(Uri uri1, Handler handler, MediaSourceEventListener mediasourceeventlistener)
		{
			uri1 = ((Uri) (createMediaSource(uri1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #56  <Method ExtractorMediaSource createMediaSource(Uri)>
		//    3    5:astore_1        
			if(handler != null && mediasourceeventlistener != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          20
		//*   6   10:aload_3         
		//*   7   11:ifnull          20
				((ExtractorMediaSource) (uri1)).addEventListener(handler, mediasourceeventlistener);
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #60  <Method void ExtractorMediaSource.addEventListener(Handler, MediaSourceEventListener)>
			return ((ExtractorMediaSource) (uri1));
		//   12   20:aload_1         
		//   13   21:areturn         
		}

		public volatile MediaSource createMediaSource(Uri uri1)
		{
			return ((MediaSource) (createMediaSource(uri1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #56  <Method ExtractorMediaSource createMediaSource(Uri)>
		//    3    5:areturn         
		}

		public int[] getSupportedTypes()
		{
			return (new int[] {
				3
			});
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:iconst_3        
		//    5    6:iastore         
		//    6    7:areturn         
		}

		public Factory setContinueLoadingCheckIntervalBytes(int i)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #73  <Method void Assertions.checkState(boolean)>
			continueLoadingCheckIntervalBytes = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #35  <Field int continueLoadingCheckIntervalBytes>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setCustomCacheKey(String s)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #73  <Method void Assertions.checkState(boolean)>
			customCacheKey = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #47  <Field String customCacheKey>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setExtractorsFactory(ExtractorsFactory extractorsfactory)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #73  <Method void Assertions.checkState(boolean)>
			extractorsFactory = extractorsfactory;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #42  <Field ExtractorsFactory extractorsFactory>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setMinLoadableRetryCount(int i)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #73  <Method void Assertions.checkState(boolean)>
			minLoadableRetryCount = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #32  <Field int minLoadableRetryCount>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setTag(Object obj)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #73  <Method void Assertions.checkState(boolean)>
			tag = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #49  <Field Object tag>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		private int continueLoadingCheckIntervalBytes;
		private String customCacheKey;
		private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
		private ExtractorsFactory extractorsFactory;
		private boolean isCreateCalled;
		private int minLoadableRetryCount;
		private Object tag;

		public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			dataSourceFactory = factory;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #30  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
			minLoadableRetryCount = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #32  <Field int minLoadableRetryCount>
			continueLoadingCheckIntervalBytes = 0x100000;
		//    8   14:aload_0         
		//    9   15:ldc1            #33  <Int 0x100000>
		//   10   17:putfield        #35  <Field int continueLoadingCheckIntervalBytes>
		//   11   20:return          
		}
	}


	public ExtractorMediaSource(Uri uri1, com.google.android.exoplayer2.upstream.DataSource.Factory factory, ExtractorsFactory extractorsfactory, int i, Handler handler, EventListener eventlistener, String s, 
			int j)
	{
		this(uri1, factory, extractorsfactory, i, s, j, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           7
	//    6    8:iload           8
	//    7   10:aconst_null     
	//    8   11:invokespecial   #49  <Method void ExtractorMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, ExtractorsFactory, int, String, int, Object)>
		if(eventlistener != null && handler != null)
	//*   9   14:aload           6
	//*  10   16:ifnull          40
	//*  11   19:aload           5
	//*  12   21:ifnull          40
		{
			addEventListener(handler, ((MediaSourceEventListener) (new EventListenerWrapper(eventlistener))));
	//   13   24:aload_0         
	//   14   25:aload           5
	//   15   27:new             #13  <Class ExtractorMediaSource$EventListenerWrapper>
	//   16   30:dup             
	//   17   31:aload           6
	//   18   33:invokespecial   #52  <Method void ExtractorMediaSource$EventListenerWrapper(ExtractorMediaSource$EventListener)>
	//   19   36:invokevirtual   #56  <Method void addEventListener(Handler, MediaSourceEventListener)>
			return;
	//   20   39:return          
		} else
		{
			return;
	//   21   40:return          
		}
	}

	private ExtractorMediaSource(Uri uri1, com.google.android.exoplayer2.upstream.DataSource.Factory factory, ExtractorsFactory extractorsfactory, int i, String s, int j, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method void BaseMediaSource()>
		uri = uri1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #63  <Field Uri uri>
		dataSourceFactory = factory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #65  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
		extractorsFactory = extractorsfactory;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #67  <Field ExtractorsFactory extractorsFactory>
		minLoadableRetryCount = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #69  <Field int minLoadableRetryCount>
		customCacheKey = s;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #71  <Field String customCacheKey>
		continueLoadingCheckIntervalBytes = j;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #73  <Field int continueLoadingCheckIntervalBytes>
		timelineDurationUs = 0x1L;
	//   20   37:aload_0         
	//   21   38:ldc2w           #74  <Long 0x1L>
	//   22   41:putfield        #77  <Field long timelineDurationUs>
		tag = obj;
	//   23   44:aload_0         
	//   24   45:aload           7
	//   25   47:putfield        #79  <Field Object tag>
	//   26   50:return          
	}


	public ExtractorMediaSource(Uri uri1, com.google.android.exoplayer2.upstream.DataSource.Factory factory, ExtractorsFactory extractorsfactory, Handler handler, EventListener eventlistener)
	{
		this(uri1, factory, extractorsfactory, handler, eventlistener, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aconst_null     
	//    7    9:invokespecial   #85  <Method void ExtractorMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, ExtractorsFactory, Handler, ExtractorMediaSource$EventListener, String)>
	//    8   12:return          
	}

	public ExtractorMediaSource(Uri uri1, com.google.android.exoplayer2.upstream.DataSource.Factory factory, ExtractorsFactory extractorsfactory, Handler handler, EventListener eventlistener, String s)
	{
		this(uri1, factory, extractorsfactory, -1, handler, eventlistener, s, 0x100000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_m1       
	//    5    5:aload           4
	//    6    7:aload           5
	//    7    9:aload           6
	//    8   11:ldc1            #20  <Int 0x100000>
	//    9   13:invokespecial   #87  <Method void ExtractorMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, ExtractorsFactory, int, Handler, ExtractorMediaSource$EventListener, String, int)>
	//   10   16:return          
	}

	private void notifySourceInfoRefreshed(long l, boolean flag)
	{
		timelineDurationUs = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #77  <Field long timelineDurationUs>
		timelineIsSeekable = flag;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #91  <Field boolean timelineIsSeekable>
		refreshSourceInfo(((com.google.android.exoplayer2.Timeline) (new SinglePeriodTimeline(timelineDurationUs, timelineIsSeekable, false, tag))), ((Object) (null)));
	//    6   10:aload_0         
	//    7   11:new             #93  <Class SinglePeriodTimeline>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:getfield        #77  <Field long timelineDurationUs>
	//   11   19:aload_0         
	//   12   20:getfield        #91  <Field boolean timelineIsSeekable>
	//   13   23:iconst_0        
	//   14   24:aload_0         
	//   15   25:getfield        #79  <Field Object tag>
	//   16   28:invokespecial   #96  <Method void SinglePeriodTimeline(long, boolean, boolean, Object)>
	//   17   31:aconst_null     
	//   18   32:invokevirtual   #100 <Method void refreshSourceInfo(com.google.android.exoplayer2.Timeline, Object)>
	//   19   35:return          
	}

	public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		boolean flag;
		if(mediaperiodid.periodIndex == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #107 <Field int MediaSource$MediaPeriodId.periodIndex>
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
	//    9   15:invokestatic    #113 <Method void Assertions.checkArgument(boolean)>
		return ((MediaPeriod) (new ExtractorMediaPeriod(uri, dataSourceFactory.createDataSource(), extractorsFactory.createExtractors(), minLoadableRetryCount, createEventDispatcher(mediaperiodid), ((ExtractorMediaPeriod.Listener) (this)), allocator, customCacheKey, continueLoadingCheckIntervalBytes)));
	//   10   18:new             #115 <Class ExtractorMediaPeriod>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #63  <Field Uri uri>
	//   14   26:aload_0         
	//   15   27:getfield        #65  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
	//   16   30:invokeinterface #121 <Method com.google.android.exoplayer2.upstream.DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//   17   35:aload_0         
	//   18   36:getfield        #67  <Field ExtractorsFactory extractorsFactory>
	//   19   39:invokeinterface #127 <Method com.google.android.exoplayer2.extractor.Extractor[] ExtractorsFactory.createExtractors()>
	//   20   44:aload_0         
	//   21   45:getfield        #69  <Field int minLoadableRetryCount>
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:invokevirtual   #131 <Method MediaSourceEventListener$EventDispatcher createEventDispatcher(MediaSource$MediaPeriodId)>
	//   25   53:aload_0         
	//   26   54:aload_2         
	//   27   55:aload_0         
	//   28   56:getfield        #71  <Field String customCacheKey>
	//   29   59:aload_0         
	//   30   60:getfield        #73  <Field int continueLoadingCheckIntervalBytes>
	//   31   63:invokespecial   #134 <Method void ExtractorMediaPeriod(Uri, com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.extractor.Extractor[], int, MediaSourceEventListener$EventDispatcher, ExtractorMediaPeriod$Listener, Allocator, String, int)>
	//   32   66:areturn         
	}

	public void maybeThrowSourceInfoRefreshError()
		throws IOException
	{
	//    0    0:return          
	}

	public void onSourceInfoRefreshed(long l, boolean flag)
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore          4
		if(l == 0x1L)
	//*   2    3:lload_1         
	//*   3    4:ldc2w           #74  <Long 0x1L>
	//*   4    7:lcmp            
	//*   5    8:ifne            17
			l1 = timelineDurationUs;
	//    6   11:aload_0         
	//    7   12:getfield        #77  <Field long timelineDurationUs>
	//    8   15:lstore          4
		if(timelineDurationUs == l1 && timelineIsSeekable == flag)
	//*   9   17:aload_0         
	//*  10   18:getfield        #77  <Field long timelineDurationUs>
	//*  11   21:lload           4
	//*  12   23:lcmp            
	//*  13   24:ifne            36
	//*  14   27:aload_0         
	//*  15   28:getfield        #91  <Field boolean timelineIsSeekable>
	//*  16   31:iload_3         
	//*  17   32:icmpne          36
		{
			return;
	//   18   35:return          
		} else
		{
			notifySourceInfoRefreshed(l1, flag);
	//   19   36:aload_0         
	//   20   37:lload           4
	//   21   39:iload_3         
	//   22   40:invokespecial   #141 <Method void notifySourceInfoRefreshed(long, boolean)>
			return;
	//   23   43:return          
		}
	}

	public void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		notifySourceInfoRefreshed(timelineDurationUs, false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #77  <Field long timelineDurationUs>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #141 <Method void notifySourceInfoRefreshed(long, boolean)>
	//    5    9:return          
	}

	public void releasePeriod(MediaPeriod mediaperiod)
	{
		((ExtractorMediaPeriod)mediaperiod).release();
	//    0    0:aload_1         
	//    1    1:checkcast       #115 <Class ExtractorMediaPeriod>
	//    2    4:invokevirtual   #148 <Method void ExtractorMediaPeriod.release()>
	//    3    7:return          
	}

	public void releaseSourceInternal()
	{
	//    0    0:return          
	}

	public static final int DEFAULT_LOADING_CHECK_INTERVAL_BYTES = 0x100000;
	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_LIVE = 6;
	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_ON_DEMAND = 3;
	public static final int MIN_RETRY_COUNT_DEFAULT_FOR_MEDIA = -1;
	private final int continueLoadingCheckIntervalBytes;
	private final String customCacheKey;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
	private final ExtractorsFactory extractorsFactory;
	private final int minLoadableRetryCount;
	private final Object tag;
	private long timelineDurationUs;
	private boolean timelineIsSeekable;
	private final Uri uri;
}
