// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			BaseKeyPool, AttributeStrategy, Poolable

static class AttributeStrategy$KeyPool extends BaseKeyPool
{

	protected AttributeStrategy.Key create()
	{
		return new AttributeStrategy.Key(this);
	//    0    0:new             #18  <Class AttributeStrategy$Key>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #21  <Method void AttributeStrategy$Key(AttributeStrategy$KeyPool)>
	//    4    8:areturn         
	}

	protected volatile Poolable create()
	{
		return ((Poolable) (create()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method AttributeStrategy$Key create()>
	//    2    4:areturn         
	}

	AttributeStrategy.Key get(int i, int j, android.graphics.Bitmap.Config config)
	{
		AttributeStrategy.Key key = (AttributeStrategy.Key)get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Poolable get()>
	//    2    4:checkcast       #18  <Class AttributeStrategy$Key>
	//    3    7:astore          4
		key.init(i, j, config);
	//    4    9:aload           4
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #32  <Method void AttributeStrategy$Key.init(int, int, android.graphics.Bitmap$Config)>
		return key;
	//    9   17:aload           4
	//   10   19:areturn         
	}

	AttributeStrategy$KeyPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void BaseKeyPool()>
	//    2    4:return          
	}
}
