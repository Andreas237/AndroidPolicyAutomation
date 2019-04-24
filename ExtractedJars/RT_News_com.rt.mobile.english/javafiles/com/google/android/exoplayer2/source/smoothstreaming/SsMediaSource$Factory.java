// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.source.smoothstreaming:
//			SsMediaSource

public static final class SsMediaSource$Factory
	implements com.google.android.exoplayer2.source.ads.urceFactory
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
			manifestParser = ((com.google.android.exoplayer2.upstream.) (new SsManifestParser()));
	//    6   12:aload_0         
	//    7   13:new             #68  <Class SsManifestParser>
	//    8   16:dup             
	//    9   17:invokespecial   #69  <Method void SsManifestParser()>
	//   10   20:putfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
		return new SsMediaSource(((SsManifest) (null)), (Uri)Assertions.checkNotNull(((Object) (uri))), manifestDataSourceFactory, manifestParser, chunkSourceFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, livePresentationDelayMs, tag, ((SsMediaSource._cls1) (null)));
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
		return new SsMediaSource(ssmanifest, ((Uri) (null)), ((com.google.android.exoplayer2.upstream.DataSource.Factory) (null)), ((com.google.android.exoplayer2.upstream.) (null)), chunkSourceFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, livePresentationDelayMs, tag, ((SsMediaSource._cls1) (null)));
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

	public SsMediaSource$Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositesequenceableloaderfactory)
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

	public SsMediaSource$Factory setLivePresentationDelayMs(long l)
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

	public SsMediaSource$Factory setManifestParser(com.google.android.exoplayer2.upstream. )
	{
		Assertions.checkState(isCreateCalled ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean isCreateCalled>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #103 <Method void Assertions.checkState(boolean)>
		manifestParser = (com.google.android.exoplayer2.upstream.)Assertions.checkNotNull(((Object) ()));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
	//    8   14:checkcast       #111 <Class com.google.android.exoplayer2.upstream.ParsingLoadable$Parser>
	//    9   17:putfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public SsMediaSource$Factory setMinLoadableRetryCount(int i)
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

	public SsMediaSource$Factory setTag(Object obj)
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

	private final SsChunkSource$Factory chunkSourceFactory;
	private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private boolean isCreateCalled;
	private long livePresentationDelayMs;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
	private com.google.android.exoplayer2.upstream. manifestParser;
	private int minLoadableRetryCount;
	private Object tag;

	public SsMediaSource$Factory(SsChunkSource$Factory sschunksource$factory, com.google.android.exoplayer2.upstream.DataSource.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		chunkSourceFactory = (SsChunkSource$Factory)Assertions.checkNotNull(((Object) (sschunksource$factory)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #40  <Class SsChunkSource$Factory>
	//    6   12:putfield        #42  <Field SsChunkSource$Factory chunkSourceFactory>
		manifestDataSourceFactory = factory;
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
