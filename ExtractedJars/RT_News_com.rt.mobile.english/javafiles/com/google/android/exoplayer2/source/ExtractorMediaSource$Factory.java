// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.source:
//			ExtractorMediaSource, MediaSourceEventListener, MediaSource

public static final class ExtractorMediaSource$Factory
	implements com.google.android.exoplayer2.source.ads.tory
{

	public ExtractorMediaSource createMediaSource(Uri uri)
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
		return new ExtractorMediaSource(uri, dataSourceFactory, extractorsFactory, minLoadableRetryCount, customCacheKey, continueLoadingCheckIntervalBytes, tag, ((ExtractorMediaSource._cls1) (null)));
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

	public ExtractorMediaSource createMediaSource(Uri uri, Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		uri = ((Uri) (createMediaSource(uri)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #56  <Method ExtractorMediaSource createMediaSource(Uri)>
	//    3    5:astore_1        
		if(handler != null && mediasourceeventlistener != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
			((ExtractorMediaSource) (uri)).addEventListener(handler, mediasourceeventlistener);
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #60  <Method void ExtractorMediaSource.addEventListener(Handler, MediaSourceEventListener)>
		return ((ExtractorMediaSource) (uri));
	//   12   20:aload_1         
	//   13   21:areturn         
	}

	public volatile MediaSource createMediaSource(Uri uri)
	{
		return ((MediaSource) (createMediaSource(uri)));
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

	public ExtractorMediaSource$Factory setContinueLoadingCheckIntervalBytes(int i)
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

	public ExtractorMediaSource$Factory setCustomCacheKey(String s)
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

	public ExtractorMediaSource$Factory setExtractorsFactory(ExtractorsFactory extractorsfactory)
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

	public ExtractorMediaSource$Factory setMinLoadableRetryCount(int i)
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

	public ExtractorMediaSource$Factory setTag(Object obj)
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

	public ExtractorMediaSource$Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
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
