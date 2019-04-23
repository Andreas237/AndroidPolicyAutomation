// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;


// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			Poolable, AttributeStrategy

static class AttributeStrategy$Key
	implements Poolable
{

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof AttributeStrategy$Key;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class AttributeStrategy$Key>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            59
		{
			obj = ((Object) ((AttributeStrategy$Key)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class AttributeStrategy$Key>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(width == ((AttributeStrategy$Key) (obj)).width)
	//*  12   18:aload_0         
	//*  13   19:getfield        #29  <Field int width>
	//*  14   22:aload_1         
	//*  15   23:getfield        #29  <Field int width>
	//*  16   26:icmpne          57
			{
				flag1 = flag2;
	//   17   29:iload_3         
	//   18   30:istore_2        
				if(height == ((AttributeStrategy$Key) (obj)).height)
	//*  19   31:aload_0         
	//*  20   32:getfield        #31  <Field int height>
	//*  21   35:aload_1         
	//*  22   36:getfield        #31  <Field int height>
	//*  23   39:icmpne          57
				{
					flag1 = flag2;
	//   24   42:iload_3         
	//   25   43:istore_2        
					if(config == ((AttributeStrategy$Key) (obj)).config)
	//*  26   44:aload_0         
	//*  27   45:getfield        #33  <Field android.graphics.Bitmap$Config config>
	//*  28   48:aload_1         
	//*  29   49:getfield        #33  <Field android.graphics.Bitmap$Config config>
	//*  30   52:if_acmpne       57
						flag1 = true;
	//   31   55:iconst_1        
	//   32   56:istore_2        
				}
			}
			return flag1;
	//   33   57:iload_2         
	//   34   58:ireturn         
		} else
		{
			return false;
	//   35   59:iconst_0        
	//   36   60:ireturn         
		}
	}

	public int hashCode()
	{
		int j = width;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int width>
	//    2    4:istore_2        
		int k = height;
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field int height>
	//    5    9:istore_3        
		android.graphics.Bitmap.Config config1 = config;
	//    6   10:aload_0         
	//    7   11:getfield        #33  <Field android.graphics.Bitmap$Config config>
	//    8   14:astore          4
		int i;
		if(config1 != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          30
			i = config1.hashCode();
	//   11   21:aload           4
	//   12   23:invokevirtual   #39  <Method int android.graphics.Bitmap$Config.hashCode()>
	//   13   26:istore_1        
		else
	//*  14   27:goto            32
			i = 0;
	//   15   30:iconst_0        
	//   16   31:istore_1        
		return (j * 31 + k) * 31 + i;
	//   17   32:iload_2         
	//   18   33:bipush          31
	//   19   35:imul            
	//   20   36:iload_3         
	//   21   37:iadd            
	//   22   38:bipush          31
	//   23   40:imul            
	//   24   41:iload_1         
	//   25   42:iadd            
	//   26   43:ireturn         
	}

	public void init(int i, int j, android.graphics.Bitmap.Config config1)
	{
		width = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #29  <Field int width>
		height = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #31  <Field int height>
		config = config1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #33  <Field android.graphics.Bitmap$Config config>
	//    9   15:return          
	}

	public void offer()
	{
		pool.offer(((Poolable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AttributeStrategy$KeyPool pool>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #47  <Method void AttributeStrategy$KeyPool.offer(Poolable)>
	//    4    8:return          
	}

	public String toString()
	{
		return AttributeStrategy.getBitmapString(width, height, config);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int width>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field int height>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field android.graphics.Bitmap$Config config>
	//    6   12:invokestatic    #53  <Method String AttributeStrategy.getBitmapString(int, int, android.graphics.Bitmap$Config)>
	//    7   15:areturn         
	}

	private android.graphics.Bitmap.Config config;
	private int height;
	private final ool pool;
	private int width;

	public AttributeStrategy$Key(ool ool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		pool = ool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field AttributeStrategy$KeyPool pool>
	//    5    9:return          
	}
}
