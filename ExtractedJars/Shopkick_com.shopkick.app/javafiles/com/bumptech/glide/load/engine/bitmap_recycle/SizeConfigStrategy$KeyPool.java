// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			BaseKeyPool, SizeConfigStrategy, Poolable

static class SizeConfigStrategy$KeyPool extends BaseKeyPool
{

	protected volatile Poolable create()
	{
		return ((Poolable) (create()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method SizeConfigStrategy$Key create()>
	//    2    4:areturn         
	}

	protected SizeConfigStrategy.Key create()
	{
		return new SizeConfigStrategy.Key(this);
	//    0    0:new             #21  <Class SizeConfigStrategy$Key>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void SizeConfigStrategy$Key(SizeConfigStrategy$KeyPool)>
	//    4    8:areturn         
	}

	public SizeConfigStrategy.Key get(int i, android.graphics.Bitmap.Config config)
	{
		SizeConfigStrategy.Key key = (SizeConfigStrategy.Key)get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Poolable get()>
	//    2    4:checkcast       #21  <Class SizeConfigStrategy$Key>
	//    3    7:astore_3        
		key.init(i, config);
	//    4    8:aload_3         
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #32  <Method void SizeConfigStrategy$Key.init(int, android.graphics.Bitmap$Config)>
		return key;
	//    8   14:aload_3         
	//    9   15:areturn         
	}

	SizeConfigStrategy$KeyPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void BaseKeyPool()>
	//    2    4:return          
	}
}
