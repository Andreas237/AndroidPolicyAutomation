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
		if(obj instanceof SizeConfigStrategy$Key)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class SizeConfigStrategy$Key>
	//*   2    4:ifeq            41
		{
			obj = ((Object) ((SizeConfigStrategy$Key)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class SizeConfigStrategy$Key>
	//    5   11:astore_1        
			return size == ((SizeConfigStrategy$Key) (obj)).size && Util.bothNullOrEqual(((Object) (config)), ((Object) (((SizeConfigStrategy$Key) (obj)).config)));
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field int size>
	//    8   16:aload_1         
	//    9   17:getfield        #34  <Field int size>
	//   10   20:icmpne          39
	//   11   23:aload_0         
	//   12   24:getfield        #36  <Field android.graphics.Bitmap$Config config>
	//   13   27:aload_1         
	//   14   28:getfield        #36  <Field android.graphics.Bitmap$Config config>
	//   15   31:invokestatic    #42  <Method boolean Util.bothNullOrEqual(Object, Object)>
	//   16   34:ifeq            39
	//   17   37:iconst_1        
	//   18   38:ireturn         
	//   19   39:iconst_0        
	//   20   40:ireturn         
		} else
		{
			return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
		}
	}

	public int hashCode()
	{
		int j = size;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int size>
	//    2    4:istore_2        
		int i;
		if(config != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field android.graphics.Bitmap$Config config>
	//*   5    9:ifnull          23
			i = config.hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field android.graphics.Bitmap$Config config>
	//    8   16:invokevirtual   #48  <Method int android.graphics.Bitmap$Config.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		return j * 31 + i;
	//   13   25:iload_2         
	//   14   26:bipush          31
	//   15   28:imul            
	//   16   29:iload_1         
	//   17   30:iadd            
	//   18   31:ireturn         
	}

	public void init(int i, android.graphics.Bitmap.Config config1)
	{
		size = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field int size>
		config = config1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #36  <Field android.graphics.Bitmap$Config config>
	//    6   10:return          
	}

	public void offer()
	{
		pool.offer(((Poolable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SizeConfigStrategy$KeyPool pool>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #54  <Method void SizeConfigStrategy$KeyPool.offer(Poolable)>
	//    4    8:return          
	}

	public String toString()
	{
		return SizeConfigStrategy.getBitmapString(size, config);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int size>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field android.graphics.Bitmap$Config config>
	//    4    8:invokestatic    #60  <Method String SizeConfigStrategy.getBitmapString(int, android.graphics.Bitmap$Config)>
	//    5   11:areturn         
	}

	private android.graphics.Bitmap.Config config;
	private final ool pool;
	int size;

	public SizeConfigStrategy$Key(ool ool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		pool = ool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field SizeConfigStrategy$KeyPool pool>
	//    5    9:return          
	}

	SizeConfigStrategy$Key(ool ool, int i, android.graphics.Bitmap.Config config1)
	{
		this(ool);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void SizeConfigStrategy$Key(SizeConfigStrategy$KeyPool)>
		init(i, config1);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #30  <Method void init(int, android.graphics.Bitmap$Config)>
	//    7   11:return          
	}
}
