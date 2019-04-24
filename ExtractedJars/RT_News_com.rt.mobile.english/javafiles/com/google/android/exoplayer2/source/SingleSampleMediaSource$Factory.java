// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.source:
//			SingleSampleMediaSource, MediaSourceEventListener

public static final class SingleSampleMediaSource$Factory
{

	public SingleSampleMediaSource createMediaSource(Uri uri, Format format, long l)
	{
		isCreateCalled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #39  <Field boolean isCreateCalled>
		return new SingleSampleMediaSource(uri, dataSourceFactory, format, l, minLoadableRetryCount, treatLoadErrorsAsEndOfStream, tag, ((SingleSampleMediaSource._cls1) (null)));
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

	public SingleSampleMediaSource createMediaSource(Uri uri, Format format, long l, Handler handler, MediaSourceEventListener mediasourceeventlistener)
	{
		uri = ((Uri) (createMediaSource(uri, format, l)));
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

	public SingleSampleMediaSource$Factory setMinLoadableRetryCount(int i)
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

	public SingleSampleMediaSource$Factory setTag(Object obj)
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

	public SingleSampleMediaSource$Factory setTreatLoadErrorsAsEndOfStream(boolean flag)
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

	public SingleSampleMediaSource$Factory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
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
