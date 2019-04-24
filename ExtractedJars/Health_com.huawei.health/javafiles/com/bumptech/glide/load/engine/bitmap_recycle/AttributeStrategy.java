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
			if(obj instanceof Key)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class AttributeStrategy$Key>
		//*   2    4:ifeq            49
			{
				obj = ((Object) ((Key)obj));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class AttributeStrategy$Key>
		//    5   11:astore_1        
				return width == ((Key) (obj)).width && height == ((Key) (obj)).height && config == ((Key) (obj)).config;
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
		private final KeyPool pool;
		private int width;

		public Key(KeyPool keypool)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			pool = keypool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field AttributeStrategy$KeyPool pool>
		//    5    9:return          
		}
	}

	static class KeyPool extends BaseKeyPool
	{

		protected Key create()
		{
			return new Key(this);
		//    0    0:new             #17  <Class AttributeStrategy$Key>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #20  <Method void AttributeStrategy$Key(AttributeStrategy$KeyPool)>
		//    4    8:areturn         
		}

		protected volatile Poolable create()
		{
			return ((Poolable) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method AttributeStrategy$Key create()>
		//    2    4:areturn         
		}

		public Key get(int i, int j, android.graphics.Bitmap.Config config)
		{
			Key key = (Key)get();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #27  <Method Poolable get()>
		//    2    4:checkcast       #17  <Class AttributeStrategy$Key>
		//    3    7:astore          4
			key.init(i, j, config);
		//    4    9:aload           4
		//    5   11:iload_1         
		//    6   12:iload_2         
		//    7   13:aload_3         
		//    8   14:invokevirtual   #31  <Method void AttributeStrategy$Key.init(int, int, android.graphics.Bitmap$Config)>
			return key;
		//    9   17:aload           4
		//   10   19:areturn         
		}

		KeyPool()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void BaseKeyPool()>
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
		return (new StringBuilder()).append("[").append(i).append("x").append(j).append("], ").append(((Object) (config))).toString();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:ldc1            #37  <String "[">
	//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:iload_0         
	//    6   13:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//    7   16:ldc1            #46  <String "x">
	//    8   18:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:iload_1         
	//   10   22:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   11   25:ldc1            #48  <String "], ">
	//   12   27:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_2         
	//   14   31:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   15   34:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   16   37:areturn         
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
		return (new StringBuilder()).append("AttributeStrategy:\n  ").append(((Object) (groupedMap))).toString();
	//    0    0:new             #34  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void StringBuilder()>
	//    3    7:ldc1            #101 <String "AttributeStrategy:\n  ">
	//    4    9:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #29  <Field GroupedLinkedMap groupedMap>
	//    7   16:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:invokevirtual   #55  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	private final GroupedLinkedMap groupedMap = new GroupedLinkedMap();
	private final KeyPool keyPool = new KeyPool();
}
