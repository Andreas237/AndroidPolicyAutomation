// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.*;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsUtil;
import com.google.android.exoplayer2.upstream.*;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming:
//			SsMediaPeriod

public final class SsMediaSource extends BaseMediaSource
	implements com.google.android.exoplayer2.upstream.Loader.Callback
{
	public static final class Factory
		implements com.google.android.exoplayer2.source.ads.AdsMediaSource.MediaSourceFactory
	{

		public volatile MediaSource createMediaSource(Uri uri)
		{
			return ((MediaSource) (createMediaSource(uri)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #62  <Method SsMediaSource createMediaSource(Uri)>
		//    3    5:areturn         
		}

		public SsMediaSource createMediaSource(Uri uri)
		{
			isCreateCalled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #64  <Field boolean isCreateCalled>
			if(manifestParser == null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
		//*   5    9:ifnonnull       23
				manifestParser = ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new SsManifestParser()));
		//    6   12:aload_0         
		//    7   13:new             #68  <Class SsManifestParser>
		//    8   16:dup             
		//    9   17:invokespecial   #69  <Method void SsManifestParser()>
		//   10   20:putfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
			return new SsMediaSource(((SsManifest) (null)), (Uri)Assertions.checkNotNull(((Object) (uri))), manifestDataSourceFactory, manifestParser, chunkSourceFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, livePresentationDelayMs, tag);
		//   11   23:new             #8   <Class SsMediaSource>
		//   12   26:dup             
		//   13   27:aconst_null     
		//   14   28:aload_1         
		//   15   29:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//   16   32:checkcast       #71  <Class Uri>
		//   17   35:aload_0         
		//   18   36:getfield        #44  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
		//   19   39:aload_0         
		//   20   40:getfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
		//   21   43:aload_0         
		//   22   44:getfield        #42  <Field SsChunkSource$Factory chunkSourceFactory>
		//   23   47:aload_0         
		//   24   48:getfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		//   25   51:aload_0         
		//   26   52:getfield        #46  <Field int minLoadableRetryCount>
		//   27   55:aload_0         
		//   28   56:getfield        #50  <Field long livePresentationDelayMs>
		//   29   59:aload_0         
		//   30   60:getfield        #73  <Field Object tag>
		//   31   63:aconst_null     
		//   32   64:invokespecial   #76  <Method void SsMediaSource(SsManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, SsChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object, SsMediaSource$1)>
		//   33   67:areturn         
		}

		public SsMediaSource createMediaSource(Uri uri, Handler handler, MediaSourceEventListener mediasourceeventlistener)
		{
			uri = ((Uri) (createMediaSource(uri)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #62  <Method SsMediaSource createMediaSource(Uri)>
		//    3    5:astore_1        
			if(handler != null && mediasourceeventlistener != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          20
		//*   6   10:aload_3         
		//*   7   11:ifnull          20
				((SsMediaSource) (uri)).addEventListener(handler, mediasourceeventlistener);
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #82  <Method void SsMediaSource.addEventListener(Handler, MediaSourceEventListener)>
			return ((SsMediaSource) (uri));
		//   12   20:aload_1         
		//   13   21:areturn         
		}

		public SsMediaSource createMediaSource(SsManifest ssmanifest)
		{
			Assertions.checkArgument(ssmanifest.isLive ^ true);
		//    0    0:aload_1         
		//    1    1:getfield        #89  <Field boolean SsManifest.isLive>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #93  <Method void Assertions.checkArgument(boolean)>
			isCreateCalled = true;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #64  <Field boolean isCreateCalled>
			return new SsMediaSource(ssmanifest, ((Uri) (null)), ((com.google.android.exoplayer2.upstream.DataSource.Factory) (null)), ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (null)), chunkSourceFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, livePresentationDelayMs, tag);
		//    8   14:new             #8   <Class SsMediaSource>
		//    9   17:dup             
		//   10   18:aload_1         
		//   11   19:aconst_null     
		//   12   20:aconst_null     
		//   13   21:aconst_null     
		//   14   22:aload_0         
		//   15   23:getfield        #42  <Field SsChunkSource$Factory chunkSourceFactory>
		//   16   26:aload_0         
		//   17   27:getfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		//   18   30:aload_0         
		//   19   31:getfield        #46  <Field int minLoadableRetryCount>
		//   20   34:aload_0         
		//   21   35:getfield        #50  <Field long livePresentationDelayMs>
		//   22   38:aload_0         
		//   23   39:getfield        #73  <Field Object tag>
		//   24   42:aconst_null     
		//   25   43:invokespecial   #76  <Method void SsMediaSource(SsManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, SsChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object, SsMediaSource$1)>
		//   26   46:areturn         
		}

		public SsMediaSource createMediaSource(SsManifest ssmanifest, Handler handler, MediaSourceEventListener mediasourceeventlistener)
		{
			ssmanifest = ((SsManifest) (createMediaSource(ssmanifest)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #96  <Method SsMediaSource createMediaSource(SsManifest)>
		//    3    5:astore_1        
			if(handler != null && mediasourceeventlistener != null)
		//*   4    6:aload_2         
		//*   5    7:ifnull          20
		//*   6   10:aload_3         
		//*   7   11:ifnull          20
				((SsMediaSource) (ssmanifest)).addEventListener(handler, mediasourceeventlistener);
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #82  <Method void SsMediaSource.addEventListener(Handler, MediaSourceEventListener)>
			return ((SsMediaSource) (ssmanifest));
		//   12   20:aload_1         
		//   13   21:areturn         
		}

		public int[] getSupportedTypes()
		{
			return (new int[] {
				1
			});
		//    0    0:iconst_1        
		//    1    1:newarray        int[]
		//    2    3:dup             
		//    3    4:iconst_0        
		//    4    5:iconst_1        
		//    5    6:iastore         
		//    6    7:areturn         
		}

		public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositesequenceableloaderfactory)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory)Assertions.checkNotNull(((Object) (compositesequenceableloaderfactory)));
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//    8   14:checkcast       #105 <Class CompositeSequenceableLoaderFactory>
		//    9   17:putfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
			return this;
		//   10   20:aload_0         
		//   11   21:areturn         
		}

		public Factory setLivePresentationDelayMs(long l)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			livePresentationDelayMs = l;
		//    5    9:aload_0         
		//    6   10:lload_1         
		//    7   11:putfield        #50  <Field long livePresentationDelayMs>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setManifestParser(com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			manifestParser = (com.google.android.exoplayer2.upstream.ParsingLoadable.Parser)Assertions.checkNotNull(((Object) (parser)));
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//    8   14:checkcast       #111 <Class com.google.android.exoplayer2.upstream.ParsingLoadable$Parser>
		//    9   17:putfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
			return this;
		//   10   20:aload_0         
		//   11   21:areturn         
		}

		public Factory setMinLoadableRetryCount(int i)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			minLoadableRetryCount = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #46  <Field int minLoadableRetryCount>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		public Factory setTag(Object obj)
		{
			Assertions.checkState(isCreateCalled ^ true);
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field boolean isCreateCalled>
		//    2    4:iconst_1        
		//    3    5:ixor            
		//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
			tag = obj;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #73  <Field Object tag>
			return this;
		//    8   14:aload_0         
		//    9   15:areturn         
		}

		private final SsChunkSource.Factory chunkSourceFactory;
		private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
		private boolean isCreateCalled;
		private long livePresentationDelayMs;
		private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
		private com.google.android.exoplayer2.upstream.ParsingLoadable.Parser manifestParser;
		private int minLoadableRetryCount;
		private Object tag;

		public Factory(SsChunkSource.Factory factory, com.google.android.exoplayer2.upstream.DataSource.Factory factory1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
			chunkSourceFactory = (SsChunkSource.Factory)Assertions.checkNotNull(((Object) (factory)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//    5    9:checkcast       #40  <Class SsChunkSource$Factory>
		//    6   12:putfield        #42  <Field SsChunkSource$Factory chunkSourceFactory>
			manifestDataSourceFactory = factory1;
		//    7   15:aload_0         
		//    8   16:aload_2         
		//    9   17:putfield        #44  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
			minLoadableRetryCount = 3;
		//   10   20:aload_0         
		//   11   21:iconst_3        
		//   12   22:putfield        #46  <Field int minLoadableRetryCount>
			livePresentationDelayMs = 30000L;
		//   13   25:aload_0         
		//   14   26:ldc2w           #47  <Long 30000L>
		//   15   29:putfield        #50  <Field long livePresentationDelayMs>
			compositeSequenceableLoaderFactory = ((CompositeSequenceableLoaderFactory) (new DefaultCompositeSequenceableLoaderFactory()));
		//   16   32:aload_0         
		//   17   33:new             #52  <Class DefaultCompositeSequenceableLoaderFactory>
		//   18   36:dup             
		//   19   37:invokespecial   #53  <Method void DefaultCompositeSequenceableLoaderFactory()>
		//   20   40:putfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		//   21   43:return          
		}
	}


	public SsMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, SsChunkSource.Factory factory1, int i, long l, Handler handler, 
			MediaSourceEventListener mediasourceeventlistener)
	{
		this(uri, factory, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new SsManifestParser())), factory1, i, l, handler, mediasourceeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #74  <Class SsManifestParser>
	//    4    6:dup             
	//    5    7:invokespecial   #76  <Method void SsManifestParser()>
	//    6   10:aload_3         
	//    7   11:iload           4
	//    8   13:lload           5
	//    9   15:aload           7
	//   10   17:aload           8
	//   11   19:invokespecial   #79  <Method void SsMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, SsChunkSource$Factory, int, long, Handler, MediaSourceEventListener)>
	//   12   22:return          
	}

	public SsMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, SsChunkSource.Factory factory1, Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		this(uri, factory, factory1, 3, 30000L, handler, mediasourceeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_3        
	//    5    5:ldc2w           #15  <Long 30000L>
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #83  <Method void SsMediaSource(Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, SsChunkSource$Factory, int, long, Handler, MediaSourceEventListener)>
	//    9   15:return          
	}

	public SsMediaSource(Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser, SsChunkSource.Factory factory1, int i, long l, 
			Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		this(((SsManifest) (null)), uri, factory, parser, factory1, ((CompositeSequenceableLoaderFactory) (new DefaultCompositeSequenceableLoaderFactory())), i, l, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:new             #85  <Class DefaultCompositeSequenceableLoaderFactory>
	//    7   10:dup             
	//    8   11:invokespecial   #86  <Method void DefaultCompositeSequenceableLoaderFactory()>
	//    9   14:iload           5
	//   10   16:lload           6
	//   11   18:aconst_null     
	//   12   19:invokespecial   #89  <Method void SsMediaSource(SsManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, SsChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object)>
		if(handler != null && mediasourceeventlistener != null)
	//*  13   22:aload           8
	//*  14   24:ifnull          41
	//*  15   27:aload           9
	//*  16   29:ifnull          41
		{
			addEventListener(handler, mediasourceeventlistener);
	//   17   32:aload_0         
	//   18   33:aload           8
	//   19   35:aload           9
	//   20   37:invokevirtual   #93  <Method void addEventListener(Handler, MediaSourceEventListener)>
			return;
	//   21   40:return          
		} else
		{
			return;
	//   22   41:return          
		}
	}

	private SsMediaSource(SsManifest ssmanifest, Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser, SsChunkSource.Factory factory1, CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, int i, 
			long l, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #96  <Method void BaseMediaSource()>
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore          12
		boolean flag;
		if(ssmanifest != null && ssmanifest.isLive)
	//*   4    7:aload_1         
	//*   5    8:ifnull          27
	//*   6   11:aload_1         
	//*   7   12:getfield        #101 <Field boolean SsManifest.isLive>
	//*   8   15:ifne            21
	//*   9   18:goto            27
			flag = false;
	//   10   21:iconst_0        
	//   11   22:istore          11
		else
	//*  12   24:goto            30
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore          11
		Assertions.checkState(flag);
	//   15   30:iload           11
	//   16   32:invokestatic    #107 <Method void Assertions.checkState(boolean)>
		manifest = ssmanifest;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #109 <Field SsManifest manifest>
		if(uri == null)
	//*  20   40:aload_2         
	//*  21   41:ifnonnull       49
			uri = null;
	//   22   44:aconst_null     
	//   23   45:astore_2        
		else
	//*  24   46:goto            54
			uri = SsUtil.fixManifestUri(uri);
	//   25   49:aload_2         
	//   26   50:invokestatic    #115 <Method Uri SsUtil.fixManifestUri(Uri)>
	//   27   53:astore_2        
		manifestUri = uri;
	//   28   54:aload_0         
	//   29   55:aload_2         
	//   30   56:putfield        #117 <Field Uri manifestUri>
		manifestDataSourceFactory = factory;
	//   31   59:aload_0         
	//   32   60:aload_3         
	//   33   61:putfield        #119 <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
		manifestParser = parser;
	//   34   64:aload_0         
	//   35   65:aload           4
	//   36   67:putfield        #121 <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
		chunkSourceFactory = factory1;
	//   37   70:aload_0         
	//   38   71:aload           5
	//   39   73:putfield        #123 <Field SsChunkSource$Factory chunkSourceFactory>
		compositeSequenceableLoaderFactory = compositesequenceableloaderfactory;
	//   40   76:aload_0         
	//   41   77:aload           6
	//   42   79:putfield        #125 <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
		minLoadableRetryCount = i;
	//   43   82:aload_0         
	//   44   83:iload           7
	//   45   85:putfield        #127 <Field int minLoadableRetryCount>
		livePresentationDelayMs = l;
	//   46   88:aload_0         
	//   47   89:lload           8
	//   48   91:putfield        #129 <Field long livePresentationDelayMs>
		manifestEventDispatcher = createEventDispatcher(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (null)));
	//   49   94:aload_0         
	//   50   95:aload_0         
	//   51   96:aconst_null     
	//   52   97:invokevirtual   #133 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//   53  100:putfield        #135 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
		tag = obj;
	//   54  103:aload_0         
	//   55  104:aload           10
	//   56  106:putfield        #137 <Field Object tag>
		if(ssmanifest != null)
	//*  57  109:aload_1         
	//*  58  110:ifnull          120
			flag = flag1;
	//   59  113:iload           12
	//   60  115:istore          11
		else
	//*  61  117:goto            123
			flag = false;
	//   62  120:iconst_0        
	//   63  121:istore          11
		sideloadedManifest = flag;
	//   64  123:aload_0         
	//   65  124:iload           11
	//   66  126:putfield        #139 <Field boolean sideloadedManifest>
		mediaPeriods = new ArrayList();
	//   67  129:aload_0         
	//   68  130:new             #141 <Class ArrayList>
	//   69  133:dup             
	//   70  134:invokespecial   #142 <Method void ArrayList()>
	//   71  137:putfield        #144 <Field ArrayList mediaPeriods>
	//   72  140:return          
	}

	SsMediaSource(SsManifest ssmanifest, Uri uri, com.google.android.exoplayer2.upstream.DataSource.Factory factory, com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser, SsChunkSource.Factory factory1, CompositeSequenceableLoaderFactory compositesequenceableloaderfactory, int i, 
			long l, Object obj, _cls1 _pcls1)
	{
		this(ssmanifest, uri, factory, parser, factory1, compositesequenceableloaderfactory, i, l, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:iload           7
	//    8   12:lload           8
	//    9   14:aload           10
	//   10   16:invokespecial   #89  <Method void SsMediaSource(SsManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, SsChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object)>
	//   11   19:return          
	}

	public SsMediaSource(SsManifest ssmanifest, SsChunkSource.Factory factory, int i, Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		this(ssmanifest, ((Uri) (null)), ((com.google.android.exoplayer2.upstream.DataSource.Factory) (null)), ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (null)), factory, ((CompositeSequenceableLoaderFactory) (new DefaultCompositeSequenceableLoaderFactory())), i, 30000L, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:aload_2         
	//    6    6:new             #85  <Class DefaultCompositeSequenceableLoaderFactory>
	//    7    9:dup             
	//    8   10:invokespecial   #86  <Method void DefaultCompositeSequenceableLoaderFactory()>
	//    9   13:iload_3         
	//   10   14:ldc2w           #15  <Long 30000L>
	//   11   17:aconst_null     
	//   12   18:invokespecial   #89  <Method void SsMediaSource(SsManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, SsChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object)>
		if(handler != null && mediasourceeventlistener != null)
	//*  13   21:aload           4
	//*  14   23:ifnull          40
	//*  15   26:aload           5
	//*  16   28:ifnull          40
		{
			addEventListener(handler, mediasourceeventlistener);
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:aload           5
	//   20   36:invokevirtual   #93  <Method void addEventListener(Handler, MediaSourceEventListener)>
			return;
	//   21   39:return          
		} else
		{
			return;
	//   22   40:return          
		}
	}

	public SsMediaSource(SsManifest ssmanifest, SsChunkSource.Factory factory, Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		this(ssmanifest, factory, 3, handler, mediasourceeventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_3        
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:invokespecial   #151 <Method void SsMediaSource(SsManifest, SsChunkSource$Factory, int, Handler, MediaSourceEventListener)>
	//    7   10:return          
	}

	private void processManifest()
	{
		for(int i = 0; i < mediaPeriods.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #144 <Field ArrayList mediaPeriods>
	//*   5    7:invokevirtual   #161 <Method int ArrayList.size()>
	//*   6   10:icmpge          38
			((SsMediaPeriod)mediaPeriods.get(i)).updateManifest(manifest);
	//    7   13:aload_0         
	//    8   14:getfield        #144 <Field ArrayList mediaPeriods>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #165 <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #167 <Class SsMediaPeriod>
	//   12   24:aload_0         
	//   13   25:getfield        #109 <Field SsManifest manifest>
	//   14   28:invokevirtual   #171 <Method void SsMediaPeriod.updateManifest(SsManifest)>

	//   15   31:iload_1         
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:istore_1        
	//*  19   35:goto            2
		com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement astreamelement[] = manifest.streamElements;
	//   20   38:aload_0         
	//   21   39:getfield        #109 <Field SsManifest manifest>
	//   22   42:getfield        #175 <Field com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement[] SsManifest.streamElements>
	//   23   45:astore          11
		int k = astreamelement.length;
	//   24   47:aload           11
	//   25   49:arraylength     
	//   26   50:istore_2        
		long l4 = 0x0L;
	//   27   51:ldc2w           #176 <Long 0x0L>
	//   28   54:lstore          7
		long l = 0xffffffffL;
	//   29   56:ldc2w           #178 <Long 0xffffffffL>
	//   30   59:lstore_3        
		for(int j = 0; j < k;)
	//*  31   60:iconst_0        
	//*  32   61:istore_1        
	//*  33   62:iload_1         
	//*  34   63:iload_2         
	//*  35   64:icmpge          146
		{
			com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement streamelement = astreamelement[j];
	//   36   67:aload           11
	//   37   69:iload_1         
	//   38   70:aaload          
	//   39   71:astore          12
			long l5 = l4;
	//   40   73:lload           7
	//   41   75:lstore          9
			long l1 = l;
	//   42   77:lload_3         
	//   43   78:lstore          5
			if(streamelement.chunkCount > 0)
	//*  44   80:aload           12
	//*  45   82:getfield        #184 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//*  46   85:ifle            132
			{
				l1 = Math.min(l, streamelement.getStartTimeUs(0));
	//   47   88:lload_3         
	//   48   89:aload           12
	//   49   91:iconst_0        
	//   50   92:invokevirtual   #188 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getStartTimeUs(int)>
	//   51   95:invokestatic    #194 <Method long Math.min(long, long)>
	//   52   98:lstore          5
				l5 = Math.max(l4, streamelement.getStartTimeUs(streamelement.chunkCount - 1) + streamelement.getChunkDurationUs(streamelement.chunkCount - 1));
	//   53  100:lload           7
	//   54  102:aload           12
	//   55  104:aload           12
	//   56  106:getfield        #184 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//   57  109:iconst_1        
	//   58  110:isub            
	//   59  111:invokevirtual   #188 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getStartTimeUs(int)>
	//   60  114:aload           12
	//   61  116:aload           12
	//   62  118:getfield        #184 <Field int com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.chunkCount>
	//   63  121:iconst_1        
	//   64  122:isub            
	//   65  123:invokevirtual   #197 <Method long com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest$StreamElement.getChunkDurationUs(int)>
	//   66  126:ladd            
	//   67  127:invokestatic    #200 <Method long Math.max(long, long)>
	//   68  130:lstore          9
			}
			j++;
	//   69  132:iload_1         
	//   70  133:iconst_1        
	//   71  134:iadd            
	//   72  135:istore_1        
			l4 = l5;
	//   73  136:lload           9
	//   74  138:lstore          7
			l = l1;
	//   75  140:lload           5
	//   76  142:lstore_3        
		}

	//*  77  143:goto            62
		SinglePeriodTimeline singleperiodtimeline;
		if(l == 0xffffffffL)
	//*  78  146:lload_3         
	//*  79  147:ldc2w           #178 <Long 0xffffffffL>
	//*  80  150:lcmp            
	//*  81  151:ifne            201
		{
			if(manifest.isLive)
	//*  82  154:aload_0         
	//*  83  155:getfield        #109 <Field SsManifest manifest>
	//*  84  158:getfield        #101 <Field boolean SsManifest.isLive>
	//*  85  161:ifeq            171
				l = 0x1L;
	//   86  164:ldc2w           #201 <Long 0x1L>
	//   87  167:lstore_3        
			else
	//*  88  168:goto            173
				l = 0L;
	//   89  171:lconst_0        
	//   90  172:lstore_3        
			singleperiodtimeline = new SinglePeriodTimeline(l, 0L, 0L, 0L, true, manifest.isLive, tag);
	//   91  173:new             #204 <Class SinglePeriodTimeline>
	//   92  176:dup             
	//   93  177:lload_3         
	//   94  178:lconst_0        
	//   95  179:lconst_0        
	//   96  180:lconst_0        
	//   97  181:iconst_1        
	//   98  182:aload_0         
	//   99  183:getfield        #109 <Field SsManifest manifest>
	//  100  186:getfield        #101 <Field boolean SsManifest.isLive>
	//  101  189:aload_0         
	//  102  190:getfield        #137 <Field Object tag>
	//  103  193:invokespecial   #207 <Method void SinglePeriodTimeline(long, long, long, long, boolean, boolean, Object)>
	//  104  196:astore          11
		} else
	//* 105  198:goto            385
		if(manifest.isLive)
	//* 106  201:aload_0         
	//* 107  202:getfield        #109 <Field SsManifest manifest>
	//* 108  205:getfield        #101 <Field boolean SsManifest.isLive>
	//* 109  208:ifeq            327
		{
			long l2 = l;
	//  110  211:lload_3         
	//  111  212:lstore          5
			if(manifest.dvrWindowLengthUs != 0x1L)
	//* 112  214:aload_0         
	//* 113  215:getfield        #109 <Field SsManifest manifest>
	//* 114  218:getfield        #210 <Field long SsManifest.dvrWindowLengthUs>
	//* 115  221:ldc2w           #201 <Long 0x1L>
	//* 116  224:lcmp            
	//* 117  225:ifeq            259
			{
				l2 = l;
	//  118  228:lload_3         
	//  119  229:lstore          5
				if(manifest.dvrWindowLengthUs > 0L)
	//* 120  231:aload_0         
	//* 121  232:getfield        #109 <Field SsManifest manifest>
	//* 122  235:getfield        #210 <Field long SsManifest.dvrWindowLengthUs>
	//* 123  238:lconst_0        
	//* 124  239:lcmp            
	//* 125  240:ifle            259
					l2 = Math.max(l, l4 - manifest.dvrWindowLengthUs);
	//  126  243:lload_3         
	//  127  244:lload           7
	//  128  246:aload_0         
	//  129  247:getfield        #109 <Field SsManifest manifest>
	//  130  250:getfield        #210 <Field long SsManifest.dvrWindowLengthUs>
	//  131  253:lsub            
	//  132  254:invokestatic    #200 <Method long Math.max(long, long)>
	//  133  257:lstore          5
			}
			l4 -= l2;
	//  134  259:lload           7
	//  135  261:lload           5
	//  136  263:lsub            
	//  137  264:lstore          7
			l = l4 - C.msToUs(livePresentationDelayMs);
	//  138  266:lload           7
	//  139  268:aload_0         
	//  140  269:getfield        #129 <Field long livePresentationDelayMs>
	//  141  272:invokestatic    #216 <Method long C.msToUs(long)>
	//  142  275:lsub            
	//  143  276:lstore_3        
			if(l < 0x4c4b40L)
	//* 144  277:lload_3         
	//* 145  278:ldc2w           #23  <Long 0x4c4b40L>
	//* 146  281:lcmp            
	//* 147  282:ifge            301
				l = Math.min(0x4c4b40L, l4 / 2L);
	//  148  285:ldc2w           #23  <Long 0x4c4b40L>
	//  149  288:lload           7
	//  150  290:ldc2w           #217 <Long 2L>
	//  151  293:ldiv            
	//  152  294:invokestatic    #194 <Method long Math.min(long, long)>
	//  153  297:lstore_3        
	//* 154  298:goto            301
			singleperiodtimeline = new SinglePeriodTimeline(0x1L, l4, l2, l, true, true, tag);
	//  155  301:new             #204 <Class SinglePeriodTimeline>
	//  156  304:dup             
	//  157  305:ldc2w           #201 <Long 0x1L>
	//  158  308:lload           7
	//  159  310:lload           5
	//  160  312:lload_3         
	//  161  313:iconst_1        
	//  162  314:iconst_1        
	//  163  315:aload_0         
	//  164  316:getfield        #137 <Field Object tag>
	//  165  319:invokespecial   #207 <Method void SinglePeriodTimeline(long, long, long, long, boolean, boolean, Object)>
	//  166  322:astore          11
		} else
	//* 167  324:goto            385
		{
			long l3;
			if(manifest.durationUs != 0x1L)
	//* 168  327:aload_0         
	//* 169  328:getfield        #109 <Field SsManifest manifest>
	//* 170  331:getfield        #221 <Field long SsManifest.durationUs>
	//* 171  334:ldc2w           #201 <Long 0x1L>
	//* 172  337:lcmp            
	//* 173  338:ifeq            353
				l3 = manifest.durationUs;
	//  174  341:aload_0         
	//  175  342:getfield        #109 <Field SsManifest manifest>
	//  176  345:getfield        #221 <Field long SsManifest.durationUs>
	//  177  348:lstore          5
			else
	//* 178  350:goto            362
				l3 = l4 - l;
	//  179  353:lload           7
	//  180  355:lload_3         
	//  181  356:lsub            
	//  182  357:lstore          5
	//* 183  359:goto            350
			singleperiodtimeline = new SinglePeriodTimeline(l + l3, l3, l, 0L, true, false, tag);
	//  184  362:new             #204 <Class SinglePeriodTimeline>
	//  185  365:dup             
	//  186  366:lload_3         
	//  187  367:lload           5
	//  188  369:ladd            
	//  189  370:lload           5
	//  190  372:lload_3         
	//  191  373:lconst_0        
	//  192  374:iconst_1        
	//  193  375:iconst_0        
	//  194  376:aload_0         
	//  195  377:getfield        #137 <Field Object tag>
	//  196  380:invokespecial   #207 <Method void SinglePeriodTimeline(long, long, long, long, boolean, boolean, Object)>
	//  197  383:astore          11
		}
		refreshSourceInfo(((com.google.android.exoplayer2.Timeline) (singleperiodtimeline)), ((Object) (manifest)));
	//  198  385:aload_0         
	//  199  386:aload           11
	//  200  388:aload_0         
	//  201  389:getfield        #109 <Field SsManifest manifest>
	//  202  392:invokevirtual   #225 <Method void refreshSourceInfo(com.google.android.exoplayer2.Timeline, Object)>
	//  203  395:return          
	}

	private void scheduleManifestRefresh()
	{
		if(!manifest.isLive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field SsManifest manifest>
	//*   2    4:getfield        #101 <Field boolean SsManifest.isLive>
	//*   3    7:ifne            11
		{
			return;
	//    4   10:return          
		} else
		{
			long l = Math.max(0L, (manifestLoadStartTimestamp + 5000L) - SystemClock.elapsedRealtime());
	//    5   11:lconst_0        
	//    6   12:aload_0         
	//    7   13:getfield        #228 <Field long manifestLoadStartTimestamp>
	//    8   16:ldc2w           #229 <Long 5000L>
	//    9   19:ladd            
	//   10   20:invokestatic    #236 <Method long SystemClock.elapsedRealtime()>
	//   11   23:lsub            
	//   12   24:invokestatic    #200 <Method long Math.max(long, long)>
	//   13   27:lstore_1        
			manifestRefreshHandler.postDelayed(new Runnable() {

				public void run()
				{
					startLoadingManifest();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field SsMediaSource this$0>
				//    2    4:invokestatic    #24  <Method void SsMediaSource.access$100(SsMediaSource)>
				//    3    7:return          
				}

				final SsMediaSource this$0;

			
			{
				this$0 = SsMediaSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SsMediaSource this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
, l);
	//   14   28:aload_0         
	//   15   29:getfield        #238 <Field Handler manifestRefreshHandler>
	//   16   32:new             #9   <Class SsMediaSource$1>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #240 <Method void SsMediaSource$1(SsMediaSource)>
	//   20   40:lload_1         
	//   21   41:invokevirtual   #246 <Method boolean Handler.postDelayed(Runnable, long)>
	//   22   44:pop             
			return;
	//   23   45:return          
		}
	}

	private void startLoadingManifest()
	{
		ParsingLoadable parsingloadable = new ParsingLoadable(manifestDataSource, manifestUri, 4, manifestParser);
	//    0    0:new             #248 <Class ParsingLoadable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #250 <Field DataSource manifestDataSource>
	//    4    8:aload_0         
	//    5    9:getfield        #117 <Field Uri manifestUri>
	//    6   12:iconst_4        
	//    7   13:aload_0         
	//    8   14:getfield        #121 <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
	//    9   17:invokespecial   #253 <Method void ParsingLoadable(DataSource, Uri, int, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser)>
	//   10   20:astore_3        
		long l = manifestLoader.startLoading(((com.google.android.exoplayer2.upstream.Loader.Loadable) (parsingloadable)), ((com.google.android.exoplayer2.upstream.Loader.Callback) (this)), minLoadableRetryCount);
	//   11   21:aload_0         
	//   12   22:getfield        #255 <Field Loader manifestLoader>
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #127 <Field int minLoadableRetryCount>
	//   17   31:invokevirtual   #261 <Method long Loader.startLoading(com.google.android.exoplayer2.upstream.Loader$Loadable, com.google.android.exoplayer2.upstream.Loader$Callback, int)>
	//   18   34:lstore_1        
		manifestEventDispatcher.loadStarted(parsingloadable.dataSpec, parsingloadable.type, l);
	//   19   35:aload_0         
	//   20   36:getfield        #135 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//   21   39:aload_3         
	//   22   40:getfield        #265 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
	//   23   43:aload_3         
	//   24   44:getfield        #268 <Field int ParsingLoadable.type>
	//   25   47:lload_1         
	//   26   48:invokevirtual   #274 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadStarted(com.google.android.exoplayer2.upstream.DataSpec, int, long)>
	//   27   51:return          
	}

	public MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		boolean flag;
		if(mediaperiodid.periodIndex == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #281 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.periodIndex>
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
	//    9   15:invokestatic    #284 <Method void Assertions.checkArgument(boolean)>
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (createEventDispatcher(mediaperiodid)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #133 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//   13   23:astore_1        
		mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (new SsMediaPeriod(manifest, chunkSourceFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, ((com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher) (mediaperiodid)), manifestLoaderErrorThrower, allocator)));
	//   14   24:new             #167 <Class SsMediaPeriod>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:getfield        #109 <Field SsManifest manifest>
	//   18   32:aload_0         
	//   19   33:getfield        #123 <Field SsChunkSource$Factory chunkSourceFactory>
	//   20   36:aload_0         
	//   21   37:getfield        #125 <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//   22   40:aload_0         
	//   23   41:getfield        #127 <Field int minLoadableRetryCount>
	//   24   44:aload_1         
	//   25   45:aload_0         
	//   26   46:getfield        #286 <Field LoaderErrorThrower manifestLoaderErrorThrower>
	//   27   49:aload_2         
	//   28   50:invokespecial   #289 <Method void SsMediaPeriod(SsManifest, SsChunkSource$Factory, CompositeSequenceableLoaderFactory, int, com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher, LoaderErrorThrower, Allocator)>
	//   29   53:astore_1        
		mediaPeriods.add(((Object) (mediaperiodid)));
	//   30   54:aload_0         
	//   31   55:getfield        #144 <Field ArrayList mediaPeriods>
	//   32   58:aload_1         
	//   33   59:invokevirtual   #293 <Method boolean ArrayList.add(Object)>
	//   34   62:pop             
		return ((MediaPeriod) (mediaperiodid));
	//   35   63:aload_1         
	//   36   64:areturn         
	}

	public void maybeThrowSourceInfoRefreshError()
		throws IOException
	{
		manifestLoaderErrorThrower.maybeThrowError();
	//    0    0:aload_0         
	//    1    1:getfield        #286 <Field LoaderErrorThrower manifestLoaderErrorThrower>
	//    2    4:invokeinterface #301 <Method void LoaderErrorThrower.maybeThrowError()>
	//    3    9:return          
	}

	public volatile void onLoadCanceled(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, boolean flag)
	{
		onLoadCanceled((ParsingLoadable)loadable, l, l1, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #248 <Class ParsingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:iload           6
	//    6   10:invokevirtual   #307 <Method void onLoadCanceled(ParsingLoadable, long, long, boolean)>
	//    7   13:return          
	}

	public void onLoadCanceled(ParsingLoadable parsingloadable, long l, long l1, boolean flag)
	{
		manifestEventDispatcher.loadCanceled(parsingloadable.dataSpec, parsingloadable.type, l, l1, parsingloadable.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #265 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
	//    4    8:aload_1         
	//    5    9:getfield        #268 <Field int ParsingLoadable.type>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #310 <Method long ParsingLoadable.bytesLoaded()>
	//   10   19:invokevirtual   #314 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCanceled(com.google.android.exoplayer2.upstream.DataSpec, int, long, long, long)>
	//   11   22:return          
	}

	public volatile void onLoadCompleted(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1)
	{
		onLoadCompleted((ParsingLoadable)loadable, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #248 <Class ParsingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #320 <Method void onLoadCompleted(ParsingLoadable, long, long)>
	//    6   11:return          
	}

	public void onLoadCompleted(ParsingLoadable parsingloadable, long l, long l1)
	{
		manifestEventDispatcher.loadCompleted(parsingloadable.dataSpec, parsingloadable.type, l, l1, parsingloadable.bytesLoaded());
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//    2    4:aload_1         
	//    3    5:getfield        #265 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
	//    4    8:aload_1         
	//    5    9:getfield        #268 <Field int ParsingLoadable.type>
	//    6   12:lload_2         
	//    7   13:lload           4
	//    8   15:aload_1         
	//    9   16:invokevirtual   #310 <Method long ParsingLoadable.bytesLoaded()>
	//   10   19:invokevirtual   #323 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadCompleted(com.google.android.exoplayer2.upstream.DataSpec, int, long, long, long)>
		manifest = (SsManifest)parsingloadable.getResult();
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #327 <Method Object ParsingLoadable.getResult()>
	//   14   27:checkcast       #98  <Class SsManifest>
	//   15   30:putfield        #109 <Field SsManifest manifest>
		manifestLoadStartTimestamp = l - l1;
	//   16   33:aload_0         
	//   17   34:lload_2         
	//   18   35:lload           4
	//   19   37:lsub            
	//   20   38:putfield        #228 <Field long manifestLoadStartTimestamp>
		processManifest();
	//   21   41:aload_0         
	//   22   42:invokespecial   #329 <Method void processManifest()>
		scheduleManifestRefresh();
	//   23   45:aload_0         
	//   24   46:invokespecial   #331 <Method void scheduleManifestRefresh()>
	//   25   49:return          
	}

	public volatile int onLoadError(com.google.android.exoplayer2.upstream.Loader.Loadable loadable, long l, long l1, IOException ioexception)
	{
		return onLoadError((ParsingLoadable)loadable, l, l1, ioexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #248 <Class ParsingLoadable>
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:aload           6
	//    6   10:invokevirtual   #337 <Method int onLoadError(ParsingLoadable, long, long, IOException)>
	//    7   13:ireturn         
	}

	public int onLoadError(ParsingLoadable parsingloadable, long l, long l1, IOException ioexception)
	{
		boolean flag = ioexception instanceof ParserException;
	//    0    0:aload           6
	//    1    2:instanceof      #339 <Class ParserException>
	//    2    5:istore          7
		manifestEventDispatcher.loadError(parsingloadable.dataSpec, parsingloadable.type, l, l1, parsingloadable.bytesLoaded(), ioexception, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher manifestEventDispatcher>
	//    5   11:aload_1         
	//    6   12:getfield        #265 <Field com.google.android.exoplayer2.upstream.DataSpec ParsingLoadable.dataSpec>
	//    7   15:aload_1         
	//    8   16:getfield        #268 <Field int ParsingLoadable.type>
	//    9   19:lload_2         
	//   10   20:lload           4
	//   11   22:aload_1         
	//   12   23:invokevirtual   #310 <Method long ParsingLoadable.bytesLoaded()>
	//   13   26:aload           6
	//   14   28:iload           7
	//   15   30:invokevirtual   #343 <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(com.google.android.exoplayer2.upstream.DataSpec, int, long, long, long, IOException, boolean)>
		return !flag ? 0 : 3;
	//   16   33:iload           7
	//   17   35:ifeq            40
	//   18   38:iconst_3        
	//   19   39:ireturn         
	//   20   40:iconst_0        
	//   21   41:ireturn         
	}

	public void prepareSourceInternal(ExoPlayer exoplayer, boolean flag)
	{
		if(sideloadedManifest)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field boolean sideloadedManifest>
	//*   2    4:ifeq            23
		{
			manifestLoaderErrorThrower = ((LoaderErrorThrower) (new com.google.android.exoplayer2.upstream.LoaderErrorThrower.Dummy()));
	//    3    7:aload_0         
	//    4    8:new             #348 <Class com.google.android.exoplayer2.upstream.LoaderErrorThrower$Dummy>
	//    5   11:dup             
	//    6   12:invokespecial   #349 <Method void com.google.android.exoplayer2.upstream.LoaderErrorThrower$Dummy()>
	//    7   15:putfield        #286 <Field LoaderErrorThrower manifestLoaderErrorThrower>
			processManifest();
	//    8   18:aload_0         
	//    9   19:invokespecial   #329 <Method void processManifest()>
			return;
	//   10   22:return          
		} else
		{
			manifestDataSource = manifestDataSourceFactory.createDataSource();
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #119 <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
	//   14   28:invokeinterface #355 <Method DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//   15   33:putfield        #250 <Field DataSource manifestDataSource>
			manifestLoader = new Loader("Loader:Manifest");
	//   16   36:aload_0         
	//   17   37:new             #257 <Class Loader>
	//   18   40:dup             
	//   19   41:ldc2            #357 <String "Loader:Manifest">
	//   20   44:invokespecial   #359 <Method void Loader(String)>
	//   21   47:putfield        #255 <Field Loader manifestLoader>
			manifestLoaderErrorThrower = ((LoaderErrorThrower) (manifestLoader));
	//   22   50:aload_0         
	//   23   51:aload_0         
	//   24   52:getfield        #255 <Field Loader manifestLoader>
	//   25   55:putfield        #286 <Field LoaderErrorThrower manifestLoaderErrorThrower>
			manifestRefreshHandler = new Handler();
	//   26   58:aload_0         
	//   27   59:new             #242 <Class Handler>
	//   28   62:dup             
	//   29   63:invokespecial   #360 <Method void Handler()>
	//   30   66:putfield        #238 <Field Handler manifestRefreshHandler>
			startLoadingManifest();
	//   31   69:aload_0         
	//   32   70:invokespecial   #156 <Method void startLoadingManifest()>
			return;
	//   33   73:return          
		}
	}

	public void releasePeriod(MediaPeriod mediaperiod)
	{
		((SsMediaPeriod)mediaperiod).release();
	//    0    0:aload_1         
	//    1    1:checkcast       #167 <Class SsMediaPeriod>
	//    2    4:invokevirtual   #365 <Method void SsMediaPeriod.release()>
		mediaPeriods.remove(((Object) (mediaperiod)));
	//    3    7:aload_0         
	//    4    8:getfield        #144 <Field ArrayList mediaPeriods>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #368 <Method boolean ArrayList.remove(Object)>
	//    7   15:pop             
	//    8   16:return          
	}

	public void releaseSourceInternal()
	{
		SsManifest ssmanifest;
		if(sideloadedManifest)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field boolean sideloadedManifest>
	//*   2    4:ifeq            15
			ssmanifest = manifest;
	//    3    7:aload_0         
	//    4    8:getfield        #109 <Field SsManifest manifest>
	//    5   11:astore_1        
		else
	//*   6   12:goto            17
			ssmanifest = null;
	//    7   15:aconst_null     
	//    8   16:astore_1        
		manifest = ssmanifest;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #109 <Field SsManifest manifest>
		manifestDataSource = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #250 <Field DataSource manifestDataSource>
		manifestLoadStartTimestamp = 0L;
	//   15   27:aload_0         
	//   16   28:lconst_0        
	//   17   29:putfield        #228 <Field long manifestLoadStartTimestamp>
		if(manifestLoader != null)
	//*  18   32:aload_0         
	//*  19   33:getfield        #255 <Field Loader manifestLoader>
	//*  20   36:ifnull          51
		{
			manifestLoader.release();
	//   21   39:aload_0         
	//   22   40:getfield        #255 <Field Loader manifestLoader>
	//   23   43:invokevirtual   #370 <Method void Loader.release()>
			manifestLoader = null;
	//   24   46:aload_0         
	//   25   47:aconst_null     
	//   26   48:putfield        #255 <Field Loader manifestLoader>
		}
		if(manifestRefreshHandler != null)
	//*  27   51:aload_0         
	//*  28   52:getfield        #238 <Field Handler manifestRefreshHandler>
	//*  29   55:ifnull          71
		{
			manifestRefreshHandler.removeCallbacksAndMessages(((Object) (null)));
	//   30   58:aload_0         
	//   31   59:getfield        #238 <Field Handler manifestRefreshHandler>
	//   32   62:aconst_null     
	//   33   63:invokevirtual   #374 <Method void Handler.removeCallbacksAndMessages(Object)>
			manifestRefreshHandler = null;
	//   34   66:aload_0         
	//   35   67:aconst_null     
	//   36   68:putfield        #238 <Field Handler manifestRefreshHandler>
		}
	//   37   71:return          
	}

	public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000L;
	public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
	private static final int MINIMUM_MANIFEST_REFRESH_PERIOD_MS = 5000;
	private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 0x4c4b40L;
	private final SsChunkSource.Factory chunkSourceFactory;
	private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private final long livePresentationDelayMs;
	private SsManifest manifest;
	private DataSource manifestDataSource;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
	private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
	private long manifestLoadStartTimestamp;
	private Loader manifestLoader;
	private LoaderErrorThrower manifestLoaderErrorThrower;
	private final com.google.android.exoplayer2.upstream.ParsingLoadable.Parser manifestParser;
	private Handler manifestRefreshHandler;
	private final Uri manifestUri;
	private final ArrayList mediaPeriods;
	private final int minLoadableRetryCount;
	private final boolean sideloadedManifest;
	private final Object tag;

	static 
	{
		ExoPlayerLibraryInfo.registerModule("goog.exo.smoothstreaming");
	//    0    0:ldc1            #62  <String "goog.exo.smoothstreaming">
	//    1    2:invokestatic    #68  <Method void ExoPlayerLibraryInfo.registerModule(String)>
	//*   2    5:return          
	}


/*
	static void access$100(SsMediaSource ssmediasource)
	{
		ssmediasource.startLoadingManifest();
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method void startLoadingManifest()>
		return;
	//    2    4:return          
	}

*/
}
