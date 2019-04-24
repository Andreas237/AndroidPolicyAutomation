// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			DefaultHlsDataSourceFactory, HlsExtractorFactory, HlsMediaPeriod, HlsManifest, 
//			HlsDataSourceFactory

public final class HlsMediaSource extends BaseMediaSource
	implements com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener
{
	public static final class Factory
		implements com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
	{

		public volatile MediaSource createMediaSource(Uri uri)
		{
			return ((MediaSource) (createMediaSource(uri)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #70  <Method HlsMediaSource createMediaSource(Uri)>
		//    3    5:areturn         
		}

		public HlsMediaSource createMediaSource(Uri uri)
		{
			isCreateCalled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #72  <Field boolean isCreateCalled>
			if(playlistTracker == null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #74  <Field HlsPlaylistTracker playlistTracker>
		//*   5    9:ifnonnull       61
			{
				HlsDataSourceFactory hlsdatasourcefactory = hlsDataSourceFactory;
		//    6   12:aload_0         
		//    7   13:getfield        #43  <Field HlsDataSourceFactory hlsDataSourceFactory>
		//    8   16:astore          4
				int i = minLoadableRetryCount;
		//    9   18:aload_0         
		//   10   19:getfield        #52  <Field int minLoadableRetryCount>
		//   11   22:istore_2        
				Object obj;
				if(playlistParser != null)
		//*  12   23:aload_0         
		//*  13   24:getfield        #76  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser playlistParser>
		//*  14   27:ifnull          38
					obj = ((Object) (playlistParser));
		//   15   30:aload_0         
		//   16   31:getfield        #76  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser playlistParser>
		//   17   34:astore_3        
				else
		//*  18   35:goto            46
					obj = ((Object) (new HlsPlaylistParser()));
		//   19   38:new             #78  <Class HlsPlaylistParser>
		//   20   41:dup             
		//   21   42:invokespecial   #79  <Method void HlsPlaylistParser()>
		//   22   45:astore_3        
				playlistTracker = ((HlsPlaylistTracker) (new DefaultHlsPlaylistTracker(hlsdatasourcefactory, i, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (obj)))));
		//   23   46:aload_0         
		//   24   47:new             #81  <Class DefaultHlsPlaylistTracker>
		//   25   50:dup             
		//   26   51:aload           4
		//   27   53:iload_2         
		//   28   54:aload_3         
		//   29   55:invokespecial   #84  <Method void DefaultHlsPlaylistTracker(HlsDataSourceFactory, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
		//   30   58:putfield        #74  <Field HlsPlaylistTracker playlistTracker>
			}
			return new HlsMediaSource(uri, hlsDataSourceFactory, extractorFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, playlistTracker, allowChunklessPreparation, tag);
		//   31   61:new             #8   <Class HlsMediaSource>
		//   32   64:dup             
		//   33   65:aload_1         
		//   34   66:aload_0         
		//   35   67:getfield        #43  <Field HlsDataSourceFactory hlsDataSourceFactory>
		//   36   70:aload_0         
		//   37   71:getfield        #50  <Field HlsExtractorFactory extractorFactory>
		//   38   74:aload_0         
		//   39   75:getfield        #57  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		//   40   78:aload_0         
		//   41   79:getfield        #52  <Field int minLoadableRetryCount>
		//   42   82:aload_0         
		//   43   83:getfield        #74  <Field HlsPlaylistTracker playlistTracker>
		//   44   86:aload_0         
		//   45   87:getfield        #86  <Field boolean allowChunklessPreparation>
		//   46   90:aload_0         
		//   47   91:getfield        #88  <Field Object tag>
		//   48   94:aconst_null     
		//   49   95:invokespecial   #91  <Method void HlsMediaSource(Uri, HlsDataSourceFactory, HlsExtractorFactory, CompositeSequenceableLoaderFactory, int, HlsPlaylistTracker, boolean, Object, HlsMediaSource$1)>
		//   50   98:areturn         
		}

		public HlsMediaSource createMediaSource(Uri uri, Handler handler, MediaSourceEventListener mediasourceeventlistener)
		{
			uri = ((Uri) (createMediaSource(uri)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #70  <Method HlsMediaSource createMediaSource(Uri)>
		//    3    5:astore_1        
			if(handler != null && mediasourceeventlistener != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          20
		//*   6   10:aload_3         
		//*   7   11:ifnull          20
				((HlsMediaSource) (uri)).addEventListener(handler, mediasourceeventlistener);
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #97  <Method void HlsMediaSource.addEventListener(Handler, MediaSourceEventListener)>
			return ((HlsMediaSource) (uri));
		//   12   20:aload_1         
		//   13   21:areturn         
		}

		public int[] getSupportedTypes()
		{
			return (new int[] {
				2
			});
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:iconst_2        
		//    5    6:iastore         
		//    6    7:areturn         
		}

		public Factory setAllowChunklessPreparation(boolean flag)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #107 <Method void Assertions.checkState(boolean)>
			allowChunklessPreparation = flag;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #86  <Field boolean allowChunklessPreparation>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositesequenceableloaderfactory)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #107 <Method void Assertions.checkState(boolean)>
			compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory)Assertions.checkNotNull(((Object) (compositesequenceableloaderfactory)));
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokestatic    #39  <Method Object Assertions.checkNotNull(Object)>
		//    8   14:checkcast       #111 <Class CompositeSequenceableLoaderFactory>
		//    9   17:putfield        #57  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
			return this;
		//   10   20:aload_0         
		//   11   21:areturn         
		}

		public Factory setExtractorFactory(HlsExtractorFactory hlsextractorfactory)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #107 <Method void Assertions.checkState(boolean)>
			extractorFactory = (HlsExtractorFactory)Assertions.checkNotNull(((Object) (hlsextractorfactory)));
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokestatic    #39  <Method Object Assertions.checkNotNull(Object)>
		//    8   14:checkcast       #45  <Class HlsExtractorFactory>
		//    9   17:putfield        #50  <Field HlsExtractorFactory extractorFactory>
			return this;
		//   10   20:aload_0         
		//   11   21:areturn         
		}

		public Factory setMinLoadableRetryCount(int i)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #107 <Method void Assertions.checkState(boolean)>
			minLoadableRetryCount = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #52  <Field int minLoadableRetryCount>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setPlaylistParser(com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser)
		{
			boolean flag1 = isCreateCalled;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field boolean isCreateCalled>
		//    2    4:istore_3        
			boolean flag = true;
		//    3    5:iconst_1        
		//    4    6:istore_2        
			Assertions.checkState(flag1 ^ true);
		//    5    7:iload_3         
		//    6    8:iconst_1        
		//    7    9:ixor            
		//    8   10:invokestatic    #107 <Method void Assertions.checkState(boolean)>
			if(playlistTracker != null)
		//*   9   13:aload_0         
		//*  10   14:getfield        #74  <Field HlsPlaylistTracker playlistTracker>
		//*  11   17:ifnonnull       23
		//*  12   20:goto            25
				flag = false;
		//   13   23:iconst_0        
		//   14   24:istore_2        
			Assertions.checkState(flag, "A playlist tracker has already been set.");
		//   15   25:iload_2         
		//   16   26:ldc1            #119 <String "A playlist tracker has already been set.">
		//   17   28:invokestatic    #122 <Method void Assertions.checkState(boolean, Object)>
			playlistParser = (com.google.android.exoplayer2.upstream.ParsingLoadable.Parser)Assertions.checkNotNull(((Object) (parser)));
		//   18   31:aload_0         
		//   19   32:aload_1         
		//   20   33:invokestatic    #39  <Method Object Assertions.checkNotNull(Object)>
		//   21   36:checkcast       #124 <Class com.google.android.exoplayer2.upstream.ParsingLoadable$Parser>
		//   22   39:putfield        #76  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser playlistParser>
			return this;
		//   23   42:aload_0         
		//   24   43:areturn         
		}

		public Factory setPlaylistTracker(HlsPlaylistTracker hlsplaylisttracker)
		{
			boolean flag1 = isCreateCalled;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field boolean isCreateCalled>
		//    2    4:istore_3        
			boolean flag = true;
		//    3    5:iconst_1        
		//    4    6:istore_2        
			Assertions.checkState(flag1 ^ true);
		//    5    7:iload_3         
		//    6    8:iconst_1        
		//    7    9:ixor            
		//    8   10:invokestatic    #107 <Method void Assertions.checkState(boolean)>
			if(playlistParser != null)
		//*   9   13:aload_0         
		//*  10   14:getfield        #76  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser playlistParser>
		//*  11   17:ifnonnull       23
		//*  12   20:goto            25
				flag = false;
		//   13   23:iconst_0        
		//   14   24:istore_2        
			Assertions.checkState(flag, "A playlist parser has already been set.");
		//   15   25:iload_2         
		//   16   26:ldc1            #130 <String "A playlist parser has already been set.">
		//   17   28:invokestatic    #122 <Method void Assertions.checkState(boolean, Object)>
			playlistTracker = (HlsPlaylistTracker)Assertions.checkNotNull(((Object) (hlsplaylisttracker)));
		//   18   31:aload_0         
		//   19   32:aload_1         
		//   20   33:invokestatic    #39  <Method Object Assertions.checkNotNull(Object)>
		//   21   36:checkcast       #132 <Class HlsPlaylistTracker>
		//   22   39:putfield        #74  <Field HlsPlaylistTracker playlistTracker>
			return this;
		//   23   42:aload_0         
		//   24   43:areturn         
		}

		public Factory setTag(Object obj)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #107 <Method void Assertions.checkState(boolean)>
			tag = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #88  <Field Object tag>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		private boolean allowChunklessPreparation;
		private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
		private HlsExtractorFactory extractorFactory;
		private final HlsDataSourceFactory hlsDataSourceFactory;
		private boolean isCreateCalled;
		private int minLoadableRetryCount;
		private com.google.android.exoplayer2.upstream.ParsingLoadable.Parser playlistParser;
		private HlsPlaylistTracker playlistTracker;
		private Object tag;

		public Factory(HlsDataSourceFactory hlsdatasourcefactory)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
			hlsDataSourceFactory = (HlsDataSourceFactory)Assertions.checkNotNull(((Object) (hlsdatasourcefactory)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #39  <Method Object Assertions.checkNotNull(Object)>
		//    5    9:checkcast       #41  <Class HlsDataSourceFactory>
		//    6   12:putfield        #43  <Field HlsDataSourceFactory hlsDataSourceFactory>
			extractorFactory = HlsExtractorFactory.DEFAULT;
		//    7   15:aload_0         
		//    8   16:getstatic       #48  <Field HlsExtractorFactory HlsExtractorFactory.DEFAULT>
		//    9   19:putfield        #50  <Field HlsExtractorFactory extractorFactory>
			minLoadableRetryCount = 3;
		//   10   22:aload_0         
		//   11   23:iconst_3        
		//   12   24:putfield        #52  <Field int minLoadableRetryCount>
			compositeSequenceableLoaderFactory = ((CompositeSequenceableLoaderFactory) (new DefaultCompositeSequenceableLoaderFactory()));
		//   13   27:aload_0         
		//   14   28:new             #54  <Class DefaultCompositeSequenceableLoaderFactory>
		//   15   31:dup             
		//   16   32:invokespecial   #55  <Method void DefaultCompositeSequenceableLoaderFactory()>
		//   17   35:putfield        #57  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		//   18   38:return          
		}

		public Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
		{
			this(((HlsDataSourceFactory) (new DefaultHlsDataSourceFactory(factory))));
		//    0    0:aload_0         
		//    1    1:new             #61  <Class DefaultHlsDataSourceFactory>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:invokespecial   #63  <Method void DefaultHlsDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource$Factory)>
		//    5    9:invokespecial   #65  <Method void HlsMediaSource$Factory(HlsDataSourceFactory)>
		//    6   12:return          
		}
	}


	public HlsMediaSource(Uri uri, HlsDataSourceFactory hlsdatasourcefactory, HlsExtractorFactory hlsextractorfactory, int i, Handler handler, MediaSourceEventListener mediasourceeventlistener, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser)
	{
		this(uri, hlsdatasourcefactory, hlsextractorfactory, ((CompositeSequenceableLoaderFactory) (new DefaultCompositeSequenceableLoaderFactory())), i, ((HlsPlaylistTracker) (new DefaultHlsPlaylistTracker(hlsdatasourcefactory, i, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new HlsPlaylistParser()))))), false, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #46  <Class DefaultCompositeSequenceableLoaderFactory>
	//    5    7:dup             
	//    6    8:invokespecial   #48  <Method void DefaultCompositeSequenceableLoaderFactory()>
	//    7   11:iload           4
	//    8   13:new             #50  <Class DefaultHlsPlaylistTracker>
	//    9   16:dup             
	//   10   17:aload_2         
	//   11   18:iload           4
	//   12   20:new             #52  <Class HlsPlaylistParser>
	//   13   23:dup             
	//   14   24:invokespecial   #53  <Method void HlsPlaylistParser()>
	//   15   27:invokespecial   #56  <Method void DefaultHlsPlaylistTracker(HlsDataSourceFactory, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//   16   30:iconst_0        
	//   17   31:aconst_null     
	//   18   32:invokespecial   #59  <Method void HlsMediaSource(Uri, HlsDataSourceFactory, HlsExtractorFactory, CompositeSequenceableLoaderFactory, int, HlsPlaylistTracker, boolean, Object)>
		if(handler != null && mediasourceeventlistener != null)
	//*  19   35:aload           5
	//*  20   37:ifnull          54
	//*  21   40:aload           6
	//*  22   42:ifnull          54
		{
			addEventListener(handler, mediasourceeventlistener);
	//   23   45:aload_0         
	//   24   46:aload           5
	//   25   48:aload           6
	//   26   50:invokevirtual   #63  <Method void addEventListener(Handler, MediaSourceEventListener)>
			return;
	//   27   53:return          
		} else
		{
			return;
	//   28   54:return          
		}
	}

	private HlsMediaSource(Uri uri, HlsDataSourceFactory hlsdatasourcefactory, HlsExtractorFactory hlsextractorfactory, CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, int i, HlsPlaylistTracker hlsplaylisttracker, boolean flag, 
			Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void BaseMediaSource()>
		manifestUri = uri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #69  <Field Uri manifestUri>
		dataSourceFactory = hlsdatasourcefactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #71  <Field HlsDataSourceFactory dataSourceFactory>
		extractorFactory = hlsextractorfactory;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #73  <Field HlsExtractorFactory extractorFactory>
		compositeSequenceableLoaderFactory = compositesequenceableloaderfactory;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #75  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		minLoadableRetryCount = i;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #77  <Field int minLoadableRetryCount>
		playlistTracker = hlsplaylisttracker;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #79  <Field HlsPlaylistTracker playlistTracker>
		allowChunklessPreparation = flag;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #81  <Field boolean allowChunklessPreparation>
		tag = obj;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #83  <Field Object tag>
	//   26   49:return          
	}


	public HlsMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, int i, Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		this(uri, ((HlsDataSourceFactory) (new DefaultHlsDataSourceFactory(factory))), HlsExtractorFactory.DEFAULT, i, handler, mediasourceeventlistener, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new HlsPlaylistParser())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #88  <Class DefaultHlsDataSourceFactory>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #91  <Method void DefaultHlsDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource$Factory)>
	//    6   10:getstatic       #96  <Field HlsExtractorFactory HlsExtractorFactory.DEFAULT>
	//    7   13:iload_3         
	//    8   14:aload           4
	//    9   16:aload           5
	//   10   18:new             #52  <Class HlsPlaylistParser>
	//   11   21:dup             
	//   12   22:invokespecial   #53  <Method void HlsPlaylistParser()>
	//   13   25:invokespecial   #98  <Method void HlsMediaSource(Uri, HlsDataSourceFactory, HlsExtractorFactory, int, Handler, MediaSourceEventListener, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//   14   28:return          
	}

	public HlsMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		this(uri, factory, 3, handler, mediasourceeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_3        
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:invokespecial   #101 <Method void HlsMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, int, Handler, MediaSourceEventListener)>
	//    7   10:return          
	}

	public MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		boolean flag;
		if(mediaperiodid.periodIndex == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #108 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
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
	//    9   15:invokestatic    #114 <Method void Assertions.checkArgument(boolean)>
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (createEventDispatcher(mediaperiodid)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #118 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//   13   23:astore_1        
		return ((MediaPeriod) (new HlsMediaPeriod(extractorFactory, playlistTracker, dataSourceFactory, minLoadableRetryCount, ((com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher) (mediaperiodid)), allocator, compositeSequenceableLoaderFactory, allowChunklessPreparation)));
	//   14   24:new             #120 <Class HlsMediaPeriod>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:getfield        #73  <Field HlsExtractorFactory extractorFactory>
	//   18   32:aload_0         
	//   19   33:getfield        #79  <Field HlsPlaylistTracker playlistTracker>
	//   20   36:aload_0         
	//   21   37:getfield        #71  <Field HlsDataSourceFactory dataSourceFactory>
	//   22   40:aload_0         
	//   23   41:getfield        #77  <Field int minLoadableRetryCount>
	//   24   44:aload_1         
	//   25   45:aload_2         
	//   26   46:aload_0         
	//   27   47:getfield        #75  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//   28   50:aload_0         
	//   29   51:getfield        #81  <Field boolean allowChunklessPreparation>
	//   30   54:invokespecial   #123 <Method void HlsMediaPeriod(HlsExtractorFactory, HlsPlaylistTracker, HlsDataSourceFactory, int, com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher, Allocator, CompositeSequenceableLoaderFactory, boolean)>
	//   31   57:areturn         
	}

	public void maybeThrowSourceInfoRefreshError()
		throws IOException
	{
		playlistTracker.maybeThrowPrimaryPlaylistRefreshError();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field HlsPlaylistTracker playlistTracker>
	//    2    4:invokeinterface #131 <Method void HlsPlaylistTracker.maybeThrowPrimaryPlaylistRefreshError()>
	//    3    9:return          
	}

	public void onPrimaryPlaylistRefreshed(HlsMediaPlaylist hlsmediaplaylist)
	{
		long l;
		if(hlsmediaplaylist.hasProgramDateTime)
	//*   0    0:aload_1         
	//*   1    1:getfield        #139 <Field boolean HlsMediaPlaylist.hasProgramDateTime>
	//*   2    4:ifeq            18
			l = C.usToMs(hlsmediaplaylist.startTimeUs);
	//    3    7:aload_1         
	//    4    8:getfield        #143 <Field long HlsMediaPlaylist.startTimeUs>
	//    5   11:invokestatic    #149 <Method long C.usToMs(long)>
	//    6   14:lstore_2        
		else
	//*   7   15:goto            22
			l = 0x1L;
	//    8   18:ldc2w           #150 <Long 0x1L>
	//    9   21:lstore_2        
		long l2;
		if(hlsmediaplaylist.playlistType != 2 && hlsmediaplaylist.playlistType != 1)
	//*  10   22:aload_1         
	//*  11   23:getfield        #154 <Field int HlsMediaPlaylist.playlistType>
	//*  12   26:iconst_2        
	//*  13   27:icmpeq          49
	//*  14   30:aload_1         
	//*  15   31:getfield        #154 <Field int HlsMediaPlaylist.playlistType>
	//*  16   34:iconst_1        
	//*  17   35:icmpne          41
	//*  18   38:goto            49
			l2 = 0x1L;
	//   19   41:ldc2w           #150 <Long 0x1L>
	//   20   44:lstore          6
		else
	//*  21   46:goto            52
			l2 = l;
	//   22   49:lload_2         
	//   23   50:lstore          6
		long l1 = hlsmediaplaylist.startOffsetUs;
	//   24   52:aload_1         
	//   25   53:getfield        #157 <Field long HlsMediaPlaylist.startOffsetUs>
	//   26   56:lstore          4
		Object obj;
		if(playlistTracker.isLive())
	//*  27   58:aload_0         
	//*  28   59:getfield        #79  <Field HlsPlaylistTracker playlistTracker>
	//*  29   62:invokeinterface #161 <Method boolean HlsPlaylistTracker.isLive()>
	//*  30   67:ifeq            208
		{
			long l4 = hlsmediaplaylist.startTimeUs - playlistTracker.getInitialStartTimeUs();
	//   31   70:aload_1         
	//   32   71:getfield        #143 <Field long HlsMediaPlaylist.startTimeUs>
	//   33   74:aload_0         
	//   34   75:getfield        #79  <Field HlsPlaylistTracker playlistTracker>
	//   35   78:invokeinterface #165 <Method long HlsPlaylistTracker.getInitialStartTimeUs()>
	//   36   83:lsub            
	//   37   84:lstore          10
			long l3;
			if(hlsmediaplaylist.hasEndTag)
	//*  38   86:aload_1         
	//*  39   87:getfield        #168 <Field boolean HlsMediaPlaylist.hasEndTag>
	//*  40   90:ifeq            105
				l3 = l4 + hlsmediaplaylist.durationUs;
	//   41   93:lload           10
	//   42   95:aload_1         
	//   43   96:getfield        #171 <Field long HlsMediaPlaylist.durationUs>
	//   44   99:ladd            
	//   45  100:lstore          8
			else
	//*  46  102:goto            110
				l3 = 0x1L;
	//   47  105:ldc2w           #150 <Long 0x1L>
	//   48  108:lstore          8
			obj = ((Object) (hlsmediaplaylist.segments));
	//   49  110:aload_1         
	//   50  111:getfield        #175 <Field List HlsMediaPlaylist.segments>
	//   51  114:astore          12
			if(l1 == 0x1L)
	//*  52  116:lload           4
	//*  53  118:ldc2w           #150 <Long 0x1L>
	//*  54  121:lcmp            
	//*  55  122:ifne            172
				if(((List) (obj)).isEmpty())
	//*  56  125:aload           12
	//*  57  127:invokeinterface #180 <Method boolean List.isEmpty()>
	//*  58  132:ifeq            141
					l1 = 0L;
	//   59  135:lconst_0        
	//   60  136:lstore          4
				else
	//*  61  138:goto            169
					l1 = ((com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment)((List) (obj)).get(Math.max(0, ((List) (obj)).size() - 3))).relativeStartTimeUs;
	//   62  141:aload           12
	//   63  143:iconst_0        
	//   64  144:aload           12
	//   65  146:invokeinterface #184 <Method int List.size()>
	//   66  151:iconst_3        
	//   67  152:isub            
	//   68  153:invokestatic    #190 <Method int Math.max(int, int)>
	//   69  156:invokeinterface #194 <Method Object List.get(int)>
	//   70  161:checkcast       #196 <Class com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment>
	//   71  164:getfield        #199 <Field long com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist$Segment.relativeStartTimeUs>
	//   72  167:lstore          4
	//*  73  169:goto            172
			obj = ((Object) (new SinglePeriodTimeline(l2, l, l3, hlsmediaplaylist.durationUs, l4, l1, true, hlsmediaplaylist.hasEndTag ^ true, tag)));
	//   74  172:new             #201 <Class SinglePeriodTimeline>
	//   75  175:dup             
	//   76  176:lload           6
	//   77  178:lload_2         
	//   78  179:lload           8
	//   79  181:aload_1         
	//   80  182:getfield        #171 <Field long HlsMediaPlaylist.durationUs>
	//   81  185:lload           10
	//   82  187:lload           4
	//   83  189:iconst_1        
	//   84  190:aload_1         
	//   85  191:getfield        #168 <Field boolean HlsMediaPlaylist.hasEndTag>
	//   86  194:iconst_1        
	//   87  195:ixor            
	//   88  196:aload_0         
	//   89  197:getfield        #83  <Field Object tag>
	//   90  200:invokespecial   #204 <Method void SinglePeriodTimeline(long, long, long, long, long, long, boolean, boolean, Object)>
	//   91  203:astore          12
		} else
	//*  92  205:goto            252
		{
			if(l1 == 0x1L)
	//*  93  208:lload           4
	//*  94  210:ldc2w           #150 <Long 0x1L>
	//*  95  213:lcmp            
	//*  96  214:ifne            223
				l1 = 0L;
	//   97  217:lconst_0        
	//   98  218:lstore          4
	//*  99  220:goto            223
			obj = ((Object) (new SinglePeriodTimeline(l2, l, hlsmediaplaylist.durationUs, hlsmediaplaylist.durationUs, 0L, l1, true, false, tag)));
	//  100  223:new             #201 <Class SinglePeriodTimeline>
	//  101  226:dup             
	//  102  227:lload           6
	//  103  229:lload_2         
	//  104  230:aload_1         
	//  105  231:getfield        #171 <Field long HlsMediaPlaylist.durationUs>
	//  106  234:aload_1         
	//  107  235:getfield        #171 <Field long HlsMediaPlaylist.durationUs>
	//  108  238:lconst_0        
	//  109  239:lload           4
	//  110  241:iconst_1        
	//  111  242:iconst_0        
	//  112  243:aload_0         
	//  113  244:getfield        #83  <Field Object tag>
	//  114  247:invokespecial   #204 <Method void SinglePeriodTimeline(long, long, long, long, long, long, boolean, boolean, Object)>
	//  115  250:astore          12
		}
		refreshSourceInfo(((com.google.android.exoplayer2.Timeline) (obj)), ((Object) (new HlsManifest(playlistTracker.getMasterPlaylist(), hlsmediaplaylist))));
	//  116  252:aload_0         
	//  117  253:aload           12
	//  118  255:new             #206 <Class HlsManifest>
	//  119  258:dup             
	//  120  259:aload_0         
	//  121  260:getfield        #79  <Field HlsPlaylistTracker playlistTracker>
	//  122  263:invokeinterface #210 <Method com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist HlsPlaylistTracker.getMasterPlaylist()>
	//  123  268:aload_1         
	//  124  269:invokespecial   #213 <Method void HlsManifest(com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist, HlsMediaPlaylist)>
	//  125  272:invokevirtual   #217 <Method void refreshSourceInfo(com.google.android.exoplayer2.Timeline, Object)>
	//  126  275:return          
	}

	public void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		exoplayer = ((ExoPlayer) (createEventDispatcher(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (null)))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #118 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    3    5:astore_1        
		playlistTracker.start(manifestUri, ((com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher) (exoplayer)), ((com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PrimaryPlaylistListener) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #79  <Field HlsPlaylistTracker playlistTracker>
	//    6   10:aload_0         
	//    7   11:getfield        #69  <Field Uri manifestUri>
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokeinterface #223 <Method void HlsPlaylistTracker.start(Uri, com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher, com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker$PrimaryPlaylistListener)>
	//   11   21:return          
	}

	public void releasePeriod(MediaPeriod mediaperiod)
	{
		((HlsMediaPeriod)mediaperiod).release();
	//    0    0:aload_1         
	//    1    1:checkcast       #120 <Class HlsMediaPeriod>
	//    2    4:invokevirtual   #228 <Method void HlsMediaPeriod.release()>
	//    3    7:return          
	}

	public void releaseSourceInternal()
	{
		if(playlistTracker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field HlsPlaylistTracker playlistTracker>
	//*   2    4:ifnull          16
			playlistTracker.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field HlsPlaylistTracker playlistTracker>
	//    5   11:invokeinterface #232 <Method void HlsPlaylistTracker.stop()>
	//    6   16:return          
	}

	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
	private final boolean allowChunklessPreparation;
	private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private final HlsDataSourceFactory dataSourceFactory;
	private final HlsExtractorFactory extractorFactory;
	private final Uri manifestUri;
	private final int minLoadableRetryCount;
	private final HlsPlaylistTracker playlistTracker;
	private final Object tag;

	static 
	{
		ExoPlayerLibraryInfo.registerModule("goog.exo.hls");
	//    0    0:ldc1            #34  <String "goog.exo.hls">
	//    1    2:invokestatic    #40  <Method void ExoPlayerLibraryInfo.registerModule(String)>
	//*   2    5:return          
	}
}
