// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.util.Util;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			Poolable, SizeConfigStrategy

static final class SizeConfigStrategy$Key
	implements Poolable
{

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof SizeConfigStrategy$Key;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class SizeConfigStrategy$Key>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            49
		{
			obj = ((Object) ((SizeConfigStrategy$Key)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class SizeConfigStrategy$Key>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(size == ((SizeConfigStrategy$Key) (obj)).size)
	//*  12   18:aload_0         
	//*  13   19:getfield        #28  <Field int size>
	//*  14   22:aload_1         
	//*  15   23:getfield        #28  <Field int size>
	//*  16   26:icmpne          47
			{
				flag1 = flag2;
	//   17   29:iload_3         
	//   18   30:istore_2        
				if(Util.bothNullOrEqual(((Object) (config)), ((Object) (((SizeConfigStrategy$Key) (obj)).config))))
	//*  19   31:aload_0         
	//*  20   32:getfield        #30  <Field android.graphics.Bitmap$Config config>
	//*  21   35:aload_1         
	//*  22   36:getfield        #30  <Field android.graphics.Bitmap$Config config>
	//*  23   39:invokestatic    #36  <Method boolean Util.bothNullOrEqual(Object, Object)>
	//*  24   42:ifeq            47
					flag1 = true;
	//   25   45:iconst_1        
	//   26   46:istore_2        
			}
			return flag1;
	//   27   47:iload_2         
	//   28   48:ireturn         
		} else
		{
			return false;
	//   29   49:iconst_0        
	//   30   50:ireturn         
		}
	}

	public int hashCode()
	{
		int j = size;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int size>
	//    2    4:istore_2        
		android.graphics.Bitmap.Config config1 = config;
	//    3    5:aload_0         
	//    4    6:getfield        #30  <Field android.graphics.Bitmap$Config config>
	//    5    9:astore_3        
		int i;
		if(config1 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          22
			i = config1.hashCode();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #42  <Method int android.graphics.Bitmap$Config.hashCode()>
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		return j * 31 + i;
	//   14   24:iload_2         
	//   15   25:bipush          31
	//   16   27:imul            
	//   17   28:iload_1         
	//   18   29:iadd            
	//   19   30:ireturn         
	}

	public void init(int i, android.graphics.Bitmap.Config config1)
	{
		size = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int size>
		config = config1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field android.graphics.Bitmap$Config config>
	//    6   10:return          
	}

	public void offer()
	{
		pool.offer(((Poolable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SizeConfigStrategy$KeyPool pool>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #50  <Method void SizeConfigStrategy$KeyPool.offer(Poolable)>
	//    4    8:return          
	}

	public String toString()
	{
		return SizeConfigStrategy.getBitmapString(size, config);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int size>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field android.graphics.Bitmap$Config config>
	//    4    8:invokestatic    #56  <Method String SizeConfigStrategy.getBitmapString(int, android.graphics.Bitmap$Config)>
	//    5   11:areturn         
	}

	private android.graphics.Bitmap.Config config;
	private final ool pool;
	int size;

	public SizeConfigStrategy$Key(ool ool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		pool = ool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field SizeConfigStrategy$KeyPool pool>
	//    5    9:return          
	}
}
