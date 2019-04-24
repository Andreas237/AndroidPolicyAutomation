// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			HlsMediaSource, HlsDataSourceFactory, HlsExtractorFactory, DefaultHlsDataSourceFactory

public static final class HlsMediaSource$Factory
	implements com.google.android.exoplayer2.source.ads.rceFactory
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
			playlistTracker = ((HlsPlaylistTracker) (new DefaultHlsPlaylistTracker(hlsdatasourcefactory, i, ((com.google.android.exoplayer2.upstream.ParsingLoadable$Parser) (obj)))));
	//   23   46:aload_0         
	//   24   47:new             #81  <Class DefaultHlsPlaylistTracker>
	//   25   50:dup             
	//   26   51:aload           4
	//   27   53:iload_2         
	//   28   54:aload_3         
	//   29   55:invokespecial   #84  <Method void DefaultHlsPlaylistTracker(HlsDataSourceFactory, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//   30   58:putfield        #74  <Field HlsPlaylistTracker playlistTracker>
		}
		return new HlsMediaSource(uri, hlsDataSourceFactory, extractorFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, playlistTracker, allowChunklessPreparation, tag, ((HlsMediaSource._cls1) (null)));
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

	public HlsMediaSource$Factory setAllowChunklessPreparation(boolean flag)
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

	public HlsMediaSource$Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositesequenceableloaderfactory)
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

	public HlsMediaSource$Factory setExtractorFactory(HlsExtractorFactory hlsextractorfactory)
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

	public HlsMediaSource$Factory setMinLoadableRetryCount(int i)
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

	public HlsMediaSource$Factory setPlaylistParser(com.google.android.exoplayer2.upstream.ParsingLoadable$Parser parsingloadable$parser)
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
		playlistParser = (com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)Assertions.checkNotNull(((Object) (parsingloadable$parser)));
	//   18   31:aload_0         
	//   19   32:aload_1         
	//   20   33:invokestatic    #39  <Method Object Assertions.checkNotNull(Object)>
	//   21   36:checkcast       #124 <Class com.google.android.exoplayer2.upstream.ParsingLoadable$Parser>
	//   22   39:putfield        #76  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser playlistParser>
		return this;
	//   23   42:aload_0         
	//   24   43:areturn         
	}

	public HlsMediaSource$Factory setPlaylistTracker(HlsPlaylistTracker hlsplaylisttracker)
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

	public HlsMediaSource$Factory setTag(Object obj)
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
	private com.google.android.exoplayer2.upstream.ParsingLoadable$Parser playlistParser;
	private HlsPlaylistTracker playlistTracker;
	private Object tag;

	public HlsMediaSource$Factory(HlsDataSourceFactory hlsdatasourcefactory)
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

	public HlsMediaSource$Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
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
