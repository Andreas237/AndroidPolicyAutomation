// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			BaseKeyPool, SizeStrategy, Poolable

static class SizeStrategy$KeyPool extends BaseKeyPool
{

	protected volatile Poolable create()
	{
		return ((Poolable) (create()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #18  <Method SizeStrategy$Key create()>
	//    2    4:areturn         
	}

	protected SizeStrategy.Key create()
	{
		return new SizeStrategy.Key(this);
	//    0    0:new             #20  <Class SizeStrategy$Key>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #23  <Method void SizeStrategy$Key(SizeStrategy$KeyPool)>
	//    4    8:areturn         
	}

	public SizeStrategy.Key get(int i)
	{
		SizeStrategy.Key key = (SizeStrategy.Key)get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method Poolable get()>
	//    2    4:checkcast       #20  <Class SizeStrategy$Key>
	//    3    7:astore_2        
		key.init(i);
	//    4    8:aload_2         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #31  <Method void SizeStrategy$Key.init(int)>
		return key;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	SizeStrategy$KeyPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void BaseKeyPool()>
	//    2    4:return          
	}
}
