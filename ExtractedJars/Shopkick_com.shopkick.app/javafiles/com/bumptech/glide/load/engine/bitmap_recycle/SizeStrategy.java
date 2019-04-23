// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import com.bumptech.glide.util.Util;
import java.util.NavigableMap;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			LruPoolStrategy, GroupedLinkedMap, PrettyPrintTreeMap, Poolable, 
//			BaseKeyPool

final class SizeStrategy
	implements LruPoolStrategy
{
	static final class Key
		implements Poolable
	{

		public boolean equals(Object obj)
		{
			boolean flag1 = obj instanceof Key;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class SizeStrategy$Key>
		//    2    4:istore_3        
			boolean flag = false;
		//    3    5:iconst_0        
		//    4    6:istore_2        
			if(flag1)
		//*   5    7:iload_3         
		//*   6    8:ifeq            31
			{
				obj = ((Object) ((Key)obj));
		//    7   11:aload_1         
		//    8   12:checkcast       #2   <Class SizeStrategy$Key>
		//    9   15:astore_1        
				if(size == ((Key) (obj)).size)
		//*  10   16:aload_0         
		//*  11   17:getfield        #26  <Field int size>
		//*  12   20:aload_1         
		//*  13   21:getfield        #26  <Field int size>
		//*  14   24:icmpne          29
					flag = true;
		//   15   27:iconst_1        
		//   16   28:istore_2        
				return flag;
		//   17   29:iload_2         
		//   18   30:ireturn         
			} else
			{
				return false;
		//   19   31:iconst_0        
		//   20   32:ireturn         
			}
		}

		public int hashCode()
		{
			return size;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int size>
		//    2    4:ireturn         
		}

		public void init(int i)
		{
			size = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #26  <Field int size>
		//    3    5:return          
		}

		public void offer()
		{
			pool.offer(((Poolable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field SizeStrategy$KeyPool pool>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #36  <Method void SizeStrategy$KeyPool.offer(Poolable)>
		//    4    8:return          
		}

		public String toString()
		{
			return SizeStrategy.getBitmapString(size);
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field int size>
		//    2    4:invokestatic    #42  <Method String SizeStrategy.getBitmapString(int)>
		//    3    7:areturn         
		}

		private final KeyPool pool;
		int size;

		Key(KeyPool keypool)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			pool = keypool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field SizeStrategy$KeyPool pool>
		//    5    9:return          
		}
	}

	static class KeyPool extends BaseKeyPool
	{

		protected volatile Poolable create()
		{
			return ((Poolable) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #19  <Method SizeStrategy$Key create()>
		//    2    4:areturn         
		}

		protected Key create()
		{
			return new Key(this);
		//    0    0:new             #21  <Class SizeStrategy$Key>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #24  <Method void SizeStrategy$Key(SizeStrategy$KeyPool)>
		//    4    8:areturn         
		}

		public Key get(int i)
		{
			Key key = (Key)super.get();
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method Poolable BaseKeyPool.get()>
		//    2    4:checkcast       #21  <Class SizeStrategy$Key>
		//    3    7:astore_2        
			key.init(i);
		//    4    8:aload_2         
		//    5    9:iload_1         
		//    6   10:invokevirtual   #32  <Method void SizeStrategy$Key.init(int)>
			return key;
		//    7   13:aload_2         
		//    8   14:areturn         
		}

		KeyPool()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void BaseKeyPool()>
		//    2    4:return          
		}
	}


	SizeStrategy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #11  <Class SizeStrategy$KeyPool>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void SizeStrategy$KeyPool()>
	//    6   12:putfield        #33  <Field SizeStrategy$KeyPool keyPool>
	//    7   15:aload_0         
	//    8   16:new             #35  <Class GroupedLinkedMap>
	//    9   19:dup             
	//   10   20:invokespecial   #36  <Method void GroupedLinkedMap()>
	//   11   23:putfield        #38  <Field GroupedLinkedMap groupedMap>
	//   12   26:aload_0         
	//   13   27:new             #40  <Class PrettyPrintTreeMap>
	//   14   30:dup             
	//   15   31:invokespecial   #41  <Method void PrettyPrintTreeMap()>
	//   16   34:putfield        #43  <Field NavigableMap sortedSizes>
	//   17   37:return          
	}

	private void decrementBitmapOfSize(Integer integer)
	{
		Integer integer1 = (Integer)sortedSizes.get(((Object) (integer)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field NavigableMap sortedSizes>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method Object NavigableMap.get(Object)>
	//    4   10:checkcast       #54  <Class Integer>
	//    5   13:astore_2        
		if(integer1.intValue() == 1)
	//*   6   14:aload_2         
	//*   7   15:invokevirtual   #58  <Method int Integer.intValue()>
	//*   8   18:iconst_1        
	//*   9   19:icmpne          34
		{
			sortedSizes.remove(((Object) (integer)));
	//   10   22:aload_0         
	//   11   23:getfield        #43  <Field NavigableMap sortedSizes>
	//   12   26:aload_1         
	//   13   27:invokeinterface #61  <Method Object NavigableMap.remove(Object)>
	//   14   32:pop             
			return;
	//   15   33:return          
		} else
		{
			sortedSizes.put(((Object) (integer)), ((Object) (Integer.valueOf(integer1.intValue() - 1))));
	//   16   34:aload_0         
	//   17   35:getfield        #43  <Field NavigableMap sortedSizes>
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:invokevirtual   #58  <Method int Integer.intValue()>
	//   21   43:iconst_1        
	//   22   44:isub            
	//   23   45:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   24   48:invokeinterface #69  <Method Object NavigableMap.put(Object, Object)>
	//   25   53:pop             
			return;
	//   26   54:return          
		}
	}

	static String getBitmapString(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[");
	//    4    8:aload_1         
	//    5    9:ldc1            #76  <String "[">
	//    6   11:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(i);
	//    8   15:aload_1         
	//    9   16:iload_0         
	//   10   17:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//   11   20:pop             
		stringbuilder.append("]");
	//   12   21:aload_1         
	//   13   22:ldc1            #85  <String "]">
	//   14   24:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		return stringbuilder.toString();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   18   32:areturn         
	}

	private static String getBitmapString(Bitmap bitmap)
	{
		return getBitmapString(Util.getBitmapByteSize(bitmap));
	//    0    0:aload_0         
	//    1    1:invokestatic    #96  <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:invokestatic    #98  <Method String getBitmapString(int)>
	//    3    7:areturn         
	}

	public Bitmap get(int i, int j, android.graphics.Bitmap.Config config)
	{
		int k = Util.getBitmapByteSize(i, j, config);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #103 <Method int Util.getBitmapByteSize(int, int, android.graphics.Bitmap$Config)>
	//    4    6:istore          4
		Key key = keyPool.get(k);
	//    5    8:aload_0         
	//    6    9:getfield        #33  <Field SizeStrategy$KeyPool keyPool>
	//    7   12:iload           4
	//    8   14:invokevirtual   #106 <Method SizeStrategy$Key SizeStrategy$KeyPool.get(int)>
	//    9   17:astore          6
		Integer integer = (Integer)sortedSizes.ceilingKey(((Object) (Integer.valueOf(k))));
	//   10   19:aload_0         
	//   11   20:getfield        #43  <Field NavigableMap sortedSizes>
	//   12   23:iload           4
	//   13   25:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   14   28:invokeinterface #109 <Method Object NavigableMap.ceilingKey(Object)>
	//   15   33:checkcast       #54  <Class Integer>
	//   16   36:astore          7
		Object obj = ((Object) (key));
	//   17   38:aload           6
	//   18   40:astore          5
		if(integer != null)
	//*  19   42:aload           7
	//*  20   44:ifnull          101
		{
			obj = ((Object) (key));
	//   21   47:aload           6
	//   22   49:astore          5
			if(integer.intValue() != k)
	//*  23   51:aload           7
	//*  24   53:invokevirtual   #58  <Method int Integer.intValue()>
	//*  25   56:iload           4
	//*  26   58:icmpeq          101
			{
				obj = ((Object) (key));
	//   27   61:aload           6
	//   28   63:astore          5
				if(integer.intValue() <= k * 8)
	//*  29   65:aload           7
	//*  30   67:invokevirtual   #58  <Method int Integer.intValue()>
	//*  31   70:iload           4
	//*  32   72:bipush          8
	//*  33   74:imul            
	//*  34   75:icmpgt          101
				{
					keyPool.offer(((Poolable) (key)));
	//   35   78:aload_0         
	//   36   79:getfield        #33  <Field SizeStrategy$KeyPool keyPool>
	//   37   82:aload           6
	//   38   84:invokevirtual   #113 <Method void SizeStrategy$KeyPool.offer(Poolable)>
					obj = ((Object) (keyPool.get(integer.intValue())));
	//   39   87:aload_0         
	//   40   88:getfield        #33  <Field SizeStrategy$KeyPool keyPool>
	//   41   91:aload           7
	//   42   93:invokevirtual   #58  <Method int Integer.intValue()>
	//   43   96:invokevirtual   #106 <Method SizeStrategy$Key SizeStrategy$KeyPool.get(int)>
	//   44   99:astore          5
				}
			}
		}
		obj = ((Object) ((Bitmap)groupedMap.get(((Poolable) (obj)))));
	//   45  101:aload_0         
	//   46  102:getfield        #38  <Field GroupedLinkedMap groupedMap>
	//   47  105:aload           5
	//   48  107:invokevirtual   #116 <Method Object GroupedLinkedMap.get(Poolable)>
	//   49  110:checkcast       #118 <Class Bitmap>
	//   50  113:astore          5
		if(obj != null)
	//*  51  115:aload           5
	//*  52  117:ifnull          134
		{
			((Bitmap) (obj)).reconfigure(i, j, config);
	//   53  120:aload           5
	//   54  122:iload_1         
	//   55  123:iload_2         
	//   56  124:aload_3         
	//   57  125:invokevirtual   #122 <Method void Bitmap.reconfigure(int, int, android.graphics.Bitmap$Config)>
			decrementBitmapOfSize(integer);
	//   58  128:aload_0         
	//   59  129:aload           7
	//   60  131:invokespecial   #124 <Method void decrementBitmapOfSize(Integer)>
		}
		return ((Bitmap) (obj));
	//   61  134:aload           5
	//   62  136:areturn         
	}

	public int getSize(Bitmap bitmap)
	{
		return Util.getBitmapByteSize(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #96  <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:ireturn         
	}

	public String logBitmap(int i, int j, android.graphics.Bitmap.Config config)
	{
		return getBitmapString(Util.getBitmapByteSize(i, j, config));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #103 <Method int Util.getBitmapByteSize(int, int, android.graphics.Bitmap$Config)>
	//    4    6:invokestatic    #98  <Method String getBitmapString(int)>
	//    5    9:areturn         
	}

	public String logBitmap(Bitmap bitmap)
	{
		return getBitmapString(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #130 <Method String getBitmapString(Bitmap)>
	//    2    4:areturn         
	}

	public void put(Bitmap bitmap)
	{
		int i = Util.getBitmapByteSize(bitmap);
	//    0    0:aload_1         
	//    1    1:invokestatic    #96  <Method int Util.getBitmapByteSize(Bitmap)>
	//    2    4:istore_2        
		Key key = keyPool.get(i);
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field SizeStrategy$KeyPool keyPool>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #106 <Method SizeStrategy$Key SizeStrategy$KeyPool.get(int)>
	//    7   13:astore          4
		groupedMap.put(((Poolable) (key)), ((Object) (bitmap)));
	//    8   15:aload_0         
	//    9   16:getfield        #38  <Field GroupedLinkedMap groupedMap>
	//   10   19:aload           4
	//   11   21:aload_1         
	//   12   22:invokevirtual   #134 <Method void GroupedLinkedMap.put(Poolable, Object)>
		bitmap = ((Bitmap) ((Integer)sortedSizes.get(((Object) (Integer.valueOf(key.size))))));
	//   13   25:aload_0         
	//   14   26:getfield        #43  <Field NavigableMap sortedSizes>
	//   15   29:aload           4
	//   16   31:getfield        #137 <Field int SizeStrategy$Key.size>
	//   17   34:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   18   37:invokeinterface #52  <Method Object NavigableMap.get(Object)>
	//   19   42:checkcast       #54  <Class Integer>
	//   20   45:astore_1        
		NavigableMap navigablemap = sortedSizes;
	//   21   46:aload_0         
	//   22   47:getfield        #43  <Field NavigableMap sortedSizes>
	//   23   50:astore          5
		int j = key.size;
	//   24   52:aload           4
	//   25   54:getfield        #137 <Field int SizeStrategy$Key.size>
	//   26   57:istore_3        
		i = 1;
	//   27   58:iconst_1        
	//   28   59:istore_2        
		if(bitmap != null)
	//*  29   60:aload_1         
	//*  30   61:ifnonnull       67
	//*  31   64:goto            74
			i = 1 + ((Integer) (bitmap)).intValue();
	//   32   67:iconst_1        
	//   33   68:aload_1         
	//   34   69:invokevirtual   #58  <Method int Integer.intValue()>
	//   35   72:iadd            
	//   36   73:istore_2        
		navigablemap.put(((Object) (Integer.valueOf(j))), ((Object) (Integer.valueOf(i))));
	//   37   74:aload           5
	//   38   76:iload_3         
	//   39   77:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   40   80:iload_2         
	//   41   81:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   42   84:invokeinterface #69  <Method Object NavigableMap.put(Object, Object)>
	//   43   89:pop             
	//   44   90:return          
	}

	public Bitmap removeLast()
	{
		Bitmap bitmap = (Bitmap)groupedMap.removeLast();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field GroupedLinkedMap groupedMap>
	//    2    4:invokevirtual   #142 <Method Object GroupedLinkedMap.removeLast()>
	//    3    7:checkcast       #118 <Class Bitmap>
	//    4   10:astore_1        
		if(bitmap != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          26
			decrementBitmapOfSize(Integer.valueOf(Util.getBitmapByteSize(bitmap)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #96  <Method int Util.getBitmapByteSize(Bitmap)>
	//   10   20:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   11   23:invokespecial   #124 <Method void decrementBitmapOfSize(Integer)>
		return bitmap;
	//   12   26:aload_1         
	//   13   27:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("SizeStrategy:\n  ");
	//    4    8:aload_1         
	//    5    9:ldc1            #144 <String "SizeStrategy:\n  ">
	//    6   11:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (groupedMap)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field GroupedLinkedMap groupedMap>
	//   11   20:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append("\n  SortedSizes");
	//   13   24:aload_1         
	//   14   25:ldc1            #149 <String "\n  SortedSizes">
	//   15   27:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(((Object) (sortedSizes)));
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #43  <Field NavigableMap sortedSizes>
	//   20   36:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   21   39:pop             
		return stringbuilder.toString();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   24   44:areturn         
	}

	private static final int MAX_SIZE_MULTIPLE = 8;
	private final GroupedLinkedMap groupedMap = new GroupedLinkedMap();
	private final KeyPool keyPool = new KeyPool();
	private final NavigableMap sortedSizes = new PrettyPrintTreeMap();
}
