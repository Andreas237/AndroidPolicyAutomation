// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.util.LruCache;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelCache

class ModelCache$1 extends LruCache
{

	protected void onItemEvicted(delKey delkey, Object obj)
	{
		delkey.release();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #25  <Method void ModelCache$ModelKey.release()>
	//    2    4:return          
	}

	public volatile void onItemEvicted(Object obj, Object obj1)
	{
		onItemEvicted((delKey)obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #21  <Class ModelCache$ModelKey>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #30  <Method void onItemEvicted(ModelCache$ModelKey, Object)>
	//    5    9:return          
	}

	final ModelCache this$0;

	ModelCache$1(int i)
	{
		this$0 = ModelCache.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ModelCache this$0>
		super(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #16  <Method void LruCache(int)>
	//    6   10:return          
	}
}
