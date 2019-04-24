// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			BaseKeyPool, LruArrayPool, Poolable

static final class LruArrayPool$KeyPool extends BaseKeyPool
{

	protected LruArrayPool.Key create()
	{
		return new LruArrayPool.Key(this);
	//    0    0:new             #17  <Class LruArrayPool$Key>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void LruArrayPool$Key(LruArrayPool$KeyPool)>
	//    4    8:areturn         
	}

	protected volatile Poolable create()
	{
		return ((Poolable) (create()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method LruArrayPool$Key create()>
	//    2    4:areturn         
	}

	LruArrayPool.Key get(int i, Class class1)
	{
		LruArrayPool.Key key = (LruArrayPool.Key)get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Poolable get()>
	//    2    4:checkcast       #17  <Class LruArrayPool$Key>
	//    3    7:astore_3        
		key.init(i, class1);
	//    4    8:aload_3         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #31  <Method void LruArrayPool$Key.init(int, Class)>
		return key;
	//    8   14:aload_3         
	//    9   15:areturn         
	}

	LruArrayPool$KeyPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void BaseKeyPool()>
	//    2    4:return          
	}
}
