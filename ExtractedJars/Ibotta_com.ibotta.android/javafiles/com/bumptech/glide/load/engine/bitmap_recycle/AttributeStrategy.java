// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import com.bumptech.glide.util.Util;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			LruPoolStrategy, GroupedLinkedMap, Poolable, BaseKeyPool

class AttributeStrategy
	implements LruPoolStrategy
{
	static class Key
		implements Poolable
	{

		public boolean equals(Object obj)
		{
			boolean flag = obj instanceof Key;
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
				obj = ((Object) ((Key)obj));
		//    7   11:aload_1         
		//    8   12:checkcast       #2   <Class AttributeStrategy$Key>
		//    9   15:astore_1        
				boolean flag1 = flag2;
		//   10   16:iload_3         
		//   11   17:istore_2        
				if(width == ((Key) (obj)).width)
		//*  12   18:aload_0         
		//*  13   19:getfield        #29  <Field int width>
		//*  14   22:aload_1         
		//*  15   23:getfield        #29  <Field int width>
		//*  16   26:icmpne          57
				{
					flag1 = flag2;
		//   17   29:iload_3         
		//   18   30:istore_2        
					if(height == ((Key) (obj)).height)
		//*  19   31:aload_0         
		//*  20   32:getfield        #31  <Field int height>
		//*  21   35:aload_1         
		//*  22   36:getfield        #31  <Field int height>
		//*  23   39:icmpne          57
					{
						flag1 = flag2;
		//   24   42:iload_3         
		//   25   43:istore_2        
						if(config == ((Key) (obj)).config)
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
		private final KeyPool pool;
		private int width;

		public Key(KeyPool keypool)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			pool = keypool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #24  <Field AttributeStrategy$KeyPool pool>
		//    5    9:return          
		}
	}

	static class KeyPool extends BaseKeyPool
	{

		protected Key create()
		{
			return new Key(this);
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

		Key get(int i, int j, android.graphics.Bitmap.Config config)
		{
			Key key = (Key)get();
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

		KeyPool()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void BaseKeyPool()>
		//    2    4:return          
		}
	}


	AttributeStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #11  <Class AttributeStrategy$KeyPool>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void AttributeStrategy$KeyPool()>
	//    6   12:putfield        #24  <Field AttributeStrategy$KeyPool keyPool>
	//    7   15:aload_0         
	//    8   16:new             #26  <Class GroupedLinkedMap>
	//    9   19:dup             
	//   10   20:invokespecial   #27  <Method void GroupedLinkedMap()>
	//   11   23:putfield        #29  <Field GroupedLinkedMap groupedMap>
	//   12   26:return          
	}

	static String getBitmapString(int i, int j, android.graphics.Bitmap.Config config)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("[");
	//    4    8:aload_3         
	//    5    9:ldc1            #37  <String "[">
	//    6   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_3         
	//    9   16:iload_0         
	//   10   17:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append("x");
	//   12   21:aload_3         
	//   13   22:ldc1            #46  <String "x">
	//   14   24:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(j);
	//   16   28:aload_3         
	//   17   29:iload_1         
	//   18   30:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   19   33:pop             
		stringbuilder.append("], ");
	//   20   34:aload_3         
	//   21   35:ldc1            #48  <String "], ">
	//   22   37:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		stringbuilder.append(((Object) (config)));
	//   24   41:aload_3         
	//   25   42:aload_2         
	//   26   43:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   27   46:pop             
		return stringbuilder.toString();
	//   28   47:aload_3         
	//   29   48:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   30   51:areturn         
	}

	private static String getBitmapString(Bitmap bitmap)
	{
		return getBitmapString(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method int Bitmap.getWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #65  <Method int Bitmap.getHeight()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #69  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    6   12:invokestatic    #71  <Method String getBitmapString(int, int, android.graphics.Bitmap$Config)>
	//    7   15:areturn         
	}

	public Bitmap get(int i, int j, android.graphics.Bitmap.Config config)
	{
		config = ((android.graphics.Bitmap.Config) (keyPool.get(i, j, config)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AttributeStrategy$KeyPool keyPool>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #76  <Method AttributeStrategy$Key AttributeStrategy$KeyPool.get(int, int, android.graphics.Bitmap$Config)>
	//    6   10:astore_3        
		return (Bitmap)groupedMap.get(((Poolable) (config)));
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field GroupedLinkedMap groupedMap>
	//    9   15:aload_3         
	//   10   16:invokevirtual   #79  <Method Object GroupedLinkedMap.get(Poolable)>
	//   11   19:checkcast       #58  <Class Bitmap>
	//   12   22:areturn         
	}

	public int getSize(Bitmap bitmap)
	{
		return Util.getBitmapByteSize(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #86  <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:ireturn         
	}

	public String logBitmap(int i, int j, android.graphics.Bitmap.Config config)
	{
		return getBitmapString(i, j, config);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #71  <Method String getBitmapString(int, int, android.graphics.Bitmap$Config)>
	//    4    6:areturn         
	}

	public String logBitmap(Bitmap bitmap)
	{
		return getBitmapString(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #89  <Method String getBitmapString(Bitmap)>
	//    2    4:areturn         
	}

	public void put(Bitmap bitmap)
	{
		Key key = keyPool.get(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AttributeStrategy$KeyPool keyPool>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #62  <Method int Bitmap.getWidth()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #65  <Method int Bitmap.getHeight()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #69  <Method android.graphics.Bitmap$Config Bitmap.getConfig()>
	//    8   16:invokevirtual   #76  <Method AttributeStrategy$Key AttributeStrategy$KeyPool.get(int, int, android.graphics.Bitmap$Config)>
	//    9   19:astore_2        
		groupedMap.put(((Poolable) (key)), ((Object) (bitmap)));
	//   10   20:aload_0         
	//   11   21:getfield        #29  <Field GroupedLinkedMap groupedMap>
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #94  <Method void GroupedLinkedMap.put(Poolable, Object)>
	//   15   29:return          
	}

	public Bitmap removeLast()
	{
		return (Bitmap)groupedMap.removeLast();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field GroupedLinkedMap groupedMap>
	//    2    4:invokevirtual   #99  <Method Object GroupedLinkedMap.removeLast()>
	//    3    7:checkcast       #58  <Class Bitmap>
	//    4   10:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("AttributeStrategy:\n  ");
	//    4    8:aload_1         
	//    5    9:ldc1            #101 <String "AttributeStrategy:\n  ">
	//    6   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (groupedMap)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #29  <Field GroupedLinkedMap groupedMap>
	//   11   20:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	private final GroupedLinkedMap groupedMap = new GroupedLinkedMap();
	private final KeyPool keyPool = new KeyPool();
}
