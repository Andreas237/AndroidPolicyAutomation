// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			ArrayPool, GroupedLinkedMap, ArrayAdapterInterface, IntegerArrayAdapter, 
//			ByteArrayAdapter, Poolable, BaseKeyPool

public final class LruArrayPool
	implements ArrayPool
{
	private static final class Key
		implements Poolable
	{

		public boolean equals(Object obj)
		{
			boolean flag = obj instanceof Key;
		//    0    0:aload_1         
		//    1    1:instanceof      #2   <Class LruArrayPool$Key>
		//    2    4:istore_2        
			boolean flag2 = false;
		//    3    5:iconst_0        
		//    4    6:istore_3        
			if(flag)
		//*   5    7:iload_2         
		//*   6    8:ifeq            46
			{
				obj = ((Object) ((Key)obj));
		//    7   11:aload_1         
		//    8   12:checkcast       #2   <Class LruArrayPool$Key>
		//    9   15:astore_1        
				boolean flag1 = flag2;
		//   10   16:iload_3         
		//   11   17:istore_2        
				if(size == ((Key) (obj)).size)
		//*  12   18:aload_0         
		//*  13   19:getfield        #28  <Field int size>
		//*  14   22:aload_1         
		//*  15   23:getfield        #28  <Field int size>
		//*  16   26:icmpne          44
				{
					flag1 = flag2;
		//   17   29:iload_3         
		//   18   30:istore_2        
					if(arrayClass == ((Key) (obj)).arrayClass)
		//*  19   31:aload_0         
		//*  20   32:getfield        #30  <Field Class arrayClass>
		//*  21   35:aload_1         
		//*  22   36:getfield        #30  <Field Class arrayClass>
		//*  23   39:if_acmpne       44
						flag1 = true;
		//   24   42:iconst_1        
		//   25   43:istore_2        
				}
				return flag1;
		//   26   44:iload_2         
		//   27   45:ireturn         
			} else
			{
				return false;
		//   28   46:iconst_0        
		//   29   47:ireturn         
			}
		}

		public int hashCode()
		{
			int j = size;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field int size>
		//    2    4:istore_2        
			Class class1 = arrayClass;
		//    3    5:aload_0         
		//    4    6:getfield        #30  <Field Class arrayClass>
		//    5    9:astore_3        
			int i;
			if(class1 != null)
		//*   6   10:aload_3         
		//*   7   11:ifnull          22
				i = ((Object) (class1)).hashCode();
		//    8   14:aload_3         
		//    9   15:invokevirtual   #34  <Method int Object.hashCode()>
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

		void init(int i, Class class1)
		{
			size = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #28  <Field int size>
			arrayClass = class1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #30  <Field Class arrayClass>
		//    6   10:return          
		}

		public void offer()
		{
			pool.offer(((Poolable) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field LruArrayPool$KeyPool pool>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #44  <Method void LruArrayPool$KeyPool.offer(Poolable)>
		//    4    8:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #48  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #49  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("Key{size=");
		//    4    8:aload_1         
		//    5    9:ldc1            #51  <String "Key{size=">
		//    6   11:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(size);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #28  <Field int size>
		//   11   20:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append("array=");
		//   13   24:aload_1         
		//   14   25:ldc1            #60  <String "array=">
		//   15   27:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(((Object) (arrayClass)));
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #30  <Field Class arrayClass>
		//   20   36:invokevirtual   #63  <Method StringBuilder StringBuilder.append(Object)>
		//   21   39:pop             
			stringbuilder.append('}');
		//   22   40:aload_1         
		//   23   41:bipush          125
		//   24   43:invokevirtual   #66  <Method StringBuilder StringBuilder.append(char)>
		//   25   46:pop             
			return stringbuilder.toString();
		//   26   47:aload_1         
		//   27   48:invokevirtual   #68  <Method String StringBuilder.toString()>
		//   28   51:areturn         
		}

		private Class arrayClass;
		private final KeyPool pool;
		int size;

		Key(KeyPool keypool)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			pool = keypool;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field LruArrayPool$KeyPool pool>
		//    5    9:return          
		}
	}

	private static final class KeyPool extends BaseKeyPool
	{

		protected Key create()
		{
			return new Key(this);
		//    0    0:new             #17  <Class LruArrayPool$Key>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #20  <Method void LruArrayPool$Key(LruArrayPool$KeyPool)>
		//    4    8:areturn         
		}

		protected volatile Poolable create()
		{
			return ((Poolable) (create()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method LruArrayPool$Key create()>
		//    2    4:areturn         
		}

		Key get(int i, Class class1)
		{
			Key key = (Key)get();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #27  <Method Poolable get()>
		//    2    4:checkcast       #17  <Class LruArrayPool$Key>
		//    3    7:astore_3        
			key.init(i, class1);
		//    4    8:aload_3         
		//    5    9:iload_1         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #31  <Method void LruArrayPool$Key.init(int, Class)>
			return key;
		//    8   14:aload_3         
		//    9   15:areturn         
		}

		KeyPool()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void BaseKeyPool()>
		//    2    4:return          
		}
	}


	public LruArrayPool()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		groupedMap = new GroupedLinkedMap();
	//    2    4:aload_0         
	//    3    5:new             #32  <Class GroupedLinkedMap>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void GroupedLinkedMap()>
	//    6   12:putfield        #35  <Field GroupedLinkedMap groupedMap>
		keyPool = new KeyPool();
	//    7   15:aload_0         
	//    8   16:new             #11  <Class LruArrayPool$KeyPool>
	//    9   19:dup             
	//   10   20:invokespecial   #36  <Method void LruArrayPool$KeyPool()>
	//   11   23:putfield        #38  <Field LruArrayPool$KeyPool keyPool>
		sortedSizes = ((Map) (new HashMap()));
	//   12   26:aload_0         
	//   13   27:new             #40  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #41  <Method void HashMap()>
	//   16   34:putfield        #43  <Field Map sortedSizes>
		adapters = ((Map) (new HashMap()));
	//   17   37:aload_0         
	//   18   38:new             #40  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #41  <Method void HashMap()>
	//   21   45:putfield        #45  <Field Map adapters>
		maxSize = 0x400000;
	//   22   48:aload_0         
	//   23   49:ldc1            #46  <Int 0x400000>
	//   24   51:putfield        #48  <Field int maxSize>
	//   25   54:return          
	}

	public LruArrayPool(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		groupedMap = new GroupedLinkedMap();
	//    2    4:aload_0         
	//    3    5:new             #32  <Class GroupedLinkedMap>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void GroupedLinkedMap()>
	//    6   12:putfield        #35  <Field GroupedLinkedMap groupedMap>
		keyPool = new KeyPool();
	//    7   15:aload_0         
	//    8   16:new             #11  <Class LruArrayPool$KeyPool>
	//    9   19:dup             
	//   10   20:invokespecial   #36  <Method void LruArrayPool$KeyPool()>
	//   11   23:putfield        #38  <Field LruArrayPool$KeyPool keyPool>
		sortedSizes = ((Map) (new HashMap()));
	//   12   26:aload_0         
	//   13   27:new             #40  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #41  <Method void HashMap()>
	//   16   34:putfield        #43  <Field Map sortedSizes>
		adapters = ((Map) (new HashMap()));
	//   17   37:aload_0         
	//   18   38:new             #40  <Class HashMap>
	//   19   41:dup             
	//   20   42:invokespecial   #41  <Method void HashMap()>
	//   21   45:putfield        #45  <Field Map adapters>
		maxSize = i;
	//   22   48:aload_0         
	//   23   49:iload_1         
	//   24   50:putfield        #48  <Field int maxSize>
	//   25   53:return          
	}

	private void decrementArrayOfSize(int i, Class class1)
	{
		class1 = ((Class) (getSizesForAdapter(class1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #57  <Method NavigableMap getSizesForAdapter(Class)>
	//    3    5:astore_2        
		Integer integer = (Integer)((NavigableMap) (class1)).get(((Object) (Integer.valueOf(i))));
	//    4    6:aload_2         
	//    5    7:iload_1         
	//    6    8:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//    7   11:invokeinterface #69  <Method Object NavigableMap.get(Object)>
	//    8   16:checkcast       #59  <Class Integer>
	//    9   19:astore_3        
		if(integer != null)
	//*  10   20:aload_3         
	//*  11   21:ifnull          65
		{
			if(integer.intValue() == 1)
	//*  12   24:aload_3         
	//*  13   25:invokevirtual   #73  <Method int Integer.intValue()>
	//*  14   28:iconst_1        
	//*  15   29:icmpne          44
			{
				((NavigableMap) (class1)).remove(((Object) (Integer.valueOf(i))));
	//   16   32:aload_2         
	//   17   33:iload_1         
	//   18   34:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//   19   37:invokeinterface #76  <Method Object NavigableMap.remove(Object)>
	//   20   42:pop             
				return;
	//   21   43:return          
			} else
			{
				((NavigableMap) (class1)).put(((Object) (Integer.valueOf(i))), ((Object) (Integer.valueOf(integer.intValue() - 1))));
	//   22   44:aload_2         
	//   23   45:iload_1         
	//   24   46:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//   25   49:aload_3         
	//   26   50:invokevirtual   #73  <Method int Integer.intValue()>
	//   27   53:iconst_1        
	//   28   54:isub            
	//   29   55:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//   30   58:invokeinterface #80  <Method Object NavigableMap.put(Object, Object)>
	//   31   63:pop             
				return;
	//   32   64:return          
			}
		} else
		{
			class1 = ((Class) (new StringBuilder()));
	//   33   65:new             #82  <Class StringBuilder>
	//   34   68:dup             
	//   35   69:invokespecial   #83  <Method void StringBuilder()>
	//   36   72:astore_2        
			((StringBuilder) (class1)).append("Tried to decrement empty size, size: ");
	//   37   73:aload_2         
	//   38   74:ldc1            #85  <String "Tried to decrement empty size, size: ">
	//   39   76:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   40   79:pop             
			((StringBuilder) (class1)).append(i);
	//   41   80:aload_2         
	//   42   81:iload_1         
	//   43   82:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   44   85:pop             
			((StringBuilder) (class1)).append(", this: ");
	//   45   86:aload_2         
	//   46   87:ldc1            #94  <String ", this: ">
	//   47   89:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
			((StringBuilder) (class1)).append(((Object) (this)));
	//   49   93:aload_2         
	//   50   94:aload_0         
	//   51   95:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   52   98:pop             
			throw new NullPointerException(((StringBuilder) (class1)).toString());
	//   53   99:new             #99  <Class NullPointerException>
	//   54  102:dup             
	//   55  103:aload_2         
	//   56  104:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   57  107:invokespecial   #106 <Method void NullPointerException(String)>
	//   58  110:athrow          
		}
	}

	private void evict()
	{
		evictToSize(maxSize);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field int maxSize>
	//    3    5:invokespecial   #112 <Method void evictToSize(int)>
	//    4    8:return          
	}

	private void evictToSize(int i)
	{
		do
		{
			if(currentSize <= i)
				break;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int currentSize>
	//    2    4:iload_1         
	//    3    5:icmple          130
			Object obj = groupedMap.removeLast();
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field GroupedLinkedMap groupedMap>
	//    6   12:invokevirtual   #118 <Method Object GroupedLinkedMap.removeLast()>
	//    7   15:astore_2        
			Preconditions.checkNotNull(obj);
	//    8   16:aload_2         
	//    9   17:invokestatic    #123 <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:pop             
			ArrayAdapterInterface arrayadapterinterface = getAdapterFromObject(obj);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:invokespecial   #127 <Method ArrayAdapterInterface getAdapterFromObject(Object)>
	//   14   26:astore_3        
			currentSize = currentSize - arrayadapterinterface.getArrayLength(obj) * arrayadapterinterface.getElementSizeInBytes();
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #114 <Field int currentSize>
	//   18   32:aload_3         
	//   19   33:aload_2         
	//   20   34:invokeinterface #133 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   21   39:aload_3         
	//   22   40:invokeinterface #136 <Method int ArrayAdapterInterface.getElementSizeInBytes()>
	//   23   45:imul            
	//   24   46:isub            
	//   25   47:putfield        #114 <Field int currentSize>
			decrementArrayOfSize(arrayadapterinterface.getArrayLength(obj), obj.getClass());
	//   26   50:aload_0         
	//   27   51:aload_3         
	//   28   52:aload_2         
	//   29   53:invokeinterface #133 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   30   58:aload_2         
	//   31   59:invokevirtual   #140 <Method Class Object.getClass()>
	//   32   62:invokespecial   #142 <Method void decrementArrayOfSize(int, Class)>
			if(Log.isLoggable(arrayadapterinterface.getTag(), 2))
	//*  33   65:aload_3         
	//*  34   66:invokeinterface #145 <Method String ArrayAdapterInterface.getTag()>
	//*  35   71:iconst_2        
	//*  36   72:invokestatic    #151 <Method boolean Log.isLoggable(String, int)>
	//*  37   75:ifeq            0
			{
				String s = arrayadapterinterface.getTag();
	//   38   78:aload_3         
	//   39   79:invokeinterface #145 <Method String ArrayAdapterInterface.getTag()>
	//   40   84:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   41   86:new             #82  <Class StringBuilder>
	//   42   89:dup             
	//   43   90:invokespecial   #83  <Method void StringBuilder()>
	//   44   93:astore          5
				stringbuilder.append("evicted: ");
	//   45   95:aload           5
	//   46   97:ldc1            #153 <String "evicted: ">
	//   47   99:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   48  102:pop             
				stringbuilder.append(arrayadapterinterface.getArrayLength(obj));
	//   49  103:aload           5
	//   50  105:aload_3         
	//   51  106:aload_2         
	//   52  107:invokeinterface #133 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   53  112:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   54  115:pop             
				Log.v(s, stringbuilder.toString());
	//   55  116:aload           4
	//   56  118:aload           5
	//   57  120:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   58  123:invokestatic    #157 <Method int Log.v(String, String)>
	//   59  126:pop             
			}
		} while(true);
	//   60  127:goto            0
	//   61  130:return          
	}

	private ArrayAdapterInterface getAdapterFromObject(Object obj)
	{
		return getAdapterFromType(obj.getClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #140 <Method Class Object.getClass()>
	//    3    5:invokespecial   #161 <Method ArrayAdapterInterface getAdapterFromType(Class)>
	//    4    8:areturn         
	}

	private ArrayAdapterInterface getAdapterFromType(Class class1)
	{
		Object obj;
label0:
		{
label1:
			{
				obj = ((Object) ((ArrayAdapterInterface)adapters.get(((Object) (class1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Map adapters>
	//    2    4:aload_1         
	//    3    5:invokeinterface #165 <Method Object Map.get(Object)>
	//    4   10:checkcast       #129 <Class ArrayAdapterInterface>
	//    5   13:astore_2        
				if(obj != null)
					break label0;
	//    6   14:aload_2         
	//    7   15:ifnonnull       105
				if(((Object) (class1)).equals([I))
	//*   8   18:aload_1         
	//*   9   19:ldc1            #167 <Class int[]>
	//*  10   21:invokevirtual   #171 <Method boolean Object.equals(Object)>
	//*  11   24:ifeq            38
				{
					obj = ((Object) (new IntegerArrayAdapter()));
	//   12   27:new             #173 <Class IntegerArrayAdapter>
	//   13   30:dup             
	//   14   31:invokespecial   #174 <Method void IntegerArrayAdapter()>
	//   15   34:astore_2        
				} else
	//*  16   35:goto            55
				{
					if(!((Object) (class1)).equals([B))
						break label1;
	//   17   38:aload_1         
	//   18   39:ldc1            #176 <Class byte[]>
	//   19   41:invokevirtual   #171 <Method boolean Object.equals(Object)>
	//   20   44:ifeq            69
					obj = ((Object) (new ByteArrayAdapter()));
	//   21   47:new             #178 <Class ByteArrayAdapter>
	//   22   50:dup             
	//   23   51:invokespecial   #179 <Method void ByteArrayAdapter()>
	//   24   54:astore_2        
				}
				adapters.put(((Object) (class1)), obj);
	//   25   55:aload_0         
	//   26   56:getfield        #45  <Field Map adapters>
	//   27   59:aload_1         
	//   28   60:aload_2         
	//   29   61:invokeinterface #180 <Method Object Map.put(Object, Object)>
	//   30   66:pop             
				return ((ArrayAdapterInterface) (obj));
	//   31   67:aload_2         
	//   32   68:areturn         
			}
			obj = ((Object) (new StringBuilder()));
	//   33   69:new             #82  <Class StringBuilder>
	//   34   72:dup             
	//   35   73:invokespecial   #83  <Method void StringBuilder()>
	//   36   76:astore_2        
			((StringBuilder) (obj)).append("No array pool found for: ");
	//   37   77:aload_2         
	//   38   78:ldc1            #182 <String "No array pool found for: ">
	//   39   80:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
			((StringBuilder) (obj)).append(class1.getSimpleName());
	//   41   84:aload_2         
	//   42   85:aload_1         
	//   43   86:invokevirtual   #187 <Method String Class.getSimpleName()>
	//   44   89:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   46   93:new             #189 <Class IllegalArgumentException>
	//   47   96:dup             
	//   48   97:aload_2         
	//   49   98:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   50  101:invokespecial   #190 <Method void IllegalArgumentException(String)>
	//   51  104:athrow          
		}
		return ((ArrayAdapterInterface) (obj));
	//   52  105:aload_2         
	//   53  106:areturn         
	}

	private Object getArrayForKey(Key key)
	{
		return groupedMap.get(((Poolable) (key)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field GroupedLinkedMap groupedMap>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #197 <Method Object GroupedLinkedMap.get(Poolable)>
	//    4    8:areturn         
	}

	private Object getForKey(Key key, Class class1)
	{
		ArrayAdapterInterface arrayadapterinterface = getAdapterFromType(class1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #161 <Method ArrayAdapterInterface getAdapterFromType(Class)>
	//    3    5:astore          4
		Object obj = getArrayForKey(key);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:invokespecial   #202 <Method Object getArrayForKey(LruArrayPool$Key)>
	//    7   12:astore_3        
		if(obj != null)
	//*   8   13:aload_3         
	//*   9   14:ifnull          55
		{
			currentSize = currentSize - arrayadapterinterface.getArrayLength(obj) * arrayadapterinterface.getElementSizeInBytes();
	//   10   17:aload_0         
	//   11   18:aload_0         
	//   12   19:getfield        #114 <Field int currentSize>
	//   13   22:aload           4
	//   14   24:aload_3         
	//   15   25:invokeinterface #133 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   16   30:aload           4
	//   17   32:invokeinterface #136 <Method int ArrayAdapterInterface.getElementSizeInBytes()>
	//   18   37:imul            
	//   19   38:isub            
	//   20   39:putfield        #114 <Field int currentSize>
			decrementArrayOfSize(arrayadapterinterface.getArrayLength(obj), class1);
	//   21   42:aload_0         
	//   22   43:aload           4
	//   23   45:aload_3         
	//   24   46:invokeinterface #133 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   25   51:aload_2         
	//   26   52:invokespecial   #142 <Method void decrementArrayOfSize(int, Class)>
		}
		class1 = ((Class) (obj));
	//   27   55:aload_3         
	//   28   56:astore_2        
		if(obj == null)
	//*  29   57:aload_3         
	//*  30   58:ifnonnull       135
		{
			if(Log.isLoggable(arrayadapterinterface.getTag(), 2))
	//*  31   61:aload           4
	//*  32   63:invokeinterface #145 <Method String ArrayAdapterInterface.getTag()>
	//*  33   68:iconst_2        
	//*  34   69:invokestatic    #151 <Method boolean Log.isLoggable(String, int)>
	//*  35   72:ifeq            123
			{
				class1 = ((Class) (arrayadapterinterface.getTag()));
	//   36   75:aload           4
	//   37   77:invokeinterface #145 <Method String ArrayAdapterInterface.getTag()>
	//   38   82:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   39   83:new             #82  <Class StringBuilder>
	//   40   86:dup             
	//   41   87:invokespecial   #83  <Method void StringBuilder()>
	//   42   90:astore_3        
				stringbuilder.append("Allocated ");
	//   43   91:aload_3         
	//   44   92:ldc1            #204 <String "Allocated ">
	//   45   94:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   46   97:pop             
				stringbuilder.append(key.size);
	//   47   98:aload_3         
	//   48   99:aload_1         
	//   49  100:getfield        #207 <Field int LruArrayPool$Key.size>
	//   50  103:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   51  106:pop             
				stringbuilder.append(" bytes");
	//   52  107:aload_3         
	//   53  108:ldc1            #209 <String " bytes">
	//   54  110:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   55  113:pop             
				Log.v(((String) (class1)), stringbuilder.toString());
	//   56  114:aload_2         
	//   57  115:aload_3         
	//   58  116:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   59  119:invokestatic    #157 <Method int Log.v(String, String)>
	//   60  122:pop             
			}
			class1 = ((Class) (arrayadapterinterface.newArray(key.size)));
	//   61  123:aload           4
	//   62  125:aload_1         
	//   63  126:getfield        #207 <Field int LruArrayPool$Key.size>
	//   64  129:invokeinterface #213 <Method Object ArrayAdapterInterface.newArray(int)>
	//   65  134:astore_2        
		}
		return ((Object) (class1));
	//   66  135:aload_2         
	//   67  136:areturn         
	}

	private NavigableMap getSizesForAdapter(Class class1)
	{
		NavigableMap navigablemap = (NavigableMap)sortedSizes.get(((Object) (class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Map sortedSizes>
	//    2    4:aload_1         
	//    3    5:invokeinterface #165 <Method Object Map.get(Object)>
	//    4   10:checkcast       #65  <Class NavigableMap>
	//    5   13:astore_3        
		Object obj = ((Object) (navigablemap));
	//    6   14:aload_3         
	//    7   15:astore_2        
		if(navigablemap == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       40
		{
			obj = ((Object) (new TreeMap()));
	//   10   20:new             #216 <Class TreeMap>
	//   11   23:dup             
	//   12   24:invokespecial   #217 <Method void TreeMap()>
	//   13   27:astore_2        
			sortedSizes.put(((Object) (class1)), obj);
	//   14   28:aload_0         
	//   15   29:getfield        #43  <Field Map sortedSizes>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokeinterface #180 <Method Object Map.put(Object, Object)>
	//   19   39:pop             
		}
		return ((NavigableMap) (obj));
	//   20   40:aload_2         
	//   21   41:areturn         
	}

	private boolean isNoMoreThanHalfFull()
	{
		int i = currentSize;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int currentSize>
	//    2    4:istore_1        
		return i == 0 || maxSize / i >= 2;
	//    3    5:iload_1         
	//    4    6:ifeq            24
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field int maxSize>
	//    7   13:iload_1         
	//    8   14:idiv            
	//    9   15:iconst_2        
	//   10   16:icmplt          22
	//   11   19:goto            24
	//   12   22:iconst_0        
	//   13   23:ireturn         
	//   14   24:iconst_1        
	//   15   25:ireturn         
	}

	private boolean isSmallEnoughForReuse(int i)
	{
		return i <= maxSize / 2;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field int maxSize>
	//    3    5:iconst_2        
	//    4    6:idiv            
	//    5    7:icmpgt          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	private boolean mayFillRequest(int i, Integer integer)
	{
		return integer != null && (isNoMoreThanHalfFull() || integer.intValue() <= i * 8);
	//    0    0:aload_2         
	//    1    1:ifnull          24
	//    2    4:aload_0         
	//    3    5:invokespecial   #226 <Method boolean isNoMoreThanHalfFull()>
	//    4    8:ifne            22
	//    5   11:aload_2         
	//    6   12:invokevirtual   #73  <Method int Integer.intValue()>
	//    7   15:iload_1         
	//    8   16:bipush          8
	//    9   18:imul            
	//   10   19:icmpgt          24
	//   11   22:iconst_1        
	//   12   23:ireturn         
	//   13   24:iconst_0        
	//   14   25:ireturn         
	}

	public void clearMemory()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		evictToSize(0);
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #112 <Method void evictToSize(int)>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public Object get(int i, Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		obj = ((Object) ((Integer)getSizesForAdapter(class1).ceilingKey(((Object) (Integer.valueOf(i))))));
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokespecial   #57  <Method NavigableMap getSizesForAdapter(Class)>
	//    5    7:iload_1         
	//    6    8:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//    7   11:invokeinterface #231 <Method Object NavigableMap.ceilingKey(Object)>
	//    8   16:checkcast       #59  <Class Integer>
	//    9   19:astore_3        
		if(mayFillRequest(i, ((Integer) (obj))))
	//*  10   20:aload_0         
	//*  11   21:iload_1         
	//*  12   22:aload_3         
	//*  13   23:invokespecial   #233 <Method boolean mayFillRequest(int, Integer)>
	//*  14   26:ifeq            45
		{
			obj = ((Object) (keyPool.get(((Integer) (obj)).intValue(), class1)));
	//   15   29:aload_0         
	//   16   30:getfield        #38  <Field LruArrayPool$KeyPool keyPool>
	//   17   33:aload_3         
	//   18   34:invokevirtual   #73  <Method int Integer.intValue()>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #236 <Method LruArrayPool$Key LruArrayPool$KeyPool.get(int, Class)>
	//   21   41:astore_3        
			break MISSING_BLOCK_LABEL_55;
	//   22   42:goto            55
		}
		obj = ((Object) (keyPool.get(i, class1)));
	//   23   45:aload_0         
	//   24   46:getfield        #38  <Field LruArrayPool$KeyPool keyPool>
	//   25   49:iload_1         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #236 <Method LruArrayPool$Key LruArrayPool$KeyPool.get(int, Class)>
	//   28   54:astore_3        
		class1 = ((Class) (getForKey(((Key) (obj)), class1)));
	//   29   55:aload_0         
	//   30   56:aload_3         
	//   31   57:aload_2         
	//   32   58:invokespecial   #238 <Method Object getForKey(LruArrayPool$Key, Class)>
	//   33   61:astore_2        
		this;
	//   34   62:aload_0         
		JVM INSTR monitorexit ;
	//   35   63:monitorexit     
		return ((Object) (class1));
	//   36   64:aload_2         
	//   37   65:areturn         
		class1;
	//   38   66:astore_2        
	//*  39   67:aload_0         
		throw class1;
	//   40   68:monitorexit     
	//   41   69:aload_2         
	//   42   70:athrow          
	}

	public Object getExact(int i, Class class1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		class1 = ((Class) (getForKey(keyPool.get(i, class1), class1)));
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #38  <Field LruArrayPool$KeyPool keyPool>
	//    5    7:iload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #236 <Method LruArrayPool$Key LruArrayPool$KeyPool.get(int, Class)>
	//    8   12:aload_2         
	//    9   13:invokespecial   #238 <Method Object getForKey(LruArrayPool$Key, Class)>
	//   10   16:astore_2        
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		return ((Object) (class1));
	//   13   19:aload_2         
	//   14   20:areturn         
		class1;
	//   15   21:astore_2        
	//*  16   22:aload_0         
		throw class1;
	//   17   23:monitorexit     
	//   18   24:aload_2         
	//   19   25:athrow          
	}

	public void put(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		boolean flag;
		Object obj1;
		obj1 = ((Object) (obj.getClass()));
	//    2    2:aload_1         
	//    3    3:invokevirtual   #140 <Method Class Object.getClass()>
	//    4    6:astore          7
		ArrayAdapterInterface arrayadapterinterface = getAdapterFromType(((Class) (obj1)));
	//    5    8:aload_0         
	//    6    9:aload           7
	//    7   11:invokespecial   #161 <Method ArrayAdapterInterface getAdapterFromType(Class)>
	//    8   14:astore          6
		i = arrayadapterinterface.getArrayLength(obj);
	//    9   16:aload           6
	//   10   18:aload_1         
	//   11   19:invokeinterface #133 <Method int ArrayAdapterInterface.getArrayLength(Object)>
	//   12   24:istore_2        
		j = arrayadapterinterface.getElementSizeInBytes() * i;
	//   13   25:aload           6
	//   14   27:invokeinterface #136 <Method int ArrayAdapterInterface.getElementSizeInBytes()>
	//   15   32:iload_2         
	//   16   33:imul            
	//   17   34:istore_3        
		flag = isSmallEnoughForReuse(j);
	//   18   35:aload_0         
	//   19   36:iload_3         
	//   20   37:invokespecial   #243 <Method boolean isSmallEnoughForReuse(int)>
	//   21   40:istore          5
		if(flag)
			break MISSING_BLOCK_LABEL_50;
	//   22   42:iload           5
	//   23   44:ifne            50
		this;
	//   24   47:aload_0         
		JVM INSTR monitorexit ;
	//   25   48:monitorexit     
		return;
	//   26   49:return          
		int k;
		Key key = keyPool.get(i, ((Class) (obj1)));
	//   27   50:aload_0         
	//   28   51:getfield        #38  <Field LruArrayPool$KeyPool keyPool>
	//   29   54:iload_2         
	//   30   55:aload           7
	//   31   57:invokevirtual   #236 <Method LruArrayPool$Key LruArrayPool$KeyPool.get(int, Class)>
	//   32   60:astore          6
		groupedMap.put(((Poolable) (key)), obj);
	//   33   62:aload_0         
	//   34   63:getfield        #35  <Field GroupedLinkedMap groupedMap>
	//   35   66:aload           6
	//   36   68:aload_1         
	//   37   69:invokevirtual   #246 <Method void GroupedLinkedMap.put(Poolable, Object)>
		obj = ((Object) (getSizesForAdapter(((Class) (obj1)))));
	//   38   72:aload_0         
	//   39   73:aload           7
	//   40   75:invokespecial   #57  <Method NavigableMap getSizesForAdapter(Class)>
	//   41   78:astore_1        
		obj1 = ((Object) ((Integer)((NavigableMap) (obj)).get(((Object) (Integer.valueOf(key.size))))));
	//   42   79:aload_1         
	//   43   80:aload           6
	//   44   82:getfield        #207 <Field int LruArrayPool$Key.size>
	//   45   85:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//   46   88:invokeinterface #69  <Method Object NavigableMap.get(Object)>
	//   47   93:checkcast       #59  <Class Integer>
	//   48   96:astore          7
		k = key.size;
	//   49   98:aload           6
	//   50  100:getfield        #207 <Field int LruArrayPool$Key.size>
	//   51  103:istore          4
		i = 1;
	//   52  105:iconst_1        
	//   53  106:istore_2        
		if(obj1 == null)
	//*  54  107:aload           7
	//*  55  109:ifnonnull       115
			break MISSING_BLOCK_LABEL_123;
	//   56  112:goto            123
		i = 1 + ((Integer) (obj1)).intValue();
	//   57  115:iconst_1        
	//   58  116:aload           7
	//   59  118:invokevirtual   #73  <Method int Integer.intValue()>
	//   60  121:iadd            
	//   61  122:istore_2        
		((NavigableMap) (obj)).put(((Object) (Integer.valueOf(k))), ((Object) (Integer.valueOf(i))));
	//   62  123:aload_1         
	//   63  124:iload           4
	//   64  126:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//   65  129:iload_2         
	//   66  130:invokestatic    #63  <Method Integer Integer.valueOf(int)>
	//   67  133:invokeinterface #80  <Method Object NavigableMap.put(Object, Object)>
	//   68  138:pop             
		currentSize = currentSize + j;
	//   69  139:aload_0         
	//   70  140:aload_0         
	//   71  141:getfield        #114 <Field int currentSize>
	//   72  144:iload_3         
	//   73  145:iadd            
	//   74  146:putfield        #114 <Field int currentSize>
		evict();
	//   75  149:aload_0         
	//   76  150:invokespecial   #248 <Method void evict()>
		this;
	//   77  153:aload_0         
		JVM INSTR monitorexit ;
	//   78  154:monitorexit     
		return;
	//   79  155:return          
		obj;
	//   80  156:astore_1        
	//*  81  157:aload_0         
		throw obj;
	//   82  158:monitorexit     
	//   83  159:aload_1         
	//   84  160:athrow          
	}

	public void put(Object obj, Class class1)
	{
		put(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #253 <Method void put(Object)>
	//    3    5:return          
	}

	public void trimMemory(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(i < 40) goto _L2; else goto _L1
	//    2    2:iload_1         
	//    3    3:bipush          40
	//    4    5:icmplt          36
_L1:
		clearMemory();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #258 <Method void clearMemory()>
		  goto _L3
	//*   7   12:goto            25
_L5:
		evictToSize(maxSize / 2);
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #48  <Field int maxSize>
	//   11   20:iconst_2        
	//   12   21:idiv            
	//   13   22:invokespecial   #112 <Method void evictToSize(int)>
_L3:
		this;
	//   14   25:aload_0         
		JVM INSTR monitorexit ;
	//   15   26:monitorexit     
		return;
	//   16   27:return          
	//*  17   28:aload_0         
_L4:
		Exception exception;
		throw exception;
	//   18   29:monitorexit     
	//   19   30:aload_2         
	//   20   31:athrow          
		exception;
	//   21   32:astore_2        
		if(true) goto _L4; else goto _L2
	//   22   33:goto            28
_L2:
		if(i < 20 && i != 15) goto _L3; else goto _L5
	//   23   36:iload_1         
	//   24   37:bipush          20
	//   25   39:icmpge          15
	//   26   42:iload_1         
	//   27   43:bipush          15
	//   28   45:icmpne          25
	//*  29   48:goto            15
	}

	private final Map adapters;
	private int currentSize;
	private final GroupedLinkedMap groupedMap;
	private final KeyPool keyPool;
	private final int maxSize;
	private final Map sortedSizes;
}
