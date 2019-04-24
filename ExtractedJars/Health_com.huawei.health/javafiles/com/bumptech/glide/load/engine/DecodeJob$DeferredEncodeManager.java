// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.support.v4.os.TraceCompat;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.cache.DiskCache;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob, DataCacheWriter, LockedResource

static class DecodeJob$DeferredEncodeManager
{

	void clear()
	{
		key = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #24  <Field Key key>
		encoder = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #26  <Field ResourceEncoder encoder>
		toEncode = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #28  <Field LockedResource toEncode>
	//    9   15:return          
	}

	void encode(DecodeJob.DiskCacheProvider diskcacheprovider, Options options)
	{
		TraceCompat.beginSection("DecodeJob.encode");
	//    0    0:ldc1            #32  <String "DecodeJob.encode">
	//    1    2:invokestatic    #38  <Method void TraceCompat.beginSection(String)>
		diskcacheprovider.getDiskCache().put(key, ((com.bumptech.glide.load.engine.cache.DiskCache.Writer) (new DataCacheWriter(((com.bumptech.glide.load.Encoder) (encoder)), ((Object) (toEncode)), options))));
	//    2    5:aload_1         
	//    3    6:invokeinterface #44  <Method DiskCache DecodeJob$DiskCacheProvider.getDiskCache()>
	//    4   11:aload_0         
	//    5   12:getfield        #24  <Field Key key>
	//    6   15:new             #46  <Class DataCacheWriter>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:getfield        #26  <Field ResourceEncoder encoder>
	//   10   23:aload_0         
	//   11   24:getfield        #28  <Field LockedResource toEncode>
	//   12   27:aload_2         
	//   13   28:invokespecial   #49  <Method void DataCacheWriter(com.bumptech.glide.load.Encoder, Object, Options)>
	//   14   31:invokeinterface #55  <Method void DiskCache.put(Key, com.bumptech.glide.load.engine.cache.DiskCache$Writer)>
		toEncode.unlock();
	//   15   36:aload_0         
	//   16   37:getfield        #28  <Field LockedResource toEncode>
	//   17   40:invokevirtual   #60  <Method void LockedResource.unlock()>
		TraceCompat.endSection();
	//   18   43:invokestatic    #63  <Method void TraceCompat.endSection()>
		return;
	//   19   46:return          
		diskcacheprovider;
	//   20   47:astore_1        
		toEncode.unlock();
	//   21   48:aload_0         
	//   22   49:getfield        #28  <Field LockedResource toEncode>
	//   23   52:invokevirtual   #60  <Method void LockedResource.unlock()>
		TraceCompat.endSection();
	//   24   55:invokestatic    #63  <Method void TraceCompat.endSection()>
		throw diskcacheprovider;
	//   25   58:aload_1         
	//   26   59:athrow          
	}

	boolean hasResourceToEncode()
	{
		return toEncode != null;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field LockedResource toEncode>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	void init(Key key1, ResourceEncoder resourceencoder, LockedResource lockedresource)
	{
		key = key1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Key key>
		encoder = resourceencoder;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field ResourceEncoder encoder>
		toEncode = lockedresource;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field LockedResource toEncode>
	//    9   15:return          
	}

	private ResourceEncoder encoder;
	private Key key;
	private LockedResource toEncode;

	DecodeJob$DeferredEncodeManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}
}
