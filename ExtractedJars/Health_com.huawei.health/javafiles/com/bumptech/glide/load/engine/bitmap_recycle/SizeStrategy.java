// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import com.bumptech.glide.util.Util;
import java.util.TreeMap;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			LruPoolStrategy, GroupedLinkedMap, PrettyPrintTreeMap, Poolable, 
//			BaseKeyPool

class SizeStrategy
	implements LruPoolStrategy
{
	static final class Key
		implements Poolable
	{

		public boolean equals(Object obj)
		{
			if(obj instanceof Key)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class SizeStrategy$Key>
		//*   2    4:ifeq            27
			{
				obj = ((Object) ((Key)obj));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class SizeStrategy$Key>
		//    5   11:astore_1        
				return size == ((Key) (obj)).size;
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field int size>
		//    8   16:aload_1         
		//    9   17:getfield        #25  <Field int size>
		//   10   20:icmpne          25
		//   11   23:iconst_1        
		//   12   24:ireturn         
		//   13   25:iconst_0        
		//   14   26:ireturn         
			} else
			{
				return false;
		//   15   27:iconst_0        
		//   16   28:ireturn         
			}
		}

		public int hashCode()
		{
			return size;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int size>
		//    2    4:ireturn         
		}

		public void init(int i)
		{
			size = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #25  <Field int size>
		//    3    5:return          
		}

		public void offer()
		{
			pool.offer(((Poolable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field SizeStrategy$KeyPool pool>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #35  <Method void SizeStrategy$KeyPool.offer(Poolable)>
		//    4    8:return          
		}

		public String toString()
		{
			return SizeStrategy.getBitmapString(size);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int size>
		//    2    4:invokestatic    #41  <Method String SizeStrategy.getBitmapString(int)>
		//    3    7:areturn         
		}

		private final KeyPool pool;
		int size;

		Key(KeyPool keypool)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			pool = keypool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field SizeStrategy$KeyPool pool>
		//    5    9:return          
		}
	}

	static class KeyPool extends BaseKeyPool
	{

		protected volatile Poolable create()
		{
			return ((Poolable) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #18  <Method SizeStrategy$Key create()>
		//    2    4:areturn         
		}

		protected Key create()
		{
			return new Key(this);
		//    0    0:new             #20  <Class SizeStrategy$Key>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #23  <Method void SizeStrategy$Key(SizeStrategy$KeyPool)>
		//    4    8:areturn         
		}

		public Key get(int i)
		{
			Key key = (Key)get();
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

		KeyPool()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void BaseKeyPool()>
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
	//   16   34:putfield        #43  <Field TreeMap sortedSizes>
	//   17   37:return          
	}

	private void decrementBitmapOfSize(Integer integer)
	{
		Integer integer1 = (Integer)sortedSizes.get(((Object) (integer)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field TreeMap sortedSizes>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #52  <Method Object TreeMap.get(Object)>
	//    4    8:checkcast       #54  <Class Integer>
	//    5   11:astore_2        
		if(integer1.intValue() == 1)
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #58  <Method int Integer.intValue()>
	//*   8   16:iconst_1        
	//*   9   17:icmpne          30
		{
			sortedSizes.remove(((Object) (integer)));
	//   10   20:aload_0         
	//   11   21:getfield        #43  <Field TreeMap sortedSizes>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #61  <Method Object TreeMap.remove(Object)>
	//   14   28:pop             
			return;
	//   15   29:return          
		} else
		{
			sortedSizes.put(((Object) (integer)), ((Object) (Integer.valueOf(integer1.intValue() - 1))));
	//   16   30:aload_0         
	//   17   31:getfield        #43  <Field TreeMap sortedSizes>
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokevirtual   #58  <Method int Integer.intValue()>
	//   21   39:iconst_1        
	//   22   40:isub            
	//   23   41:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   24   44:invokevirtual   #69  <Method Object TreeMap.put(Object, Object)>
	//   25   47:pop             
			return;
	//   26   48:return          
		}
	}

	static String getBitmapString(int i)
	{
		return (new StringBuilder()).append("[").append(i).append("]").toString();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:ldc1            #76  <String "[">
	//    4    9:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:iload_0         
	//    6   13:invokevirtual   #83  <Method StringBuilder StringBuilder.append(int)>
	//    7   16:ldc1            #85  <String "]">
	//    8   18:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   10   24:areturn         
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
	//   11   20:getfield        #43  <Field TreeMap sortedSizes>
	//   12   23:iload           4
	//   13   25:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   14   28:invokevirtual   #109 <Method Object TreeMap.ceilingKey(Object)>
	//   15   31:checkcast       #54  <Class Integer>
	//   16   34:astore          7
		Object obj = ((Object) (key));
	//   17   36:aload           6
	//   18   38:astore          5
		if(integer != null)
	//*  19   40:aload           7
	//*  20   42:ifnull          99
		{
			obj = ((Object) (key));
	//   21   45:aload           6
	//   22   47:astore          5
			if(integer.intValue() != k)
	//*  23   49:aload           7
	//*  24   51:invokevirtual   #58  <Method int Integer.intValue()>
	//*  25   54:iload           4
	//*  26   56:icmpeq          99
			{
				obj = ((Object) (key));
	//   27   59:aload           6
	//   28   61:astore          5
				if(integer.intValue() <= k * 8)
	//*  29   63:aload           7
	//*  30   65:invokevirtual   #58  <Method int Integer.intValue()>
	//*  31   68:iload           4
	//*  32   70:bipush          8
	//*  33   72:imul            
	//*  34   73:icmpgt          99
				{
					keyPool.offer(((Poolable) (key)));
	//   35   76:aload_0         
	//   36   77:getfield        #33  <Field SizeStrategy$KeyPool keyPool>
	//   37   80:aload           6
	//   38   82:invokevirtual   #113 <Method void SizeStrategy$KeyPool.offer(Poolable)>
					obj = ((Object) (keyPool.get(integer.intValue())));
	//   39   85:aload_0         
	//   40   86:getfield        #33  <Field SizeStrategy$KeyPool keyPool>
	//   41   89:aload           7
	//   42   91:invokevirtual   #58  <Method int Integer.intValue()>
	//   43   94:invokevirtual   #106 <Method SizeStrategy$Key SizeStrategy$KeyPool.get(int)>
	//   44   97:astore          5
				}
			}
		}
		obj = ((Object) ((Bitmap)groupedMap.get(((Poolable) (obj)))));
	//   45   99:aload_0         
	//   46  100:getfield        #38  <Field GroupedLinkedMap groupedMap>
	//   47  103:aload           5
	//   48  105:invokevirtual   #116 <Method Object GroupedLinkedMap.get(Poolable)>
	//   49  108:checkcast       #118 <Class Bitmap>
	//   50  111:astore          5
		if(obj != null)
	//*  51  113:aload           5
	//*  52  115:ifnull          132
		{
			((Bitmap) (obj)).reconfigure(i, j, config);
	//   53  118:aload           5
	//   54  120:iload_1         
	//   55  121:iload_2         
	//   56  122:aload_3         
	//   57  123:invokevirtual   #122 <Method void Bitmap.reconfigure(int, int, android.graphics.Bitmap$Config)>
			decrementBitmapOfSize(integer);
	//   58  126:aload_0         
	//   59  127:aload           7
	//   60  129:invokespecial   #124 <Method void decrementBitmapOfSize(Integer)>
		}
		return ((Bitmap) (obj));
	//   61  132:aload           5
	//   62  134:areturn         
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
	//   14   26:getfield        #43  <Field TreeMap sortedSizes>
	//   15   29:aload           4
	//   16   31:getfield        #137 <Field int SizeStrategy$Key.size>
	//   17   34:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   18   37:invokevirtual   #52  <Method Object TreeMap.get(Object)>
	//   19   40:checkcast       #54  <Class Integer>
	//   20   43:astore_1        
		TreeMap treemap = sortedSizes;
	//   21   44:aload_0         
	//   22   45:getfield        #43  <Field TreeMap sortedSizes>
	//   23   48:astore          5
		int j = key.size;
	//   24   50:aload           4
	//   25   52:getfield        #137 <Field int SizeStrategy$Key.size>
	//   26   55:istore_3        
		if(bitmap == null)
	//*  27   56:aload_1         
	//*  28   57:ifnonnull       65
			i = 1;
	//   29   60:iconst_1        
	//   30   61:istore_2        
		else
	//*  31   62:goto            72
			i = ((Integer) (bitmap)).intValue() + 1;
	//   32   65:aload_1         
	//   33   66:invokevirtual   #58  <Method int Integer.intValue()>
	//   34   69:iconst_1        
	//   35   70:iadd            
	//   36   71:istore_2        
		treemap.put(((Object) (Integer.valueOf(j))), ((Object) (Integer.valueOf(i))));
	//   37   72:aload           5
	//   38   74:iload_3         
	//   39   75:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   40   78:iload_2         
	//   41   79:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   42   82:invokevirtual   #69  <Method Object TreeMap.put(Object, Object)>
	//   43   85:pop             
	//   44   86:return          
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
		return (new StringBuilder()).append("SizeStrategy:\n  ").append(((Object) (groupedMap))).append("\n  SortedSizes").append(((Object) (sortedSizes))).toString();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:ldc1            #144 <String "SizeStrategy:\n  ">
	//    4    9:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #38  <Field GroupedLinkedMap groupedMap>
	//    7   16:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #149 <String "\n  SortedSizes">
	//    9   21:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #43  <Field TreeMap sortedSizes>
	//   12   28:invokevirtual   #147 <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   14   34:areturn         
	}

	private static final int MAX_SIZE_MULTIPLE = 8;
	private final GroupedLinkedMap groupedMap = new GroupedLinkedMap();
	private final KeyPool keyPool = new KeyPool();
	private final TreeMap sortedSizes = new PrettyPrintTreeMap();
}
