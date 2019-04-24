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
		if(obj instanceof AttributeStrategy$Key)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class AttributeStrategy$Key>
	//*   2    4:ifeq            49
		{
			obj = ((Object) ((AttributeStrategy$Key)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class AttributeStrategy$Key>
	//    5   11:astore_1        
			return width == ((AttributeStrategy$Key) (obj)).width && height == ((AttributeStrategy$Key) (obj)).height && config == ((AttributeStrategy$Key) (obj)).config;
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field int width>
	//    8   16:aload_1         
	//    9   17:getfield        #28  <Field int width>
	//   10   20:icmpne          47
	//   11   23:aload_0         
	//   12   24:getfield        #30  <Field int height>
	//   13   27:aload_1         
	//   14   28:getfield        #30  <Field int height>
	//   15   31:icmpne          47
	//   16   34:aload_0         
	//   17   35:getfield        #32  <Field android.graphics.Bitmap$Config config>
	//   18   38:aload_1         
	//   19   39:getfield        #32  <Field android.graphics.Bitmap$Config config>
	//   20   42:if_acmpne       47
	//   21   45:iconst_1        
	//   22   46:ireturn         
	//   23   47:iconst_0        
	//   24   48:ireturn         
		} else
		{
			return false;
	//   25   49:iconst_0        
	//   26   50:ireturn         
		}
	}

	public int hashCode()
	{
		int j = width;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int width>
	//    2    4:istore_2        
		int k = height;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field int height>
	//    5    9:istore_3        
		int i;
		if(config != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #32  <Field android.graphics.Bitmap$Config config>
	//*   8   14:ifnull          28
			i = config.hashCode();
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field android.graphics.Bitmap$Config config>
	//   11   21:invokevirtual   #38  <Method int android.graphics.Bitmap$Config.hashCode()>
	//   12   24:istore_1        
		else
	//*  13   25:goto            30
			i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_1        
		return (j * 31 + k) * 31 + i;
	//   16   30:iload_2         
	//   17   31:bipush          31
	//   18   33:imul            
	//   19   34:iload_3         
	//   20   35:iadd            
	//   21   36:bipush          31
	//   22   38:imul            
	//   23   39:iload_1         
	//   24   40:iadd            
	//   25   41:ireturn         
	}

	public void init(int i, int j, android.graphics.Bitmap.Config config1)
	{
		width = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int width>
		height = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #30  <Field int height>
		config = config1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #32  <Field android.graphics.Bitmap$Config config>
	//    9   15:return          
	}

	public void offer()
	{
		pool.offer(((Poolable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AttributeStrategy$KeyPool pool>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #46  <Method void AttributeStrategy$KeyPool.offer(Poolable)>
	//    4    8:return          
	}

	public String toString()
	{
		return AttributeStrategy.getBitmapString(width, height, config);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int width>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field int height>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field android.graphics.Bitmap$Config config>
	//    6   12:invokestatic    #52  <Method String AttributeStrategy.getBitmapString(int, int, android.graphics.Bitmap$Config)>
	//    7   15:areturn         
	}

	private android.graphics.Bitmap.Config config;
	private int height;
	private final ool pool;
	private int width;

	public AttributeStrategy$Key(ool ool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		pool = ool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field AttributeStrategy$KeyPool pool>
	//    5    9:return          
	}
}
