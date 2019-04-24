// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.source.dash:
//			DashMediaSource

public static final class DashMediaSource$Factory
	implements com.google.android.exoplayer2.source.ads.ceFactory
{

	public volatile MediaSource createMediaSource(Uri uri)
	{
		return ((MediaSource) (createMediaSource(uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method DashMediaSource createMediaSource(Uri)>
	//    3    5:areturn         
	}

	public DashMediaSource createMediaSource(Uri uri)
	{
		isCreateCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #64  <Field boolean isCreateCalled>
		if(manifestParser == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
	//*   5    9:ifnonnull       23
			manifestParser = ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new DashManifestParser()));
	//    6   12:aload_0         
	//    7   13:new             #68  <Class DashManifestParser>
	//    8   16:dup             
	//    9   17:invokespecial   #69  <Method void DashManifestParser()>
	//   10   20:putfield        #66  <Field com.google.android.exoplayer2.upstream.ParsingLoadable$Parser manifestParser>
		return new DashMediaSource(((DashManifest) (null)), (Uri)Assertions.checkNotNull(((Object) (uri))), manifestDataSourceFactory, manifestParser, chunkSourceFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, livePresentationDelayMs, tag, ((DashMediaSource._cls1) (null)));
	//   11   23:new             #8   <Class DashMediaSource>
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
	//   22   44:getfield        #42  <Field DashChunkSource$Factory chunkSourceFactory>
	//   23   47:aload_0         
	//   24   48:getfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//   25   51:aload_0         
	//   26   52:getfield        #46  <Field int minLoadableRetryCount>
	//   27   55:aload_0         
	//   28   56:getfield        #50  <Field long livePresentationDelayMs>
	//   29   59:aload_0         
	//   30   60:getfield        #73  <Field Object tag>
	//   31   63:aconst_null     
	//   32   64:invokespecial   #76  <Method void DashMediaSource(DashManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, DashChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object, DashMediaSource$1)>
	//   33   67:areturn         
	}

	public DashMediaSource createMediaSource(Uri uri, Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		uri = ((Uri) (createMediaSource(uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method DashMediaSource createMediaSource(Uri)>
	//    3    5:astore_1        
		if(handler != null && mediasourceeventlistener != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
			((DashMediaSource) (uri)).addEventListener(handler, mediasourceeventlistener);
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #82  <Method void DashMediaSource.addEventListener(Handler, MediaSourceEventListener)>
		return ((DashMediaSource) (uri));
	//   12   20:aload_1         
	//   13   21:areturn         
	}

	public DashMediaSource createMediaSource(DashManifest dashmanifest)
	{
		Assertions.checkArgument(dashmanifest.dynamic ^ true);
	//    0    0:aload_1         
	//    1    1:getfield        #89  <Field boolean DashManifest.dynamic>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #93  <Method void Assertions.checkArgument(boolean)>
		isCreateCalled = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #64  <Field boolean isCreateCalled>
		return new DashMediaSource(dashmanifest, ((Uri) (null)), ((com.google.android.exoplayer2.upstream.DataSource.Factory) (null)), ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (null)), chunkSourceFactory, compositeSequenceableLoaderFactory, minLoadableRetryCount, livePresentationDelayMs, tag, ((DashMediaSource._cls1) (null)));
	//    8   14:new             #8   <Class DashMediaSource>
	//    9   17:dup             
	//   10   18:aload_1         
	//   11   19:aconst_null     
	//   12   20:aconst_null     
	//   13   21:aconst_null     
	//   14   22:aload_0         
	//   15   23:getfield        #42  <Field DashChunkSource$Factory chunkSourceFactory>
	//   16   26:aload_0         
	//   17   27:getfield        #55  <Field CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory>
	//   18   30:aload_0         
	//   19   31:getfield        #46  <Field int minLoadableRetryCount>
	//   20   34:aload_0         
	//   21   35:getfield        #50  <Field long livePresentationDelayMs>
	//   22   38:aload_0         
	//   23   39:getfield        #73  <Field Object tag>
	//   24   42:aconst_null     
	//   25   43:invokespecial   #76  <Method void DashMediaSource(DashManifest, Uri, com.google.android.exoplayer2.upstream.DataSource$Factory, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, DashChunkSource$Factory, CompositeSequenceableLoaderFactory, int, long, Object, DashMediaSource$1)>
	//   26   46:areturn         
	}

	public DashMediaSource createMediaSource(DashManifest dashmanifest, Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		dashmanifest = ((DashManifest) (createMediaSource(dashmanifest)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #96  <Method DashMediaSource createMediaSource(DashManifest)>
	//    3    5:astore_1        
		if(handler != null && mediasourceeventlistener != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
			((DashMediaSource) (dashmanifest)).addEventListener(handler, mediasourceeventlistener);
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #82  <Method void DashMediaSource.addEventListener(Handler, MediaSourceEventListener)>
		return ((DashMediaSource) (dashmanifest));
	//   12   20:aload_1         
	//   13   21:areturn         
	}

	public int[] getSupportedTypes()
	{
		return (new int[] {
			0
		});
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_0        
	//    5    6:iastore         
	//    6    7:areturn         
	}

	public DashMediaSource$Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositesequenceableloaderfactory)
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

	public DashMediaSource$Factory setLivePresentationDelayMs(long l)
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

	public DashMediaSource$Factory setManifestParser(com.google.android.exoplayer2.upstream.ParsingLoadable.Parser parser)
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

	public DashMediaSource$Factory setMinLoadableRetryCount(int i)
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

	public DashMediaSource$Factory setTag(Object obj)
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

	private final DashChunkSource$Factory chunkSourceFactory;
	private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
	private boolean isCreateCalled;
	private long livePresentationDelayMs;
	private final com.google.android.exoplayer2.upstream.DataSource.Factory manifestDataSourceFactory;
	private com.google.android.exoplayer2.upstream.ParsingLoadable.Parser manifestParser;
	private int minLoadableRetryCount;
	private Object tag;

	public DashMediaSource$Factory(DashChunkSource$Factory dashchunksource$factory, com.google.android.exoplayer2.upstream.DataSource.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		chunkSourceFactory = (DashChunkSource$Factory)Assertions.checkNotNull(((Object) (dashchunksource$factory)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #40  <Class DashChunkSource$Factory>
	//    6   12:putfield        #42  <Field DashChunkSource$Factory chunkSourceFactory>
		manifestDataSourceFactory = factory;
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:putfield        #44  <Field com.google.android.exoplayer2.upstream.DataSource$Factory manifestDataSourceFactory>
		minLoadableRetryCount = 3;
	//   10   20:aload_0         
	//   11   21:iconst_3        
	//   12   22:putfield        #46  <Field int minLoadableRetryCount>
		livePresentationDelayMs = -1L;
	//   13   25:aload_0         
	//   14   26:ldc2w           #47  <Long -1L>
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
